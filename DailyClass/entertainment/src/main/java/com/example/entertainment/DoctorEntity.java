package com.example.entertainment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor_details")
public class DoctorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doc_Id;
	
	private String d_name;
	
	private String specialisation;
	
	private Long consultation;
	
	private String gender;
	
	private int experience; 
	
	
	
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getConsultation() {
		return consultation;
	}

	public void setConsultation(Long consultation) {
		this.consultation = consultation;
	}

	public int getDoc_Id() {
		return doc_Id;
	}

	public void setDoc_Id(int doc_Id) {
		this.doc_Id = doc_Id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	
	
	
	
}
