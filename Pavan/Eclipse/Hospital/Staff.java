package com.vedait.Hospital;

public class Staff extends Commonproperties {

	String role,salary;
	Staff(String fname, String lname, String email, String phno, int age, char gender,String role,String salary) {
		super(fname, lname, email, phno, age, gender);
		this.role = role;
		this.salary = salary;
	}
	public String staffs() {
		return "Name: "+fname+" "+lname+"\n"+"Email :" + email + "\n" +  "PhNo :" + phno +
				"\n" + "Age :" + age + "\n" + "Gender :" + gender + "\n"  +  "Role:" + role + 
				"\n" + "Salary :" + salary;
		
		}

}
