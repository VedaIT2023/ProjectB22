package com.vedait.Calender;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Appointmentcalender {
	 static HashMap<Integer, ArrayList<String>> appointments = new HashMap<>();
	    static Integer appointmentCounter = 1000;

	    public static void main(String[] args) {
	        Doctors.doctorDetails();
	        showOptions();
	    }

	    static Integer getAppointmentId() {
	        appointmentCounter++;
	        return appointmentCounter;
	    }

	    static void bookAppointment(String doctorId) {
	        Scanner sc = new Scanner(System.in);
	        boolean found = false;
	        ArrayList<Doctors> doctorsList = Doctors.doctorsList;

	        for (Doctors doctor : doctorsList) {
	            if (doctor.getId().equals(doctorId)) {
	                doctor.displayDoctorInfo();
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Doctor Not Found");
	            return;
	        }

	        System.out.println("Do You Want To Book an Appointment (Yes/No)");
	        String input = sc.next();

	        if (input.equalsIgnoreCase("yes")) {
	            System.out.println("Enter your Name");
	            String name = sc.next();
	            System.out.println("Enter your Problem");
	            String problem = sc.next();
	            System.out.println("Enter your phone no.");
	            String phone = sc.next();

	            System.out.println("Available Appointment Slots:");
	            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	            Random random = new Random();
	            ArrayList<Date> availableSlots = new ArrayList<>();
	            for (int i = 0; i < 8; i++) {
	                Date slot = new Date(System.currentTimeMillis() + random.nextInt(7 * 24 * 60 * 60 * 1000)); // Generate a random time slot within the next 7 days
	                availableSlots.add(slot);
	                System.out.println((i + 1) + ". " + dateFormat.format(slot));
	            }

	            System.out.println("Select an appointment slot (1, 2, 3, 4, 5, 6, 7, 8):");
	            int slotChoice = sc.nextInt();

	            if (slotChoice < 1 || slotChoice > 8) {
	                System.out.println("Invalid choice.");
	                return;
	            }

	            Date selectedSlot = availableSlots.get(slotChoice - 1);

	            ArrayList<String> appointmentDetails = new ArrayList<>();
	            appointmentDetails.add(doctorId);
	            appointmentDetails.add(name);
	            appointmentDetails.add(problem);
	            appointmentDetails.add(phone);
	            appointmentDetails.add(dateFormat.format(selectedSlot));

	            Integer appointmentID = getAppointmentId();

	            appointments.put(appointmentID, appointmentDetails);

	            System.out.println("Your appointment is booked with Appointment ID: " + appointmentID);

	        } else if (input.equalsIgnoreCase("no")) {
	            System.out.println("Please select another doctor.");
	        } else {
	            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
	        }
	    }

	    public static void showOptions() {
	        Scanner sc = new Scanner(System.in);
	        int options;

	        do {
	            System.out.println("Select any Option");
	            System.out.println("1. Book an Appointment");
	            System.out.println("2. View Doctors Information");
	            System.out.println("3. View Appointments Information");
	            System.out.println("4. Delete an Appointment");
	            System.out.println("5. Exit");
	            options = sc.nextInt();

	            switch (options) {
	                case 1:
	                    System.out.println("Enter the Doctor ID");
	                    String doctorId = sc.next();
	                    bookAppointment(doctorId);
	                    break;
	                case 2:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid Option. Please enter a valid option.");
	                    break;
	            }
	        } while (options != 2);
	    }
	}


