package com.therealdanvega.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity( securedEnabled = true )
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public void configureAuth(AuthenticationManagerBuilder auth) throws Exception{
		auth
			.inMemoryAuthentication()
				.withUser("dan")          // adding the users and admins in our applocation using withUser()
				.password("password")
				.roles("ADMIN")
			.and()
				.withUser("joe")
				.password("password")
				.roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()							//follow the sequence anyRequest().authenticated() must be atlast or else nothing will work
				.antMatchers("/admin/**").hasRole("ADMIN")   //only admin can  access the routes from /admin/-->
				//.antMatchers("/posts/**").hasRole("USER")	 //only user can  access the routes from /posts/-->									
				.anyRequest().authenticated()   // any request can be accesed by user and admin 
				.and()
			.formLogin()//enables spring security form login
				.loginPage("/login")
				.permitAll()
				.and()
			.logout()
				.logoutSuccessUrl("/login?logout")  // redirecting user to login page when he hits logout
				.permitAll();
	}
	
	
	// if method is invoked in an api then no need to secure that method only need to secure apis 


	
}
