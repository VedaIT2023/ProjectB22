package com.Hospital.oops;



public class DoctorProperties {
	String name,mobileno,specialization,timings;
	char gender;
	int id,age;
	
		DoctorProperties(String name,char gender,int id,int age,String specialization,String mobileno,String timings ){
			this.name=name;
			this.gender=gender;
			this.id=id;
			this.age=age;
			this.specialization=specialization;
			this.mobileno=mobileno;
			this.timings=timings;
	   }

		public String viewDoctorsList() {
			return  "Name :"+this.name+"\n"+ "Doctor ID :"+this.id+"\n"+"Gender :"+this.gender+"\n"+"Age :"+this.age+"\n"+"Specialization :"+this.specialization+"\n"+
			         "Mobile No :"+mobileno+"\n"+"Available Timings :"+this.timings+"\n";
		}

		public String getName() {
			return  "Doctor Name :"+this.name+"\n"+ "Gender :"+this.gender+"\n"+"Specialization :"+this.specialization+"\n"+
					"Available Timings :"+this.timings ;

        }
		
}

