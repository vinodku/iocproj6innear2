package com.nt.beans;

public class person {
	private String name;
	private aadharcard age;
	
	//setters&getters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public aadharcard getAge() {
		return age;
	}

	public void setAge(aadharcard age) {
		this.age = age;
	}

	public String success() {
		return name+"   "+"received aadharcard";
	}

	
}
