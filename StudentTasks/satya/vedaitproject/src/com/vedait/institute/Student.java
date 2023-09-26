package com.vedait.institute;

public class Student {
	String firstName;
	String lastName;
	String className;
	int stdId;
	
	void listingClass() {
		System.out.println("Student Listening the Class");
	}
	void  stopListingClass() {
		System.out.println("Student  Stop Listening the Class");
	}
	void studentWorking() {
		System.out.println("Student doing their work");
	}
	void studentStopWorking() {
		System.out.println("Student Stop doing their work");
	}
	 Student(String firstName,String lastName,String className,int stdId){
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.className=className;
		 this.stdId=stdId;
	 }

}


