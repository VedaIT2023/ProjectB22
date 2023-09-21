package com.vedait.inheritance;

public class Hospital {
	String name;
	 Doctor doctors[];
	 Nurse nurse[];	
	 Staff staff[];
	Patient patient[];
	Ward wards[];
	Room rooms[];
	
	void hospitalOpen() {
		System.out.println("Hospital Open");
	}
		void hospitalClose() {
			System.out.println("Hospital Close");
		
	}
	 Hospital(String name, Doctor doctors[], Nurse nurse[],Staff staff[],Patient patient[],
			Ward wards[],Room rooms[]){
		this.name=name;
		this.doctors=doctors;
		this.nurse=nurse;
		this.patient=patient;
		this.staff=staff;
		this.wards=wards;
		this.rooms=rooms;
		
	}
}

