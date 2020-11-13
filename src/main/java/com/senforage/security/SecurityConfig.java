package com.senforage.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		.dataSource(dataSource).usersByUsernameQuery("SELECT email as principal, password as credentials, etat FROM User WHERE email = ?")
		.authoritiesByUsernameQuery("SELECT u.email as principal, r.libelle as role FROM User u, Roles r, user_roles ur WHERE u.id = ur.users_id AND r.id = ur.roles_id AND u.email = ?")
		.rolePrefix("ROLE_");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//http.formLogin(); //pour afficher un formulaire de connexion par defaut
		try {
			http.formLogin().loginPage("/login");  //personnaliser le form de login
			http.authorizeRequests().antMatchers("/Client/**").hasRole("ADMIN");
			http.authorizeRequests().antMatchers("/Village/**").hasRole("CHEFPARC");
			http.authorizeRequests().antMatchers("/User/**", "/User/**","/Roles").hasRole("SUPERADMIN");
			http.exceptionHandling().accessDeniedPage("/Admin/403");
			http.csrf().disable();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
