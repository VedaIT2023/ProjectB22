package com.vedait.Basic.Operations;

public class Student {
	String name,studentId, qualification,stream,phno;
	String email;
	int age;
	char gender;
	Student(String name, String studentId, String qualification, String stream, 
			String phno, String email,int age, char gender ){
		this.name = name;
		this.studentId = studentId;
		this.qualification = qualification;
		this.stream = stream;
		this.phno = phno;
		this.email = email;
		this.age = age;	
		this.gender = gender;
	}
	public String StudentDetails() {
        return "Name of the Person : " + name + "\nStudent Id :" +studentId + "\nQualification : " + qualification + "\nStream : " +
	stream + "\nPhone Number : " + phno +"\nEmail : " + email + "\nage: " + age   + "\ngender: " + gender ;
	}	

}
