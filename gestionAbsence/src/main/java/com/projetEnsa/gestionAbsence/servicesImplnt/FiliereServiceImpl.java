package com.projetEnsa.gestionAbsence.servicesImplnt;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetEnsa.gestionAbsence.Dto.FiliereDto;
import com.projetEnsa.gestionAbsence.entities.Filliere;
import com.projetEnsa.gestionAbsence.exception.FiliereNotFoundException;
import com.projetEnsa.gestionAbsence.repositories.FiliereRepository;
import com.projetEnsa.gestionAbsence.services.FiliereService;
 
@Service
public class FiliereServiceImpl implements  FiliereService{
	
	@Autowired
	FiliereRepository  filiereRepository;
	
	@Override
	public FiliereDto createFiliere(FiliereDto filiereDto) {
	//	FiliereEntity checkLabel =  filiereRepository.FindByLibelleFilliere(filiereDto.getLibelleFilliere());
		//if(checkLabel!=null) throw new RuntimeException("Filiere Already Exist");
		
		Filliere filiere = new Filliere();
		
		BeanUtils.copyProperties(filiereDto, filiere);
		filiere.setIdFilliere(12);
		//filiere.setLibelleFilliere("test");
		Filliere  newFiliere = filiereRepository.save(filiere);
		FiliereDto newfiliereDto = new FiliereDto();
		BeanUtils.copyProperties(newFiliere, newfiliereDto);
		return filiereDto;
		
	}
	@Override
	public List<FiliereDto> finAll() {
		Iterable<Filliere> filieres = filiereRepository.findAll();
		List<FiliereDto> lists=	StreamSupport.stream(filieres.spliterator(), false).map(filiere->{
			FiliereDto dto = new FiliereDto();
			BeanUtils.copyProperties(filiere, dto);
			return dto;
		}).collect(Collectors.toList());
		
		return lists;
	}
	
	
	@Override
	
	public FiliereDto update(FiliereDto filiereDto, long id) {
		Filliere filiere = filiereRepository.findById(id);
		if(filiere==null)  throw new FiliereNotFoundException("Filiere Not Exist Exist");
		filiere.setLibelleFilliere(filiereDto.getLibelleFilliere());
		
		Filliere updatefiliere = filiereRepository.save(filiere);
		FiliereDto update = new FiliereDto();
		BeanUtils.copyProperties(updatefiliere, update);
		return update;
	}
	
	@Override
	
	public String Delete(long id) {
		Filliere filiere = filiereRepository.findById(id);
		if(filiere==null) throw new FiliereNotFoundException("Filiere Not Exist Exist");
		filiereRepository.deleteById(id);
		return "Succes";
	}
	
}
