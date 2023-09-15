package com.City.task;

public class Hospital {
	String name;
	int beds;
	int patients;
	int doctors;
	int genralwards;
	int oxygencylinders;
	
		void nurse() {
			System.out.println(this.name +"nurse wil do normal checkup");
		}
		void doctor(){
			System.out.println(this.patients +"doctor will do surgery");
		}
			Hospital(String name,int beds,int patints,int doctors,int genralwards,int oxygencylinders){
				this.name=name;
				this.beds=beds;
				this.patients=patints;
				this.doctors=doctors;
				this.genralwards=genralwards;
				this.oxygencylinders=oxygencylinders;			 
			}
}
