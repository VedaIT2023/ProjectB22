package com.vedhait.Application.Form;
import java.util.Scanner;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.*;
import java.util.ArrayList;
public class AppointmentForm {
	
	//Appointment ID:<Doctor ID, Patient Name, Problem, phone >
	
	static Integer appointmentCounter=1000;
	static Integer patientCounter=2000;
	
    public static void main(String[] args) {
        
        showOptions();
    }
    
    static Integer getAppointmentId()
    {
    	appointmentCounter++;
    	return appointmentCounter;
    }
    
    static Integer getPatientId() {
    	patientCounter++;
    	return patientCounter;
    }
    
    static boolean isPhoneAlreadyExists(String phone) {
        String url = "jdbc:mysql://localhost:3306/a2z_db";
        String username = "root";
        String password = "@Saggu052";
        String query = "SELECT phone_number FROM patient_details WHERE phone_number = ?";
        
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            try (Connection con = DriverManager.getConnection(url, username, password)) {
                System.out.println("Connection Established successfully");

                // Create a prepared statement to execute SQL queries
                try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                    preparedStatement.setString(1, phone);

                    // Execute the query and retrieve the result set
                    try (ResultSet rs = preparedStatement.executeQuery()) {
                        return rs.next();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
            // Handle the exception appropriately
        }
        return false;
    }
    
    static boolean isEmailAlreadyExists(String email) {
        String url = "jdbc:mysql://localhost:3306/a2z_db";
        String username = "root";
        String password = "@Saggu052";
        String query = "SELECT email FROM patient_details WHERE email = ?";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            try (Connection con = DriverManager.getConnection(url, username, password)) {
                System.out.println("Connection Established successfully");

                // Create a prepared statement to execute SQL queries
                try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                    preparedStatement.setString(1, email);

                    // Execute the query and retrieve the result set
                    try (ResultSet rs = preparedStatement.executeQuery()) {
                        return rs.next();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
            // Handle the exception appropriately
        }
        return false;
    }

    static LocalDateTime generateRandomDateTime(){
    	Random random = new Random();
    	//generates Days
    	int randomDayOfWeek = random.nextInt(5)+1;
    	//generates Hours
    	int randomHours = random.nextInt(10)+8;
    	int randomMinutes = random.nextInt(60);
    	
    	LocalDateTime now = LocalDateTime.now();   
    	
    	LocalDateTime randomDateTime = now.plusDays(randomDayOfWeek).withHour(randomHours).withMinute(randomMinutes);
    	LocalDateTime randomDateTime1 = now.withHour(randomHours);
    	LocalDateTime randomDateTime2 = now.withMinute(randomMinutes);
  
    	return randomDateTime;
    	}
    
    static void bookAppointment() {
    	Scanner sc = new Scanner(System.in);
    	boolean found = false;
    	System.out.println("Enter the Doctor ID");
    	int docId1= sc.nextInt();
            try{  
        		Class.forName("com.mysql.jdbc.Driver");  
        		Connection con=DriverManager.getConnection(  
        		"jdbc:mysql://localhost:3306/a2z_db","root","@Saggu052");  

        		Statement stmt=con.createStatement();  
        		ResultSet rs=stmt.executeQuery("select * from doctor_details"); 
        		
        		while(rs.next())
        			if(rs.getInt(1)==docId1) {
        				System.out.println("Doctor ID: "+rs.getInt(1)+"\nDoctor Name: "+rs.getString(2)+"\nSpecialisation: "+rs.getString(3)+"\n");
        				//dName = rs.getString(2);
        				found = true;
        			}
        				con.close();  
        			
        		}catch(Exception e){ System.out.println(e);}

        
        if (!found) {
            System.out.println("Doctor Not Found");
            System.out.println("Please Select Another Option");
            System.out.println("");
            return;
        }
        
        System.out.println("Do You Want To Book an Appointment(Yes/No)");
        String input = sc.next();
        if (input.equalsIgnoreCase("yes")) {

        	System.out.println("Enter your Name");
        	String name=sc.next();
        	System.out.println("Enter your Age");
        	String age = sc.next();
        	System.out.println("Enter your Problem");
        	String problem=sc.next();
        	String email;
        	do {
        		System.out.println("Enter your Email");
        		email = sc.next();
        	if(isEmailAlreadyExists(email)) {
        		System.out.println("Please Enter another Email.These Email is Already Exists");
        		System.out.println("");
        	}else {
        		break;
        	}
        	}
        	while(true);
        	System.out.println("Mention Your Gender");
        	String gender = sc.next();
        	
        	String phone;
        	do {
        	System.out.println("Enter your phone no.");
        	phone=sc.next();
        	if(phone.length() != 10) {
        		System.out.println("Please Enter valid 10-Digit Phone Number");
        		System.out.println("");
        	}else if(isPhoneAlreadyExists(phone)) {
        		System.out.println("Phone Number is Already Exists in the Data.Please Enter Another Phone Number");
        	}else {
        		break;
        	}
        	}
        	while(true);
        	
        		LocalDateTime appointmentDateTime = generateRandomDateTime();
        		
        		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy/HH:mm");
        		String formattedDateTime = appointmentDateTime.format(formatter);
        		
        		//Appointment details
            	Integer patientID = getPatientId();

            	Integer appointmentID=getAppointmentId();
            	patientID = getPatientId();
            	
            	String appointmentInsertQuery = "INSERT INTO appointment_details (appointment_id,patient_id,doc_id,appointment_date_time,patient_problem,p_status) VALUES (?, ?, ?, ?, ?, ?)";
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/a2z_db", "root", "@Saggu052");
                    PreparedStatement appointmentForm = con.prepareStatement(appointmentInsertQuery);
                    
                    //appointmentForm.setInt(1, docId1);
                    //appointmentForm.setInt(2, patientID);
                    //appointmentForm.setString(3, problem);
                    //appointmentForm.setString(4, formattedDateTime);
                    appointmentForm.setInt(1, appointmentID);
                    appointmentForm.setInt(2, patientID);
                    appointmentForm.setInt(3, docId1);
                    appointmentForm.setString(4, formattedDateTime);
                    appointmentForm.setString(5, problem);
                    appointmentForm.setString(6, "OnGoing");
                    
                    // You don't need to set patient_id, as it should be auto-generated
                    appointmentForm.executeUpdate();
                    System.out.println("Appointment details saved in the database.");
                    appointmentForm.close();
                    con.close();
                } catch (Exception e) {
                    System.out.println("Error connecting to the database: " + e.getMessage());
                }
            	
            	
            	String patientInsertQuery = "INSERT INTO patient_details (p_name, age, problem, email, gender, phone_number, doc_ID) VALUES (?, ?, ?, ?, ?, ?)";
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/a2z_db", "root", "@Saggu052");
                    PreparedStatement patientStmt = con.prepareStatement(patientInsertQuery);
                    patientStmt.setString(1, name);
                    patientStmt.setString(2, age);
                    patientStmt.setString(3, problem);
                    patientStmt.setString(4, email);
                    patientStmt.setString(5, gender);
                    patientStmt.setString(6, phone);
                    patientStmt.setInt(7, docId1);
                    
                    // You don't need to set patient_id, as it should be auto-generated
                    patientStmt.executeUpdate();
        
                    patientStmt.close();
                    con.close();
                } catch (Exception e) {
                    System.out.println("Error connecting to the database: " + e.getMessage());
                }
                
                //String appointmentInsertQuery = "INSERT INTO appointment_details (doc_id, patient_id, problem, appointment_date_time) VALUES (?, ?, ?, ?)";

        		
        		System.out.println("Your appointment is booked with Appointment ID: "+appointmentID);
        		System.out.println("Your appointment is booked with Patient ID:" +patientID);
                System.out.println("Appointment Date and Time :"+formattedDateTime);
                System.out.println("");
        }
        else if (input.equalsIgnoreCase("no")) {
            System.out.println("Please select another doctor.");
            System.out.println("");
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            System.out.println("");
        }
        
    }

