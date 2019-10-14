package com.therealdanvega;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

	// accessing the variable from properties file using @value("${variable name}")
	// the variable name must be same as that off application.properties variable
	// name
	@Value("${pageController.msg}")
	private String pageControllerMsg; // the value of pageController.msg from application.properties will be assigned
										// pageControllerMsg variable

	
	//@Value("${app.description}")
	@Value("${my.secret}")
	private String mySecret;

	// if we comment out the same variable in application.properties file spring will
	// try and look the same variable in application.yml file thus .properties file
	// have higher priority than .yml file
	
	//we can also set the variable from cli through run configuration ,just specify the variable name and value 
	//thus spring gives higher priority to env variabke than the variables in application.properties file
	

	@RequestMapping("/")
	public String home() { // this method return the value each time when we invoke "/" in our request
		//return pageControllerMsg;
		return mySecret;
	}

}
