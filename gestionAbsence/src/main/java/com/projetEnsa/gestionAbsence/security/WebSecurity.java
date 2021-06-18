package com.projetEnsa.gestionAbsence.security;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.projetEnsa.gestionAbsence.services.AdminService;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	private final AdminService userDetailsService;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;

	// constructeur de la class
	public WebSecurity(AdminService userDetailsService, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userDetailsService = userDetailsService;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// Cross-origin resource sharing activier cors pour communication avec  angular(ou autre)
		// Cross-Site Request Forgery (desactiver csrf j'ai pas des formulaire sur l'application)
		// authorizeRequests autorisé l'execution les requets HTTP(url save user(inscription) or url login , any person can access) (just sign up(/users))
		// permitAll autorisé tous les permissions poussible
		// anyRequest or post sign up have to authenticated (error 403 access denied)
		http // obj
				.cors().and()
				.csrf().disable()
				.authorizeRequests()
				.antMatchers(HttpMethod.POST, SecurityConstants.SIGN_UP_URL)
				.permitAll()
				.anyRequest()
				.authenticated()
				.and().addFilter(getAuthenticationFilter()).addFilter(new AuthorizationFilter(authenticationManager()))
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

	protected AuthenticationFilter getAuthenticationFilter() throws Exception {
		final AuthenticationFilter filter = new AuthenticationFilter(authenticationManager());
		filter.setFilterProcessesUrl("/users/login");
		return filter;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);

	}
}