package com.vedhait.Application.Form;
import java.util.Scanner;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.*;
import java.util.ArrayList;
public class AppointmentForm {
	
	//Appointment ID:<Doctor ID, Patient Name, Problem, phone >
	static HashMap<Integer,ArrayList<String>> appointments=new HashMap<>();
	
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
    	for(Integer appointmentID :appointments.keySet()) {
    		ArrayList<String>appointmentdetails = appointments.get(appointmentID);
    		if(appointmentdetails.get(5).equals(phone)) {
    			return true;
    		}
    	}
    	return false;
    }
    static boolean isEmailAlreadyExists(String email) {
    	for(Integer appointmentID:appointments.keySet()) {
    		ArrayList<String>appointmentdetails = appointments.get(appointmentID);
    		if(appointmentdetails.get(4).equals(email)) {
    			return true;
    		}
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
        		"jdbc:mysql://localhost:3306/DoctorsList","root","@Saggu052");  

        		Statement stmt=con.createStatement();  
        		ResultSet rs=stmt.executeQuery("select * from DoctorsList");  
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
            	ArrayList<String> appointmentdetails=new ArrayList<>();
            	appointmentdetails.add(String.valueOf(docId1));
            	Integer patientID = getPatientId();
            	appointmentdetails.add(patientID.toString());
            	appointmentdetails.add(name);
            	appointmentdetails.add(problem);
            	appointmentdetails.add(email);
            	appointmentdetails.add(phone);
            	appointmentdetails.add(gender);
            	appointmentdetails.add(appointmentDateTime.toString());
            	
            	Integer appointmentID=getAppointmentId();
            	patientID = getPatientId();
            	
            	appointments.put(appointmentID,appointmentdetails);
        		
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
        
        String url = "jdbc:mysql://localhost:3306/DoctorsList"; // JDBC URL
        String username = "root"; // MySQL UserName
        String password = "@Saggu052"; // MySQL password
        String query = "SELECT * FROM DoctorsList"; // SQL query

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
    	for(Integer x:appointments.keySet())
    	{
    		ArrayList<String> appointmentDetails=appointments.get(x);
    		System.out.println("Appointment ID:"+x);
    		System.out.println("Doctor ID:"+appointmentDetails.get(0));
    		System.out.println("Patient ID:"+appointmentDetails.get(1));
    		System.out.println("Patient Name:"+appointmentDetails.get(2));
    		System.out.println("Patient Problem:"+appointmentDetails.get(3));
    		System.out.println("Patient Email:"+appointmentDetails.get(4));
    		System.out.println("Phone Number :"+appointmentDetails.get(5));
    		System.out.println("Gender :" +appointmentDetails.get(6));
    		System.out.println("Appointment Date And Time :" +appointmentDetails.get(7));
    		
    		System.out.println("");
    		
    	}
    }
    
    static void deleteAppointment()
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the appointment ID to cancel:");
    	Integer appointmentId=Integer.valueOf(sc.nextInt());
    	
    	if(appointments.containsKey(appointmentId)){
    		appointments.remove(appointmentId);
    		System.out.println("Your Appointment was cancelled.");
    	}
    	else {
    		System.out.println("appointment details not found.");
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
            System.out.println("5. Exit");
            
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
