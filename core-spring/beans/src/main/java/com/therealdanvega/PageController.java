package com.therealdanvega;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.foo.NotificationService;
import com.abc.foo.User;

@RestController
public class PageController {

    // autowiring the notificationService
	@Autowired
    private NotificationService notificationService;
	
	
	
	
	

   
    
    @RequestMapping("/")
    public String home(){
        return notificationService.toString();
    }

}
