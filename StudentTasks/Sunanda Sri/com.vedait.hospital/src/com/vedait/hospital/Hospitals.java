package com.vedait.hospital;

import java.util.*;

public class Hospitals {

	public static void main(String[] args) {

		ArrayList<Doctor> doctors = new ArrayList();
		
		doctors.add(new Doctor("Dr.Sunanda","Cardiologist","9 AM to 10 AM"));
		doctors.add(new Doctor("Dr.Satya","Dermatologists","10 AM to 11 AM"));
		doctors.add(new Doctor("Dr.Sindhu","Endocrinologists","11 AM to 12 PM"));
		doctors.add(new Doctor("Dr.kavitha","Gastroenterologists","12 PM to 1 pM"));
		doctors.add(new Doctor("Dr.Deepika","Hematologists","1 PM to 2 PM"));
		doctors.add(new Doctor("Dr.Keerthi","Nephrologists","2 PM to 3 PM"));
		doctors.add(new Doctor("Dr.Anupma","Neurologists","3 pM to 4 PM"));
		doctors.add(new Doctor("Dr.Chandhini","Ophthalmologists","Only in Weekends"));
		doctors.add(new Doctor("Dr.Anushka","Immunologists","Sunday 10 AM to 1 PM"));
		
		ArrayList<Patient> patients = new ArrayList();
		
		patients.add(new Patient("Balaji", " High Blood Pressure"));
		patients.add(new Patient("Satish", " Hair loss"));
		patients.add(new Patient("Sandeep", " Leukemia "));
		patients.add(new Patient("Rohan", " Pancreas"));
		patients.add(new Patient("Divakar", "Diabetes")); 
		patients.add(new Patient("Valli", " Kidneydisease"));
		patients.add(new Patient("Ramkrishna", " Heart attack"));
		patients.add(new Patient("Kiran", " Glaucoma"));
		patients.add(new Patient("Lakshmi", " Immunesystem"));
		patients.add(new Patient("Chandhu", "Parkinson'sdisease"));
		
		
		System.out.println(" Name " + "  -  " + "  Specialization" + "   -   " +  " Timing");
		
		
		for(int i=0;i<doctors.size();i++) {
			System.out.printf(doctors.get(i).detailsofDoc());
		}
		System.out.println();

		
		System.out.println(" Name" + "    -   "  +  " Problem" );
		
		
		for(int j=0;j<patients.size();j++) {
			System.out.printf(patients.get(j).detalsOfPat());
			
		}
		System.out.println();

		
	        System.out.println("Patient Name\t   Problem\t\t     Doctor Name\tSpecialization\t\t Timing");
	       
	        for (int i = 0; i < doctors.size(); i++) {
	            System.out.printf("%-20s %-20s %-20s %-20s %-20s %n",
	                    patients.get(i).patientname,
	                    patients.get(i).problem,
	                    doctors.get(i).doctorname,
	                    doctors.get(i).specialization,
	                    doctors.get(i).time);
	        }
	    }
	}