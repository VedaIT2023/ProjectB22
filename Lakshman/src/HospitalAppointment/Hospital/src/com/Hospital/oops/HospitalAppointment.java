package com.Hospital.oops;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;



public class HospitalAppointment {

	public static void main(String[] args) {
		
		 ArrayList<PatientDetails> appointments = new ArrayList();
		
		Scanner sc=new Scanner(System.in);
		
		DoctorProperties doctor1=new DoctorProperties("Dr.Alexandar", 'M', 1001, 35, "Cardilogist","8823967127","10:00 am to 1:00 pm");
		DoctorProperties doctor2=new DoctorProperties("Dr.Ramesh", 'M',1002, 28,"oncologist","9823967126","11:00 am to 2:00 pm");
		DoctorProperties doctor3=new DoctorProperties("Dr.Siva Krishna", 'M',1003, 45, "Neurologist ","7423967125" ,"5:00 pm to 8:00 pm");
		DoctorProperties doctor4=new DoctorProperties("Dr.Ruby", 'F',1004, 51, "Ophthalmologist","9923967129","10:00 am to 12:00 pm");
		DoctorProperties doctor5=new DoctorProperties("Dr.Lavanya", 'F',1005, 39, "Gynecologist", "6323967128","6:00 pm to 10:00 pm" );
		DoctorProperties doctor6=new DoctorProperties("Dr.Lakshman", 'M',1006, 35, "Urologist","8823967127","10:00 am to 1:00 pm");
		DoctorProperties doctor7=new DoctorProperties("Dr.Nithish", 'M',1007, 28,"Dermatologist","9823967126","11:00 am to 2:00 pm");
		DoctorProperties doctor8=new DoctorProperties("Dr.Dinakaran", 'M',1008, 45, "Gastroenterologist ","7423967125" ,"5:00 pm to 8:00 pm");
		DoctorProperties doctor9=new DoctorProperties("Dr.Shalem", 'M',1009, 41, "Rheumatologist","9923967129","10:00 am to 12:00 pm");
		DoctorProperties doctor10=new DoctorProperties("Dr.Sathish Babu", 'M',1010, 49, "Phathologist", "6323967128","6:00 pm to 10:00 pm" );
		DoctorProperties doctor11=new DoctorProperties("Dr.Bhavana", 'F', 1011, 35, "Cardilogist","6323967127","5:00 pm to 8:00 pm");
		DoctorProperties doctor12=new DoctorProperties("Dr.Harika", 'F',1012, 28,"oncologist","7723967126","7:00 pm to 10:00 pm");
		DoctorProperties doctor13=new DoctorProperties("Dr.Sireesha", 'F',1013, 45, "Neurologist ","6623967125" ,"11:00 am to 1:00 pm");
		DoctorProperties doctor14=new DoctorProperties("Dr.Maeve", 'F',1014, 51, "Ophthalmologist","8023967129","6:00 pm to 10:00 pm");
		DoctorProperties doctor15=new DoctorProperties("Dr.Priyanka", 'F',1015, 39, "Gynecologist", "9023967128","10:00 am to 2:00 pm" );
		DoctorProperties doctor16=new DoctorProperties("Dr.Subhani", 'M',1016, 35, "Rheumatologist","8223967127","5:00 pm to 9:00 pm");
		DoctorProperties doctor17=new DoctorProperties("Dr.Abhinav", 'M',1017, 28,"Dermatologist","7723967126","10:00 am to 1:00 pm");
		DoctorProperties doctor18=new DoctorProperties("Dr.Rosy", 'F',1018, 45, "Gastroenterologist ","6323967125" ,"5:00 pm to 8:00 pm");
		DoctorProperties doctor19=new DoctorProperties("Dr.Anjali", 'M',1019, 41, "Urologist","8863967129","6:00 pm to 10:00 pm");
		DoctorProperties doctor20=new DoctorProperties("Dr.Bhargav", 'M',1020, 49, "Phathologist", "9993967128","11:00 am to 2:00 pm" );
		
		DoctorProperties doctors[]= {doctor1,doctor2,doctor3,doctor4,doctor5,doctor6,doctor7,doctor8,doctor9,doctor10,doctor11,doctor12,doctor13,doctor14,doctor15,doctor16,doctor17,doctor18,doctor19,doctor20};
		boolean count = false;
		int patient =0;
		int id = 100;
	    while (!count) {
            System.out.println("Select an option:");
            System.out.println("1. View Doctors List");
            System.out.println("2. Book an Appointment");
            System.out.println("3. view Appointment List");
            System.out.println("4. Cancel an Appointment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The Doctors List:\n");
                    for (int i = 0; i < doctors.length; i++) {
                        System.out.println(doctors[i].viewDoctorsList());
                    }
                    break;

                case 2:
                    System.out.print("Enter the Doctor ID you want to consult: ");
                    int doctorid = sc.nextInt();
                    boolean found = false;
            		    for(int i=0;i<doctors.length;i++) {
            		    	if(doctorid == doctors[i].id) {
            		    	System.out.println(doctors[i].getName()+"\n");;
            		    	found=true;
                        }
                    }

                    if (!found) {
                        System.out.println("Doctor not found");
                        break;
                    }

                    System.out.print("Are you OK with the Timings? (yes/no): ");
                    String feedback = sc.next().toLowerCase();

                    if (feedback.equals("yes")) {
                    	System.out.println("Enter your name :");
                    	String name =sc.next();
                    	System.out.println("Enter your age :");
                    	int age =sc.nextInt();
                    	System.out.println("Enter your Problem :");
                    	String problem =sc.next();
                    	System.out.println("Enter your Mobile No :");
                    	String mobileno =sc.next();
                    	
                    	PatientDetails appoint = new PatientDetails(id, name, age, problem, mobileno);
                    	appointments.add(appoint);
                    	
                    	System.out.println("Your appointment is conformed  \n"+"Appointment ID :"+id+"\nName :"+name+"\nAge :"+age+"\nProblem :"+problem+"\nMobile No :"+mobileno);
                        id++;
                        
                    } else if (feedback.equals("no")) {
                        System.out.println("Please select another doctor.");
                    } else {
                        System.out.println("Invalid Doctor Id");
                    }
                    System.out.println("You want to book another appointment(Yes/No)");
            	    String confirmation = sc.next().toLowerCase();
            	    if(confirmation.equals("no")) {
            	    	System.out.println("Thank you");
            	    	count=true;
                       break;
            	    }
            	    else if(confirmation.equals("yes")) {
            	    	continue;
            	    	
            	    }
            	    
                    
                case 3:
                	if(appointments.size()>0) {
                	for(PatientDetails appointment : appointments) {
                		System.out.println("Appointments "+ appointment.toString());
                	}
                	}
                	else {
                		System.out.println("No appointments are booked\n");
                		continue;
                	}

                case 4:
                    
                  	System.out.print("Enter the appointment number you want to cancel: ");
                	int appointmentnumber = sc.nextInt();
                	boolean condition = false;

                	for (int i = 0; i < appointments.size(); i++) {
                	    if (appointments.get(i).id == appointmentnumber) {
                	        appointments.remove(i);
                	        System.out.println("Appointment canceled");
                	        condition = true;
                	        break;
                	    }
                	}

                	if (!condition) {
                	    System.out.println("Invalid appointment number.");
                	}
                case 5:
                    System.out.println("Thank you");
                    
                default:
                    System.out.println("Please select a valid option.");
	   
          
             }

            
          }
         
	}
}
	