    static void viewDoctorsInfo() {
    	
    	
    	System.out.println("Doctor Information");
        
        String url = "jdbc:mysql://localhost:3306/a2z_db"; // JDBC URL
        String username = "root"; // MySQL UserName
        String password = "@Saggu052"; // MySQL password
        String query = "SELECT * FROM doctor_details"; // SQL query

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");

            // Create a statement to execute SQL queries
            Statement st = con.createStatement();

            // Execute the query and retrieve the result set
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                int doctorId = rs.getInt(1);
                String name = rs.getString(2);
                String specialisation = rs.getString(3);
                String Email = rs.getString(4);
                String PhoneNumber = rs.getString(5);
                int Experience = rs.getInt(6);
                String working = rs.getString(7);
                String degree = rs.getString(8);
                int Fee = rs.getInt(9);
                String Gender = rs.getString(10);
                
                System.out.println("DoctorId No: " + doctorId);
                System.out.println("Name of the Doctor: " + name);
                System.out.println("Email :" +Email);
                System.out.println("Phone Number :" +PhoneNumber);
                System.out.println("Experience :" +Experience);
                System.out.println("Working :" +working);
                System.out.println("Consultation Fee :" +Fee);
                System.out.println("Gender :" +Gender);
                System.out.println("");
            }

