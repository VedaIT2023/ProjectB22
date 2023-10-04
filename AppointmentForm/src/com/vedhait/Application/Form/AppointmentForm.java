package com.vedhait.Application.Form;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;
import java.time.*;
import java.util.ArrayList;
public class AppointmentForm {
	
	//Appointment ID:<Doctor ID, Patient Name, Problem, phone >
	static HashMap<Integer,ArrayList<String>> appointments=new HashMap<>();
	static Integer appointmentCounter=1000;
	
	
    public static void main(String[] args) {
    	
        Doctors.doctorDetails();
        showOptions();
    }
    
    static Integer getAppointmentId()
    {
    	appointmentCounter++;
    	return appointmentCounter;
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
    
    static void bookAppointment(String doctorId) {
    	Scanner sc = new Scanner(System.in);
    	boolean found = false;
    	ArrayList<Doctors> doctorsList = Doctors.doctorsList;
    	for (int i = 0; i < doctorsList.size(); i++) {
            Doctors doctor = doctorsList.get(i);
            if (doctor.getId().equals(doctorId)) {
                doctor.displayDoctorInfo();
                found = true;
                break;
            }
        }
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
        	System.out.println("Enter your phone no.");
        	String phone=sc.next();
        	while(true) {
        	if(phone.length() != 10) {
        		System.out.println("Please Enter valid Phone Number");
        		System.out.println("");
        		break;
        	}else {
        		LocalDateTime appointmentDateTime = generateRandomDateTime();
        		
        		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy/HH:mm");
        		String formattedDateTime = appointmentDateTime.format(formatter);
        		
        		//Appointment details
            	ArrayList<String> appointmentdetails=new ArrayList<>();
            	appointmentdetails.add(doctorId);
            	appointmentdetails.add(name);
            	appointmentdetails.add(problem);
            	appointmentdetails.add(phone);
            	appointmentdetails.add(appointmentDateTime.toString());
            	
            	Integer appointmentID=getAppointmentId();
            	
            	appointments.put(appointmentID,appointmentdetails);
        		
        		System.out.println("Your appointment is booked with Appointment ID: "+appointmentID);
                System.out.println("Appointment Date and Time :"+formattedDateTime);
                System.out.println("");
                break;
        	}
       	}
        } else if (input.equalsIgnoreCase("no")) {
            
            System.out.println("Please select another doctor.");
            System.out.println("");
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            System.out.println("");
        }
    }
    static void viewDoctorsInfo() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Display Doctor Information");
        Doctors.doctorDetails();
        
        System.out.println("Select the Doctor ID Number To Book An Appointment");
        String selectedDoctorId = sc.next();
        bookAppointment(selectedDoctorId);
    }
    
    static void displayAppointments()
    {
    	for(Integer x:appointments.keySet())
    	{
    		ArrayList<String> appointmentDetails=appointments.get(x);
    		System.out.println("Appointment ID:"+x);
    		System.out.println("Doctor ID:"+appointmentDetails.get(0));
    		System.out.println("Patient Name:"+appointmentDetails.get(1));
    		System.out.println("Patient Problem:"+appointmentDetails.get(2));
    		System.out.println("Phone:"+appointmentDetails.get(3));
    		System.out.println("Appointment Date And Time :" +appointmentDetails.get(4));
    		System.out.println();
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
            System.out.println("1. Book an Appointment");
            System.out.println("2. View Doctors Information");
            System.out.println("3. View Appointments Information");
            System.out.println("4. Delete an Appointment");
            System.out.println("5. Exit");
            
            options = sc.nextInt();
            switch (options) {
                case 1:
                	System.out.println("Enter the Doctor ID");
                	String doctorId= sc.next();
                	bookAppointment(doctorId);
                    break;
                case 2:
                	viewDoctorsInfo();
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
