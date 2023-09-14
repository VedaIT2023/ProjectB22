package com.vedait.Hospitals;

public class patients extends Commonproperties {


	String problem;
	patients(String fname, String lname, String email, String phonenumber, int age, char gender,String problem) {
		super(fname, lname, email, phonenumber, age, gender);
		this.problem = problem;
	}

	public String patient() {
		return "Name: "+fname+" "+lname+"\n"+"Email :" + email + "\n" +  "Phonenumber :" + phonenumber +
				"\n" + "Age :" + age + "\n" + "Gender :" + gender + "\n"  +  "Problem of Patient :" + problem ;

	
	}

}
