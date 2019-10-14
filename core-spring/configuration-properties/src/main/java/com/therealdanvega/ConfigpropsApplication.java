package com.therealdanvega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@EnableConfigurationProperties
public class ConfigpropsApplication {

    public static void main(String[] args) {
    	
    	//setting the application context
        ApplicationContext ctx = SpringApplication.run(ConfigpropsApplication.class, args);
        
        
        //calling the bean created 
        MyAppConfig config = (MyAppConfig) ctx.getBean("myAppConfig");
        
        
        //printing the contents within the bean i.e "myAppConfig" is bean of type @Component
        System.out.println(config.toString());
    }

}
