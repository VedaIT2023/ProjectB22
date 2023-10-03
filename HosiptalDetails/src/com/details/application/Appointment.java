package com.details.application;

public class Appointment {
	private Patients patients;
    private Doctors doctors;
    private String date;

    public Appointment(Patients patients, Doctors doctors, String date) {
        this.patients = patients;
        this.doctors = doctors;
        this.date = date;
    }

    public Patients getPatient() {
        return patients;
    }

    public Doctors getDoctor() {
    	return doctors;
    }
        public String getDate() {
            return date;
        }

        @Override
        public String toString() {
            return "Appointment [Patient: " + patients.getName() + ", Doctor: " + doctors.getName() + ", Date: " + date + "]";
        }
    }


