package com.Hospital.oops;

public class PatientDetails {

		String name,problem,mobileno;
		int id,age;
		
		PatientDetails(int id,String name,int age,String problem,String mobileno){
			this.id=id;
			this.name=name;
			this.age=age;
			this.problem=problem;
			this.mobileno=mobileno;
		}
		
		public String toString() {
			return "Patinent ID: "+this.id+
					"\nName: "+this.name+
					"\nAge: "+this.age+
					"\nProblem: "+this.problem+
					"\nMobile No: "+this.mobileno;
			
			
		}
		
		
	}

