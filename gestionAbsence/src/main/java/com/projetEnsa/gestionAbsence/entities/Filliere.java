package com.projetEnsa.gestionAbsence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Filliere")
public class Filliere implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long idFilliere;
	//
	@Column(nullable = false, unique = true)
	private String LibelleFilliere;

	public Filliere(String libelleFilliere) {
		super();
		LibelleFilliere = libelleFilliere;
	}

	public Filliere() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdFilliere() {
		return idFilliere;
	}

	public void setIdFilliere(long idFilliere) {
		this.idFilliere = idFilliere;
	}

	public String getLibelleFilliere() {
		return LibelleFilliere;
	}

	public void setLibelleFilliere(String libelleFilliere) {
		LibelleFilliere = libelleFilliere;
	}

}
