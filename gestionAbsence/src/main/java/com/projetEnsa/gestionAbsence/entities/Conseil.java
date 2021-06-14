package com.projetEnsa.gestionAbsence.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Conseil")
public class Conseil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long idConseil;
	//
	@Column(nullable=false)
	private Date dateConseil;
	//
	@Column(nullable=false, length=254)
	private String PVconseil;
	
	
	
	public Conseil() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Conseil(Date dateConseil, String pVconseil) {
		super();
		this.dateConseil = dateConseil;
		PVconseil = pVconseil;
	}



	public long getIdConseil() {
		return idConseil;
	}



	public void setIdConseil(long idConseil) {
		this.idConseil = idConseil;
	}



	public Date getDateConseil() {
		return dateConseil;
	}



	public void setDateConseil(Date dateConseil) {
		this.dateConseil = dateConseil;
	}



	public String getPVconseil() {
		return PVconseil;
	}



	public void setPVconseil(String pVconseil) {
		PVconseil = pVconseil;
	}
	
}
