package com.core.banking.entity;

public class JwtAuthenticationRequest {
	 private String username;
	 private String password;

	public JwtAuthenticationRequest() {
		// TODO Auto-generated constructor stub
	}

	public JwtAuthenticationRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "JwtAuthenticationRequest [username=" + username + ", password=" + password + "]";
	}
	
}
