package com.vedait.inheritance.hospital;

public class Patient extends CommonProperties{
	String problem;
	
	int fee ;
	
	Patient(String name, String mobileNumber, String email, String gender, int age,String problem,int fee ) {
		super(name, mobileNumber, email, gender, age);
	this.problem=problem;
	this.fee=fee;
		
	}

}
