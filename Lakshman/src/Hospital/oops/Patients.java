package com.Hospital.oops;

public class Patients extends CommonProps{
	
	Patients(String name,char gender,int age,String disease,String mobileno) {
			super(name,gender,age,mobileno);
			this.disease=disease;
			
		}
		String disease;
		
		
		public String toString() {
			return  "Name :"+this.name+"\n"+"Gender :"+this.gender+"\n"+"Age :"+this.age+"\n"+"Disease :"+this.disease+"\n"+
		            "Mobile No :"+mobileno+"\n";
		}
		public String getName() {
			return name;
		}
		public String getDisease() {
			return disease;
		}
		
	}


