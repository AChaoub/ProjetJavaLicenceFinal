package com.projetEnsa.gestionAbsence.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projetEnsa.gestionAbsence.Dto.FiliereDto;
import com.projetEnsa.gestionAbsence.request.FiliereRequest;
import com.projetEnsa.gestionAbsence.responses.FiliereResponse;
import com.projetEnsa.gestionAbsence.services.FiliereService;

import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
@RequestMapping("filiere") //localhost:8081/filiere
public class FiliereControllers {
	@Autowired
	FiliereService filiereService;
	
	@GetMapping
	public List<FiliereDto> getFiliere() {
	
		return filiereService.finAll();
	}
	
	@PutMapping()
	public FiliereResponse getFiliereId(@RequestBody FiliereRequest filiereRequest,@RequestParam long id) {
		FiliereDto filiereDto = new FiliereDto();
		BeanUtils.copyProperties(filiereRequest, filiereDto);
		 FiliereDto updateFiliere = filiereService.update(filiereDto, id);
		 FiliereResponse res = new FiliereResponse();
		 BeanUtils.copyProperties(updateFiliere, res);
		return res;
	}
	@PostMapping
	public FiliereResponse CreateFiliere(@RequestBody FiliereRequest filiereRequest) {
		   FiliereDto filiereDto = new FiliereDto();
		    
		     BeanUtils.copyProperties(filiereRequest, filiereDto);
		   FiliereDto createFiliere = filiereService.createFiliere(filiereDto);
		   FiliereResponse res = new FiliereResponse();
		   BeanUtils.copyProperties(createFiliere, res);
		   return res;

	}
	
	@DeleteMapping
	
	public String deleteFiliere(@RequestParam long id) {
		String res =  filiereService.Delete(id);	
		return res;
	}
	
	

}
