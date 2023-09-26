package com.vedait.hospitals;


public class ApplicationMain {
	public static void main(String args[]) {
		Doctors chandini = new  Doctors("Dr. Chandini", 40, "Female", "123 Main St", "555-123-4567","Cardiologist", "MD12345", 4, "Mon-Fri, 9 AM - 5 PM");

	    Doctors chandu = new Doctors("Dr. Chandu", 35, "Male", "456 Elm St", "555-987-6543","Pediatrician", "MD67890", 5,"Tue-Sat, 10 AM - 6 PM");

	    Doctors obama = new Doctors("Dr. Obama", 50, "Male", "789 Oak St", "555-222-3333","Orthopedic Surgeon", "MD54321", 6,"Mon-Wed, 8 AM - 4 PM");
	    
	    Doctors[] doctors = {chandini,chandu,obama  };
	    
	    Nurses kavya = new Nurses("Nurse Kavya", 30, "Female", "123 Pine St", "555-111-2222","Registered Nurse", "RN789", true, "Shift A");

	    Nurses srihan = new Nurses("Nurse srihan", 28, "Male", "789 Birch St", "555-444-5555","Licensed Practical Nurse", "LPN123", false, "Shift B");
	    
	    Nurses[] nurses = {kavya,srihan};
	    
	    Patients smitha = new Patients("P001", "Smitha", 28, "Female", "654 Birch St", "555-333-2222","Asthma, Allergies");

	    Patients jackie = new Patients("P002", "Jackie", 60, "Male", "987 Elm St", "555-666-7777", "Arthritis, Hypertension"  );
	    
	    Patients[] patients = { smitha,jackie };
	    
	    Rooms room1 = new Rooms(101,"general", 10,true);
	    Rooms room2 = new Rooms(102,"genaeral", 10,true);
	    Rooms room3 = new Rooms(103,"A/C", 1,true);
	    
	    Rooms[] rooms = {room1,room2,room3};
	    
	    GeneralWard generalWard = new GeneralWard("General",10,true);
        IcuWard icuWard = new IcuWard("ICU", 10, true);
        EmergencyWard emergencyWard = new EmergencyWard("Emergency", 10);
        
        HospitalsClass yashoda = new HospitalsClass("YASHODA HOSPITALS",doctors,nurses,patients,rooms,generalWard,icuWard,emergencyWard);
	   
        yashoda.printDoctorDetails();
        yashoda.printNurseDetails();
        yashoda.printPatientDetails();
        yashoda.printRoomsDetails();
        yashoda.printGeneralWardDetails();
        yashoda.printICUWardDetails();
        yashoda.printEmergencyWardDetails();
        
	      
	     
	      
	       
	       
		
	}


}
