package com.vedait.interfaces;
import java.util.Scanner;
public class Appointment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		   
		 Doctor mahi = new Doctor("Dr.Mahi", "10:00AM--12:00PM", "Cardiologists", 'M');
	        Doctor maruthi = new Doctor("Dr.Maruthi", "9:00AM--1:00PM", "Dermatologists", 'M');
	        Doctor maheswari = new Doctor("Dr.Maheswari", "11:00AM--3:00PM", "Endocrinologists", 'F');
	        Doctor akshaya = new Doctor("Dr.Akshaya", "2:00PM--4:00PM", "Gastroenterologists", 'F');
	        Doctor akshitha = new Doctor("Dr.Akshitha", "2:00PM--4:00PM", "Hematologists", 'F');
	        Doctor abhinaya = new Doctor("Dr.Abhinaya", "1:00PM--4:00PM", "Nephrologists", 'F');
	        Doctor abhi = new Doctor("Dr.AbhiRam", "12:00PM--4:00PM", "Neurologists", 'M');
	        Doctor vasu = new Doctor("Dr.VasuPradha", "10:00AM--4:00PM", "Obstetricians", 'F');
	        Doctor bheem = new Doctor("Dr.Bheem", "2:00PM--8:00PM", "Oncologists", 'M');
	        Doctor pavan = new Doctor("Dr.Pavan", "1:00PM--9:00PM", "Ophthalmologists", 'M');

	        Patient ravi = new Patient("Ravi", "10:00AM--11:00PM", "high blood pressure", 'M');
	        Patient ramya = new Patient("Ramya", "11:00AM--12:00PM", "Skin problem", 'F');
	        Patient tanu = new Patient("Tanuja", "9:00AM--10:00AM", "thyroid problems", 'F');
	        Patient hemanth = new Patient("Hemanth", "2:00PM--3:00PM", "abdominal pain", 'M');
	        Patient madhu = new Patient("Madhu", "3:00PM--3:30PM", "sickle cell disease", 'M');
	        Patient marin = new Patient("Marin", "2:00PM--2:30PM", "kidney disease", 'M');
	        Patient balu = new Patient("Balu", "12:00PM--12:30PM", "Parkinson's disease", 'M');
	        Patient hema = new Patient("Hema", "1:30PM--2:00PM", "pregnancy", 'F');
	        Patient siri = new Patient("Siri", "6:00PM--7:00PM", "cancer", 'F');
	        Patient raju = new Patient("Raju", "8:30PM--9:00PM", "glaucoma", 'M');

	        Doctor doctors[] = { mahi, maruthi, maheswari, akshaya, akshitha, abhinaya, abhi, vasu, bheem, pavan };
	        Patient patients[] = { ravi, ramya, tanu, hemanth, madhu, marin, balu, hema, siri, raju };
	        
	        Scanner scanner = new Scanner(System.in);

	        boolean continueBooking = true;

	        while (continueBooking) {
	           
	            System.out.println("Select the Doctor Number to Book An Appointment:");
	            for (int i = 0; i < doctors.length; i++) {
	                Doctor doctor = doctors[i];
	                System.out.println(i + ":");
	                System.out.println("Name of the Doctor: " + doctor.name);
	                System.out.println("Available Timings: " + doctor.timings);
	                System.out.println("Specialisation: " + doctor.specialisation);
	                System.out.print("Do you want to book an appointment with this doctor? (yes/no): ");
	                String bookAppointment = scanner.next();

	                if (bookAppointment.equalsIgnoreCase("yes")) {
	                    System.out.println("Your appointment is booked!");
	                } else {
	                    System.out.println("Please select another doctor.");
	                }
	      }

	          
	            System.out.print("Do you want to book another appointment? (yes/no): ");
	            String continueBookingInput = scanner.next();
	            continueBooking = continueBookingInput.equalsIgnoreCase("yes");
	        }

	       
	        System.out.println("Thank you for Using our Service");
	        
	       
	    }
	}


