package com.vedait.interfaces;

public class Doctor extends CommonProperties {
	
	
	String specialisation;
	
	
		Doctor(String name, String timings,String specialisation,char gender) {			
		super(name, timings,gender);
		// TODO Auto-generated constructor stub
		
		this.specialisation=specialisation;
	}
			
}
