package com.veda.it;

public class Employee {
     
	 String name;
	 String email;
	 char gender;
	 int id;
	 double salary;
	 String address;
	 
	 void startDutyTime() {
		 System.out.println("start working on institute");
	 }
	 void stopDutyTime() {
		 System.out.println("stop working on institute");

	 }
	 
	 Employee(String name,char gender,int id,double salary,String address,String email){
		 this.name=name;
		 this.address= address;
		 this.gender= gender;
		 this.id =id;
		 this.email=email;
		 
	 }
	 
}
