package com.vedait.Appilactionform;
import java.util.Scanner;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppointmentCalendar {
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

            Date slot1 = new Date();
            Date slot2 = new Date();
            Date slot3 = new Date();
            Date slot4 = new Date();
            Date slot5 = new Date();
            Date slot6 = new Date();
            Date slot7 = new Date();
            Date slot8 = new Date();

            System.out.println("1. " + dateFormat.format(slot1));
            System.out.println("2. " + dateFormat.format(slot2));
            System.out.println("3. " + dateFormat.format(slot3));
            System.out.println("4. " + dateFormat.format(slot4));
            System.out.println("5. " + dateFormat.format(slot5));
            System.out.println("6. " + dateFormat.format(slot6));
            System.out.println("7. " + dateFormat.format(slot7));
            System.out.println("8. " + dateFormat.format(slot8));
            System.out.println("Select an appointment slot (1, 2, 3, 4, 5, 6, 7, 8):");
            int slotChoice = sc.nextInt();

            Date selectedSlot = null;

            switch (slotChoice) {
                case 1:
                    selectedSlot = slot1;
                    break;
                case 2:
                    selectedSlot = slot2;
                    break;
                case 3:
                    selectedSlot = slot3;
                    break;
                case 4:
                    selectedSlot = slot4;
                    break;
                case 5:
                    selectedSlot = slot5;
                    break;
                case 6:
                    selectedSlot = slot6;
                    break;
                case 7:
                    selectedSlot = slot7;
                    break;
                case 8:
                    selectedSlot = slot8;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return;
            }

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

    static void viewDoctorsInformation() {
        ArrayList<Doctors> doctorsList = Doctors.doctorsList;
        System.out.println("Doctor Information:");
        for (Doctors doctor : doctorsList) {
            doctor.displayDoctorInfo();
        }
    }

    static void viewAppointmentsInformation() {
        System.out.println("Appointments Information:");
        for (Map.Entry<Integer, ArrayList<String>> entry : appointments.entrySet()) {
            Integer appointmentID = entry.getKey();
            ArrayList<String> appointmentDetails = entry.getValue();
            System.out.println("Appointment ID: " + appointmentID);
            System.out.println("Doctor ID: " + appointmentDetails.get(0));
            System.out.println("Name: " + appointmentDetails.get(1));
            System.out.println("Problem: " + appointmentDetails.get(2));
            System.out.println("Phone: " + appointmentDetails.get(3));
            System.out.println("Appointment Time: " + appointmentDetails.get(4));
            System.out.println();
        }
    }

    static void deleteAppointment(Integer appointmentID) {
        if (appointments.containsKey(appointmentID)) {
            appointments.remove(appointmentID);
            System.out.println("Appointment ID " + appointmentID + " has been deleted.");
        } else {
            System.out.println("Appointment ID " + appointmentID + " not found.");
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
                    viewDoctorsInformation();
                    break;
                case 3:
                    viewAppointmentsInformation();
                    break;
                case 4:
                    System.out.println("Enter the Appointment ID to delete:");
                    int appointmentID = sc.nextInt();
                    deleteAppointment(appointmentID);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Option. Please enter a valid option.");
                    break;
            }
        } while (options != 5);
    }
}




