package com.projetEnsa.gestionAbsence.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Absence")
public class Absence implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6057294777821712013L;

	@Id
	@GeneratedValue
	private long idFAbsence;
	//
	@Column(nullable=false)
	private Date dateAbsence;
	public Absence(Date dateAbsence) {
		super();
		this.dateAbsence = dateAbsence;
	}
	public Absence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdFAbsence() {
		return idFAbsence;
	}
	public void setIdFAbsence(long idFAbsence) {
		this.idFAbsence = idFAbsence;
	}
	public Date getDateAbsence() {
		return dateAbsence;
	}
	public void setDateAbsence(Date dateAbsence) {
		this.dateAbsence = dateAbsence;
	}
	
	
	
	
	
}
