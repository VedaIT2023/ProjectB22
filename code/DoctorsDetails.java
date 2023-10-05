package com.hospital.code;

public class DoctorsDetails extends CommonProperties {

	String specialization, timings, job;
	DoctorsDetails(String job, String name,int age, char gender, String email, String day, String specialization,String timings) {
		super(name, age, gender, email, day);
		this.job = job;
		this.specialization = specialization;
		this.timings = timings;
	}
	
	public String details() {
        return super.details() +"\nJob: "+this.job+
                "\nSpecialization: " + this.specialization +
                "\nTimings: " + this.timings+"\n";
    }
	public String values() {
        return "\nJob: " +this.job+"\nName: "+this.name +
                "\nSpecialization: " + this.specialization +
                "\nTimings: " + this.timings;
    }

}
