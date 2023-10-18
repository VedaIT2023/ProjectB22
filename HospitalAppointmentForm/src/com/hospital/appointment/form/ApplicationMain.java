package com.hospital.appointment.form;
import java.sql.*;
import java.util.*;

public class ApplicationMain {

    static int patient_id = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Properties property = new Properties();
        HashMap<Integer, DoctorProperties> doctors = property.getDoctors();
        List<DoctorProperties> doctorList = new ArrayList<>(doctors.values());

        int patientnum = 0;
        int patientLimit = 100;

        while (patientnum <= patientLimit) {
            System.out.println(printString());
            System.out.print("\nEnter an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    for (DoctorProperties doctor : doctorList) {
                        System.out.println(doctor.drDetails());
                    }
                    break;
                case 2:
                    bookAppointment(doctorList);
                    break;
                case 3:
                    viewPatientDetails();
                    break;
                case 4:
                	appointmentDetails();
                    break;
                case 5:
                    cancelOrClear();
                    break;
                case 6:
                    System.out.println("Thank you");
                    return; 
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }

            patientnum++;
        }
    }

    static String printString() {
        return "\n1.List of Doctors" + "\n2.Book a Appointment" + "\n3.View Patient Details"
                + "\n4.View the Appointments" + "\n5.Cancel the Appointment" + "\n6.Exit";
    }

    static void bookAppointment(List<DoctorProperties> doctorList) {
        boolean op = false;
        int drIdcp = 0;
        
        while (!op) {
            try {
                System.out.println("Enter the Id of the Doctor: ");
                int drId = scanner.nextInt();

                if (drId != 0) {
                    String drName = "";
                    for (DoctorProperties doctor : doctorList) {
                        if (doctor.docId == drId) {
                            drName = doctor.doc_Name;
                            drIdcp = drId;
                            break;
                        }
                    }
                    if (drName.equals("")) {
                        System.out.println("Invalid input");
                        continue;
                    }

                    boolean input = false;
                    String pName = "";
                    int pAge = 0;
                    String pGender = " ";
                    String pProblem = " ";
                    long pPhone = 0;
                    String pEmail = "";

                    while (!input) {
                        System.out.print("Name: ");
                        pName = scanner.next();

                        try {
                            System.out.print("Age: ");
                            pAge = scanner.nextInt();
                            System.out.print("Gender(M/F):");
                            pGender = scanner.next();
                            System.out.print("Problem: ");
                            pProblem = scanner.next();
                            System.out.println("Email:");
                            pEmail = scanner.next();
                            System.out.println("Phone Number: ");
                            boolean validPhoneNumber = false;
                            
                            while (!validPhoneNumber) {
                                try {
                                    pPhone = scanner.nextLong();
                                    if (String.valueOf(pPhone).length() == 10) {
                                        boolean exists = checkPhoneNumberExists(pPhone);

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
                            input = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid Input. Please enter the correct Input");
                            System.out.println("\nEnter your details again");
                            scanner.nextLine();
                        }
                    }
                    try {
                        Connection con = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/a2z_db", "root", "Balaji3004....#@");

                        Statement stmt = con.createStatement();
                        stmt.executeUpdate("INSERT INTO patient_details (p_name, age, problem, email, gender, phone_number) "
                                + "VALUES('" + pName + "'," + pAge + ",'" + pProblem + "','" + pEmail + "','" + pGender
                                + "','" + pPhone + "')");

                        stmt.executeUpdate("INSERT INTO appointment_details (patient_id, doc_id, patient_problem) "
                                + "VALUES('" + getPatientId(pPhone) + "','" + drIdcp + "','" + pProblem + "')");

                        con.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }

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
                        if (exit.equals("no")) {
                            break;
                        } else {
                            System.out.println("Thank you");
                            op = true;
                        }
                    }
                } else {
                    System.out.println("Invalid Doctor ID. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }

    static boolean checkPhoneNumberExists(long phoneNumber) {
        boolean exists = false;
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/a2z_db", "root", "Balaji3004....#@");

            PreparedStatement stmt = con.prepareStatement("SELECT * FROM patient_details WHERE phone_number = ?");
            stmt.setLong(1, phoneNumber);

            ResultSet rs = stmt.executeQuery();
            exists = rs.next(); 

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return exists;
    }

    static int getPatientId(long phoneNumber) {
        int patientId = -1; 
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/a2z_db", "root", "Balaji3004....#@");

            PreparedStatement stmt = con.prepareStatement("SELECT patient_id FROM patient_details WHERE phone_number = ?");
            stmt.setLong(1, phoneNumber);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                patientId = rs.getInt("patient_id");
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return patientId;
    }



    static void viewPatientDetails() {
    	try {
    	    Class.forName("com.mysql.jdbc.Driver");
    	    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a2z_db", "root", "Balaji3004....#@");
    	         Statement stmt = con.createStatement();
    	         ResultSet rs = stmt.executeQuery("select * from patient_details")) {

    	        int rowCount = 0;

    	        while (rs.next()) {
    	            System.out.println("\nID: " + rs.getInt(1) + "\nPatient Name: " + rs.getString(2) + "\nAge: "
    	                    + rs.getInt(3) + "\nProblem: " + rs.getString(4) + "\nEmail: " + rs.getString(5) + "\nGender: "
    	                    + rs.getString(6) + "\nPhone_Number: " + rs.getString(7));

    	            rowCount++;
    	        }

    	        if (rowCount == 0) {
    	            System.out.println("No Appointments are booked");
    	        }
    	    }
    	} catch (Exception e) {
    	    System.out.println(e);
    	}

    }
    static void appointmentDetails() {
    	
    	try {
    	    Class.forName("com.mysql.jdbc.Driver");
    	    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a2z_db", "root", "Balaji3004....#@");
    	         Statement stmt = con.createStatement();
    	         ResultSet rs = stmt.executeQuery("select * from appointment_details")) {

    	        int rowCount = 0;

    	        while (rs.next()) {
    				System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3));

    	            rowCount++;
    	        }

    	        if (rowCount == 0) {
    	            System.out.println("No Appointments are booked");
    	        }
    	    }
    	} catch (Exception e) {
    	    System.out.println(e);
    	}  
     		
    		} 

    static void cancelOrClear() {
        System.out.println("Do you want to cancel the appointment or clear all the appointments\n(type cancel or clear)");
        String delete = scanner.next().toLowerCase();
        while (!delete.equals("cancel") && !delete.equals("clear")) {
            System.out.println("Enter only cancel or clear");
            delete = scanner.next().toLowerCase();
        }
        if (delete.equals("cancel")) {
            System.out.println("Enter the patient ID");
            patient_id = scanner.nextInt();
            toDelete();

            System.out.println("The Appointment is canceled");
        } else if (delete.equals("clear")) {
            clearall();
            System.out.println("All the Appointments are cleared");
        }
    }

    static void toDelete() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a2z_db", "root",
                    "Balaji3004....#@");

            Statement stmt = con.createStatement();
            String deleteQuery = "DELETE FROM patient_details where patient_id = " + patient_id;
            String deleteap = "DELETE FROM appointment_details where patient_id = " + patient_id;
            int rowsAffected = stmt.executeUpdate(deleteQuery);
            int rowsDelete = stmt.executeUpdate(deleteap);


            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void clearall() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a2z_db", "root",
                    "Balaji3004....#@");

            Statement stmt = con.createStatement();
            String deleteQuery = "DELETE FROM patient_details";

            int rowsAffected = stmt.executeUpdate(deleteQuery);

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}