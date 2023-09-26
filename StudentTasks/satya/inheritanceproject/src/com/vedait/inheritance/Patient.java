package com.vedait.inheritance;

	public class Patient extends CommonProperties  {
		
		String typeDisease;

		Patient(String name, String phoneNumber, int age, String timings, char gender,
				String typeDisease) {
			super(name, phoneNumber, age, timings, gender);
			// TODO Auto-generated constructor stub
			this.typeDisease=typeDisease;
		}

		
		
		

	}

