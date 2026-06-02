package com.rest.webservices.restful_web_services.helloHarshad;

public class HelloworldBean {

	private String message;
	private String name;

	public HelloworldBean(String message,String name) {
		this.message= message;
		this.name= name;
	
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloworldBean [message=" + message + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
