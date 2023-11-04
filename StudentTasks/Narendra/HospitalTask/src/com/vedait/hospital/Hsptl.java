package com.vedait.hospital;
import java.util.*;

public class Hsptl {
	Scanner s = new Scanner(System.in);
	Doctors[] doctor;
	Patients[] patients;
	HashMap<String, List<String>> pmap = new HashMap<>();
	Hsptl(Doctors[] doctor,Patients[] patients ){
		this.doctor=doctor;
		this.patients=patients;
	}
	void bookAnAppointment() {
        System.out.print("Patient Name :");
        String pName=s.nextLine();
       
        System.out.print("PatientId :");
		String pId=s.nextLine();
		
		System.out.print("Doctor Name :");
		String dName=s.nextLine();
		
		System.out.print("Doctor Id:");
		String dId=s.nextLine();
		
		for (Doctors d : doctor) {
			
            if (dName.equalsIgnoreCase(d.name)) {
                List<String> timeSlots = d.availableTime;
                System.out.println("Time slots for " + dName);
                for (String timeSlot : timeSlots) {
                    System.out.println(timeSlot);
                }
                break; 
            }
		}
		
		System.out.print("time slot:");
		String time=s.nextLine();
        pmap.put(pId, List.of(dName,dId,time));
        System.out.println("Booked appointment successfully");
        System.out.println();
        System.out.println();
        System.out.println();
        }
   
         
	void deleteAnAppointment() {
		String pId=s.nextLine();
		if(pmap.containsKey(pId)) {
			pmap.remove(pId);
			System.out.println("Deleted appointment successfully");
			System.out.println();
	        System.out.println();
	        System.out.println();
		}
		else {
			System.out.println("There is no patient appointment with that Id");
			System.out.println();
	        System.out.println();
	        System.out.println();
		}
	}
	
	void printAppointments() {
		for (Map.Entry<String, List<String>> e : pmap.entrySet())
            System.out.println("PatientId: " + e.getKey() + "  " + "doctor details: " + e.getValue());
    }
	}












