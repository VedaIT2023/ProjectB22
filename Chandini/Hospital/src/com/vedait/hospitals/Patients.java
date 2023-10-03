package com.vedait.hospitals;

public class Patients {
	String name;
	int age;
	String gender;
	String address;
	String phoneNumber;
	String patientID;
    String medicalHistory;
    public Patients(String patientID, String name, int age, String gender, String address, String phoneNumber, String medicalHistory) {
   	 this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.medicalHistory = medicalHistory;
    }

}
