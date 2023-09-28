package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	 public static void main(String[] args) {
		 String[] doctorsnames = {"Sathwik","Balaji","Satish","Lakshman","Pavan","Kalyan","Dileep","Tejaswini","SaiLakshmi","Prasanthi"};
		 String[] specialization = {"Cardiologist","Neurologist","KidneySpecialist","LiverSpecialist","Psychiatrist","Radiologist","Neurologist",
				 					"Dermatologist","Oncologist","Neurologist"};
		 String[] timings = {"11AM to 3PM","9AM to 12PM","10AM to 2PM","4PM to 8PM","2PM to 5PM","5PM to 9PM","3PM to 6PM","10AM to 4PM","4PM to 9PM","6PM to 10PM"};
		 char[] gender = {'M','M','M','M','M','M','M','F','F','F'};
		 
		 String[] patientsnames = {"pinky","pandu","sajju","kumar","umar","uma","sandhya","bhargav","purna","sai"};
		 String[] suffering = {"Heart","NervosSystem","kindeys","liver","mentalhealth","dieases","NervosSystem"," skin disorders","tumour","NervosSystem"};
		 String[] phno = {"7324829334","9638496293","9239747423","9283492744","8394824454","8497245657","7673297923","7472947538","9104475230","9284923445"};
		 
		    ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	        ArrayList<Patients> patientList = new ArrayList<Patients>();

	        for (int i = 0; i < doctorsnames.length; i++) {
	            Doctor dtr = new Doctor(doctorsnames[i], specialization[i], timings[i], gender[i]);
	            doctorList.add(dtr);
	        }

	        for (int i = 0; i < patientsnames.length; i++) {
	            Patients pt = new Patients(patientsnames[i], phno[i], suffering[i]);
	            patientList.add(pt);
	        }

	        for (int i = 0; i < doctorList.size(); i++) {
	            Doctor doctor = doctorList.get(i);
	            System.out.println("Doctor Name"+ (i+1) +":" +doctor.name);
	            System.out.println("Specialization: " + doctor.specialization);
	            
	           
	            System.out.println();
	        }
	        Scanner scanner = new Scanner(System.in);
	        boolean exit = false;
            while (!exit) {
                System.out.println("Enter a number for Doctor:");
                int num = scanner.nextInt();
                if ((num == 0) || (num > 10)) {
                    System.out.println("Exit");
                    exit = true;
                } else if (num >= 1 && num <= doctorList.size()) {
                    Doctor doctor = doctorList.get(num - 1);
                    System.out.println("Doctor Name: " + doctor.name);
                    System.out.println("Specialization: " + doctor.specialization);
                    System.out.println("Timings: " + doctor.timings);

                    System.out.println("Give an appointment to a patient?  (0 for no and 1 for yes)");
                    int value = scanner.nextInt();
                    if(value>1) {
                    	break;
                    }
                    if (value == 1 && value <= patientList.size()) {
                        Patients patient = patientList.get(num - 1);
                        System.out.println("Patient Name: " + patient.name);
                        System.out.println("Problem: " + patient.suffering);
                        System.out.println("Thank you !");
                    }
                } 
            }
        }
    }




