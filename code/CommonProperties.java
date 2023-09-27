package com.hospital.code;

public class CommonProperties {

	String name, email, day;
	int age;
	char gender;
	
	CommonProperties(String name, int age, char gender, String email,String day){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.day = day;
		
	}
	public String details(){
		return "Name: "+this.name+
				"\nAge: "+this.age
				+"\ngender: "+this.gender+
				"\nEmail: "+this.email+
				"\nDay: "+this.day;
		}
}
