package com.vedait.hospitals;

public class Persons{
	class Doctors extends commonPerson{
		String specilization;
		String licenseNumber;
		int yearsOfExperience;
		String timings;
		Doctors(String name,int age,String gender,String address, String phoneNumber,String specilization,String licenseNumber,String timings){
			super(name,age,gender, address,phoneNumber);
			this.name=name;
			this.specilization=specilization;
			this.age=age;
			this.gender=gender;
			this.address=address;
			this.phoneNumber=phoneNumber;
			this.licenseNumber=licenseNumber;
			this.yearsOfExperience=yearsOfExperience;
			this.timings=timings;
			
		}
		
	}
	class Nurses extends commonPerson{
		String licenseNumber;
		int yearsOfExperience;
		String timings;
		boolean isRegistered;
		Nurses(String name, int age, String gender,String address, String phoneNumber,String specialization, String licenseNumber, boolean isRegistered,String timings){
			super(name,age,gender, address,phoneNumber);
			this.licenseNumber=licenseNumber;
			this.isRegistered=isRegistered;
			this.timings=timings;
			this.address = address;
	        this.phoneNumber = phoneNumber;
	
		}
		
	}
	class Patients extends commonPerson{
		 String patientID;
	     String medicalHistory;
	     public Patients(String patientID, String name, int age, String gender, String address, String phoneNumber, String medicalHistory) {
	    	 super(name,age,gender, address,phoneNumber);
	    	 this.patientID = patientID;
	         this.name = name;
	         this.age = age;
	         this.address = address;
	         this.phoneNumber = phoneNumber;
	         this.gender = gender;
	         this.medicalHistory = medicalHistory;
	     }
		
	}
	class Workers extends commonPerson{
		String work;
		String shift;
		int shiftDuration;
		Workers(String name,int age,String gender, String address, String phoneNumber,String work,String shift,int shiftDuration){
			super(name,age,gender, address,phoneNumber);
			this.work=work;
			this.shift=shift;
			this.shiftDuration=shiftDuration;
		}
		
		
	}
	

}
