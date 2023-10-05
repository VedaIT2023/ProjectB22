package com.vedait.Appilactionform;

import java.util.ArrayList;

public class Doctors {

	String dname, id, specialisation, timings, email;
	   static ArrayList<Doctors> doctorsList;

	    Doctors(String dname, String id, String specialisation, String timings, String email) {
	        this.dname = dname;
	        this.id = id;
	        this.specialisation = specialisation;
	        this.timings = timings;
	        this.email = email;
	    }

	    public void displayDoctorInfo() {
	        System.out.println("Name of the Doctor: " + dname);
	        System.out.println("ID No: " + id);
	        System.out.println("Specialisation: " + specialisation);
	        System.out.println("Timings: " + timings);
	        System.out.println("Mail Id: " + email);
	    }


	    static void doctorDetails() {

	    	doctorsList = new ArrayList<>();
	        Doctors doctor1 = new Doctors("Chandhini", "101", "Cardiologist", "MON to WED", "chandhini5436@gmail.com");
	        doctorsList.add(doctor1);
	        Doctors doctor2 = new Doctors("Satya", "102", "Neurologist", "TUES to THURS", "satya50002@gmail.com");
	        doctorsList.add(doctor2);
	        Doctors doctor3 = new Doctors("Sindu", "103", "Dentist", "WEDNES to FRI", "sindu6754@gmail.com");
	        doctorsList.add(doctor3);
	        Doctors doctor4 = new Doctors("Deepika", "104", "Gynecologist", "THURS to SATUR", "deepika676434@gmail.com");
	        doctorsList.add(doctor4);
	        Doctors doctor5 = new Doctors("Kavitha", "105", "Psychiatrist", "FRI to SUN", "kavitha56678@gmail.com");
	        doctorsList.add(doctor5);
	        Doctors doctor6 = new Doctors("Kavya", "106", "Radiologist", "SAT to MON", "kavya05002@gmail.com");
	        doctorsList.add(doctor6);

	        System.out.println("Doctor Information:");
	        for (int i=0;i<doctorsList.size();i++) {
	            Doctors doctor = doctorsList.get(i);
	            doctor.displayDoctorInfo();
	            System.out.println("-------------------------");
	        }
	    }

		public String getId() {
			return id;
		
	}

}
