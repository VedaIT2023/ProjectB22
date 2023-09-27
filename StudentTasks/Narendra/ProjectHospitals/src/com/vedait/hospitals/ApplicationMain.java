package com.vedait.hospitals;


public class ApplicationMain {
	public static void main(String args[]) {
		// Creating instances of doctors
		Persons.Doctors doctor1 = new Persons().new Doctors(
	            "Dr. Smith", 40, "Male", "123 Main St", "555-123-4567",
	            "Cardiologist", "MD12345", "Mon-Fri, 9 AM - 5 PM"
	        );

	        Persons.Doctors doctor2 = new Persons().new Doctors(
	            "Dr. Johnson", 35, "Female", "456 Elm St", "555-987-6543",
	            "Pediatrician", "MD67890", "Tue-Sat, 10 AM - 6 PM"
	        );

	        Persons.Doctors doctor3 = new Persons().new Doctors(
	            "Dr. Lee", 50, "Male", "789 Oak St", "555-222-3333",
	            "Orthopedic Surgeon", "MD54321", "Mon-Wed, 8 AM - 4 PM"
	        );
	        
	        Persons.Doctors[] doctorsArray = { doctor1, doctor2, doctor3 };

	        // Creating instances of Nurses
	        Persons.Nurses nurse1 = new Persons().new Nurses(
	            "Nurse Johnson", 30, "Female", "123 Pine St", "555-111-2222",
	            "Registered Nurse", "RN789", true, "Shift A"
	        );

	        Persons.Nurses nurse2 = new Persons().new Nurses(
	            "Nurse Davis", 28, "Male", "789 Birch St", "555-444-5555",
	            "Licensed Practical Nurse", "LPN123", false, "Shift B"
	        );

	        Persons.Nurses nurse3 = new Persons().new Nurses(
	            "Nurse Smith", 32, "Female", "456 Cedar St", "555-999-8888",
	            "Registered Nurse", "RN456", true, "Shift C"
	        );

	        Persons.Nurses[] nursesArray = { nurse1, nurse2, nurse3 };
	        
	        // Creating instances of Patients
	        Persons.Patients patient1 = new Persons().new Patients(
	            "P001", "John Doe", 45, "Male", "321 Maple St", "555-777-8888",
	            "High blood pressure, Diabetes"
	        );

	        Persons.Patients patient2 = new Persons().new Patients(
	            "P002", "Jane Smith", 28, "Female", "654 Birch St", "555-333-2222",
	            "Asthma, Allergies"
	        );

	        Persons.Patients patient3 = new Persons().new Patients(
	            "P003", "Michael Johnson", 60, "Male", "987 Elm St", "555-666-7777",
	            "Arthritis, Hypertension"
	        );
	        
	        Persons.Patients[] patientsArray = { patient1, patient2, patient3 };

	        // Creating instances of Workers
	        Persons.Workers worker1 = new Persons().new Workers(
	            "John Worker", 35, "Male", "555 Oak St", "555-777-1234",
	            "Janitor", "Morning Shift", 8
	        );

	        Persons.Workers worker2 = new Persons().new Workers(
	            "Lisa Worker", 25, "Female", "123 Cedar St", "555-888-5678",
	            "Cafeteria Staff", "Evening Shift", 6
	        );

	        Persons.Workers worker3 = new Persons().new Workers(
	            "David Worker", 40, "Male", "789 Pine St", "555-999-4321",
	            "Security Guard", "Night Shift", 10
	        );
	        
	        
	        
	        
	        Persons.Workers[] workersArray = { worker1, worker2, worker3 };
	        

	        // Creating instances of wards and passing details
	        Wards.GeneralWard generalWard = new Wards().new GeneralWard("General", 50, true);
	        Wards.ICUWard icuWard = new Wards().new ICUWard("ICU", 10, true);
	        Wards.PediatricWard pediatricWard = new Wards().new PediatricWard("Pediatric", 30, 0);
	        Wards.MaternityWard maternityWard = new Wards().new MaternityWard("Maternity", 20, true, true);
	        Wards.PsychiatricWard psychiatricWard = new Wards().new PsychiatricWard("Psychiatric", 15, "Behavioral Health");
	        Wards.CardiacWard cardiacWard = new Wards().new CardiacWard("Cardiac", 25, true);
	        Wards.BurnUnit burnUnit = new Wards().new BurnUnit("Burn Unit", 5, true);
	        Wards.EmergencyWard emergencyWard = new Wards().new EmergencyWard("Emergency", 10);
	        Wards.SurgeryWard surgeryWard = new Wards().new SurgeryWard("Surgery", 12, "Orthopedic");
	        Wards.IsolationWard isolationWard = new Wards().new IsolationWard("Isolation", 8, "Infectious Diseases");
	        
	        Wards.GeneralWard[] generalWardsArray = { generalWard };
	        Wards.ICUWard[] icuWardsArray = { icuWard };
	        Wards.PediatricWard[] pediatricWardsArray = { pediatricWard };
	        Wards.MaternityWard[] maternityWardsArray = { maternityWard };
	        Wards.PsychiatricWard[] psychiatricWardsArray = { psychiatricWard };
	        Wards.CardiacWard[] cardiacWardsArray = { cardiacWard };
	        Wards.BurnUnit[] burnUnitsArray = { burnUnit };
	        Wards.EmergencyWard[] emergencyWardsArray = { emergencyWard };
	        Wards.SurgeryWard[] surgeryWardsArray = { surgeryWard };
	        Wards.IsolationWard[] isolationWardsArray = { isolationWard };
		    
	        
	        Hospitals apollo = new Hospitals("APOLLO",
	                doctorsArray, nursesArray, patientsArray, workersArray,
	                generalWardsArray, icuWardsArray, pediatricWardsArray, maternityWardsArray,
	                psychiatricWardsArray, cardiacWardsArray, burnUnitsArray,
	                emergencyWardsArray, surgeryWardsArray, isolationWardsArray
	            );
 		
	        apollo.printDoctorDetails();
	        apollo.printNurseDetails();
	        apollo.printPatientDetails();
	        apollo.printWorkerDetails();
	        apollo.printGeneralWardDetails();
	        apollo.printICUWardDetails();
	        apollo.printPediatricWardDetails();
	        apollo.printMaternityWardDetails();
	        apollo.printPsychiatricWardDetails();
	        apollo.printCardiacWardDetails();
	        apollo.printBurnUnitDetails();
	        apollo.printEmergencyWardDetails();
	        apollo.printSurgeryWardDetails();
	        apollo.printIsolationWardDetails();
	}
	

}
