package com.vedait.Hospital.Appointment;

import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentMain {

    static ArrayList<Details> appointments = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int initialAppointmentNo = 1000;
    static int appointmentNo = initialAppointmentNo;
	static DoctorDetails doc =new DoctorDetails();
	static ArrayList<Doctors> doctorsList = doc.getDoctorsList();
    
    public static void main(String[] args) {
    	

    	
        while (true) {
        	
            System.out.println("Select an Option");
            System.out.println("1. View Doctor Details ");
            System.out.println("2. Book Appointment");
            System.out.println("3. View Appointments");
            System.out.println("4. Cancel Appointment");
            System.out.println("5. Update Appointment");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Details Of Doctors :");
                    ArrayList<Doctors> doctors = new ArrayList<>();
                    for (Doctors doctor : doctorsList) {
                    	System.out.println(doctor.toString());
                        
                    }
                    break;
                case 2:
                    bookAppointment();
                    break;   
                case 3:
                    viewAppointments();
                    break;
                case 4:
                    cancelAppointment();
                    break;
                case 5:
                    updateAppointment();
                    break;
                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    static void bookAppointment() {
        System.out.println("Enter Doctor ID:");
        int doctorId = 0;

        try {
            doctorId = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input for Doctor ID. Please enter a valid Id.");
            scanner.nextLine();
            return;
        }

        boolean doctorExists = false;
        Doctors selectedDoctor = null;

        for (Doctors doctor : doctorsList) { 
            if (doctor.getId() == doctorId) {
                doctorExists = true;
                selectedDoctor = doctor;
                break;
            }
        }

        if (doctorExists) {
            System.out.println("Doctor Details:");
            System.out.println("Doctor Name: " + selectedDoctor.Doc_Name);
            System.out.println("Specialization: " + selectedDoctor.Specialisation);
            System.out.println("Doctor ID: " + selectedDoctor.Doc_Id);

            System.out.print("Enter patient name: ");
            String patientName = scanner.next();
            int age = 0;
            char gender = '0';

            try {
                System.out.print("Enter Your Age: ");
                age = scanner.nextInt();

                System.out.print("Enter Gender (M/F): ");
                gender = scanner.next().charAt(0);
            } catch (Exception e) {
                System.out.println("Invalid input for age or gender. Please enter valid values.");
                scanner.nextLine();
                return;
            }

            System.out.print("Enter Patient Problem: ");
            String problem = scanner.next();

            Details appointment = new Details(appointmentNo, doctorId, patientName, age, gender, problem);
            appointments.add(appointment);

            System.out.println("Your Appointment is booked successfully with Appointment No: " + appointmentNo++);
        } else {
            System.out.println("Invalid Doctor ID. Please enter a valid Doctor ID.");
        }
    }

    static void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments booked.");
        } else {
            System.out.println("Appointments:");
            for (Details appointment : appointments) {
                System.out.println(appointment.toString());
            }
        }
    }

    static void cancelAppointment() {
        System.out.print("Enter the appointment number you want to cancel: ");
        int appointmentNumber = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).appointmentno == appointmentNumber) {
                appointments.remove(i);
                System.out.println("Appointment canceled");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Invalid appointment number.");
        }
    }

    static void updateAppointment() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments have been booked yet.");
            return;
        }

        System.out.print("Enter the appointment number you want to update: ");
        int appointmentNumber = scanner.nextInt();
        boolean found = false;

        for (Details appointment : appointments) {
            if (appointment.getAppointno() == appointmentNumber) {
                found = true;
                System.out.println("Current Appointment Details:");
                System.out.println(appointment.toString());

                System.out.println("Select what you want to update:");
                System.out.println("1. Patient Name");
                System.out.println("2. Age");
                System.out.println("3. Gender");
                System.out.println("4. Patient Problem");
                System.out.print("Enter your choice: ");
                int updateChoice = scanner.nextInt();
                scanner.nextLine();

                switch (updateChoice) {
                    case 1:
                        System.out.print("Enter new Patient Name: ");
                        String newPatientName = scanner.nextLine();
                        appointment.setPatientName(newPatientName);
                        System.out.println("Patient Name updated successfully.");
                        break;
                    case 2:
                        System.out.print("Enter new Age: ");
                        int newAge = scanner.nextInt();
                        appointment.setAge(newAge);
                        System.out.println("Age updated successfully.");
                        break;
                    case 3:
                        System.out.print("Enter new Gender (M/F): ");
                        char newGender = scanner.next().charAt(0);
                        appointment.setGender(newGender);
                        System.out.println("Gender updated successfully.");
                        break;
                    case 4:
                        System.out.print("Enter new Patient Problem: ");
                        String newProblem = scanner.next();
                        appointment.setProblem(newProblem);
                        System.out.println("Patient Problem updated successfully.");
                        break;
                    default:
                        System.out.println("Invalid choice for update.");
                }
            }
        }

        if (!found) {
            System.out.println("Appointment not found.");
        }
    }
    
    static void detail() {
    	
    }
}
