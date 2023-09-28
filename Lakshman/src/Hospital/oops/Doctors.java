package com.Hospital.oops;

	public class Doctors extends CommonProps {

		Doctors(String name,char gender,int id,int age,String specialization,String mobileno,String timings ){
			super(name,gender,age,mobileno);
			this.specialization=specialization;
			this.timings=timings;
			this.id=id;
	   }
		String specialization,timings;
		int id;
		
		public String toString() {
			return  "Name :"+this.name+"\n"+ "Doctor ID :"+this.id+"\n"+"Gender :"+this.gender+"\n"+"Age :"+this.age+"\n"+"Specialization :"+this.specialization+"\n"+
			         "Mobile No :"+mobileno+"\n";
		}
		public String getName() {
			return  "Doctor Name :"+this.name+"\n"+ "Specialization :"+this.specialization+"\n"+ "Available Timings :"+this.timings;
		}
	

}

		
			
		
		

