package com.hospital.form;
import java.util.*;
public class Hospital {

	public static void main(String[] args) {

		        AllDetails doctor = new AllDetails();
		        List<DoctorsDetails> doctorList = new ArrayList<>(doctor.doctors.values());

		        System.out.println("These are the doctors in this Hospital\n");
		        for(int i = 0; i < doctorList.size(); i++) {
	                  System.out.println((i+1)+"."+doctorList.get(i).name);
	                  System.out.println(" Specialization: "+doctorList.get(i).specialization+"\n");

	             }

		        Random random = new Random();
		        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		        Scanner scanner = new Scanner(System.in);

		        String drname = "";
		        String day = "";
		        String time = "";
		        String amOrPm = "";
		        boolean doctorFound = false;
		        while (true) {
		            System.out.println("Enter the name of the doctor: ");
		            String nameDr = scanner.nextLine();

		            for (int i = 0; i < doctorList.size(); i++) {

		                if (nameDr.equalsIgnoreCase(doctorList.get(i).name)) {

		                    drname = doctorList.get(i).name;
		                    drname = doctorList.get(i).name;
		                    day = daysOfWeek[random.nextInt(7)];
		                    int hour = random.nextInt(8) + 9;
		                    amOrPm = (hour < 12) ? "AM" : "PM";
		                    hour = (hour <= 12) ? hour : hour - 12;

		                    int minute = random.nextInt(60);
		                    time = String.format("%d:%02d %s", hour, minute, amOrPm);

		                    System.out.println("\n" + doctorList.get(i).details());
		                    doctorFound = true;
		                    break;
		                }
		            }

		            if (!doctorFound) {
		                System.out.println(nameDr + " Doctor not found");

		            } else {
		                while (true) {
		                    System.out.println("Do you want to book the Appointment for " + drname + " type yes or no");
		                    String ap = scanner.nextLine().toLowerCase();
		                    if (ap.equals("yes")) {
		                        System.out.println("Enter your Name: ");
		                        String namep = scanner.next();

		                        System.out.println("Enter your age: ");
		                        int agep = scanner.nextInt();

		                        scanner.nextLine();
		                        System.out.println("Enter your Gender (M/F): ");
		                        String genderp = scanner.nextLine().toUpperCase();


		                        System.out.println("To Confirm the Appointment type yes or no :");
		                        String apoint = scanner.nextLine().toLowerCase();
		                        if (apoint.equals("yes")) {
		                            System.out.println("You book the Appointment with " + drname);
		                            System.out.println("Day: " + day);
		                            System.out.println("Time: " + time + amOrPm);
		                            System.out.println("Patient Name: " + namep);
		                            System.out.println("Age: " + agep);
		                            System.out.println("Gender: " + genderp);

		                            while (true) {
		                                System.out.println("Do you want to Select the doctor again type yes or no: ");
		                                String exit = scanner.nextLine().toLowerCase();
		                                if (exit.equals("no")) {
		                                    System.out.println("Thank You! ");
		                                    break;
		                                } else if (exit.equals("yes")) {
		                                    doctorFound = false;
		                                    break;
		                                } else {
		                                    System.out.println("Please enter yes or no.");
		                                }
		                            }
		                            break;
		                        } else if (apoint.equals("no")) {
		                            while (true) {
		                                System.out.println("Do you want to Select the doctor again type yes or no: ");
		                                String cancel = scanner.nextLine().toLowerCase();
		                                if (cancel.equals("no")) {
		                                    System.out.println("Thank You!");
		                                    break;
		                                } else if (cancel.equals("yes")) {
		                                    doctorFound = false;
		                                    break;
		                                } else {
		                                    System.out.println("Please enter yes or no.");
		                                }
		                            }
		                            break;
		                        } else {
		                            System.out.println("Please enter yes or no.");
		                        }
		                    } else if (ap.equals("no")) {
		                    	System.out.println("Do you want to Re-Select the doctor yes or no: ");
		                    	String re = scanner.nextLine();
		                    	if(re.equals("yes")) {
		                    		doctorFound = false;
		                        	break;
		                    	}
		                    	else {
		                    		System.out.println("Thank You");
		                    		break;
		                    	}
		                    } else {
		                        System.out.println("Please enter yes or no.");
		                    }
		                }
		            }
		            if (doctorFound) {
		                break;
		            }
		            System.out.print("Re-");
		        }
		    }
		
	}