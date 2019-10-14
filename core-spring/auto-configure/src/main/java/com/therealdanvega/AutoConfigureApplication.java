package com.therealdanvega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan

//all the above three annotations are  included in @SpringBootApplication so you can use all them 3 or a single doesnt make any difference
//@SpringBootApplication
public class AutoConfigureApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoConfigureApplication.class, args);
	}
}
