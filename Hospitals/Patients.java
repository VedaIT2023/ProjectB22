package com.vedait.Hospitals;

public class Patients {

	String patientname,problem;
	
	Patients(String patientname,String problem){
		this.patientname = patientname;
		this.problem = problem;
		
	}
	
	public String detalsOfPat() {
		return String.format(" %-10s %-20s %n",patientname,problem) ;
	}
	
}
