package com.vedhait.Application.Form;
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
        Doctors doctor1 = new Doctors("Satish", "101", "Cardiologist", "MON to WED", "satishpendhem052@gmail.com");
        doctorsList.add(doctor1);
        Doctors doctor2 = new Doctors("Ravi", "102", "Neurologist", "TUES to THURS", "ravipendhem052@gmail.com");
        doctorsList.add(doctor2);
        Doctors doctor3 = new Doctors("Sandya", "103", "Dentist", "WEDNES to FRI", "sandyachuduri032@gmail.com");
        doctorsList.add(doctor3);
        Doctors doctor4 = new Doctors("Sneha", "104", "Gynecologist", "THURS to SATUR", "sneha2001@gmail.com");
        doctorsList.add(doctor4);
        Doctors doctor5 = new Doctors("Jay", "105", "Psychiatrist", "FRI to SUN", "jay833322@gmail.com");
        doctorsList.add(doctor5);
        Doctors doctor6 = new Doctors("Kavya", "106", "Radiologist", "SAT to MON", "kavyapilli052@gmail.com");
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
