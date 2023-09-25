package com.pack.code;

public class Student {
	
	 String name, phNo, email, course;
	 int age;
	 char gender;
	 
	 Student(String name, int age, char gender, String email,String phNo,String course){
		 this.name = name;
		 this.age = age;
		 this.gender = gender;
		 this.email = email;
		 this.phNo = phNo;
		 this.course = course;
	 }
	 
	 public String toString() {
		 return "Name: "+this.name+"\n"+
				 "Age: "+this.age+"\n"+
				 "Gender: "+this.gender+"\n"+
				 "Email: "+this.email+"\n"+
				 "PhNo: "+this.phNo+"\n"+
				 "Course: "+this.course;
	 }

}
