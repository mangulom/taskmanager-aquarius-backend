package com.taskmanager.app.models;

public class Response {
	private Object result;
	private String message;
	private int status;
	public Response() {
		super();
	}
	public Response(Object result,  String message, int status) {
		super();
		this.result = result;
		this.message = message;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Response [result=" + result + ", message=" + message + ", status=" + status + "]";
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
