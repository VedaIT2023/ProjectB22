package com.vedait.Hospitals;

public class Doctors {

	String doctorname,specialization,time;
	
	Doctors(String doctorname,String specialization,String time ){
		
		this.doctorname = doctorname;
		this.specialization = specialization;
		this.time = time;
		
		
	}
	public String detailsofDoc(){
		return  String.format(" %-10s  %-19s  %-10s %n" ,doctorname ,specialization , time );
		
	}
}
