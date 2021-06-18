package com.projetEnsa.gestionAbsence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Etudiant")
public class Etudiant implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1497590107634648409L;

	@Id
	@GeneratedValue
	private long idEtudiant;
	//
	@Column(nullable = false, unique = true)
	private int CNE;
	//
	@Column(nullable = false, length = 50)
	private String nomEtudiant;
	//
	@Column(nullable = false, length = 50)
	private String prenomEtudiant;
	//
	@Column(nullable = false, length = 120, unique = true)
	private String emailEtudiant;

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(int cNE, String nomEtudiant, String prenomEtudiant, String emailEtudiant) {
		super();
		CNE = cNE;
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		this.emailEtudiant = emailEtudiant;
	}

	public long getId() {
		return idEtudiant;
	}

	public void setId(long id) {
		this.idEtudiant = id;
	}

	public int getCNE() {
		return CNE;
	}

	public void setCNE(int cNE) {
		CNE = cNE;
	}

	public String getNomEtudiant() {
		return nomEtudiant;
	}

	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}

	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}

	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}

	public String getEmailEtudiant() {
		return emailEtudiant;
	}

	public void setEmailEtudiant(String emailEtudiant) {
		this.emailEtudiant = emailEtudiant;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + idEtudiant + ", CNE=" + CNE + ", nomEtudiant=" + nomEtudiant + ", prenomEtudiant="
				+ prenomEtudiant + ", emailEtudiant=" + emailEtudiant + "]";
	}

}
