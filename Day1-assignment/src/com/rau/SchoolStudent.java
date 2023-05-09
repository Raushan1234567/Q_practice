package com.rau;

public class SchoolStudent extends Student{

	
	 String b_name;
	
	public SchoolStudent(int roll, String name, String state, String b_name) {
		super(roll, name, state);
		this.b_name = b_name;
	}

	@Override
	public String toString() {
		return "SchoolStudent [b_name=" + b_name + ", roll=" + roll + ", name=" + name + ", state=" + state + "]";
	}


	

	
	

	
}
