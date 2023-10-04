package com.vedait.Hospital.Appointment;


import java.util.ArrayList;

public class DoctorDetails {
    private ArrayList<Doctors> doctors = new ArrayList<>();

    public DoctorDetails() {
        initializeDoctors();
    }

    private void initializeDoctors() {
        doctors.add(new Doctors("Dr.Pavan", "Cardiologist", 101, "9 AM to 10 AM"));
        doctors.add(new Doctors("Dr.Laxman", "Dermatologists", 102, "10 AM to 11 AM"));
        doctors.add(new Doctors("Dr.Satish", "Endocrinologists", 103, "11 AM to 12 PM"));
        doctors.add(new Doctors("Dr.Balaji", "Gastroenterologists", 104, "12 PM to 1 PM"));
        doctors.add(new Doctors("Dr.Satwik", "Hematologists", 105, "1 PM to 2 PM"));
        doctors.add(new Doctors("Dr.Lakshmi", "Nephrologists", 106, "2 PM to 3 PM"));
        doctors.add(new Doctors("Dr.Supriya", "Neurologists", 107, "3 PM to 4 PM"));
        doctors.add(new Doctors("Dr.Niharika", "Ophthalmologists", 108, "Only in Weekends"));
        doctors.add(new Doctors("Dr.Lalitha", "Immunologists", 109, "Sunday 10 AM to 1 PM"));
    }

    public ArrayList<Doctors> getDoctorsList() {
        return doctors;
    }
}
