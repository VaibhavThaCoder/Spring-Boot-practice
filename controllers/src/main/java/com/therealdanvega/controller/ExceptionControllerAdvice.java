package com.therealdanvega.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice {

	// this for all the controller present in the application
	// global error handler for all the controllers
	// handles the exception thrown by any of the controller

	@ExceptionHandler(Exception.class)
	public String exception(Exception exception, Model model) {
		model.addAttribute("exception", exception);
		return "errorHandler"; // searches for errorHandler.html
	}

}
