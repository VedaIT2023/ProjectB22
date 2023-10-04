package com.vedait.Hospital.Appointment;


public class Doctors  {
	int doctorid;
	String doctorname;
	String specialization;
	String time;
	
	Doctors(String doctorname,String specialization,int doctorid,String time){
		
		this.doctorid = doctorid;
		this.doctorname = doctorname;
		this.specialization = specialization;
		this.time = time;
	}
    
	public String toString(){
		return  "Doctor ID:" + doctorid+"\n" 
				+ "Doctor Name  :" + doctorname + "\n" +
                "Specialization :" + specialization + "\n" +
				"Timings :" + time + "\n" ;
		
	}
		
		       
	
	public int getId() {
		return doctorid;
	}
	
}
