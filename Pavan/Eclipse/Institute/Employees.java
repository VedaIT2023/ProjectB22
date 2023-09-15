package com.vedait.Institute;

public class Employees {

	String name,email,role;
	char gender;
	long phno,salary;
	
	void payment() {
		System.out.println(this.name + " will receive the payments from the students");
	}
	
	void detail()
	{
		System.out.println(this.name + " will save the details of the students in the system");
	}
	
	Employees(String name,String email,String role,char gender,long phno,long salary){
		
		this.name = name;
		this.email = email;
		this.role = role;
		this.gender = gender;
		this.phno  = phno;
		this.salary = salary;
	}
	public String employees () {
        return "Name: " + name +  "\n" +
               "Email: " + email + "\n" +
               "Gender: " + gender + "\n" +
               "Phone Number: " + phno + "\n" +
               "Role: " + role +"\n" + "Salary: " + salary;
	}
}



