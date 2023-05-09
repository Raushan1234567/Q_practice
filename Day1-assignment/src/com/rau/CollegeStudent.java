package com.rau;

public class CollegeStudent extends Student{

  String U_name;

	public CollegeStudent(int roll, String name, String state, String u_name) {
		super(roll, name, state);
		U_name = u_name;
	}

	@Override
	public String toString() {
		return "CollegeStudent [U_name=" + U_name + ", roll=" + roll + ", name=" + name + ", state=" + state + "]";
	}






	


	


	


	

	
	
}
