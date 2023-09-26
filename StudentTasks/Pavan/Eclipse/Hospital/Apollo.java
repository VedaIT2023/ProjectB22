package com.vedait.Hospital;

public class Apollo {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Apollo Hospital\n");

		Doctors doctor1 = new Doctors("Pavan","Mathi","pavan@gmail.com","9308489387",45,'M',"Cardiologist","MS");
		Doctors doctor2 = new Doctors("Rama","Rao","rama@gmail.com","8797564579",32,'M',"Dentist","MBBS");
		Doctors doctor3 = new Doctors("Ajay","Krishna","ajay@gmail.com","9309435206",30,'M',"Neurologist","MBBS");
		Doctors doctor4 = new Doctors("sri","leela","sri@gmail.com","9852435206",28,'F',"Radiology","MBBS");
		Doctors doctor5 = new Doctors("Keerthi","Suresh","keerthi@gmail.com","9309435206",35,'F',"Dermatology","MBBS");
		
		Doctors doctors[] = {doctor1,doctor2,doctor3,doctor4,doctor5};
		
		Nurse nurse1 = new Nurse("Ramya","nakka","ramya@gmail.com","9348489387",28,'F'," Associate Degree in Nursing","20000");
		Nurse nurse2 = new Nurse("Maeve","valley","maeve@gmail.com","9893499387",18,'F',"  Nursing Diploma","15000");
		Nurse nurse3 = new Nurse("Ruby","ottis","ruby@gmail.com","908574687",20,'F'," Bachelor of Science in Nursing ","18000");
		
		Nurse nurse[] = {nurse1,nurse2,nurse3};
		
		Patients patient1 = new Patients("Satwik","Siram","satwik@gmail.com","9895785437",22,'M',"Cough");
		Patients patient2 = new Patients("Lakshman","pulka","lakshman@gmail.com","8573897343",23,'M',"liver damage");
		Patients patient3 = new Patients("Satish","pendham","satish@gmail.com","9895043637",20,'M',"Headache");
		Patients patient4 = new Patients("Balaji","nakka","balaji@gmail.com","9895043637",21,'M',"Bypass surgery");
		
		Patients patient[] = {patient1,patient2,patient3,patient4};
		
		Staff staff1 = new Staff("Pavan","naidu","pavan@gmail.com","9895785437",22,'M',"Bil Counter","15000");
		Staff staff2 = new Staff("Sireesha","Paramkusum","sireesha@gmail.com","8688188233",21,'F',"Receptionist","20000");
		Staff staff3 = new Staff("Lakshman","Paramkusam","lakshman@gmail.com","9895785437",22,'M',"Watchman","10000");
		
		Staff staff[] = {staff1,staff2,staff3};
		
		Wards ward1 = new Wards("Emergency ward",100,150);
		Wards ward2 = new Wards("ICU ward",20,30);
		Wards ward3 = new Wards("General ward",150,200);
		
		Wards ward[] = {ward1,ward2,ward3};
		
		Hospital apollo = new Hospital("Apollo","Hyderabad",doctors, nurse,patient,staff,ward);
		
		System.out.println("Total no of Doctors :" + apollo.doctors.length);
		System.out.println("Total no of Nurses :" + apollo.nurse.length);
		System.out.println("Total no of Patients :" + apollo.patient.length);
		System.out.println("Tota Staff :" + apollo.staff.length);
		System.out.println("Total Wards :" + apollo.ward.length + "\n");
		
		System.out.println("Details of Doctors :\n" ); 
		for(int i=0;i<doctors.length;i++) {
			System.out.println(doctors[i].doctor()+"\n");
			}
		
		System.out.println("Details of Nurses :\n" ); 
		for(int i=0;i<nurse.length;i++) {
			System.out.println(nurse[i].nurse()+"\n");
			}
		
		System.out.println("Details of Patients :\n" ); 
		for(int i=0;i<patient.length;i++) {
			System.out.println(patient[i].patient()+"\n");
			}
		
		System.out.println("Details of Staff :\n" ); 
		for(int i=0;i<staff.length;i++) {
			System.out.println(staff[i].staffs()+"\n");
			}
		
		System.out.println("Details of Staff :\n" ); 
		for(int i=0;i<ward.length;i++) {
			System.out.println(ward[i].wards()+"\n");
			}
		
	}
	

}
