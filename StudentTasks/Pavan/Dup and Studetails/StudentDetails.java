package com.vedait.dup.stuhash;

public class StudentDetails {

	 String name,idno,email,course;
	 int age;
	 char gender;
	
	StudentDetails(String name,String idno,String email,String course,int age,char gender){
		this.name = name;
		this.idno = idno;
		this.email = email;
		this.course = course;
		this.age = age;
		this.gender = gender;
		
	}
	
	public String details() {
		return "Name: " + name +  "\n" +
					"IdNo: " + idno + "\n" +
	               "Email: " + email + "\n" +
	               "Course: " + course + "\n" +
	               "Age: " + age + "\n" +
	               "Gender: " + gender + "\n" ;
	               
	}
}
