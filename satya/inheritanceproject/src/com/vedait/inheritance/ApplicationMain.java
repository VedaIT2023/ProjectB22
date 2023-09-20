package com.vedait.inheritance;

public class ApplicationMain {
		// TODO Auto-generated method stub
		public static void main(String[] args) {

			
			
Doctor vasu=new Doctor("Dr.Vasu","1234567890",25, "10-12am",'M', "Surgeon", "MBBS");
Doctor bheem=new Doctor("Dr.Bheem","1234567890",35, "12-2pm",'M', "Neurologist", "MBBS");
Doctor vasun=new Doctor("Dr.Vasundhara","9876542167",5, "3-5pm",'F', "Cardiologist", "MBBS");
Doctor pavan=new Doctor("Dr.Pavan","1234597450",5, "10-12am",'M', "Psychiatrist", "MBBS");


Staff ameer=new Staff("Ameer", "9834672580", 30, "9-4pm", 'M', "Reception", 45);
Staff durga=new Staff("Durga", "9986437760", 24, "9-4pm", 'F', "Health Administration", 46);
Staff balu=new Staff("Balu", "9837698064", 30, "9-4pm", 'M', "Physician", 48);
Staff niraj=new Staff("Niraj", "9992672580", 65, "9-4pm", 'M', "Occupational Therapists", 45);


Nurse meena=new Nurse("Meena", "9988665544",30,"12-5am", 'F', "Nursing", "Bsc Nursing");
Nurse satya=new Nurse("Satya", "9988665454",20,"12-5pm", 'F', "Public Health Nursing", "Bsc Nursing");
Nurse hema=new Nurse("Hema", "9898543245",45,"12-5am", 'F', "Pediatric nursing", "Bsc biotech");
Nurse rani=new Nurse("Rani", "8764398674",30,"9-6pm", 'F', "Oncology nursing", "Bsc Nursing");

	Patient ravi=new Patient("Ravi", "9977663798", 10, "10-2pm",'M', "Fevar");
	Patient ramya=new Patient("Ramya", "997867980", 45, "10-11am",'F',"Accedent");
	Patient tanu =new Patient("Tanuja", "9908675432",35, "10-11am",'M', "Noise Sugerer");
	Patient hemanth=new Patient("Hemanth","9908675432",85, "10-5pm",'M', "Heart Sugerer");
	
	Ward general=new Ward("General Ward", 201, 20);
	Ward emergency=new Ward("Emergency Ward", 205, 5);
	Ward medical=new Ward("Medical&Surgical Ward", 301, 10);
	Ward maternity=new Ward("Maternity Ward", 305, 30);
	Ward burns=new Ward("Burns Ward", 401, 30);
	
	Room suite=new Room(101, "Suite", false);
	Room twin=new Room(201, "Twin", false);
	Room general1=new Room(108, "General", true);
	Room laboratory=new Room(100, "Laboratory", true);
	Room deluxe=new Room(220, "Deluxe Room", false);

Doctor doctors[]= {vasu,bheem,vasun,pavan};
Staff staff[]= {ameer,durga,balu,niraj};
Nurse nurse[]= {meena,satya,hema,rani};
Patient patient[]= {ravi,ramya,tanu,hemanth};
Ward[] wards= {general,emergency,medical,maternity,burns};
Room[] rooms= {suite,twin,general1,laboratory,deluxe};


Hospital kavitha=new Hospital("Kavitha", doctors, nurse, staff, patient, wards, rooms);

System.out.println("Number of Doctors:"+kavitha.doctors.length);
System.out.println("Number of Staff:"+kavitha.staff.length);
System.out.println("Number of Nurse:"+kavitha.nurse.length);
System.out.println("Number of patient:"+kavitha.patient.length);
System.out.println("Number of Ward:"+kavitha.wards.length);
System.out.println("Number of Room:"+kavitha.rooms.length);

System.out.println(" ");

for(int i=0;i<kavitha.doctors.length;i++) {
	System.out.println("Name of the Doctors:"+kavitha.doctors[i].name);

}
    System.out.println(" ");

for(int i=0;i<kavitha.staff.length;i++) {
	System.out.println("PhoneNumber of the Staff:"+kavitha.staff[i].phoneNumber);

}
     System.out.println(" ");

for(int i=0;i<kavitha.nurse.length;i++) {
	System.out.println("Name of the Nurse:"+kavitha.nurse[i].name);

}
      System.out.println(" ");
	
	for(int i=0;i<kavitha.patient.length;i++) {
		System.out.println("Name of the patient:"+kavitha.patient[i].name);
	
	}
	
	 System.out.println(" ");
		for(int i=0;i<kavitha.wards.length;i++) {
			System.out.println("Name of the Wards:"+kavitha.wards[i].wardName);
		
		}
		
		 System.out.println(" ");
			
			for(int i=0;i<kavitha.rooms.length;i++) {
				System.out.println("Name of the Wards:"+kavitha.rooms[i].roomType);
			
			}
			
		Doctor naveen=new Doctor("Dr.Naveen","1234567894",27, "10-12am",'M', "Surgeon", "MBBS");
		Doctor kaveri=new Doctor("Dr.kaveri","1234567367",35, "12-2pm",'F', "Neurologist", "MBBS");
		Doctor lekha =new Doctor("Dr.Lekha","9856434543",50, "3-5pm",'F', "Cardiologist", "MBBS");
		Doctor krishna=new Doctor("Dr.Krishna","1234597450",55, "10-12am",'M', "Psychiatrist", "MBBS");
			
		Staff ameena=new Staff("Ameena", "9834672580", 30, "6-12am", 'F', "Reception", 1);
		Staff nazma =new Staff("Nazma", "9986437760", 24, "9-6pm", 'F', "Health Administration", 2);
		Staff brahma=new Staff("Brahma", "9837698064", 30, "7-6am", 'M', "Physician",3);
		Staff niranjan=new Staff("Ranjan", "9992672580", 65, "9-4pm", 'M', "Occupational Therapists", 4);
			
		Nurse abhi=new Nurse("Abhi", "9908557894",30,"12-5am", 'M', "Nursing", "Bsc Nursing");
		Nurse sri=new Nurse("Srinija", "9986547854",20,"12-5pm", 'F', "Public Health Nursing", "Bsc Nursing");
		Nurse Nithin=new Nurse("Nithin", "9874290375",45,"12-5am", 'M', "Pediatric nursing", "Bsc biotech");
		Nurse raju=new Nurse("Raju", "456758674",30,"9-6pm", 'M', "Oncology nursing", "Bsc Nursing");

		Patient darshan=new Patient("Darshan", "9977663798", 10, "10-2pm",'M', "Fevar");
		Patient ravibabu=new Patient("Ravi Babu", "9187867980", 45, "10-11am",'M',"Accedent");
		Patient tanusri=new Patient("Tanu Sri", "9908674532",35, "10-11am",'F', "Noise Sugerer");
		Patient hemasri=new Patient("Hema Sri","99086748723",85, "10-5pm",'F', "Heart Sugerer");
		
		Ward genera=new Ward("General Ward", 201, 30);
		Ward emergency1=new Ward("Emergency Ward", 205, 5);
		Ward medical1=new Ward("Medical&Surgical Ward", 301, 10);
		Ward maternity1=new Ward("Maternity Ward", 305, 30);
		Ward burns1=new Ward("Burns Ward", 401, 30);
		
		Room suite1=new Room(101, "Suite", false);
		Room twin1=new Room(201, "Twin", false);
		Room general2=new Room(108, "General", true);
		Room laboratory1=new Room(100, "Laboratory", true);
		Room deluxe1=new Room(220, "Deluxe Room", false);
		
		Doctor doctors1[]= {naveen,kaveri,lekha,krishna};
		Staff staff1[]= {ameena,nazma,brahma,niranjan};	
		Nurse nurse1[]= {abhi,sri,Nithin,raju};
		Patient patient1[]= {darshan,ravibabu,tanusri,hemasri};	
		Ward[] wards1= {genera,emergency1,medical1,maternity1,burns1};
		Room[] rooms1= {suite1,twin1,general2,laboratory1,deluxe1};
		
		Hospital nandhu=new Hospital("nandhu", doctors1, nurse1, staff1, patient1, wards1, rooms1);
		
		 System.out.println(" ");
		
		System.out.println("Number of Doctors:"+nandhu.doctors.length);
		System.out.println("Number of Staff:"+nandhu.staff.length);
		System.out.println("Number of Nurse:"+nandhu.nurse.length);
		System.out.println("Number of patient:"+nandhu.patient.length);
		System.out.println("Number of Ward:"+nandhu.wards.length);
		System.out.println("Number of Room:"+nandhu.rooms.length);
		
		System.out.println(" ");

		for(int i=0;i<nandhu.doctors.length;i++) {
			System.out.println("Name of the Doctors:"+nandhu.doctors[i].name);
		
		}
		    System.out.println(" ");
		
		for(int i=0;i<nandhu.staff.length;i++) {
			System.out.println("PhoneNumber of the Staff:"+nandhu.staff[i].phoneNumber);
		
		}
	         System.out.println(" ");
		
		for(int i=0;i<nandhu.nurse.length;i++) {
			System.out.println("Name of the Nurse:"+nurse[i].name);
		
		}
		     
			
			for(int i=0;i<nandhu.patient.length;i++) {
				System.out.println("Name of the patient:"+nandhu.patient[i].name);
			
			}
			
			 System.out.println(" ");
				
				for(int i=0;i<nandhu.wards.length;i++) {
					System.out.println("Name of the Wards:"+nandhu.wards[i].wardName);
				
				}
				
				 System.out.println(" ");
					
					for(int i=0;i<nandhu.rooms.length;i++) {
						System.out.println("Name of the Wards:"+nandhu.rooms[i].roomType);
					
					}
		

	}

}
