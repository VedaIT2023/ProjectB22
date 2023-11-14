package com.vedait.Hospital.Appointment;


public class Doctors  {
	int Doc_Id, Consultation, Experience;
	String Doc_Name, Specialisation , Email, Ph_No, Working , Degree, Gender;
	
	Doctors(int Doc_Id, String Doc_Name,String Specialisation ,String Email,String Ph_No,int Experience,String Working ,String Degree, int Consultation,String Gender){
		

		this.Doc_Id =Doc_Id;
		this.Doc_Name = Doc_Name;
		this.Specialisation = Specialisation;
		this.Email =Email;
		this.Ph_No = Ph_No;
		this.Experience = Experience;
		this.Working = Working;
		this.Degree = Degree;
		this.Consultation = Consultation;
		this.Gender = Gender;
	}
    
	public String toString(){
		return  "Doctor ID:" + Doc_Id+"\n" 
				+ "Doctor Name  :" + Doc_Name + "\n" +
                "Specialization :" + Specialisation + "\n"  +
                "Email :" + Email + "\n" + 
                "Ph_No :" + Ph_No + "\n" +
                "Experience :" + Experience + "\n" +
                "Working :" + Working + "\n" +
                "Degree :" + Degree + "\n" +
                "Consultation :" + Consultation + "\n" +
                "Gender :" + Gender + "\n" ;
		
	}
		
		       
	
	public int getId() {
		return Doc_Id;
	}
	
}
