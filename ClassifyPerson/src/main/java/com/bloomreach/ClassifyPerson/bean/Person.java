package com.bloomreach.ClassifyPerson.bean;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String sex;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(String sex, int age) {
		super();
	this.age=age;
		this.sex = sex;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
