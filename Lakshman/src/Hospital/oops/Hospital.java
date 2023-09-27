package com.Hospital.oops;

public class Hospital {
	
	public static void main(String[] args) {
		
		Doctors doctor1=new Doctors("Dr.Alexandar", 'M', 35, "Cardilogist","8823967127","10:00 am to 1:00 pm");
		Doctors doctor2=new Doctors("Dr.Ramesh", 'M', 28,"oncologist","9823967126","11:00 am to 2:00 pm");
		Doctors doctor3=new Doctors("Dr.Siva Krishna", 'M', 45, "Neurologist ","7423967125" ,"5:00 pm to 8:00 pm");
		Doctors doctor4=new Doctors("Dr.Ruby", 'F', 51, "Ophthalmologist","9923967129","10:00 am to 12:00 pm");
		Doctors doctor5=new Doctors("Dr.Lavanya", 'F', 39, "Gynecologist", "6323967128","6:00 pm to 10:00 pm" );
		Doctors doctor6=new Doctors("Dr.Lakshman", 'M', 35, "Urologist","8823967127","10:00 am to 1:00 pm");
		Doctors doctor7=new Doctors("Dr.Nithish", 'M', 28,"Dermatologist","9823967126","11:00 am to 2:00 pm");
		Doctors doctor8=new Doctors("Dr.Dinakaran", 'M', 45, "Gastroenterologist ","7423967125" ,"5:00 pm to 8:00 pm");
		Doctors doctor9=new Doctors("Dr.Shalem", 'M', 41, "Rheumatologist","9923967129","10:00 am to 12:00 pm");
		Doctors doctor10=new Doctors("Dr.Sathish Babu", 'M', 49, "Phathologist", "6323967128","6:00 pm to 10:00 pm" );
		
		
		Doctors doctors[]= {doctor1,doctor2,doctor3,doctor4,doctor5,doctor6,doctor7,doctor8,doctor9,doctor10};
		
		Patients patient1=new Patients("Balaji", 'M', 65, "Heartattack", "6705672172");
		Patients patient2=new Patients("Pavan", 'M', 33, "cancer", "9848732145");
	    Patients patient3=new Patients("Satish", 'M', 28, "Thyroid", "9030331612");
	    Patients patient4=new Patients("Manasa", 'F', 42, "Dental problem", "8887642921");
	    Patients patient5=new Patients("Kalyan", 'M', 55, "Brain tumour", "7898564361");
	    Patients patient6=new Patients("Prasad", 'M', 35, "Urinary problem", "9805672172");
		Patients patient7=new Patients("Bala krishna", 'M', 33, "Skin allergy", "8848732145");
	    Patients patient8=new Patients("Rohith", 'M', 58, "Digestive problem", "7030331612");
	    Patients patient9=new Patients("Dileep", 'M', 22, "Bone problem", "6307642921");
	    Patients patient10=new Patients("Tony", 'M', 75, " Decrease of Tissues ", "6358564361");
	    
	    Patients patients[]= {patient1,patient2,patient3,patient4,patient5,patient6,patient7,patient8,patient9,patient10};
	   
	    System.out.println("The Doctors List :"+"\n");
	    for(int i=0;i<doctors.length;i++) {
	    	System.out.println(doctors[i]);
	    }
	    
	    System.out.println("The Patients List :"+"\n");
	    for(int i=0;i<patients.length;i++) {
	    	System.out.println(patients[i]);
	    }
	    for(int i=0;i<doctors.length;i++) {
	    	System.out.println("Name of Doctor :"+doctors[i].getName() + " (" + doctors[i].getSpecialization() + ")"
	    			+"\nTiming :" + doctors[i].getTimings()+"\nPatient Name :" +patients[i].getName() +"\nDisease :"+patients[i].getDisease());
	    	System.out.println("");
	    }
	}
}







	


