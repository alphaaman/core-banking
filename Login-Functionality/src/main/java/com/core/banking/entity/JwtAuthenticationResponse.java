package com.core.banking.entity;

public class JwtAuthenticationResponse {
	
	private String token;
	public JwtAuthenticationResponse() {
		// TODO Auto-generated constructor stub
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "JwtAuthenticationResponse [token=" + token + "]";
	}
	public JwtAuthenticationResponse(String token) {
		super();
		this.token = token;
	}

}
