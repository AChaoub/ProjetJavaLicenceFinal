package com.projetEnsa.gestionAbsence.Dto;

import java.io.Serializable;

public class FiliereDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6014719095219581825L;
	
	private String LibelleFilliere;
	private long id=12;

	public String getLibelleFilliere() {
		return LibelleFilliere;
	}

	public void setLibelleFilliere(String libelle_filliere) {
		this.LibelleFilliere = libelle_filliere;
	}

	public Long getIdFilliere() {
		return id;
	}

	public void setIdFilliere(Long id_filliere) {
		this.id = id_filliere;
	}

}
