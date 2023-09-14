package com.vedait.Hospitals;

public class yashoda {

	public static void main(String[] args) {
		System.out.println("Welcome to yashoda Hospital\n");

		Doctors doctor1 = new Doctors("Sunanda","sri","sunanda@gmail.com","9308389386",29,'F',"Cardiologist","MS");
		Doctors doctor2 = new Doctors("Kavitha","suresh","kavitha@gmail.com","8794564679",32,'F',"Dentist","MBBS");
		Doctors doctor3 = new Doctors("Ram","Krishna","ram@gmail.com","9319436206",30,'M',"Neurologist","MBBS");
		Doctors doctor4 = new Doctors("Sri","leela","sri@gmail.com","9802435256",28,'F',"Radiology","MBBS");
		Doctors doctor5 = new Doctors("Keerthi","Suresh","keerthi@gmail.com","9309435206",35,'F',"Dermatology","MBBS");
		
		Doctors doctors[] = {doctor1,doctor2,doctor3,doctor4,doctor5};
		
		Nurse nurse1 = new Nurse("Ramya","nakka","ramya@gmail.com","9348489587",28,'F'," Associate Degree in Nursing","20000");
		Nurse nurse2 = new Nurse("Anusha","sukhavasi","anusha@gmail.com","9695499387",18,'F',"  Nursing Diploma","15000");
		Nurse nurse3 = new Nurse("Rose","ravuri","rose@gmail.com","918574697",20,'F'," Bachelor of Science in Nursing ","18000");
		Nurse nurse[] = {nurse1,nurse2,nurse3};
		
		patients patient1 = new patients("Satish","nakka","satish@gmail.com","9896783437",22,'M',"Cough");
		patients patient2 = new patients("Mahitha","tella","mahitha@gmail.com","8973897343",23,'F',"liver damage");
		patients patient3 = new patients("Rajesh","gunthoti","rajesh@gmail.com","9865043637",20,'M',"Headache");
		patients patient4 = new patients("Sai","bijjam","sai@gmail.com","9095043637",21,'M',"Bypass surgery");
		
		patients patient[] = {patient1,patient2,patient3,patient4};
		
		Staff staff1 = new Staff("Pavan","naidu","pavan@gmail.com","7895785497",22,'M',"Bil Counter","15000");
		Staff staff2 = new Staff("Sireesha","tella","sireesha@gmail.com","8688188233",21,'F',"Receptionist","20000");
		Staff staff3 = new Staff("Lakshman","Paramkusam","lakshman@gmail.com","9805785437",22,'M',"Watchman","10000");
		
		Staff staff[] = {staff1,staff2,staff3};
		
		wards ward1 = new wards("Emergency ward",100,150);
		wards ward2 = new wards("ICU ward",25,40);
		wards ward3 = new wards("General ward",100,200);
		
		wards ward[] = {ward1,ward2,ward3};
		
		Hospitals yashoda = new Hospitals("Yashoda","Hyderabad",doctors, nurse,patient,staff,ward);
		
		System.out.println("Total no of Doctors :" + yashoda.doctors.length);
		System.out.println("Total no of Nurses :" + yashoda.nurse.length);
		System.out.println("Total no of Patients :" + yashoda.patient.length);
		System.out.println("Tota Staff :" + yashoda.staff.length);
		System.out.println("Total Wards :" + yashoda.ward.length + "\n");
		
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

