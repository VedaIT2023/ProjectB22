package com.vedait.inheritance.hospital;

public class Nurse extends CommonProperties{
	String post;
	int salary;
	Nurse(String name, String mobileNumber, String email, String gender, int age,String post,int salary) {
		super(name, mobileNumber, email, gender, age);
		this.post=post;
		this.salary=salary;
	}

}
