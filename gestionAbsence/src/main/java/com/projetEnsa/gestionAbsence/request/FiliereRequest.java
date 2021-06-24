package com.projetEnsa.gestionAbsence.request;

import org.springframework.beans.BeanUtils;
 

public class FiliereRequest {
	private String LibelleFilliere;

	public String getLibelleFilliere() {
		return LibelleFilliere;
	}

	public void setLibelleFilliere(String libelle_filliere) {
		this.LibelleFilliere = libelle_filliere;
	}
	
	
}
