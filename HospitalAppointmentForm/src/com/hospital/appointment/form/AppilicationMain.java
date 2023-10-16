package com.hospital.appointment.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;

public class AppilicationMain {

    public static void main(String[] args) {

        Properties property = new Properties();
        HashMap<Integer, DoctorProperties> doctors = property.getDoctors();
        List<DoctorProperties> doctorList = new ArrayList<>(doctors.values());

        List<PatientProperties> patientList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean input = false;
        String pname = "";
        int page = 0;
        char pgender = ' ';
        String pproblem = " ";
        int id = 1000;
        int patientnum = 0;
        int patientLimit = 100;
        String drName = "";
        int count = 0;
        long pPhone = 0;


        while (patientnum <= patientLimit) {

            System.out.println(printString());
            System.out.print("\nEnter an option: ");
            int option = scanner.nextInt();

            if (option == 1) {

                for (int i = 0; i < doctorList.size(); i++) {
                    System.out.println(doctorList.get(i).drDetails());
                }

            } else if (option == 2) {
                System.out.println("Enter the Id of the Doctor: ");
                int drId = 0;
                try {
                    drId = scanner.nextInt();

                    if (drId != 0) {
                        for (int i = 0; i < doctorList.size(); i++) {
                            if (doctorList.get(i).docId == drId) {
                                drName = doctorList.get(i).doc_Name;
                            }
                        }
                        if (drName.equals("")) {
                            System.out.println("Invalid input");
                            continue;
                        }
                        input = false;
                        System.out.println("\nEnter the Patient Details");
                        while (!input) {
                            System.out.print("Name: ");
                            pname = scanner.next();
                            try {
                                System.out.print("Age: ");
                                page = scanner.nextInt();
                                System.out.print("Gender(M/F):");
                                pgender = scanner.next().charAt(0);
                                System.out.print("Problem: ");
                                pproblem = scanner.next();
                                System.out.println("Phone Number: ");
                                boolean validPhoneNumber = false;
                                while (!validPhoneNumber) {
                                    try {
                                   
                                        pPhone =scanner.nextLong();
                                        if (String.valueOf(pPhone).length() == 10) {
                                            boolean exists = false;
                                            for (int i=0; i<patientList.size(); i++) {
                                                if (patientList.get(i).Ph_no == pPhone) {
                                                    exists = true;
                                                    break;
                                                }
                                            }
                                            if (!exists) {
                                                validPhoneNumber = true;
                                            } else {
                                                System.out.println("This phone number is already booked. Please use another number.");
                                            }
                                        } else {
                                            System.out.println("Please enter a 10-digit phone number.");
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid Input. Please enter a number.");
                                    }
                                }
                                id += 1;
                                input = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid Input. Please enter the correct Input");
                                System.out.println("\nEnter your details again");
                                scanner.nextLine();
                            }
                        }
                        patientList.add(new PatientProperties(id, pname, page, pgender, pproblem, pPhone, drName));

                        System.out.println("Your Appointment is booked with " + drName);
                        System.out.println("Do you want to book another appointment type yes or no");
                        String re = scanner.next();
                        while (!re.equals("yes") && !re.equals("no")) {
                            System.out.println("Please enter 'yes' or 'no'.");
                            re = scanner.next();
                        }
                        if (re.equals("yes")) {
                            continue;
                        } else {
                            System.out.println("Do you want to exit type yes or no");
                            String exit = scanner.next();
                            if (exit.equals("yes")) {
                                System.out.println("Thank you");
                                break;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        System.out.println("Invalid Doctor ID. Please try again.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                }
            } else if (option == 3) {
                if (patientList.size() > 0) {
                    System.out.println("Appointments");
                    for (PatientProperties patientDetails : patientList) {
                        System.out.println(patientDetails.pDetials() + "\n");
                    }
                } else {
                    System.out.println("No appointments are booked");
                }
            } else if (option == 4) {
                System.out.println("Do you want to cancel the appointment or clear all the appointments\n(type cancel or clear)");
                String delete = scanner.next().toLowerCase();
                while (!delete.equals("cancel") && !delete.equals("clear")) {
                    System.out.println("Enter only cancel or clear");
                    delete = scanner.next().toLowerCase();
                }
                if (delete.equals("cancel")) {
                    System.out.println("Enter the patient ID");
                    int pid = scanner.nextInt();
                    for (int i = 0; i < patientList.size(); i++) {
                        if ((patientList.get(i).id) == (pid)) {
                            patientList.remove(i);
                            break; // Exit loop after removing the patient
                        }
                    }
                    System.out.println("The Appointment is canceled");
                } else if (delete.equals("clear")) {
                    patientList.clear();
                    System.out.println("All the Appointments are cleared");
                }
            } else if (option == 5) {
                System.out.println("Thank you");
                break;
            } else {
                System.out.println("Invalid input");
            }
            patientnum++;
        }
    }

    static String printString() {
        return "\n1.List of Doctors" +
                "\n2.Book a Appointment" +
                "\n3.View the Appointments" +
                "\n4.Cancel the Appointment" +
                "\n5.Exit";
    }

    static String dateAndTime() {
        Random random = new Random();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, random.nextInt(30) + 1);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == Calendar.SATURDAY) {
            calendar.add(Calendar.DATE, 2);
        } else if (dayOfWeek == Calendar.SUNDAY) {
            calendar.add(Calendar.DATE, 1);
        }

        int hour = random.nextInt(8) + 9;

        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");

        String appointmentDate = dateFormat.format(calendar.getTime());
        String appointmentTime = timeFormat.format(calendar.getTime());

        return appointmentDate + " " + appointmentTime;
    }
}
