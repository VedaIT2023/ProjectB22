package com.vedait.institute.student.details;

public class Properties {
	
	String names, email, phnoNo, qualifications, address;
	char gender;
	int age;
	
	Properties(String names, int age, char gender, String phnoNo, String email,  String qualifications, String address){
		this.names = names;
		this.age = age;
		this.gender = gender;
		this.phnoNo = phnoNo;
		this.email = email;
		this.qualifications = qualifications;
		this.address = address;

	}
	
	public String toString() {
		return "Student_Name: "+this.names+"\n"
				+"Age: "+this.age+"\n"
				+"Gender: "+this.gender+"\n"
				+"Phone_Numbers: "+phnoNo+"\n"
				+"Email: "+this.email+"\n"
				+"Course: "+this.qualifications+"\n"+
				"Address: "+this.address+"\n";
	}
}
