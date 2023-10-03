package com.details.application;
import java.util.ArrayList;

public class AppointmentManager {
	private ArrayList<Appointment> appointments = new ArrayList<>();
    private ArrayList<Patients> patients = new ArrayList<>();
    private ArrayList<Doctors> doctors = new ArrayList<>();

    public void bookAppointment(Patients patients, Doctors doctors, String date) {
        Appointment appointment = new Appointment(patients, doctors, date);
        appointments.add(appointment);
        System.out.println("Appointment booked successfully: " + appointment);
    }

    public void deleteAppointment(int index) {
        if (index >= 0 && index < appointments.size()) {
            Appointment deletedAppointment = appointments.remove(index);
            System.out.println("Appointment deleted successfully: " + deletedAppointment);
        } else {
            System.out.println("Invalid appointment index.");
        }
    }
    public void listAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            System.out.println("Appointments:");
            for (int i = 0; i < appointments.size(); i++) {
                System.out.println(i + ". " + appointments.get(i));
            }
        }
    }
    public void listPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients added.");
        } else {
            System.out.println("Patients:");
            for (int i = 0; i < patients.size(); i++) {
                System.out.println(i + ". " + patients.get(i));
            }
        }
    }
    public void listDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors added.");
        } else {
            System.out.println("Doctors:");
            for (int i = 0; i < doctors.size(); i++) {
                System.out.println(i + ". " + doctors.get(i));
            }
        }
    }

}
