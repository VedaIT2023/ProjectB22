package com.vedait.inheritance.city;

public class Hospital {
	String name;
	int doctors;
	int nurses;
	int beds;
	int ot;
	int femaleWards;
	int maleWards;
	
	
	void startOperation() {
		System.out.println("Operation has Started");
	}
	void stopOperation() {
		System.out.println("Operation has Ended");
	}
	Hospital(String name,int doctors,int nurses,int beds,int ot,int femaleWards,int maleWards){
		this.name=name;
		this.doctors=doctors;
		this.nurses=nurses;
		this.beds=beds;
		this.ot=ot;
		this.femaleWards=femaleWards;
		this.maleWards=maleWards;
	}
}
