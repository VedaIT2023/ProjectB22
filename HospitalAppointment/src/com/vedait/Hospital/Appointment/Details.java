package com.vedait.Hospital.Appointment;
import java.text.SimpleDateFormat;
import java.util.*;
public class Details {

	 int appointmentno;	
	 String patientName;
	 String problem;
	 int doctorid;
	 Date appointmentDateTime;
	    
	   
	     Details(int appointmentno, int doctorid, String patientName, String problem) {
	        
	    	this.appointmentno = appointmentno; 
	    	this.patientName = patientName;
	        this.problem = problem;
	        this.doctorid = doctorid;
	        this.appointmentDateTime = generateRandomDate();
	    }

	     Date generateRandomDate() {
	         Random random = new Random();
	         Calendar calendar = Calendar.getInstance();
	         int currentYear = calendar.get(Calendar.YEAR);
	         int currentMonth = calendar.get(Calendar.MONTH);
	         int month = currentMonth + random.nextInt(12 - currentMonth) + 1;
	         int day = random.nextInt(28) + 1; 
	         int hour = random.nextInt(24); 
	         int minute = random.nextInt(60); 
	         
	         calendar.set(currentYear, month -1 , day, hour, minute);
	         return calendar.getTime();
	     }
	     public int getAppointno() {
		        return appointmentno;
		    }
	    public String getPatientName() {
	        return patientName;
	    }

	    public String getProblem() {
	        return problem;
	    }
	    public int getDoctorID() {
	        return doctorid;
	    }
	    public Date getDateTime() {
	    	return appointmentDateTime;
	    }
	    
	 
	    public String toString() {
	    	
	    	 SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy / HH:mm");
	         String formattedDate = dateFormat.format(appointmentDateTime);
	         
	        return "Appointment No :" + appointmentno +"\n" +
	        		"Doctor ID : " + doctorid + "\n" +
	                "Patient Name :" + patientName + "\n" +
	                "Problem :" + problem + "\n" +        
<<<<<<< Updated upstream
	                "Appointment Date/Time: " + formattedDate;
=======
	                "Appointment Date/Time: " + formattedDate ;
>>>>>>> Stashed changes
	    }
	}