            // Close the statement and connection
            st.close();
            con.close();
            System.out.println("Connection Closed....");
        } catch (Exception e) {
            System.out.println("Error connecting to the database.");
            // Handle the exception appropriately
        }
    }
    static void displayAppointments()
    {
    	System.out.println("Appointment Information");
        
        String url = "jdbc:mysql://localhost:3306/a2z_db"; // JDBC URL
        String username = "root"; // MySQL UserName
        String password = "@Saggu052"; // MySQL password
        String query = "SELECT * FROM appointment_details"; // SQL query

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");

            // Create a statement to execute SQL queries
            Statement st = con.createStatement();

            // Execute the query and retrieve the result set
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int appointment_id = rs.getInt(1);
                int patient_id = rs.getInt(2);
                int doc_id = rs.getInt(3);
                String appointment_date_time = rs.getString(4);
                String patient_problem = rs.getString(5);
                String p_status = rs.getString(6);
           
                
                System.out.println("DoctorId No: " + appointment_id);
                System.out.println("Name of the Doctor: " + patient_id);
                System.out.println("Email :" +doc_id);
                System.out.println("Phone Number :" +appointment_date_time);
                System.out.println("Experience :" +patient_problem);
                System.out.println("Working :" +p_status);
                System.out.println("");
            }

            // Close the statement and connection
            st.close();
            con.close();
            System.out.println("Connection Closed....");
        } catch (Exception e) {
            System.out.println("Error connecting to the database.");
            // Handle the exception appropriately
        }
    }
    
    static void deleteAppointment() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the appointment ID to cancel:");
        Integer appointmentId = Integer.valueOf(sc.nextInt());

        String url = "jdbc:mysql://localhost:3306/a2z_db"; // JDBC URL
        String username = "root"; // MySQL UserName
        String password = "@Saggu052"; // MySQL password
        String query = "DELETE FROM appointment_details WHERE appointment_id = ?"; // Correct SQL query

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");

            // Create a prepared statement to execute the SQL delete query
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, appointmentId); 
            //set the appointmentId to delete

            // Execute the delete query
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Appointment with ID " + appointmentId + " was cancelled.");
            } else {
                System.out.println("Appointment with ID " + appointmentId + " not found.");
            }

            // Close the statement and connection
            preparedStatement.close();
            con.close();
            System.out.println("Connection Closed....");
        } catch (Exception e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }
    static void clearAllPatientDetails() {
        String url = "jdbc:mysql://localhost:3306/a2z_db"; // JDBC URL
        String username = "root"; // MySQL UserName
        String password = "@Saggu052"; // MySQL password
        String deleteQuery = "DELETE FROM patient_details"; // SQL query to delete all appointments

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");

            // Create a statement to execute SQL queries
            Statement st = con.createStatement();

            // Execute the delete query to clear all appointments
            int rowsAffected = st.executeUpdate(deleteQuery);

            if (rowsAffected > 0) {
                System.out.println("All existing Patients have been cleared.");
            } else {
                System.out.println("No Patients found to clear.");
            }

            // Close the statement and connection
            st.close();
            con.close();
            System.out.println("Connection Closed....");
        } catch (Exception e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }


    public static void showOptions() {
        Scanner sc = new Scanner(System.in);
        String input;
        int options = 0;

        
        
        try {
        	do {
        	System.out.println("Select any Option");
            System.out.println("1. View Doctors Information");
            System.out.println("2. Book an Appointment");
            System.out.println("3. View Appointments Information");
            System.out.println("4. Delete an Appointment");
            System.out.println("5. clear all Appointments");
            System.out.println("6. Exit");
            
            options = sc.nextInt();
            switch (options) {
                case 1:
                	viewDoctorsInfo();
                    break;
                case 2:
                	bookAppointment();
                    break;
                case 3:
                    displayAppointments();  
                    break;
                case 4:
                    deleteAppointment();
                    break;
                case 5:
                	clearAllPatientDetails();
                    
                    break;
                case 6:
                	System.out.println("Exiting...");
                	
                	break;
                default:
                    System.out.println("Invalid Option. Please enter a valid option.");
                    break;
            }
        }while(options != 5);
    }
        catch (Exception e) {
            System.out.println("Please Enter a valid Option");
            
        }
    }
}
