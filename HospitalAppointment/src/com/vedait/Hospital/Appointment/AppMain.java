package com.vedait.Hospital.Appointment;
import java.sql.*;
import java.util.*;

public class AppMain {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Doctors> doctors = new ArrayList();
    static int initialAppointmentNo = 1000;
    static int appointmentNo = initialAppointmentNo;
    static DoctorDetails doc =new DoctorDetails();
    static ArrayList<Doctors> doctorsList = doc.getDoctorsList();
    static ArrayList<Details> appointments = new ArrayList();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Select an Option");
            System.out.println("1. View Doctor Details ");
            System.out.println("2. Book Appointment");
            System.out.println("3. View Appointments");
            System.out.println("4. Cancel Appointment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    viewDoctorDetails();
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
                    System.out.println("Thank You!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    static void viewDoctorDetails() {
        System.out.println("Doctor Details :");
      
        ArrayList<Doctors> doctors = new ArrayList();
        for (int i = 0; i < doctorsList.size(); i++) {
            Doctors doctor = doctorsList.get(i);
        	System.out.println(doctor.toString());
            
        }
    }

    static void bookAppointment() {
    	boolean bookingAnotherAppointment = true;

        while (bookingAnotherAppointment) {
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

        for (int i = 0; i < doctorsList.size(); i++) {
            Doctors doctor = doctorsList.get(i);
            if (doctor.getId() == doctorId) {
                doctorExists = true;
                selectedDoctor = doctor;
                break;
            }
        }
        if (doctorExists) {
            System.out.println("Doctor Details:");
            System.out.println("Doctor ID: " + selectedDoctor.Doc_Id);
            System.out.println("Doctor Name: " + selectedDoctor.Doc_Name);
            System.out.println("Specialization: " + selectedDoctor.Specialisation);
            System.out.println("Email : " + selectedDoctor.Email);
            System.out.println("Ph_No: " + selectedDoctor.Ph_No);
            System.out.println("Experience: " + selectedDoctor.Experience);
            System.out.println("Working: " + selectedDoctor.Working);
            System.out.println("Degree: " + selectedDoctor.Degree);
            System.out.println("Consultation: " + selectedDoctor.Consultation);
            System.out.println("Gender: " + selectedDoctor.Gender);
            
            System.out.print("Do you want to book the appointment? (yes/no): ");
            String confirmation = scanner.next();

            if (confirmation.equalsIgnoreCase("yes")) {
            System.out.print("Enter patient name: ");
            String patientName = scanner.next();
            int age = 0;
            char gender = '0';
            long phno = 0;

            try {
            	while (true) {
            	    try {
            	        System.out.print("Enter Your Age: ");
            	        age = scanner.nextInt();
            	        
            	        if (age < 0 || age > 120) {
            	            System.out.println("Invalid age. Please enter a valid age between 0 to 120.");
            	            continue; 
            	        }
            	        break; 
            	    } catch (InputMismatchException e) {
            	        System.out.println("Invalid input for age. Please enter a valid age.");
            	        scanner.nextLine(); 
            	    }
            	}

                System.out.print("Enter Gender (M/F): ");
                gender = scanner.next().charAt(0);
                
                boolean isPhoneNumberValid = false;
                boolean duplicatePhoneNumber = false;
                while (!isPhoneNumberValid || duplicatePhoneNumber) {
                    if (duplicatePhoneNumber) {
                        System.out.println("Appointment with the same phone number already exists.");
                        duplicatePhoneNumber = false; 
                    }
                    System.out.print("Enter your Phone Number : ");
                    phno = scanner.nextLong();
                    if (String.valueOf(phno).length() <= 10) {
                        isPhoneNumberValid = true;
                        for (int i = 0; i < appointments.size(); i++) {
                            Details appointment = appointments.get(i);
                            if (appointment.getphno() == phno) {
                                duplicatePhoneNumber = true;
                                break;
                            }
                        }
                    } else {
                        System.out.println("Phone number must be exactly 10 digits.");
                    }
                }
                
            } catch (Exception e) {
                System.out.println("Invalid input for gender. Please enter valid values.");
                scanner.nextLine();
                return;
            }
           
            System.out.println("Enter your Email:");
            String email = scanner.next();
            
            System.out.print("Enter Patient Problem: ");
            String problem = scanner.next();

            Details appointment = new Details(appointmentNo, doctorId, patientName, age, gender,phno,email,problem);
            appointments.add(appointment);

            System.out.println("Your Appointment is booked successfully with Appointment No: " + appointmentNo++);
            }else {
                System.out.println("Appointment booking cancelled.");
            }
            System.out.print("Do you want to book another appointment? (yes/no): ");
            String anotherAppointmentConfirmation = scanner.next();
            bookingAnotherAppointment = anotherAppointmentConfirmation.equalsIgnoreCase("yes");
        } else {
            System.out.println("Invalid Doctor ID. Please enter a valid Doctor ID.");
        }
    }
  }

    static void viewAppointments() {
    	if (appointments.isEmpty()) {
            System.out.println("No appointments booked At.");
        } else {
            System.out.println("Appointments:");
            for (int i = 0; i < appointments.size(); i++) {
                Details appointment = appointments.get(i);
                System.out.println(appointment.toString());
            }
        }
    }

    static void cancelAppointment() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments booked At.");
        } else {
            boolean validAppointment = false;
            int appointmentNumber;

            while (!validAppointment) {
                System.out.print("Enter the appointment number you want to cancel: ");
                
                if (scanner.hasNextInt()) {
                    appointmentNumber = scanner.nextInt();
                    boolean found = false;
                    
                    for (int i = 0; i < appointments.size(); i++) {
                        if (appointments.get(i).appointmentno == appointmentNumber) {
                            appointments.remove(i);
                            System.out.println("Appointment canceled.");
                            found = true;
                            validAppointment = true;
                            break;
                        }
                    }
                    
                    if (!found) {
                        System.out.println("Invalid appointment number. Please enter a valid number.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid Input.");
                    scanner.nextLine(); 
                }
            }
        }
    }  	
 }



