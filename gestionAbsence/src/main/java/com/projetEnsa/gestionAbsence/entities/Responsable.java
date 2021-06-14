package com.projetEnsa.gestionAbsence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Responsable")
public class Responsable   implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long idResponsable;
	//
	@Column(nullable=false, length=50)
	private String nomResponsable;
	
	@Column(nullable=false, length=50)
	private String prenomResponsable;

	
	
	
	
	public Responsable() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Responsable(String nomResponsable, String prenomResponsable) {
		super();
		this.nomResponsable = nomResponsable;
		this.prenomResponsable = prenomResponsable;
	}


	public long getIdResponsable() {
		return idResponsable;
	}


	public void setIdResponsable(long idResponsable) {
		this.idResponsable = idResponsable;
	}


	public String getNomResponsable() {
		return nomResponsable;
	}


	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}


	public String getPrenomResponsable() {
		return prenomResponsable;
	}


	public void setPrenomResponsable(String prenomResponsable) {
		this.prenomResponsable = prenomResponsable;
	}
	
}
