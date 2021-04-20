package com.poc.demo;

public class Person {

	private int sno;
	private String name;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [sno=" + sno + ", name=" + name + "]";
	}
	
	
	
	
}
