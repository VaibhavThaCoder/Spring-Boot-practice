package com.therealdanvega.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.therealdanvega.domain.Post;

@Controller
@RequestMapping("/posts")
public class PostController {

	private static final Logger logger = LoggerFactory.getLogger(PostController.class);

	@RequestMapping("/get/{slug}")

	// exception handling done at the controller level
	public String getPost(@PathVariable(value = "slug") String slug) throws Exception {
		Post post = null;

		// we are trying to access a null object here
		if (post == null)
			throw new Exception("We couldn't find the post with slug: " + slug);
		return "post";
	}

	// this @ExceptionHandler will handle all the exception at controller level and
	// will redirect us postError.html page in /templates
	
	
//this was specific to /posts/get/jhh api	
//	@ExceptionHandler(Exception.class)
//	public String handleException(HttpServletRequest req, Exception exception, Model model) {
//		model.addAttribute("errorMessage", exception.getMessage());
//		return "postError"; //sderaches for postError.html page
//	}
	
	//by commenting out this it will gor @ControllerAdvice class and will show global handler exception

}
