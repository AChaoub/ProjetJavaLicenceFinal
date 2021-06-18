package com.projetEnsa.gestionAbsence.controllers;


  
 
import com.projetEnsa.gestionAbsence.responses.UserResponse;
 
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetEnsa.gestionAbsence.Dto.AdminDto;
import com.projetEnsa.gestionAbsence.request.UserRequest;
import com.projetEnsa.gestionAbsence.services.AdminService;
 

@CrossOrigin("http://localhost:4200") //access from angular port
@RestController 
@RequestMapping("/users") // localhost:8080/users  mapper url(requette)
public class UserController  {

	@Autowired //injecter le bean ** Injection des dépendances
	AdminService userService;

	@GetMapping(path = "/{id}")
	public ResponseEntity<UserResponse> getUser(@PathVariable String id) {

		AdminDto userDto = userService.getUserByUserId(id);

		UserResponse userResponse = new UserResponse();

		BeanUtils.copyProperties(userDto, userResponse);

		return new ResponseEntity<UserResponse>(userResponse, HttpStatus.OK);
	}
 
	
	@PostMapping //Ajouter utilisateur
	public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest) throws Exception {

		AdminDto userDto = new AdminDto();

		BeanUtils.copyProperties(userRequest, userDto);

		AdminDto createUser = userService.createAdmin(userDto);

		UserResponse userResponse = new UserResponse();

		BeanUtils.copyProperties(createUser, userResponse);

		return new ResponseEntity<UserResponse>(userResponse, HttpStatus.CREATED);
	}
}
