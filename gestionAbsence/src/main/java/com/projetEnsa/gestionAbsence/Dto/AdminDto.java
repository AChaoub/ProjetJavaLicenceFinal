package com.projetEnsa.gestionAbsence.Dto;

import java.io.Serializable;

public class AdminDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idAdministrateur;
	private String userId;
	private String nomAdmin;
	private String prenomAdmin;
	private String emailAdmin;
	private String passwordAdmin;
	private String encyptePassword;

	public AdminDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminDto(String nomAdmin, String prenomAdmin, String emailAdmin, String passwordAdmin) {
		super();
		this.nomAdmin = nomAdmin;
		this.prenomAdmin = prenomAdmin;
		this.emailAdmin = emailAdmin;
		this.passwordAdmin = passwordAdmin;
	}

	public long getIdAdministrateur() {
		return idAdministrateur;
	}

	public void setIdAdministrateur(long idAdministrateur) {
		this.idAdministrateur = idAdministrateur;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNomAdmin() {
		return nomAdmin;
	}

	public void setNomAdmin(String nomAdmin) {
		this.nomAdmin = nomAdmin;
	}

	public String getPrenomAdmin() {
		return prenomAdmin;
	}

	public void setPrenomAdmin(String prenomAdmin) {
		this.prenomAdmin = prenomAdmin;
	}

	public String getEmailAdmin() {
		return emailAdmin;
	}

	public void setEmailAdmin(String emailAdmin) {
		this.emailAdmin = emailAdmin;
	}

	public String getPasswordAdmin() {
		return passwordAdmin;
	}

	public void setPasswordAdmin(String passwordAdmin) {
		this.passwordAdmin = passwordAdmin;
	}

	public String getEncyptePassword() {
		return encyptePassword;
	}

	public void setEncyptePassword(String encyptePassword) {
		this.encyptePassword = encyptePassword;
	}

}
