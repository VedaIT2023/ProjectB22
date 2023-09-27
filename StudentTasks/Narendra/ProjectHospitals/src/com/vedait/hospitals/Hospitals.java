package com.vedait.hospitals;



public class Hospitals {
	String name;
     Persons.Doctors[] doctors;
     Persons.Nurses[] nurses;
     Persons.Patients[] patients;
     Persons.Workers[] workers;
     Wards.GeneralWard[] generalWards;
     Wards.ICUWard[] icuWards;
     Wards.PediatricWard[] pediatricWards;
     Wards.MaternityWard[] maternityWards;
     Wards.PsychiatricWard[] psychiatricWards;
     Wards.CardiacWard[] cardiacWards;
     Wards.BurnUnit[] burnUnits;
     Wards.EmergencyWard[] emergencyWards;
     Wards.SurgeryWard[] surgeryWards;
     Wards.IsolationWard[] isolationWards;
     
    public Hospitals(String name,Persons.Doctors[] doctors, Persons.Nurses[] nurses, Persons.Patients[] patients, Persons.Workers[] workers,
    		Wards.GeneralWard[] generalWards, Wards.ICUWard[] icuWards, Wards.PediatricWard[] pediatricWards,
    		Wards.MaternityWard[] maternityWards, Wards.PsychiatricWard[] psychiatricWards,
    		Wards.CardiacWard[] cardiacWards, Wards.BurnUnit[] burnUnits, Wards.EmergencyWard[] emergencyWards,
    		Wards.SurgeryWard[] surgeryWards, Wards.IsolationWard[] isolationWards) {
    	
    	this.name=name;
    	this.doctors = doctors;
        this.nurses = nurses;
        this.patients = patients;
        this.workers = workers;
        this.generalWards = generalWards;
        this.icuWards = icuWards;
        this.pediatricWards = pediatricWards;
        this.maternityWards = maternityWards;
        this.psychiatricWards = psychiatricWards;
        this.cardiacWards = cardiacWards;
        this.burnUnits = burnUnits;
        this.emergencyWards = emergencyWards;
        this.surgeryWards = surgeryWards;
        this.isolationWards = isolationWards;
	}
	
     void printDoctorDetails() {
    	 System.out.println("Hospital Name: " + name);
         System.out.println("Doctors:");
        for (Persons.Doctors doctor : doctors) {
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
        for (Persons.Nurses nurse : nurses) {
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
        for (Persons.Patients patient : patients) {
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

     void printWorkerDetails() {
    	 System.out.println("Hospital Name: " + name);
         System.out.println("Workers:");
        for (Persons.Workers worker : workers) {
            System.out.println("Worker Name: " + worker.name);
            System.out.println("Age: " + worker.age);
            System.out.println("Gender: " + worker.gender);
            System.out.println("Address: " + worker.address);
            System.out.println("Phone Number: " + worker.phoneNumber);
            System.out.println("Work: " + worker.work);
            System.out.println("Shift: " + worker.shift);
            System.out.println("Shift Duration: " + worker.shiftDuration + " hours");
            System.out.println();
        }
    }

     void printGeneralWardDetails() {
    	 System.out.println("Hospital Name: " + name);
         System.out.println("Wards:");
        for (Wards.GeneralWard ward : generalWards) {
            System.out.println("Ward Type: " + ward.wardType);
            System.out.println("Capacity: " + ward.capacity);
            System.out.println("Private Rooms: " + ward.hasPrivateRooms);
            System.out.println();
        }
    }

     void printICUWardDetails() {
        for (Wards.ICUWard ward : icuWards) {
            System.out.println("Ward Type: " + ward.wardType);
            System.out.println("Capacity: " + ward.capacity);
            System.out.println("Specialized Equipment: " + ward.specializedEquipment);
            System.out.println();
        }
    }
      void printPediatricWardDetails() {
         for (Wards.PediatricWard ward : pediatricWards) {
             System.out.println("Ward Type: " + ward.wardType);
             System.out.println("Capacity: " + ward.capacity);
             System.out.println("Age Range: 0-" + ward.ageRange + " years");
             System.out.println();
         }
     }

      void printMaternityWardDetails() {
         for (Wards.MaternityWard ward : maternityWards) {
             System.out.println("Ward Type: " + ward.wardType);
             System.out.println("Capacity: " + ward.capacity);
             System.out.println("Labor & Delivery Rooms: " + ward.laborDeliveryRooms);
             System.out.println("Neonatal ICU: " + ward.neonatalICU);
             System.out.println();
         }
     }

      void printPsychiatricWardDetails() {
         for (Wards.PsychiatricWard ward : psychiatricWards) {
             System.out.println("Ward Type: " + ward.wardType);
             System.out.println("Capacity: " + ward.capacity);
             System.out.println("Specialty: " + ward.specialty);
             System.out.println();
         }
     }

      void printCardiacWardDetails() {
         for (Wards.CardiacWard ward : cardiacWards) {
             System.out.println("Ward Type: " + ward.wardType);
             System.out.println("Capacity: " + ward.capacity);
             System.out.println("Specialized Staff: " + ward.specializedStaff);
             System.out.println();
         }
     }

      void printBurnUnitDetails() {
         for (Wards.BurnUnit ward : burnUnits) {
             System.out.println("Ward Type: " + ward.wardType);
             System.out.println("Capacity: " + ward.capacity);
             System.out.println("Advanced Wound Care: " + ward.advancedWoundCare);
             System.out.println();
         }
     }

      void printEmergencyWardDetails() {
         for (Wards.EmergencyWard ward : emergencyWards) {
             System.out.println("Ward Type: " + ward.wardType);
             System.out.println("Capacity: " + ward.capacity);
             System.out.println();
         }
     }

      void printSurgeryWardDetails() {
         for (Wards.SurgeryWard ward : surgeryWards) {
             System.out.println("Ward Type: " + ward.wardType);
             System.out.println("Capacity: " + ward.capacity);
             System.out.println("Surgical Specialty: " + ward.surgicalSpecialty);
             System.out.println();
         }
     }

      void printIsolationWardDetails() {
         for (Wards.IsolationWard ward : isolationWards) {
             System.out.println("Ward Type: " + ward.wardType);
             System.out.println("Capacity: " + ward.capacity);
             System.out.println("Isolation Type: " + ward.isolationType);
             System.out.println();
         }
     }
 }

