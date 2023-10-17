package com.vedait.interfaces;

public class Patient extends CommonProperties {
	
	String typeProblem;
	
	Patient(String name, String timings,String typeProblem,char gender) {
		super(name, timings,gender);
		// TODO Auto-generated constructor stub
		this.typeProblem=typeProblem;
		
	}

}
