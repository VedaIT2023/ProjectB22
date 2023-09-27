package com.vedait.Hospitals;

public class Nurse extends Commonproperties {

	String qualification,salary;
	Nurse(String fname, String lname, String email, String phonenumber, int age, char gender,String qualification,String salary) {
		super(fname, lname, email, phonenumber, age, gender);
		
		this.qualification = qualification;
		this.salary = salary;
	}

	public String nurse() {
		return "Name: "+fname+" "+lname+"\n"+"Email :" + email + "\n" +  "phonenumber :" + phonenumber +
				"\n" + "Age :" + age + "\n" + "Gender :" + gender + "\n"  + "Qualification :"
			+ qualification + "\n" +  "Salary :" + salary;
		
	}

}
