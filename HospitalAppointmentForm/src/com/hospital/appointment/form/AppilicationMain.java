package com.hospital.appointment.form;
import java.text.SimpleDateFormat;
import java.util.*;


public class AppilicationMain {

	public static void main(String[] args) {
		
		Properties property = new Properties();
		
        List<DoctorProperties> doctorList = new ArrayList<>(property.doctors.values());
        List<PatientProperties> patientList = new ArrayList<>(); 



        Scanner scanner = new Scanner(System.in);
        System.out.println("Omi Hospital Appointment Form");
        boolean input = false;
        String time = "";
        String pname = "";
        int page = 0;
        char pgender = ' ';
        String pproblem = " ";
        int id = 1000;
        int patientnum = 0;
        int patientLimit = 100;
        String drName="";
        
        while(patientnum<=patientLimit) {
        	
        	System.out.println(printString());
        	System.out.print("\nEnter a option: ");
        	int option = scanner.nextInt();
    
        	if(option==1) {
        		for(int i=0; i<doctorList.size(); i++) {
        			System.out.println("Dr.Id: "+doctorList.get(i).id);
        			System.out.println("Name: "+doctorList.get(i).drname);
        			System.out.println("Specialization: "+doctorList.get(i).specialization+"\n");

        			}
        		}
        	
        	else if(option==2) {
        		
        			
        				System.out.println("Enter the Id of the Doctor: ");
        				int drId = scanner.nextInt();
            			drName=property.doctors.get(drId).drname;

        				System.out.println(property.doctors.get(drId).drDetils());
        				input = false;
        				System.out.println("\nEnter your Details");
        				while(!input) {
        					System.out.print("Name: ");
        					pname = scanner.next();
        					try {

        						System.out.print("Age: ");
        						page = scanner.nextInt();
        				
        				
        						System.out.print("Gender: ");
        						pgender = scanner.next().charAt(0);        				

        			
        						System.out.print("Problem: ");
        						 pproblem = scanner.next();
        						 id+=1;
        						 time = dateAndTime();
        						input = true;
        					}
        					catch(Exception e) {
        						System.out.println("Invalid Input Please Enter the correct Input");
        						System.out.println("\nEnter your details again");
                		
        						scanner.nextLine();
                				}
        					
        		}
    			patientList.add(new PatientProperties(id, pname, page, pgender, pproblem, time));

        		System.out.println("Your Appointment is booked with "+drName);
        		System.out.println("Do you want to book another appointment type yes or no");
                 String re = scanner.next();
                 while (!re.equals("yes") && !re.equals("no")) {
                     System.out.println("Please enter 'yes' or 'no'.");
                     re = scanner.next();
                 }
                 if (re.equals("yes")) {
                     continue;
                 } else {
                	 System.out.println("Do you want to exit type yes or no");
                	 String exit = scanner.next();
                	 if(exit.equals("yes")) {
                		 System.out.println("Thank you");
                		 break;
                	 }
                	 else {
                		 continue;
                	 }
                 }
        	}
        	else if(option==3) {
        		
        		if(patientList.size()>0) {
            		System.out.println("Appointments");

        		 for (PatientProperties patientDetails : patientList) {
                     System.out.println(patientDetails.pDetials() + "\n");
                 }
        		}
        		else {
        			System.out.println("No appointment are booked");
        		}
        	}
        	else if(option==4) {
        		System.out.println("Do you want to cancel the appointment or clear all the appointments\n(type cancel or clear)");
        		String delete = scanner.next().toLowerCase();
                while (!delete.equals("cancel") && !delete.equals("clear")) {
                	System.out.println("Enter only cancel or clear");
                    delete = scanner.next().toLowerCase();
                }
                if(delete.equals("cancel")) {
                	System.out.println("Enter the patient ID");
                	int pid = scanner.nextInt();
                	for(int i=0; i<patientList.size(); i++) {
                		if((patientList.get(i).id)==(pid)) {
                			patientList.remove(i);
                		}
                	}
                	System.out.println("The Appointment is canceled");
                }
                else if(delete.equals("clear")) {
                	patientList.clear();
                	System.out.println("All the Appointments are cleared");
                }
                else {
                	System.out.println("Enter only cancel or clear");

                }
        	}
        	
        	else if(option==5){
    			System.out.println("Thank you");
    			break;

        	}
        	else {
        System.out.println("Invalid input");
        	}
        	patientnum++;

        }
      
	}
	
	static String printString() {
		return 
				"\n1.List of Doctors"+
				"\n2.Book a Appointment"+
				"\n3.View the Appointments"+
				"\n4.Cancel the Appointment"+
				"\n5.Exit";
	}

	static String dateAndTime() {
		Random random = new Random();

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, random.nextInt(30) + 1); 

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == Calendar.SATURDAY) {
            calendar.add(Calendar.DATE, 2); 
        } else if (dayOfWeek == Calendar.SUNDAY) {
            calendar.add(Calendar.DATE, 1); 
        }

        int hour = random.nextInt(8) + 9; 

        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");

        String appointmentDate = dateFormat.format(calendar.getTime());
        String appointmentTime = timeFormat.format(calendar.getTime());

        return appointmentDate +" "+ appointmentTime;
	}
}
