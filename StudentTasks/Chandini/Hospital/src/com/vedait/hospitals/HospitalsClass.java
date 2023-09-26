package com.vedait.hospitals;

public class HospitalsClass {
	
	String name;
    Doctors[] doctors;
    Nurses[] nurses;
    Patients[] patients;
    GeneralWard generalWards;
    IcuWard icuWards;
    EmergencyWard emergencyWards;
    Rooms[] rooms;
    
    
   public HospitalsClass(String name,Doctors[] doctors, Nurses[] nurses, Patients[] patients,Rooms[] rooms,GeneralWard generalWards, IcuWard icuWards,  EmergencyWard emergencyWards) {
   	
   	   this.name=name;
   	   this.doctors = doctors;
       this.nurses = nurses;
       this.patients = patients;
       this.generalWards = generalWards;
       this.icuWards = icuWards; 
       this.emergencyWards = emergencyWards;
       this.rooms=rooms;
	}
	
    void printDoctorDetails() {
   	 System.out.println("Hospital Name: " + name);
        System.out.println("Doctors:");
       for (Doctors doctor : doctors) {
           System.out.println("Doctor Name: " + doctor.name);
           System.out.println("Specialization: " + doctor.specilization);
           System.out.println("License Number: " + doctor.licenseNumber);
           System.out.println("Years of Experience: " + doctor.yearsOfExperience);
           System.out.println("Timings: " + doctor.timings);
           System.out.println();
       }
   }

    void printNurseDetails() {
   	 System.out.println("Hospital Name: " + name);
        System.out.println("Nurses:");
       for (Nurses nurse : nurses) {
           System.out.println("Nurse Name: " + nurse.name);
           System.out.println("License Number: " + nurse.licenseNumber);
           System.out.println("Years of Experience: " + nurse.yearsOfExperience);
           System.out.println("Timings: " + nurse.timings);
           System.out.println("Registered: " + nurse.isRegistered);
           System.out.println();
       }
   }

    void printPatientDetails() {
   	 System.out.println("Hospital Name: " + name);
        System.out.println("Patients:");
       for (Patients patient : patients) {
           System.out.println("Patient Name: " + patient.name);
           System.out.println("Patient ID: " + patient.patientID);
           System.out.println("Age: " + patient.age);
           System.out.println("Gender: " + patient.gender);
           System.out.println("Address: " + patient.address);
           System.out.println("Phone Number: " + patient.phoneNumber);
           System.out.println("Medical History: " + patient.medicalHistory);
           System.out.println();
       }
   }
    
    void printGeneralWardDetails() {
   	 System.out.println("Hospital Name: " + name);
        System.out.println("Wards:");
           System.out.println("Ward Type: " + generalWards.wardType);
           System.out.println("Capacity: " + generalWards.capacity);
           System.out.println("Private Rooms: " + generalWards.hasPrivateRooms);
           System.out.println();
       
   }

    void printICUWardDetails() {
       
           System.out.println("Ward Type: " + icuWards.wardType);
           System.out.println("Capacity: " + icuWards.capacity);
           System.out.println("Specialized Equipment: " + icuWards.specializedEquipment);
           System.out.println();
       
   }
    
    void printEmergencyWardDetails() {
        
            System.out.println("Ward Type: " + emergencyWards.wardType);
            System.out.println("Capacity: " + emergencyWards.capacity);
            System.out.println();
        
    }
    
    void printRoomsDetails() {
    	for (Rooms room : rooms) {
    		System.out.println("Room Number : "+room.roomNumber);
    		System.out.println("Room Capacity : "+room.capacity);
    		System.out.println("Room Type : "+room.roomType);
    		System.out.println("Is Room Occupied : "+room.isOccupied);
    		System.out.println();
    	}
    }
    


}
