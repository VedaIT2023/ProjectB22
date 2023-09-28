package AppointmentForm;
import java.util.Scanner;
import java.util.HashMap;

import com.vedait.Basic.Operations.Student;

public class HospitalMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Doctors doctor1 = new Doctors("Satish", "101","Cardialogist",  "MON to WED", "MBBS","satishpendhem052@gmail.com" , "7036156924", 21, 'M');
		Doctors doctor2 = new Doctors("Ravi", "102","Neuralogist", "TUES to THURS","MS",  "ravipendhem052@gmail.com" , "8926156924", 36, 'M');
		Doctors doctor3 = new Doctors("Sandya","103","Dentist", "WEDNES to FRI", "MS", "sandyachuduri032@gmail.com" , "787223924", 20, 'F');
		Doctors doctor4 = new Doctors("sneha","104", "Gynecologist",  "THURS to SATUR", "MBBS", "sneha2001@gmail.com" , "8936156924", 25, 'F');
		Doctors doctor5 = new Doctors("Jay","104", "Psychiatrist", "FRI to SUN", "MBBS",  "jay833322@gmail.com" , "7348156924", 21, 'M');
		Doctors doctor6 = new Doctors("kavya","105", "Radialogist", "SAT to MON", "MBBS",  "kavyapilli052@gmail.com" , "8926156924", 22, 'F');
		Doctors doctor7 = new Doctors("Pavan","106", "Dermotoligist", "SUN to WEDNES", "MBBS",  "pavancherry@gmail.com" , "7036156924", 21, 'M');
		Doctors doctor8 = new Doctors("Lucky","107", "Oncologist", "MON to THURS", "MS",  "lucky@gmail.com" , "8926156924", 21, 'M');
		Doctors doctor9 = new Doctors("Balaji","108","Surgeon", "TUES to FRI",  "MS", "balaji@gmail.com" , "787223924", 21, 'M');
		Doctors doctor10 = new Doctors("Sathwik", "109","Pulmonoligist", "WEDNES to THURS", "MBBS",  "sathwik@gmail.com" , "8936156924", 21, 'M');
		
		System.out.println("List of the Doctors\n");
		Doctors doctor[] = {doctor1,doctor2,doctor3,doctor4,doctor5,doctor6, doctor7, doctor8, doctor9, doctor10};
		for(int i=0;i<doctor.length;i++) {
		System.out.println(doctor[i].DoctorDetails());
		System.out.println("");
		}
		
        HashMap<Integer, String> doctorMap = new HashMap<>();
        
        for(int i=0;i<doctor.length;i++) {
        	doctorMap.put(i,doctor[i].getname()+ "\nAvailable Timings :" +doctor[i].getTimings() + "\nSpecialisation : " +doctor[i].getSpecialization());
        }
        boolean continueBooking = true;

        while (continueBooking) {
        System.out.println("Select the Doctor Number to Book An Appointment :");
        int indexNumber = sc.nextInt();
        
        if(indexNumber>=0 && indexNumber<doctor.length) {
        	String doctorName = doctorMap.get(indexNumber);
        	System.out.println("Name of the Doctor " + ": "+doctorName);
        	System.out.println("Do you want to book an appointment with this doctor? (yes/no)");
        	String confirmation = sc.next();

             if (confirmation.equalsIgnoreCase("yes")) {
                 System.out.println("Your appointment is booked!");
             } else if (confirmation.equalsIgnoreCase("no")) {
         
                 System.out.println("Please select another doctor.");
             } else {
                 System.out.println("Invalid input. Please enter 'yes' or 'no'.");
             }
         } else {
             System.out.println("Invalid index. Please enter a valid index.");
         }
        	System.out.println("Do you want to book another appointment? (yes/no)");
        	String continueBookingInput = sc.next();
        	continueBooking = continueBookingInput.equalsIgnoreCase("yes");
    	}
        System.out.println("Thank you for Using our Service");
     }
}
