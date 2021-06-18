package com.projetEnsa.gestionAbsence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Administrateur")
public class Administrateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long idAdministrateur;
	//
	@Column(nullable = false)
	private String userId;
	//
	@Column(nullable = false, length = 50)
	private String nomAdmin;
	//
	@Column(nullable = false, length = 50)
	private String prenomAdmin;
	//
	@Column(nullable = false, length = 120, unique = true)
	private String emailAdmin;
	//
	@Column(nullable = false)
	private String encyptePassword;

	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrateur(String nomAdmin, String prenomAdmin, String emailAdmin) {
		super();
		this.nomAdmin = nomAdmin;
		this.prenomAdmin = prenomAdmin;
		this.emailAdmin = emailAdmin;
	}

	public long getIdAdministrateur() {
		return idAdministrateur;
	}

	public void setIdAdministrateur(long idAdministrateur) {
		this.idAdministrateur = idAdministrateur;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEncyptePassword() {
		return encyptePassword;
	}

	public void setEncyptePassword(String encyptePassword) {
		this.encyptePassword = encyptePassword;
	}

}
