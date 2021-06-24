package com.projetEnsa.gestionAbsence.services;


import java.util.List;

import com.projetEnsa.gestionAbsence.Dto.FiliereDto;
 
public interface FiliereService {
	FiliereDto createFiliere(FiliereDto filiereDto);
	List<FiliereDto> finAll();
	FiliereDto update(FiliereDto filiereDto,long id);
	
	String Delete(long id);

}
