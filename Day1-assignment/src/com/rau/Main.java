package com.rau;

import java.util.ArrayList;
import java.util.List;

public class Main { 
	static void findStudentWithSameState(List<?  super Student> st, List<? extends Student> list1, List<? extends Student> list2, String state) {
		
		for(Student a:list1) {
			if(a.state.equals(state)) {
				st.add(a);
			}
		}
		
		for(Student a:list2) {
			if(a.state.equals(state)) {
				st.add(a);
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
public static void main(String[] args) {
		
		List<SchoolStudent> sstu=new ArrayList<>();
		
		sstu.add(new SchoolStudent(12, "Raushan", "Bihar", "aku7"));
		sstu.add(new SchoolStudent(32, "Raushan1", "Bihar45", "5"));
		sstu.add(new SchoolStudent(62, "Raushan2", "Bihar343", "aku34"));
		sstu.add(new SchoolStudent(82, "Raushan3", "Bihar78", "aku"));
		sstu.add(new SchoolStudent(92, "Raushan4", "Bihar123", "aku0"));
		
		
List<CollegeStudent> sstu1=new ArrayList<>();
		
		sstu1.add(new CollegeStudent(12, "Raushan", "Bihar343", "aku7"));
		sstu1.add(new CollegeStudent(32, "Raushan1", "Bihar343", "5"));
		sstu1.add(new CollegeStudent(62, "praushan2", "Bihar343", "aku34"));
		sstu1.add(new CollegeStudent(12, "traaushan3", "fihar78", "aku"));
		sstu1.add(new CollegeStudent(22, "craaushan4", "Bihar123", "aku0"));
		
		
List<Student> st=new ArrayList<>();
findStudentWithSameState(st,sstu,sstu1,"Bihar343");
st.forEach(System.out::println);

	}

}
