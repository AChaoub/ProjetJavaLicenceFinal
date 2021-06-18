package com.projetEnsa.gestionAbsence.test;

import com.projetEnsa.gestionAbsence.Dto.AdminDto;
import com.projetEnsa.gestionAbsence.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class UseradminTest {

	@Autowired
	AdminService userService;

	@Test
	public void testaddUser() {

		AdminDto userDto = new AdminDto("Administrateur", "Administrateur", "ad@min.com", "admin");
		userService.createAdmin(userDto);
	}

}