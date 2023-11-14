package com.DataBase.sql;

	public class DoctorDetails {

		
			int docId, experience, consultation;
		     String doctorName,specialization,email,phoneNo,working,degree;
		     String gender;
		     public DoctorDetails(int docId, String doctorName, String specialization, String email, String phoneNo, int experience, String working, String degree, int consultation, String gender) {
		        this.docId = docId;
		        this.doctorName = doctorName;
		        this.specialization = specialization;
		        this.email = email;
		        this.phoneNo = phoneNo;
		        this.experience = experience;
		        this.working = working;
		        this.degree = degree;
		        this.consultation = consultation;
		        this.gender = gender;
		    }
		     public String  getDetails() {
		    	 return "Doctor ID: "+this.docId +"\nDoctor Name :"+this.doctorName+"\nSpecialisation :"+this.specialization+"\nEmail :"+ this.email+"\nPhone No :"+this.phoneNo+"\nExperiance :"+ this.experience+"\nWorking :"+this.working+"\nDegree :"+this.degree+"\nConsultation :"+ this.consultation+"\nGender :"+ this.gender;
		    	 
		     }
		     public String  getName() {
					return  "Doctor Name :"+this.doctorName+"\n"+ "Gender :"+this.gender+"\n"+"Specialization :"+this.specialization+"\n" ;
		     }
			public int getDocId() {
				return  this.docId;
			}

		}



