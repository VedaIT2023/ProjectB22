package com.hospital.appointment.form;

public class DoctorProperties {

	int docId, consultation, experience;
	String doc_Name, specialisation , email, ph_No, working , degree, gender;

	
	DoctorProperties(int docId,String doc_Name,String specialisation ,String email,String ph_No,int experience,String working ,String degree, int consultation,String gender){
		this.docId = docId;
		this.doc_Name = doc_Name;
		this.specialisation = specialisation;
		this.email =email;
		this.ph_No = ph_No;
		this.experience = experience;
		this.working = working;
		this.degree = degree;
		this.consultation = consultation;
		this.gender = gender;

	}
	
	public String drDetils() {
		return	"Doctor ID: "+docId+"\n"+
				"Doctor Name  :" + doc_Name + "\n" +
                "Specialization :" + specialisation + "\n"  +
                "Email: " + email + "\n" + 
                "Ph_No: " + ph_No + "\n" +
                "Experience: " + experience + "\n" +
                "Working: " + working + "\n" +
                "Degree: " + degree + "\n" +
                "Consultation: " + consultation + "\n" +
                "Gender: " + gender + "\n" ;
		

	}
	public String drDetails() {
		return "Doctor ID: "+docId+"\n"+
				"Doctor Name  :" + doc_Name + "\n" +
                "Specialization :" + specialisation + "\n";
	}

}
