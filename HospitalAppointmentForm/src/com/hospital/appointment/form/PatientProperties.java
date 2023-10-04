package com.hospital.appointment.form;

public class PatientProperties {

	String pname, problem, dateAndTime;
	int age, id;
	char gender;
	
	PatientProperties(int id, String pname, int age, char gender, String problem, String dateAndTime){
		this.id = id;
		this.pname = pname;
		this.age = age;
		this.problem = problem;
		this.dateAndTime = dateAndTime;
		
	}
	
	public String pDetials() {
		return "Patient ID: "+this.id+
				"\nName: "+this.pname+
				"\nAge: "+this.age+
				"\nProblem: "+this.problem
				+"\nDate and Time: "+this.dateAndTime;	
		}
}
