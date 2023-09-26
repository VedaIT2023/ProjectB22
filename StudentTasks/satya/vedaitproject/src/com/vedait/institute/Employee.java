
	package com.vedait.institute;

	public class Employee {
		String name;
		char gender;
		int id;
		double salary;
		String address;
		
		void startDuty() {
			System.out.println("Start working on their Duty");
		}
		void stopDuty() {
			System.out.println("Stop working on their Duty");
		}
		
		Employee(String name,char gender,int id,double salary,String address){
			this.name=name;
			this.gender=gender;
			this.id=id;
			this.salary=salary;
			this.address=address;
		}
		

	}

