package com.projetEnsa.gestionAbsence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name="Administrateur")
public class Administrateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long idAdministrateur;
	//
	@Column(nullable=false, length=50)
	private String nomAdmin;
	//
	@Column(nullable=false, length=50)
	private String prenomAdmin;
	//
	@Column(nullable=false, length=120, unique=true)
	private String emailAdmin;
	//
	@Column(nullable=false, length=40)
	private String mdpsAdmin;
	
	
	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Administrateur(String nomAdmin, String prenomAdmin, String emailAdmin, String mdpsAdmin) {
		super();
		this.nomAdmin = nomAdmin;
		this.prenomAdmin = prenomAdmin;
		this.emailAdmin = emailAdmin;
		this.mdpsAdmin = mdpsAdmin;
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


	public String getMdpsAdmin() {
		return mdpsAdmin;
	}


	public void setMdpsAdmin(String mdpsAdmin) {
		this.mdpsAdmin = mdpsAdmin;
	}

}
