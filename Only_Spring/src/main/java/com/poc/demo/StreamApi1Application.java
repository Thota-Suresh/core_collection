package com.poc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StreamApi1Application {

	public static void main(String[] args) {
		
		 @SuppressWarnings("resource")
		ApplicationContext context =
				 new AnnotationConfigApplicationContext(ApplicationBean.class);
	        Person p =  context.getBean("person",Person.class);
	        p.setName("suresh");
	        p.setSno(12);
	        System.out.println(p);
	}

}
