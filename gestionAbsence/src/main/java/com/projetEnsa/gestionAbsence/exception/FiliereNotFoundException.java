package com.projetEnsa.gestionAbsence.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus; 
@ResponseStatus(HttpStatus.NOT_FOUND)  
public class FiliereNotFoundException extends RuntimeException{

	
	public FiliereNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
