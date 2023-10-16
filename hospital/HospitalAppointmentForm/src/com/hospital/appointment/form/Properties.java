package com.hospital.appointment.form;

import java.util.HashMap;

public class Properties {

	HashMap<Integer, DoctorProperties> doctors = new HashMap();

	public Properties() {
	//Doctors
		doctors.put(1001, new DoctorProperties("1001","Dr.Sandeep",52,'M',"Pediatrics","sandeep1223@gmail.com","09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1002,new DoctorProperties("1002","Dr.Ajay",67,'M',  "Cardioligists","ajaykaul1223@gmail.com","09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1003,new DoctorProperties("1003","Dr.Naresh",49,'M',  "Psychiatry","nareshtrehan1223@gmail.com","09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1004,new DoctorProperties("1004","Dr.Ramesh",38,'F', "Neurologists","rameshsarin1223@gmail.com","09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1005,new DoctorProperties("1005","Dr.Meghal",46,'F',  "Dermatology","mohandas1223@gmail.com","09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1006, new DoctorProperties("1006","Dr.Mohandas", 46,'M',  "Orthopaedic","mohandas1223@gmail.com", "09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1007, new DoctorProperties("1007","Dr.Satish", 21, 'M'  , "Cardialogist", "satishpendhem052@gmail.com","09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1008, new DoctorProperties("1008","Dr.Ravi", 36, 'M', "Neuralogist",  "ravipendhem052@gmail.com","09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1009, new DoctorProperties("1009","Dr.Sandya", 20, 'F', "Dentist","sandyachuduri032@gmail.com" ,"09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1010, new DoctorProperties("1010","Dr.Sneha", 25, 'F', "Gynecologist", "sneha2001@gmail.com" ,"09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1012, new DoctorProperties("1011","Dr.Jay", 21, 'M' , "Psychiatrist", "jay833322@gmail.com","09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1013, new DoctorProperties("1012","Dr.kavya", 22, 'F' , "Radialogist",  "kavyapilli052@gmail.com","09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1014, new DoctorProperties("1014","Dr.Pavan", 21, 'M' , "Dermotoligist", "pavancherry@gmail.com","09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1015, new DoctorProperties("1015","Dr.Lucky", 21, 'M', "Oncologist", "lucky@gmail.com" ,"09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1016, new DoctorProperties("1016","Dr.Balaji", 21, 'M' , "Surgeon","balaji@gmail.com","09:00PM to 04:00PM","Monday to Friday"));
		doctors.put(1017, new DoctorProperties("1017","Dr.Sathwik", 21, 'M' , "Pulmonoligist", "sathwik@gmail.com","09:00PM to 04:00PM","Monday to Friday"));
		
	}
	
}
