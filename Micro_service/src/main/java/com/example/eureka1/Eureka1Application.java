package com.example.eureka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eureka1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka1Application.class, args);
	}

}
