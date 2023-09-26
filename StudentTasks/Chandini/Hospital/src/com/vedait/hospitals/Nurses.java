package com.vedait.hospitals;

public class Nurses {
	String name;
	int age;
	String gender;
	String address;
	String phoneNumber;
	String specialization;
	String licenseNumber;
	int yearsOfExperience;
	String timings;
	boolean isRegistered;
	Nurses(String name, int age, String gender,String address, String phoneNumber,String specialization, String licenseNumber, boolean isRegistered,String timings){
		this.name=name;
		this.specialization=specialization;
		this.age=age;
		this.gender=gender;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.licenseNumber=licenseNumber;
		this.isRegistered=isRegistered;
		this.timings=timings;
		this.address = address;
        this.phoneNumber = phoneNumber;

	}
}
