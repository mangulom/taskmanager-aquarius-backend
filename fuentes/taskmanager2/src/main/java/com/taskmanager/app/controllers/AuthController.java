package com.taskmanager.app.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.taskmanager.app.models.Response;
import com.taskmanager.app.models.User;
import com.taskmanager.app.utils.JwtUtil;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }
    
    @GetMapping
    public String welcome() {
    	return "hola";
    }

    @PostMapping("/login")
    public ResponseEntity<Response> login(@RequestBody User user) {
    	
    	System.out.println("User : " + user);
        Response response = new Response();
        User foundUser = new User();
        foundUser.setId("0014-2025");
        foundUser.setName("Usuario de Prueba Aquarius");
        foundUser.setNick("admin");
        foundUser.setPassword("123");
        try {
            if (user == null || user.getNick()==null || user.getNick()=="") {
                response.setMessage("Usuario desconocido o no enviado");
                response.setResult(null);
                response.setStatus(0);
                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
            } else {
                if (foundUser.getNick().equals(user.getNick()) &&  foundUser.getPassword().equals(user.getPassword())) {
                    response.setMessage("Usuario autenticado correctamente");
                    response.setResult(jwtUtil.generateToken(user.getNick()));
                    response.setStatus(1);
                    return new ResponseEntity<>(response, HttpStatus.OK);                
                } else {
                    response.setMessage("Credenciales inválidas");
                    response.setResult(null);
                    return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
                }
            }
        } catch (Exception e) {
            response.setMessage("Ocurrió un error en el servicio: " + e.getMessage());
            response.setResult(null);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
