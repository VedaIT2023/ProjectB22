package com.vedait.Hospital.Appointment;
import java.text.SimpleDateFormat;
import java.util.*;
public class Details {

	 int appointmentno;	
	 String patientName;
	 String problem,email;
	 int doctorid;
	 Date appointmentDateTime;
	 int age;
	 long phno;
	 char gender;
	    
	     Details(int appointmentno, int doctorid, String patientName,int age,char gender, long phno, String email,String problem) {
	        
	    	this.appointmentno = appointmentno; 
	    	this.patientName = patientName;
	        this.problem = problem;
	        this.doctorid = doctorid;
	        this.appointmentDateTime = generateRandomDate();
	        this.age = age;
	        this.gender = gender;
	        this.phno = phno;
	        this.email = email;
	        
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
	    public void setPatientName(String patientname) {
	    	this.patientName = patientName;
	    }
	    
	    public String getProblem() {
	        return problem;
	    }
	    public void setProblem(String problem) {
	        this.problem = problem;
	    }
	    
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age= age;
	    }
	    
	    public char getGender() {
	        return gender;
	    }
	    public void setGender(char gender) {
	        this.gender = gender;
	    }
	    
	    public long getphno() {
	        return phno;
	    }
	    public void setphno(long phno) {
	        this.phno = phno;
	    }
	    
	    public String getemail() {
	        return email;
	    }
	    public void setemail(String email) {
	        this.email = email;
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
	        		"Age :" + age + "\n" +
	                 "Gender :" + gender + "\n" +
	                 "Ph-No :" + phno + "\n" +
	                 "Email :" + email + "\n" +
	                "Problem :" + problem + "\n" +        
	                "Appointment Date/Time : " + formattedDate + "\n" ;
	    }
	}

