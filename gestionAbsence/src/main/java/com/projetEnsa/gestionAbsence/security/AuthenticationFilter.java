package com.projetEnsa.gestionAbsence.security;

import com.projetEnsa.gestionAbsence.SpringApplicationContext;
import com.projetEnsa.gestionAbsence.request.UserLoginRequest;
import com.projetEnsa.gestionAbsence.services.AdminService;
import com.projetEnsa.gestionAbsence.Dto.AdminDto;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;

import com.fasterxml.jackson.databind.ObjectMapper;

  

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

//filtrer si l'utilisateur exicte au cours de l'authentification
public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {
	

	private final AuthenticationManager authenticationManager;

	// constructeur  de la class 
	public AuthenticationFilter(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	//la methode récupére la demande request ( req 'email + password')
	@Override
	public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res)
			throws AuthenticationException {
		try {

			// get data in object creds (email password)
			UserLoginRequest creds = new ObjectMapper().readValue(req.getInputStream(), UserLoginRequest.class);
			
			//verifier si email and password exicts
			return authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(creds.getEmailAdmin(), creds.getPassword(), new ArrayList<>()));
			

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	  @Override
	    protected void successfulAuthentication(HttpServletRequest req,
	                                            HttpServletResponse res,
	                                            FilterChain chain,
	                                            Authentication auth) throws IOException, ServletException {
	        
	        String userName = ((User) auth.getPrincipal()).getUsername(); 
	        
            AdminService userService = (AdminService)SpringApplicationContext.getBean("adminServicesImpl");
	        
            AdminDto userDto = userService.getUser(userName);
	        
	        // json web tokrn (configurer le token)
	        String token = Jwts.builder()
	                .setSubject(userName)
	                .claim("id", userDto.getUserId())
	                .claim("name", userDto.getPrenomAdmin() + " " + userDto.getNomAdmin())
	                .setExpiration(new Date(System.currentTimeMillis() + SecurityConstants.EXPIRATION_TIME))
	                .signWith(SignatureAlgorithm.HS512, SecurityConstants.TOKEN_SECRET )
	                .compact();
	        
	       
	       
	        res.addHeader(SecurityConstants.HEADER_STRING, SecurityConstants.TOKEN_PREFIX + token);
	        res.addHeader("user_id", userDto.getUserId());
	        
	        res.getWriter().write("{\"token\": \"" + token + "\", \"id\": \""+ userDto.getUserId() + "\"}");

	    }  
}
