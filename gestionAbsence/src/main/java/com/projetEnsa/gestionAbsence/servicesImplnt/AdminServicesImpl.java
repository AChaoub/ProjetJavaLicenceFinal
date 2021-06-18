package com.projetEnsa.gestionAbsence.servicesImplnt;

import java.util.ArrayList; 
import com.projetEnsa.gestionAbsence.repositories.UserRepository;

import com.projetEnsa.gestionAbsence.shared.Utils;
 
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.projetEnsa.gestionAbsence.Dto.AdminDto;
import com.projetEnsa.gestionAbsence.entities.Administrateur;
import com.projetEnsa.gestionAbsence.services.AdminService;


@Service  // indique que cette class est un service
public class AdminServicesImpl implements AdminService {

	@Autowired  //injecter le bean ** Injection des dépendances
	UserRepository userRepository;
	
	@Autowired  //injecter le bean ** Injection des dépendances
	BCryptPasswordEncoder bCryptPasswordEncoder;
 
	@Autowired  //injecter le bean ** Injection des dépendances
	Utils util;
	
	
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		Administrateur userEntity = userRepository.findByEmailAdmin(email);

		if (userEntity == null)
			throw new UsernameNotFoundException(email);

		return new User(userEntity.getEmailAdmin(), userEntity.getEncyptePassword(), new ArrayList<>());
	}

	@Override
	public AdminDto getUser(String email) {

		Administrateur userEntity = userRepository.findByEmailAdmin(email);

		if (userEntity == null)
			throw new UsernameNotFoundException(email);

		AdminDto userDto = new AdminDto();

		BeanUtils.copyProperties(userEntity, userDto);

		return userDto;
	}


	@Override
	public AdminDto getUserByUserId(String userId) {

		Administrateur userEntity = userRepository.findByUserId(userId);

		if (userEntity == null)
			throw new UsernameNotFoundException(userId);

		AdminDto userDto = new AdminDto();

		BeanUtils.copyProperties(userEntity, userDto);

		return userDto;
	}

	@Override
	public AdminDto createAdmin(AdminDto user) {
 

		Administrateur userEntity = new Administrateur();

		Administrateur checkUser = userRepository.findByEmailAdmin(user.getEmailAdmin());

			if (checkUser != null)
				throw new RuntimeException("User Alrady Exists !");

			BeanUtils.copyProperties(user, userEntity);

			userEntity.setEncyptePassword(bCryptPasswordEncoder.encode(user.getPasswordAdmin()));

			userEntity.setUserId(util.generateStringId(32));

			Administrateur newUser = userRepository.save(userEntity);

			AdminDto userDto = new AdminDto();
			BeanUtils.copyProperties(newUser, userDto);

			return userDto;
		

	}

 

}
