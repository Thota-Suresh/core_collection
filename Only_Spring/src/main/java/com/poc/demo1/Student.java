package com.poc.demo1;

public class Student {

	private int sno;
	private String name;
	
	
	
	
//	public Student() {
//		super();
//	}
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
	
}
