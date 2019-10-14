package com.therealdanvega;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PageController {

	@Value("${spring.profiles.active}")
	private String environment;

	// it will go in development application.properties file if active in
	// application.properties file and will search for "msg" variable value

	// always it will first go in the application.properties file and see which
	// profile is active and will access the values accordingly
	@Value("${msg}")
	private String msg;

	@RequestMapping("/")
	public String home() {
		return msg;
	}

}
