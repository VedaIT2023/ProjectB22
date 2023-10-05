package com.hospital.form;


public class DoctorsDetails extends CommonProperties {

	String email, specialization;
	DoctorsDetails(String name,int age, char gender, String email, String days, String specialization,String timings) {
		super(name,age,gender, days, timings);
		this.email = email;
		this.specialization = specialization;
	}
	
	public String details() {
        return 	super.details()+
        		"\nEmail: "+this.email+
        		"\nDays: "+this.days+
                "\nSpecialization: " + this.specialization +
                "\nTimings: " + this.time+"\n";
    }


}
