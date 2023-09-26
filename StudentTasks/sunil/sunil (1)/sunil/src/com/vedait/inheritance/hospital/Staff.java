package com.vedait.inheritance.hospital;

public class Staff extends CommonProperties {

		String post;
		int salary;
	Staff(String name, String mobileNumber, String email, String gender, int age,String post,int salary) {
		super(name, mobileNumber, email, gender, age);
		this.post=post;
		this.salary=salary;
		
	}

}
