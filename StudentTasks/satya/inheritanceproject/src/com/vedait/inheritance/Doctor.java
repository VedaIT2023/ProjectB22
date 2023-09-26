package com.vedait.inheritance;


	public class Doctor extends CommonProperties {
		
		String typeDoctors;
		String qualification;
		
		Doctor(String name, String phoneNumber, int age, String timings, char gender,
				String typeDoctors,	String qualification){
			
			super(name, phoneNumber, age,timings, gender);
			// TODO Auto-generated constructor stub
		this.typeDoctors=typeDoctors;
		this.qualification=qualification;
		
		
		
		}
		
	       void doctorEnteredHospital() {
		System.out.println("Doctor Entered the Hospital");
			
		}

		
		}
		
		

