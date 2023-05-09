package com.rau;

public abstract class Student {
	
	 int roll;
	 String name;
 String state;
	public Student(int roll, String name, String state) {
		super();
		this.roll = roll;
		this.name = name;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", state=" + state + "]";
	}
	
	
	
	
	
	

}
