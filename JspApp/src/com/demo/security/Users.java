package com.demo.security;
public class Users {

	private String name;
	private String password;
	
	public boolean authenticate() {
		if(name.equals(password)) {
			return true;
		}else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
