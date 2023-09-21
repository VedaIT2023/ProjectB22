package com.vedait.inheritance;

	public class Staff extends CommonProperties {
		
		String department;
		int staffId;
		
		Staff(String name, String phoneNumber, int age, String timings, char gender,
				String department,int staffId) {
			super(name, phoneNumber, age, timings, gender);
			// TODO Auto-generated constructor stub
			this.department=department;
			this.staffId=staffId;
		
		}
		
		
	}

