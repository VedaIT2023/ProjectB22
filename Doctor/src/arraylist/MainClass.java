package arraylist;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
public class MainClass {

	static HashMap<Integer,ArrayList<String>> appointments=new HashMap<>();
	static Integer appointmentCounter=10;

    public static void main(String[] args) {
        Doctor.doctorDetails();
        showOptions();
    }
    
    static Integer getAppointmentId()
    {
    	appointmentCounter++;
    	return appointmentCounter;
    }
    
    static void bookAppointment(String doctorId) {
    	Scanner sc = new Scanner(System.in);
    	boolean found = false;
    	ArrayList<Doctor> doctorsList = Doctor.doctorList;
    	for (int i = 0; i < doctorsList.size(); i++) {
            Doctor doctor = doctorsList.get(i);
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
        
        System.out.println("Do You Want To Book an Appointment(Yes/No)");
        String input = sc.next();
        if (input.equalsIgnoreCase("yes")) {

        	System.out.println("Enter your Name");
        	String name=sc.next();
        	System.out.println("Enter your Problem");
        	String problem=sc.next();
        	System.out.println("Enter your phone no.");
        	String phone=sc.next();
        	
        	//Appointment details
        	ArrayList<String> appointmentdetails=new ArrayList<>();
        	appointmentdetails.add(doctorId);
        	appointmentdetails.add(name);
        	appointmentdetails.add(problem);
        	appointmentdetails.add(phone);
        	
        	Integer appointmentID=getAppointmentId();
        	
        	appointments.put(appointmentID,appointmentdetails);
        	
            System.out.println("Your appointment is booked with Appointment ID: "+appointmentID);
            
        } else if (input.equalsIgnoreCase("no")) {
    
            System.out.println("Please select another doctor.");
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }
    }
    
    static void viewDoctorsInfo() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Display Doctor Information");
        Doctor.doctorDetails();
        
        System.out.println("Select the Doctor ID Number To Book An Appointment");
        String selectedDoctorId = sc.next();
        bookAppointment(selectedDoctorId);
    }
    
    static void displayAppointments()
    {
    	for(Integer Y:appointments.keySet())
    	{
    		ArrayList<String> appointmentDetails=appointments.get(Y);
    		System.out.println("Appointment ID:"+Y);
    		System.out.println("Doctor ID:"+appointmentDetails.get(0));
    		System.out.println("Patient Name:"+appointmentDetails.get(1));
    		System.out.println("Patient Problem:"+appointmentDetails.get(2));
    		System.out.println("Phone:"+appointmentDetails.get(3));
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
    		System.out.println("Your Appointment was cancelled");
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
            System.out.println("5. Quit");
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
                    System.out.println("Quit");
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
