package com.DataBase.sql;

	public class AppointmentDetails {
		int patient_id,doc_id;
		String patient_problem;
		
		AppointmentDetails(int patient_id,int doc_id,String patient_problem){
			this.patient_id = patient_id;
			this.doc_id = doc_id;
			this.patient_problem = patient_problem;
		}
		public String getApp() {
			return "Patinent ID: "+this.patient_id+
					"\nDoctor ID : "+this.doc_id+
					"\nAge : "+this.patient_problem;
		}
	}


