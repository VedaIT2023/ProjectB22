package com.vedait.Hospital;

public class Hospital {
 
	String name,location;
	Doctors doctors[];
	Nurse nurse[];
	Patients patient[];
	Staff staff[];
	Wards ward[];
	
	Hospital(String name,String location,Doctors doctors[],Nurse nurse[],Patients patient[],Staff staff[],Wards ward[]){
		this.name = name;
		this.location = location;
		this.doctors = doctors;
		this.nurse = nurse;
		this.patient = patient;
		this.staff = staff;
		this.ward = ward;
		}
	public String wards() {
		return "Name: "+ name + "\n"+  "Location :" + location  ;
		
		}
}
