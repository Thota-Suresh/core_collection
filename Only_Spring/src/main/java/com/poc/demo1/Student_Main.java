package com.poc.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Student_Main {

	public static void main(String[] args) {

		ApplicationContext context 
		= new AnnotationConfigApplicationContext(ApplicationBeans.class);
		Student st = context.getBean("student",Student.class);
	
		System.out.println(st);
	}

}
