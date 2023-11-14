package com.DataBase.sql;

public class PatientDetails {
	String p_name,problem,email,gender,phone_number;
	
	int age;	
		
	PatientDetails(String p_name,int age,String problem,String email,String gender,String phone_number){
			
			this.p_name=p_name;
			this.age=age;
			this.problem=problem;
			this.email=email;
			this.gender=gender;
			this.phone_number=phone_number;
		}
		public String getPatient() {
			return "\nName : "+this.p_name+
					"\nAge : "+this.age+
					"\nProblem : "+this.problem+
					"\nEmail : "+this.email+
					"\nGender : "+this.gender+
					"\nMobile No : "+this.phone_number;		
	}

}
