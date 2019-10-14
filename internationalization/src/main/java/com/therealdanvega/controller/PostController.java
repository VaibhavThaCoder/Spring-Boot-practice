package com.therealdanvega.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {

	@RequestMapping("/")
	public String list() {
		return "views/list";// as we have used @Controller annotations hre so it take the file from views
							// folder i.e /views/list.html

		// we are trying to change the copyright content of list.html page
		// for that we have used profiling
		// we are changing spring "spring.mvc.locale" variable from
		// application.properties file
		// due to use of spring.mvc.locale=es" variable it will find for es in
		// .properties file and will load the contents from copyright variable in
		// message_es.properties i.e #{copyright} if we comment out it will take value
		// from default messages.properties 
		// so dont get confused from spring.profiles.active ans spring.mvc.locale they are different
	}

}
