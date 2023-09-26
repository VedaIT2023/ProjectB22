package com.vedait.inheritance.hospital;

public class ApplicationMain {

	public static void main(String[] args) {

		Patient pt1=new Patient("Patien1", "123654789", "patient1@gmail.com", "Male", 30, "Fever", 2000);
		Patient pt2=new Patient("Patien2", "123654789", "patient2@gmail.com", "Female", 30, "Fever", 2000);
		Patient pt3=new Patient("Patien3", "123654789", "patient3@gmail.com", "Male", 30, "Fever", 2000);
		Patient pt4=new Patient("Patien4", "123654789", "patient4@gmail.com", "Male", 30, "Fever", 2000);
		
		Patient[] pt= {pt1,pt2,pt3,pt4};
		for(int i=0;i<pt.length;i++) {
			System.out.println("Name : "+pt[i].name+"\n" +"Phone Number : "+pt[i].mobileNumber+"\n"+"EmailID : "+pt[i].email+"\n"+"Gender : "+pt[i].gender+"\n"+"Age : "+pt[i].age+"\n"+"Problem : "+pt[i].problem+"\n"+"Fee : "+pt[i].fee+"\n");
		}
		
		Doctor doc1 = new Doctor("Doctor1", "147852369", "doctor1@gmail.com", "MAle", 38, "MBBS", "Neurologist");
		Doctor doc2 = new Doctor("Doctor2", "147852369", "doctor2@gmail.com", "MAle", 38, "MBBS", "Orthopedic");
		Doctor doc3 = new Doctor("Doctor3", "147852369", "doctor3@gmail.com", "MAle", 38, "MBBS", "gynocologist");
		Doctor doc4 = new Doctor("Doctor4", "147852369", "doctor4@gmail.com", "MAle", 38, "MBBS", "Dentist");
		
		Doctor[] dc= {doc1,doc2,doc3,doc4};
		
		for(int i=0;i<dc.length;i++) {
			System.out.println("Name : "+dc[i].name+"\n" +"Phone Number : "+dc[i].mobileNumber+"\n"+"EmailID : "+dc[i].email+"\n"+"Gender : "+dc[i].gender+"\n"+"Age : "+dc[i].age+"\n"+"Specialization : "+dc[i].specialization+"\n"+"Qualification : "+dc[i].qualification+"\n");

		}
		
		Staff staff1=new Staff("Staff1", "125478963", "staff1@gmail.com", "Male", 25, "Superviser", 25000);
		Staff staff2=new Staff("Staff2", "125478963", "staff2@gmail.com", "Male", 25, "Superviser", 25000);
		Staff staff3=new Staff("Staff3", "125478963", "staff3@gmail.com", "FeMale", 25, "Reciptionist", 25000);
		Staff staff4=new Staff("Staff4", "125478963", "staff4@gmail.com", "FEMale", 25, "Reciptionist", 25000);
		
		Staff[] st= {staff1,staff2,staff3,staff4};
		
		for(int i=0;i<st.length;i++) {
			System.out.println("Name : "+st[i].name+"\n" +"Phone Number : "+st[i].mobileNumber+"\n"+"EmailID : "+st[i].email+"\n"+"Gender : "+st[i].gender+"\n"+"Age : "+st[i].age+"\n"+"Specialization : "+st[i].post+"\n"+"Qualification : "+st[i].salary+"\n");

		}
		Rooms rm1=new Rooms("Doctor Cabin", 1, 2);		
		Rooms rm2=new Rooms("Store Romm", 1, 2);
		Rooms rm3=new Rooms("Hall", 10, 8);
		Rooms rm4=new Rooms("Doctor Cabin", 1, 2);
		
		Rooms[] room= {rm1,rm2,rm3,rm4};
		
		for(int i=0;i<room.length;i++) {
			System.out.println("Room Name : "+room[i].type+"\n" +"Fans : "+room[i].fans+"\n"+"Lights : "+room[i].lights+"\n");

		}
		
		Nurse nurse1=new Nurse("Nurse1", "145236987", "nurse1@gmail.com", "Female", 26, "Senior Nurse", 25000);
		Nurse nurse2=new Nurse("Nurse2", "145236987", "nurse2@gmail.com", "Female", 26, "Senior Nurse", 25000);
		Nurse nurse3=new Nurse("Nurse3", "145236987", "nurse3@gmail.com", "Female", 26, "Senior Nurse", 25000);
		Nurse nurse4=new Nurse("Nurse4", "145236987", "nurse4@gmail.com", "Female", 26, "Senior Nurse", 25000);
		
		Nurse[] nurse= {nurse1,nurse2,nurse3,nurse4};
		
	
		for(int i=0;i<nurse.length;i++) {
			System.out.println("Name : "+nurse[i].name+"\n" +"Phone Number : "+nurse[i].mobileNumber+"\n"+"EmailID : "+nurse[i].email+"\n"+"Gender : "+nurse[i].gender+"\n"+"Age : "+nurse[i].age+"\n"+"Specialization : "+nurse[i].post+"\n"+"Qualification : "+nurse[i].salary+"\n");

	}	
		
		Ward ward1=new Ward("General Ward", 2, 10, 10, 8);
		Ward ward2=new Ward("Casuality Ward", 4, 10, 10, 8);
		Ward ward3=new Ward("ICU", 1, 1, 2, 2);
		
		Ward[] ward= {ward1,ward2,ward3};
		
		for(int i=0;i<ward.length;i++) {
			System.out.println("Name : "+ward[i].name+"\n" +"Phone Number : "+ward[i].oxygenCylinders+"\n"+"EmailID : "+ward[i].beds+"\n"+"Gender : "+ward[i].fans+"\n"+"Age : "+ward[i].lights+"\n");

	}	

}
}
