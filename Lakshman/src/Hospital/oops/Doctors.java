package com.Hospital.oops;

	public class Doctors extends CommonProps {
	

		Doctors(String name,char gender,int age,String specialization,String mobileno,String timings ){
			super(name,gender,age,mobileno);
			this.specialization=specialization;
			this.timings=timings;
	   }
		String specialization,timings;
		
		public String toString() {
			return  "Name :"+this.name+"\n"+"Gender :"+this.gender+"\n"+"Age :"+this.age+"\n"+"Specialization :"+this.specialization+"\n"+
			         "Mobile No :"+mobileno+"\n";
		}
		public String getName() {
			return name;
		}
		public String getSpecialization() {
			return specialization;
		}
		public String getTimings() {
			return timings;
		}

}

		
			
		
		

