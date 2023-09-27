package com.vedait.Hospitals;
import java.util.*;
public class Hospital {

	public static void main(String[] args) {
		 
		ArrayList<Doctors> doctors = new ArrayList();
			
		doctors.add(new Doctors("Dr.Pavan","Cardiologist","9 AM to 10 AM"));
		doctors.add(new Doctors("Dr.Laxman","Dermatologists","10 AM to 11 AM"));
		doctors.add(new Doctors("Dr.Satish","Endocrinologists","11 AM to 12 PM"));
		doctors.add(new Doctors("Dr.Balaji","Gastroenterologists","12 PM to 1 pM"));
		doctors.add(new Doctors("Dr.Satwik","Hematologists","1 PM to 2 PM"));
		doctors.add(new Doctors("Dr.Keerthi","Nephrologists","2 PM to 3 PM"));
		doctors.add(new Doctors("Dr.Anupma","Neurologists","3 pM to 4 PM"));
		doctors.add(new Doctors("Dr.Kajal","Ophthalmologists","Only in Weekends"));
		doctors.add(new Doctors("Dr.Anushka","Immunologists","Sunday 10 AM to 1 PM"));
		
		ArrayList<Patients> patients = new ArrayList();
		
		patients.add(new Patients("MohanDas", " High Blood Pressure"));
		patients.add(new Patients("Bhavana", " Hair loss"));
		patients.add(new Patients("Sandeep", " Diabetes"));
		patients.add(new Patients("Rohan", " Pancreas"));
		patients.add(new Patients("Ajay", " Leukemia")); 
		patients.add(new Patients("Naresh", " Kidneydisease"));
		patients.add(new Patients("Meghana", " Parkinson'sdisease"));
		patients.add(new Patients("Kiran", " Glaucoma"));
		patients.add(new Patients("Lakshmi", " Immunesystem"));
		patients.add(new Patients("Aishwarya", " Heart attack"));
		
		System.out.println("---------------------------------------------");
		System.out.println(" Name " + "  -  " + "  Specialization" + "   -  " +  " Timing");
		System.out.println("---------------------------------------------");
		
		for(int i=0;i<doctors.size();i++) {
			System.out.printf(doctors.get(i).detailsofDoc());
		}
		System.out.println();

		System.out.println("--------------------------------");
		System.out.println(" Name" + "    - " + " Problem" );
		System.out.println("--------------------------------");
		
		for(int j=0;j<patients.size();j++) {
			System.out.printf(patients.get(j).detalsOfPat());
			
		}
		System.out.println();

		 System.out.println("---------------------------------------------------------------------------------------------------------------");
	        System.out.println("Patient Name\t   Problem\t\t     Doctor Name\tSpecialization\t\t Timing");
	        System.out.println("---------------------------------------------------------------------------------------------------------------");

	        for (int i = 0; i < doctors.size(); i++) {
	            System.out.printf("%-17s %-26s %-17s %-25s %-17s %n",
	                    patients.get(i).patientname,
	                    patients.get(i).problem,
	                    doctors.get(i).doctorname,
	                    doctors.get(i).specialization,
	                    doctors.get(i).time);
	        }
	    }
	}