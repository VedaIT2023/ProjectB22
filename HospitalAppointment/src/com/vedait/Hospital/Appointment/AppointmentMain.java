package com.vedait.Hospital.Appointment;
import java.util.*;
public class AppointmentMain {
	
	static ArrayList<Details> appointments = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
	static ArrayList<Doctors> doctors = new ArrayList();
    static int intialappointmentno = 1000; 
    
	public static void main(String[] args) {
		
		doctors.add(new Doctors("Dr.Pavan","Cardiologist",101));
		doctors.add(new Doctors("Dr.Laxman","Dermatologists",102));
		doctors.add(new Doctors("Dr.Satish","Endocrinologists",103));
		doctors.add(new Doctors("Dr.Balaji","Gastroenterologists",104));
		doctors.add(new Doctors("Dr.Satwik","Hematologists",105));
		doctors.add(new Doctors("Dr.Lakshmi","Nephrologists",106));
		doctors.add(new Doctors("Dr.Supriya","Neurologists",107));
		doctors.add(new Doctors("Dr.Lalitha","Ophthalmologists",108));
		doctors.add(new Doctors("Dr.Niharika","Immunologists",109));
		
     
     while (true) {
    	 
    	 System.out.println("Appointment Options");
         System.out.println("1. View Doctor Details ");
         System.out.println("2. Book an appointment");
         System.out.println("3. View appointments");
         System.out.println("4. Cancel Appointment");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine(); 

         switch (choice) {
             case 1:
            	 System.out.println("Details Of Doctors :");
            	 for(int i=0;i<doctors.size();i++) {
         			System.out.println(doctors.get(i).toString());
         		}
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

	static void bookAppointment() {
	    System.out.println("Enter Doctor ID :");
	    int doctorId = scanner.nextInt();

	    boolean doctorExists = false;

	    for (int i = 0; i < doctors.size(); i++) {
	        if (doctors.get(i).doctorid==(doctorId)) {
	            doctorExists = true;

	            System.out.print("Enter patient name: ");
	            String patientName = scanner.next();

	            System.out.print("Enter Patient Problem : ");
	            String problem = scanner.next();

	            Details appointment = new Details(intialappointmentno++, doctorId, problem, patientName);
	            appointments.add(appointment);
	            System.out.println("Appointment booked successfully!");
	            break; 
	        }
	    }

	    if (!doctorExists) {
	        System.out.println("Invalid Doctor ID. Please enter a valid Doctor ID.");
	    }
	}
	
	static void viewAppointments() {
		if (appointments.isEmpty()) {
<<<<<<< Updated upstream
	        System.out.println("No appointments.");
	    } else {
     System.out.println("Appointments:");
     for (int i=0;i<appointments.size();i++) {
         System.out.println(appointments.toString());
=======
	        System.out.println("No appointments booked.");
	    } else {
     System.out.println("Appointments:");
     for (int i=0;i<appointments.size();i++) {
         System.out.println(appointments.get(i).toString());
>>>>>>> Stashed changes
     	}
    } 
}
	
	
    static void cancelAppointment() {
         System.out.print("Enter the  appointment number you want to cancel: ");
         int appointmentnumber = scanner.nextInt();
         boolean found = false;
         for (int i=0; i<appointments.size(); i++) {
             if (appointments.get(i).appointmentno==appointmentnumber) {
                 appointments.remove(i);
                 System.out.println("Appointment cancled");
                found = true;
                 break;
             }
         }
         if(!found) {
             System.out.println("Invalid appointment number.");
         }
    }
 }
 
 

