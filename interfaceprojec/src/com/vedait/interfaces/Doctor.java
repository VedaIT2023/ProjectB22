package com.vedait.interfaces;

public class Doctor {
	String name;
	int id;		
	String specialisation;			
	String phoneNumber;
	String email;
	String timings;
	public boolean isBooked;
	
		
	 public Doctor(String name,int id,String specialisation,String phoneNumber,String email,String timings){
		this.name=name;
		this.id=id;
		this.specialisation=specialisation;
		this.phoneNumber=phoneNumber;
		this.email=email;
		this.timings=timings;
	}

	 public boolean isPatientBooked(int patientId, String patientName) {
			// TODO Auto-generated method stub
			return false;
	 }

	public void addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		
	}	
}
