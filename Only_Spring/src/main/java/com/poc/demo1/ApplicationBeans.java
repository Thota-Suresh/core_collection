package com.poc.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeans {

	@Bean(name="student")
	public Student  stduentData() {
		return new Student(12, "suresh");
	}
}
