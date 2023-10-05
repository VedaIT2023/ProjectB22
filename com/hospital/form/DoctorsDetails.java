package com.hospital.form;


public class DoctorsDetails {

	String name, email, days;
	int age;
	char gender;
	
	String specialization, timings, job;
	DoctorsDetails(String name,int age, char gender, String email, String days, String specialization,String timings) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.days = days;
		this.specialization = specialization;
		this.timings = timings;
	}
	
	public String details() {
        return 		"Name: "+this.name+
					"\nAge: "+this.age
					+"\ngender: "+this.gender+
					"\nEmail: "+this.email+
					"\nDays: "+this.days+
                "\nSpecialization: " + this.specialization +
                "\nTimings: " + this.timings+"\n";
    }

}
