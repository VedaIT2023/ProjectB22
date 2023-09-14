package com.vedait.Hospitals;

public class Staff extends Commonproperties {
	String role,salary;
	Staff(String fname, String lname, String email, String phonenumber, int age, char gender,String role,String salary) {
		super(fname, lname, email, phonenumber, age, gender);
		this.role = role;
		this.salary = salary;
	}
	public String staffs() {
		return "Name: "+fname+" "+lname+"\n"+"Email :" + email + "\n" +  "Phonenumber :" + phonenumber +
				"\n" + "Age :" + age + "\n" + "Gender :" + gender + "\n"  +  "Role:" + role + 
				"\n" + "Salary :" + salary;
	}

}
