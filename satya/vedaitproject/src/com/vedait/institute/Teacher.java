package com.vedait.institute;

public class Teacher {
	String name;
	String subname;
	int clsTime;
	char gender;
	String address;
	void startClass() {
		System.out.println("Sir Start the class");
	}
	void stopClass() {
		System.out.println("Sir Stop the class");
	}
	void startWritingProgram() {
		System.out.println("Sir Start Writing the Program");
	}
	void stopWritingProgram() {
		System.out.println("Sir Stop Writing the Program");
	}
	
	Teacher (String name,String subname,int clsTime,char gender,String address){
		this.name=name;
		this.subname=subname;
		this.clsTime=clsTime;
	    this.gender=gender;
		this.address=address;
		
	}

}
