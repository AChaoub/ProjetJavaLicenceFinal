package com.projetEnsa.gestionAbsence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Module")
public class Module  implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

 
	@Id
	@GeneratedValue
	private long idModule;
	//
	@Column(nullable=false, unique=true)
	private String LibelleModule;
	
	
	
	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Module(String libelleModule) {
		super();
		LibelleModule = libelleModule;
	}



	public long getIdModule() {
		return idModule;
	}



	public void setIdModule(long idModule) {
		this.idModule = idModule;
	}



	public String getLibelleModule() {
		return LibelleModule;
	}



	public void setLibelleModule(String libelleModule) {
		LibelleModule = libelleModule;
	}
	
	

}
