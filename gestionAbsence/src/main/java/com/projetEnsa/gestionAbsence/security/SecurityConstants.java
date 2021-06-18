package com.projetEnsa.gestionAbsence.security;


public class SecurityConstants {
	
	public static final long EXPIRATION_TIME = 864000000; // 10 Days  date d'expiration
	public static final String TOKEN_PREFIX = "Bearer ";  
	public static final String HEADER_STRING = "Authorization"; //Header d requete http (le type de header est Authorization)
	public static final String SIGN_UP_URL = "/users";
	public static final String TOKEN_SECRET = "dfg893hdc475zwerop4tghg4ddfdfgdsdfeqaas?=-0ljznm0-9";  //pour generer le token obligation presence d'un clé secret
}
