package com.hospital.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllDetails {


	HashMap<String, DoctorsDetails> doctors = new HashMap();
	HashMap<String, PatientsDetails> patients = new HashMap();

	public AllDetails() {
	//Doctors
		doctors.put("sandeep", new DoctorsDetails("Doctor","Sandeep",52,'M',"sandeep1223@gmail.com","Monday to Wednesday"," Pediatrics","02:00PM to 05:00PM"));
		doctors.put("ajay",new DoctorsDetails("Doctor","Ajay",67,'M',"ajaykaul1223@gmail.com","Monday to Saturday", "Cardioligists","09:00AM to 05:00PM"));
		doctors.put("naresh",new DoctorsDetails("Doctor","Naresh",49,'M',"nareshtrehan1223@gmail.com","Monday and Tuesday", "Psychiatry","10:00PM to 04:00PM"));
		doctors.put("ramesh",new DoctorsDetails("Doctor","Ramesh",38,'F',"rameshsarin1223@gmail.com","Thursday and Friday","Neurologists","08:00PM to 12:00PM"));
		doctors.put("meghal",new DoctorsDetails("Doctor","Meghal",46,'F',"mohandas1223@gmail.com","Wednesday and Friday", "Dermatology","10:00AM to 02:00PM"));
		doctors.put("mohandas", new DoctorsDetails("Doctor","Mohandas", 46,'M',"mohandas1223@gmail.com"," Friday and Saturday", "Orthopaedic", "09:00AM to 04:00PM"));
	
	//Patients
		patients.put("rohan", new PatientsDetails("Rohan",46,'M',"rohan1223@gmail.com","Infection","Tuesday"));
		patients.put("lakshman",new PatientsDetails("Lakshman",22,'M',"lakshman1223@gmail.com","Heart","Tuesday"));
		patients.put("ramesh",new PatientsDetails("Ramesh", 67,'M',"anvenash1223@gmail.com","Back and Neck Pain","Monday"));
		patients.put("kiran",new PatientsDetails("Kiran", 49,'M',"nikel1223@gmail.com","Mental Health","Friday"));
		patients.put("lakshmi",new PatientsDetails("Lakshmi",38,'F',"poja1223@gmail.com","Skin Cancer","Wednesday"));
		patients.put("niharika",new PatientsDetails("Niharika", 46,'F',"roja1223@gmail.com","Fracture", "Saturday"));
	

	}

}

