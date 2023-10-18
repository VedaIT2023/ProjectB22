package com.DataBase.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class AppMain {
    public static void main(String[] args) {
        
        Data data = new Data();

        // Get a list of doctors and store them in a HashMap
        HashMap<Integer, DoctorDetails> docMap = data.getDoctors();
        List<DoctorDetails> doctorList = new ArrayList<>(docMap.values());

        // Create a Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Create a flag to control the main program loop
        boolean count = false;

        while (!count) {
            // Display the menu
            System.out.println("Select an option:");
            System.out.println("1. View Doctors List");
            System.out.println("2. Book an Appointment");
            System.out.println("3. View Appointment List");
            System.out.println("4. Cancel an Appointment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                      
                        for (int i = 0; i < doctorList.size(); i++) {
                            System.out.println(doctorList.get(i).getDetails());
                            System.out.println();
                        }
                        break;

                    case 2:
                      
                        int newPatientId = 0;

                        int docCp = 0;
                        System.out.print("Enter the Doctor ID you want to consult: ");
                        int doctorid = sc.nextInt();
                        boolean found = false;

                    
                        for (int i = 0; i < doctorList.size(); i++) {
                            if (doctorid == doctorList.get(i).getDocId()) {
                                docCp = doctorid;
                                System.out.println(doctorList.get(i).getName() + "\n");
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Doctor not found");
                            break;
                        }

                      
                        System.out.print("Are you sure you want to book an Appointment? (yes/no): ");
                        String feedback = sc.next().toLowerCase();

                        if (feedback.equals("yes")) {
                            System.out.println("Enter your name:");
                            String p_name = sc.next();
                            System.out.println("Enter your age:");
                            int age = sc.nextInt();
                            sc.nextLine(); 
                            System.out.println("Enter your Problem:");
                            String problem = sc.nextLine(); 
                            System.out.println("Enter your email:");
                            String email = sc.next();
                            System.out.println("Enter your gender:");
                            String gender = sc.next();
                            System.out.println("Enter your Mobile No:");
                            String phone_number = sc.next();

                            try {
                               
                                Class.forName("com.mysql.cj.jdbc.Driver"); 
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a2z_db", "root", "Pavan@23");

                              
                                Statement getMaxPatientIdStmt = con.createStatement();
                                ResultSet rs = getMaxPatientIdStmt.executeQuery("SELECT MAX(patient_id) FROM patient_details");


                                if (rs.next()) {
                                    newPatientId = rs.getInt(1) + 1;
                                }

                            
                                PreparedStatement pstmt = con.prepareStatement("INSERT INTO appointment_details (patient_id, doc_id, patient_problem) VALUES (?, ?, ?)");

                           
                                pstmt.setInt(1, newPatientId);
                                pstmt.setInt(2, docCp);
                                pstmt.setString(3, problem);

                       
                                pstmt.executeUpdate();

                             
                                pstmt.close();
                                getMaxPatientIdStmt.close();
                                con.close();
                            } catch (Exception e) {
                                System.out.println(e);
                            }


                       
                            System.out.println("\nYour appointment is confirmed");
                            System.out.println("\nName: " + p_name);
                            System.out.println("Age: " + age);
                            System.out.println("Problem: " + problem);
                            System.out.println("Email: " + email);
                            System.out.println("Gender: " + gender);
                            System.out.println("Mobile No: " + phone_number);

                            try {
                          
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a2z_db", "root", "Pavan@23");
                                Statement stmt = con.createStatement();

                             
                                stmt.executeUpdate("INSERT INTO patient_details (p_name, age, problem, email, gender, phone_number) "
                                        + "VALUES('" + p_name + "'," + age + ",'" + problem + "','" + email + "','" + gender
                                        + "','" + phone_number + "')");

                                con.close();
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        } else if (feedback.equals("no")) {
                            System.out.println("Please select another doctor.");
                        } else {
                            System.out.println("Invalid Doctor Id");
                        }
                        break;

                    case 3:
                       
                        List<AppointmentDetails> appointments = data.viewAppointments();

                        if (appointments.size() > 0) {
                            for (AppointmentDetails appointment : appointments) {
                                System.out.println("Appointment ID: " + appointment.getApp());
                            }
                        } else {
                            System.out.println("No appointments are booked");
                        }
                        break;

                    case 4:
                     
                        System.out.print("Enter the Patient_Id you want to cancel: ");
                        int appointmentnumber = sc.nextInt();
                        data.cancelAppointment(appointmentnumber);
                        System.out.println("Appointment canceled");
                        break;

                    case 5:
                       
                        System.out.println("Thank you!");
                        count = true;
                        break;

                    default:
                        System.out.println("Please select a valid option.");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
