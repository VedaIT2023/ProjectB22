package com.hospital.form;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllDetails {


	HashMap<Integer, DoctorsDetails> doctors = new HashMap();

	public AllDetails() {
	//Doctors
		doctors.put(1, new DoctorsDetails("Dr.Sandeep",52,'M',"sandeep1223@gmail.com","Full week","Pediatrics","09:00PM to 04:00PM"));
		doctors.put(2,new DoctorsDetails("Dr.Ajay",67,'M',"ajaykaul1223@gmail.com","Full week", "Cardioligists","09:00PM to 04:00PM"));
		doctors.put(3,new DoctorsDetails("Dr.Naresh",49,'M',"nareshtrehan1223@gmail.com","Full week", "Psychiatry","09:00PM to 04:00PM"));
		doctors.put(4,new DoctorsDetails("Dr.Ramesh",38,'F',"rameshsarin1223@gmail.com","Full week","Neurologists","09:00PM to 04:00PM"));
		doctors.put(5,new DoctorsDetails("Dr.Meghal",46,'F',"mohandas1223@gmail.com","Full week", "Dermatology","09:00PM to 04:00PM"));
		doctors.put(6, new DoctorsDetails("Dr.Mohandas", 46,'M',"mohandas1223@gmail.com","Full week", "Orthopaedic", "09:00PM to 04:00PM"));
		doctors.put(7, new DoctorsDetails("Dr.Satish", 21, 'M' , "satishpendhem052@gmail.com" ,"Full week","Cardialogist","09:00PM to 04:00PM"));
		doctors.put(8, new DoctorsDetails("Dr.Ravi", 36, 'M',  "ravipendhem052@gmail.com","Full week","Neuralogist","09:00PM to 04:00PM"));
		doctors.put(9, new DoctorsDetails("Dr.Sandya", 20, 'F',"sandyachuduri032@gmail.com" ,"Full week","Dentist","09:00PM to 04:00PM"));
		doctors.put(10, new DoctorsDetails("Dr.Sneha", 25, 'F', "sneha2001@gmail.com" ,"Full week","Gynecologist","09:00PM to 04:00PM"));
		doctors.put(12, new DoctorsDetails("Dr.Jay", 21, 'M', "jay833322@gmail.com" ,"Full week","Psychiatrist","09:00PM to 04:00PM"));
		doctors.put(13, new DoctorsDetails("Dr.kavya", 22, 'F',  "kavyapilli052@gmail.com" ,"Full week","Radialogist","09:00PM to 04:00PM"));
		doctors.put(14, new DoctorsDetails("Dr.Pavan", 21, 'M', "pavancherry@gmail.com" ,"Full week","Dermotoligist","09:00PM to 04:00PM"));
		doctors.put(15, new DoctorsDetails("Dr.Lucky", 21, 'M', "lucky@gmail.com" ,"Full week","Oncologist","09:00PM to 04:00PM"));
		doctors.put(16, new DoctorsDetails("Dr.Balaji", 21, 'M',"balaji@gmail.com" ,"Full week","Surgeon","09:00PM to 04:00PM"));
		doctors.put(17, new DoctorsDetails("Dr.Sathwik", 21, 'M', "sathwik@gmail.com" ,"Full week","Pulmonoligist","09:00PM to 04:00PM"));
		
	}

}

