package com.hospital.appointment.form;

public class DoctorProperties {

	String id, drname,email, specialization, Time, days;
	int age;
	char gender;
	
	DoctorProperties(String id, String drname, int age, char gender, String specialization,String email, String Time, String days){
		this.id = id;
		this.drname = drname;
		this.age = age;
		this.gender = gender;
		this.specialization = specialization;
		this.email = email;
		this.Time = Time;
		this.days = days;
	}
	
	public String drDetils() {
		return "Dr.Id: "+this.id+
				"\nDr.Name: "+this.drname+
				"\nAge: "+this.age+
				"\nGender: "+this.gender+
				"\nSpecialization: "+this.specialization+
				"\nEmail: "+this.email+
				"\nTime: "+this.Time+
				"\nDays: "+this.days;
	}

}
