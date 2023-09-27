package arraylist;
import java.util.ArrayList;

public class MainClass {
	 public static void main(String[] args) {
		 String[] doctorsnames = {"Sathwik","Balaji","Satish","Lakshman","Pavan","Kalyan","Dileep","Tejaswini","SaiLakshmi","Prasanthi"};
		 String[] specialization = {"Cardiologist","Neurologist","KidneySpecialist","LiverSpecialist","Psychiatrist","Radiologist","Neurologist",
				 					"Dermatologist","Oncologist","Neurologist"};
		 String[] timings = {"11AMto3PM","9AMto12PM","10AMto2PM","4PMto8PM","2PMto5PM","5PMto9PM","3PMto6PM","10AMto4PM","4PMto9PM","6PMto10PM"};
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
	            System.out.println("Doctor Name: " + doctor.name);
	            System.out.println("Specialization: " + doctor.specialization);
	            System.out.println("Timings: " + doctor.timings);

	            if (i < patientList.size()) {
	                Patients patient = patientList.get(i);
	                System.out.println("Patient Name: " + patient.name);
	                System.out.println("Suffering: " + patient.suffering);
	            }
	            System.out.println();
	        }
	    }
	}
	



