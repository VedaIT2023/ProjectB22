package com.hospital.code;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
        public static void main(String[] args) {

             AllDetails doctor = new AllDetails();
             List<DoctorsDetails> doctorList = new ArrayList<>(doctor.doctors.values());
                
             for(int i = 0; i < doctorList.size(); i++) {
                  System.out.println(doctorList.get(i).details());
                
             }
             AllDetails patient = new AllDetails();
             List<PatientsDetails> patientList = new ArrayList<>(patient.patients.values());
                
             for(int i = 0; i < patientList.size(); i++) {
                  System.out.println(patientList.get(i).details());
                
             }
             for(int i=0; i<doctorList.size(); i++) {
                 System.out.println(doctorList.get(i).values());
                 System.out.println(patientList.get(i).values());
             }
    }
}
