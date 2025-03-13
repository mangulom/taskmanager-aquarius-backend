package com.taskmanager.app.models;

public class User {
    private String id;
    private String name;
    private String nick;
    private String password;
	public User() {
		super();
	}
	public User(String id, String name, String nick, String password) {
		super();
		this.id = id;
		this.name = name;
		this.nick = nick;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", nick=" + nick + ", password=" + password + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	} 
}
