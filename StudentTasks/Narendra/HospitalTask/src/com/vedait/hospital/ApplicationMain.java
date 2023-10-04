package com.vedait.hospital;

import java.util.*;

public class ApplicationMain {
	

	 static public void main(String args[]) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 Doctors narendra = new Doctors("Narendra","DD101","CARDIOLOGIST",List.of("9:00AM","10:00AM"),0);
		 Doctors chandini = new Doctors("Chandini","DD102","Neurologist",List.of("11:00AM","12:00PM"),0);
		 Doctors chandu = new Doctors("Chandu","DD103","ENT Specialist",List.of("1:00PM","2:00PM"),0);
		 Doctors sudheer = new Doctors("Sudheer","DD104","Dentist",List.of("3:00PM","4:00PM"),0);
		 
		 Doctors[] doctor= {narendra , chandini, chandu, sudheer};
		 
		 Patients smitha = new Patients( "Smitha", "P001",28, "Female", "654 Birch St", "555-333-2222","Asthma, Allergies");

		 Patients jackie = new Patients( "Jackie", "P002", 60, "Male", "987 Elm St", "555-666-7777", "Arthritis, Hypertension"  );
		    
		 Patients[] patients = { smitha,jackie };
		 
		 
		 Hsptl h1 = new Hsptl(doctor, patients);
		 
		 System.out.println("Hospital DashBoard :");
		 while(true) {
			 System.out.println("1.Book Appointment");
			 System.out.println("2.Delete Appointment");
			 System.out.println("3.View Appointments");
			 System.out.println("4.Exit");
			 System.out.print("Enter your choice : ");
			 int choice = sc.nextInt();
			 switch(choice) {
			 
			 case 1:{
				 
				 h1.bookAnAppointment();
				 break;
				 
			 }
			 case 2:{
				 h1.deleteAnAppointment();
				 break;
			 }
				 
			 case 3:{
				 h1.printAppointments();
				 break;
			 }
			 default:
				 System.out.println("Enter valid choie");
				 break;
				 
			 
			 }
		 }
			 
			
		 

	}

}
