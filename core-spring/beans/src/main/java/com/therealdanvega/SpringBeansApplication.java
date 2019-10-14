package com.therealdanvega;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.abc.foo.User;

@ComponentScan({"com.therealdanvega","com.abc.foo"})
@SpringBootApplication
public class SpringBeansApplication {

	
	//created a new bean "User" with @Bean annotation
	// a bean is a simple java object
	
	//User class was just having getters and setters and some constructors
	// there were no annotations used for this user class 
	// so we created a constructor here to initialize the User bean
	// and finally call the toString() of the same class to print the first name and last name 
	@Bean
    public User user(){
        return new User("Vaibhav","Pawar","vaibhavpawar@vmail.com");   	
    	
    }



    public static void main(String[] args) {
 
    	
//    	User usr=new User();
//    	
//    	usr.setFirstName("Vaibhav");
//    	usr.setLastName("Pawar");
//    	System.out.println("---->>>>>>>"+usr.toString());
    	//we can access the Java Class like above
    	
    	
    	//creating the instance of ApplicationContext 
        ApplicationContext ctx = SpringApplication.run(SpringBeansApplication.class, args);

        //getting the name of the beans from the application context
        String[] beanNames = ctx.getBeanDefinitionNames();
        
        //sorting the name of the beans
        Arrays.sort(beanNames);
        
        // print name of the bean
        for( String name : beanNames ){
            System.out.println(name);
        }
       // getBean() will be used to retrieve the method in the bean
        
             System.out.println( ctx.getBean("user").toString());
 
     
       System.out.println( ctx.getBean("myNotificationService").toString());
       System.out.println( ctx.getBean("myNotificationService") );
       

    }

	
}
