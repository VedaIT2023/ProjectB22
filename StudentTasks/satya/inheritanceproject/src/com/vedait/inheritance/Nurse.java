package com.vedait.inheritance;

	public class Nurse extends CommonProperties {
		

		String typeNurse;
		String qualification;
		Nurse(String name, String phoneNumber, int age, String timings, char gender,
				String typeNurse,String qualification){
			
			super(name, phoneNumber, age, timings, gender);
			// TODO Auto-generated constructor stub
			this.typeNurse=typeNurse;
			this.qualification=qualification;
		}

		
	}
