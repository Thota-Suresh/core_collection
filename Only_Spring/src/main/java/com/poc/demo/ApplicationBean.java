package com.poc.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBean {

	 @Bean(name="person")
	    public Person getPerson(){
	        return new Person();
	    }
}
