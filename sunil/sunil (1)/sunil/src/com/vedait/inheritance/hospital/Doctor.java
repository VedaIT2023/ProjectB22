package com.vedait.inheritance.hospital;

public class Doctor extends CommonProperties{
	String qualification;
	String specialization;
	Doctor(String name, String mobileNumber, String email, String gender, int age,String qualification,String specialization) {
		super(name, mobileNumber, email, gender, age);
		this.qualification=qualification;
		this.specialization=specialization;
		
	}

}
