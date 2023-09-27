package com.hospital.code;

public class PatientsDetails extends CommonProperties {

	String problem;
	PatientsDetails(String name,int age, char gender,String email,String problem, String day) {
		super(name,age, gender,email, day);
		this.problem = problem;
		this.day = day;

	}
	
	public String details() {
        return super.details() +
                "\nProblem: " + this.problem+
                "\nDay: "+this.day+"\n";
    }
	public String values() {
        return "Name: "+this.name+"\nProblem: " + this.problem+
                "\nDay: "+this.day;
    }
} 


