package com.vedait.Hospital;

public class Patients extends Commonproperties {

	String problem;
	Patients(String fname, String lname, String email, String phno, int age, char gender,String problem) {
		super(fname, lname, email, phno, age, gender);
		this.problem = problem;
	}

	public String patient() {
		return "Name: "+fname+" "+lname+"\n"+"Email :" + email + "\n" +  "PhNo :" + phno +
				"\n" + "Age :" + age + "\n" + "Gender :" + gender + "\n"  +  "Problem of Patient :" + problem ;
		
		}
}
