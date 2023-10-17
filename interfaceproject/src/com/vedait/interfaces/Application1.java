package com.vedait.interfaces;
import java.util.Scanner;
public class Application1 {

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
		        	System.out.println("Doctors List:");
		        	for(int i=0;i<doctors.length;i++) {
		        		System.out.println( i+"."+"Doctor Name:" +doctors[i].name +" ");
		        		   								System.out.println("DoctorSpecialisation:"+doctors[i].specialisation);
		        		System.out.println("Doctor Timings:"+doctors[i].timings);
		        		System.out.println(" ");
		        	}
			       

		            System.out.println("Enter a number to select a doctor:");
		        
		        int selectedDoctorIndex = scanner.nextInt();

		        
		        if (selectedDoctorIndex >= 0 && selectedDoctorIndex < doctors.length) {
		            Doctor selectedDoctor = doctors[selectedDoctorIndex];

		          
		            System.out.println("Appointment Of Doctor");
		            System.out.println("Doctor: " + selectedDoctor.name);
		            System.out.println("Specialisation: " + selectedDoctor.specialisation);
		            System.out.println("Doctor Timings: " + selectedDoctor.timings);

		           
		            System.out.print("Do you want to book an appointment? (yes/no): ");
		            String bookAppointment = scanner.next();
		            System.out.println("Enter Patient Name:");
		            if (bookAppointment.equalsIgnoreCase("yes")) {
		                
		               
		                String patientName= scanner.next();

		                Patient bookedPatient = new Patient(patientName, selectedDoctor.timings, "Your problem", 'M');

		               
		                System.out.println("Appointment booked successfully:");
		                System.out.println("Doctor: " + selectedDoctor.name);
		                System.out.println("Patient: " + bookedPatient.name);
		                System.out.println("Appointment Time: " + bookedPatient.timings);
		            } else {
		                System.out.println("Appointment not booked.");
		            }
		        } else {
		            System.out.println("Invalid doctor selection.");
		        }
		        System.out.print("Do you want to book another appointment? (yes/no): ");
	            String continueBookingInput = scanner.next();
	            continueBooking = continueBookingInput.equalsIgnoreCase("yes");
	        }

	        System.out.println("Thank you ");
	        
	    }

	   
	   
	    }
	


		    
	


	        		        