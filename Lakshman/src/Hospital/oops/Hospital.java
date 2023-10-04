package com.Hospital.oops;
import java.util.*;

public class Hospital {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Doctors doctor1=new Doctors("Dr.Alexandar", 'M', 1001, 35, "Cardilogist","8823967127","10:00 am to 1:00 pm");
		Doctors doctor2=new Doctors("Dr.Ramesh", 'M',1002, 28,"oncologist","9823967126","11:00 am to 2:00 pm");
		Doctors doctor3=new Doctors("Dr.Siva Krishna", 'M',1003, 45, "Neurologist ","7423967125" ,"5:00 pm to 8:00 pm");
		Doctors doctor4=new Doctors("Dr.Ruby", 'F',1004, 51, "Ophthalmologist","9923967129","10:00 am to 12:00 pm");
		Doctors doctor5=new Doctors("Dr.Lavanya", 'F',1005, 39, "Gynecologist", "6323967128","6:00 pm to 10:00 pm" );
		Doctors doctor6=new Doctors("Dr.Lakshman", 'M',1006, 35, "Urologist","8823967127","10:00 am to 1:00 pm");
		Doctors doctor7=new Doctors("Dr.Nithish", 'M',1007, 28,"Dermatologist","9823967126","11:00 am to 2:00 pm");
		Doctors doctor8=new Doctors("Dr.Dinakaran", 'M',1008, 45, "Gastroenterologist ","7423967125" ,"5:00 pm to 8:00 pm");
		Doctors doctor9=new Doctors("Dr.Shalem", 'M',1009, 41, "Rheumatologist","9923967129","10:00 am to 12:00 pm");
		Doctors doctor10=new Doctors("Dr.Sathish Babu", 'M',1010, 49, "Phathologist", "6323967128","6:00 pm to 10:00 pm" );
		Doctors doctor11=new Doctors("Dr.Bhavana", 'F', 1011, 35, "Cardilogist","6323967127","5:00 pm to 8:00 pm");
		Doctors doctor12=new Doctors("Dr.Harika", 'F',1012, 28,"oncologist","7723967126","7:00 pm to 10:00 pm");
		Doctors doctor13=new Doctors("Dr.Sireesha", 'F',1013, 45, "Neurologist ","6623967125" ,"11:00 am to 1:00 pm");
		Doctors doctor14=new Doctors("Dr.Maeve", 'F',1014, 51, "Ophthalmologist","8023967129","6:00 pm to 10:00 pm");
		Doctors doctor15=new Doctors("Dr.Priyanka", 'F',1015, 39, "Gynecologist", "9023967128","10:00 am to 2:00 pm" );
		Doctors doctor16=new Doctors("Dr.Subhani", 'M',1016, 35, "Rheumatologist","8223967127","5:00 pm to 9:00 pm");
		Doctors doctor17=new Doctors("Dr.Abhinav", 'M',1017, 28,"Dermatologist","7723967126","10:00 am to 1:00 pm");
		Doctors doctor18=new Doctors("Dr.Rosy", 'F',1018, 45, "Gastroenterologist ","6323967125" ,"5:00 pm to 8:00 pm");
		Doctors doctor19=new Doctors("Dr.Anjali", 'M',1019, 41, "Urologist","8863967129","6:00 pm to 10:00 pm");
		Doctors doctor20=new Doctors("Dr.Bhargav", 'M',1020, 49, "Phathologist", "9993967128","11:00 am to 2:00 pm" );
		
		Doctors doctors[]= {doctor1,doctor2,doctor3,doctor4,doctor5,doctor6,doctor7,doctor8,doctor9,doctor10,doctor11,doctor12,doctor13,doctor14,doctor15,doctor16,doctor17,doctor18,doctor19,doctor20};
	
	    System.out.println("The Doctors List :"+"\n");
	    for(int i=0;i<doctors.length;i++) {
	    	System.out.println(doctors[i]);
	    }
	 
	    while(true) {
		    System.out.println("Please Enter the 'Doctor id' that you want to consult : ");
		    int doctorid=sc.nextInt();
	    for(int i=0;i<doctors.length;i++) {
	    	if(doctorid == doctors[i].id) {
	    	System.out.println(doctors[i].getName()+"\n");
	    	}
	    }
    	System.out.println("Are you Ok with the Timings say (yes/No)");
    	String feedback=sc.next();
	    	 if (feedback.equalsIgnoreCase("yes")) {
                 System.out.println("Your Appointment is fixed");
               
             } else if(feedback.equalsIgnoreCase("no")) {
            	 System.out.println("Plz Select Another Doctor");
            	 
            	 }else {
            	 System.out.println("invalid Input ");
             }
	  
	    System.out.println("You want to book another appointment(Yes/No)");
	    String confirmation = sc.next().toLowerCase();
	    if(confirmation.equals("no")) {
	    	System.out.println("Thank you");
           break;
	    }
	  }
   }
}








	


