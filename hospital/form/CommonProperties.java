package com.hospital.form;

public class CommonProperties {

	String name, days, time;
	int age;
	char gender;
	
	CommonProperties(String name, int age, char gender, String days, String time){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.days = days;
		this.time = time;
		
	}

	public String details(){
		return "Name: "+this.name+
				"\nAge: "+this.age
				+"\nGender: "+this.gender+
				"\nDay: "+this.days+
				"\nTime: "+this.time;
		}
}
