package com.projetEnsa.gestionAbsence.request;

public class UserLoginRequest {
	
	private String emailAdmin;
	private String password;
	
	
	public String getEmailAdmin() {
		return emailAdmin;
	}
	public void setEmail(String emailAdmin) {
		this.emailAdmin = emailAdmin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
