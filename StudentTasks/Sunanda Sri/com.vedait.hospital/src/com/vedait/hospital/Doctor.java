package com.vedait.hospital;

public class Doctor {
String doctorname,specialization,time;
	
	Doctor(String doctorname,String specialization,String time ){
		
		this.doctorname = doctorname;
		this.specialization = specialization;
		this.time = time;
		
		
	}
	public String detailsofDoc(){
		return  String.format(" %-20s  %-20s  %-20s %n" ,doctorname ,specialization , time );
		
	}
}
