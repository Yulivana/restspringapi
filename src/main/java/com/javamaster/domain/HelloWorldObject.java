package com.javamaster.domain;

/*
 * Just simple pojo class
 */
public class HelloWorldObject {

	private String message;
	private int id;
	public HelloWorldObject() {
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "HelloWorldObject [message=" + message + ", id=" + id + "]";
	}
	
}
