package com.Hospital.oops;

public class Doctors {
	String name,mobileno,specialization,days;
	char gender;
	int id,age;
	
		Doctors(String name,char gender,int id,int age,String specialization,String mobileno,String days ){
			this.name=name;
			this.gender=gender;
			this.id=id;
			this.age=age;
			this.specialization=specialization;
			this.mobileno=mobileno;
			this.days=days;
	   }
		
		public String toString() {
			return  "Name :"+this.name+"\n"+ "Doctor ID :"+this.id+"\n"+"Gender :"+this.gender+"\n"+"Age :"+this.age+"\n"+"Specialization :"+this.specialization+"\n"+
			         "Mobile No :"+mobileno+"\n";
		}
		public String getName() {
			return  "Doctor Name :"+this.name+"\n"+ "Specialization :"+this.specialization+"\n"+ "Available Days :"+this.days;
		
		}
}
		
		

