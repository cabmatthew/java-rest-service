package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This annotation encompasses 3 annotations:
 * @Configuration: Tags the class as a source of bean definitions for app context
 * 
 * @EnableAutoConfiguration: Tells Spring Boot to start adding beans 
 * (based on settings, like classpath)
 * 
 * @ComponentScan: Tells Spring to look for other components/configuration/services
 * Looks in 'com/example' package
 * 
 * No XML. Maybe building other stuff for XML is usually required. Not here!
 */
@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
