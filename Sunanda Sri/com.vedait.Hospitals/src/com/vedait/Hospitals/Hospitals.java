package com.vedait.Hospitals;

public class Hospitals {

	String name,location;
	Doctors doctors[];
	Nurse nurse[];
	patients patient[];
	Staff staff[];
	wards ward[];
	
	Hospitals(String name,String location,Doctors doctors[],Nurse nurse[],patients patient[],Staff staff[],wards ward[]){
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
