package com.vedait.interfaces;
import java.util.*;
public class AppMain {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Doctor>names=new LinkedList() ;
		
				
		HospitalsHelp.displayDoctorsList();
		HospitalsHelp.createDoctors();
		 showOptions();
	}
	public static void showOptions() {
		System.out.println("Choose an option in the below\n");
		System.out.println("1.Book an appointment");
		System.out.println("2.Delete an appointment");
		System.out.println("3.View appointment");
		System.out.println("4. Exit");
		int option = 0;
		while(option<=0) {
			try {
				option = sc.nextInt();
				switch(option) {
				case 1:
					bookAnAppointment();
					break;
				case 2:
					deleteAnAppointment();
					break;
				case 3:
					viewAllAppointments();
					break;
				case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;

				default:
					System.out.println("Please enter a valid option");
					showOptions();
					break;

				}
			}catch(Exception e) {
				String error = sc.nextLine();
				System.out.println("Please enter a valid input\n");

			}
		}		
	}

	 public static void bookAnAppointment() {
	        System.out.println("Enter the ID of the doctor you want to book an appointment with:");
	        int doctorId = sc.nextInt();
	        Doctor selectedDoctor = findDoctor(doctorId);
	        
	        if (selectedDoctor != null) {
	            System.out.println("Enter your patient ID:");
	            int patientId = sc.nextInt();
	            sc.nextLine(); 
	            
	            System.out.println("Enter your name:");
	            String patientName = sc.nextLine();
	            
	            boolean isAlreadyBooked = selectedDoctor.isPatientBooked(patientId, patientName);
	            
	            if (!isAlreadyBooked) {
	                Appointment appointment = new Appointment();
	                selectedDoctor.addAppointment(appointment);
	                System.out.println("Appointment booked with Dr. " + selectedDoctor.name);
	            } else {
	                System.out.println("You are already booked with Dr. " + selectedDoctor.name);
	            }
	        } else {
	            System.out.println("Doctor with ID " + doctorId + " not found.");
	        }
	        showOptions();
	    }

	
	private static void deleteAnAppointment() {
        System.out.println("Enter the ID of the doctor whose appointment you want to delete:");
        int doctorId = sc.nextInt();
        Doctor selectedDoctor = findDoctor(doctorId);
        if (selectedDoctor != null) {
            if (selectedDoctor.isBooked) {
                selectedDoctor.isBooked = false; 
                System.out.println("Appointment with Dr. " + selectedDoctor.name + " deleted.");
            } else {
                System.out.println("No appointment is booked with Dr. " + selectedDoctor.name);
            }
        } else {
            System.out.println("Doctor with ID " + doctorId + " not found.");
        }
        showOptions();
    }
	
    private static void viewAllAppointments() {
        System.out.println("\nAppointment List:");
        for (Doctor doctor : HospitalsHelp.doctorsList) {
            System.out.println("Doctor ID: " + doctor.id);
            System.out.println("Doctor Name: " + doctor.name);
            System.out.println("Specialization: " + doctor.specialisation);
            System.out.println("Is Booked: " + (doctor.isBooked ? "Yes" : "No"));
            System.out.println("------------------------------");
        }
        showOptions();
    }
	private static Doctor findDoctor(int id) {
        for (Doctor doctors : HospitalsHelp.doctorsList) {
            if (doctors.id == id) {
                return doctors;
            }
        }
        return null;
    }
}

