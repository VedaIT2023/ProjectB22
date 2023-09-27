package com.vedait.hospital;

public class Patient {
	
String patientname,problem;
	
	Patient(String patientname,String problem){
		this.patientname = patientname;
		this.problem = problem;
		
	}
	
	public String detalsOfPat() {
		return String.format(" %-20s %-20s %n",patientname,problem) ;
	}
	
}
