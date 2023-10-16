package com.vedhait.Application.Form;
import java.util.ArrayList;

public class Doctors {
	int DoctorId,Fee,Experience;
   String DoctorName, Specialisation, Email,Working,Degree,Gender;
   static ArrayList<Doctors> doctorsList;

    Doctors(int DoctorId, String DoctorName, String Specialisation, String Email, int Experience, String Working,String Degree,
    		int Fee,String Gender) {
        this.DoctorId = DoctorId;
        this.DoctorName = DoctorName;
        this.Specialisation = Specialisation;
        this.Email = Email;
        this.Experience = Experience;
        this.Working = Working;
        this.Degree = Degree;
        this.Fee = Fee;
        this.Gender = Gender;
    }

    public void displayDoctorInfo() {
    	System.out.println("ID No: " + DoctorId);
        System.out.println("Name of the Doctor: " + DoctorName);
        
        System.out.println("Specialisation: " + Specialisation);
        System.out.println("Email: " + Email);
        System.out.println("Experience: " + Experience);
        System.out.println("Working: " + Working);
        System.out.println("Degree: " + Degree);
        System.out.println("Fee: " + Fee);
        System.out.println("Gender: " + Gender);
    }
    
    
    
        
	public int getDoctorId() {
		return DoctorId;
	}
}
