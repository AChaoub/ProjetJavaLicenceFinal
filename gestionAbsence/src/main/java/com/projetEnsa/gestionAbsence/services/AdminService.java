package com.projetEnsa.gestionAbsence.services;
 
   
import org.springframework.security.core.userdetails.UserDetailsService;

import com.projetEnsa.gestionAbsence.Dto.AdminDto;



public interface AdminService extends UserDetailsService {
 
	AdminDto getUser(String email);

	AdminDto getUserByUserId(String userId);
	
	AdminDto createAdmin(AdminDto user);
}
