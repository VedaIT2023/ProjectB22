package HospitalList;

public class HospitalMain {

	public static void main(String[] args) {
		Doctors doctor1 = new Doctors("Satish", "Cardialogist",  "9AM to 10AM", "MBBS","satishpendhem052@gmail.com" , "7036156924", 21, 'M');
		Doctors doctor2 = new Doctors("Ravi", "Neuralogist", "10AM to 11AM","MS",  "ravipendhem052@gmail.com" , "8926156924", 36, 'M');
		Doctors doctor3 = new Doctors("Sandya","Dentist", "11AM to 12Am", "MS", "sandyachuduri032@gmail.com" , "787223924", 20, 'F');
		Doctors doctor4 = new Doctors("sneha", "Gynecologist",  "12AM to 1AM", "MBBS", "sneha2001@gmail.com" , "8936156924", 25, 'F');
		Doctors doctor5 = new Doctors("Jay", "Psychiatrist", "1AM to 2AM", "MBBS",  "jay833322@gmail.com" , "7348156924", 21, 'M');
		Doctors doctor6 = new Doctors("kavya", "Radialogist", "2AM to 3AM", "MBBS",  "kavyapilli052@gmail.com" , "8926156924", 22, 'F');
		Doctors doctor7 = new Doctors("Pavan", "Dermotoligist", "3Am to 4AM", "MBBS",  "pavancherry@gmail.com" , "7036156924", 21, 'M');
		Doctors doctor8 = new Doctors("Lucky", "Oncologist", "4AM to 5AM", "MS",  "lucky@gmail.com" , "8926156924", 21, 'M');
		Doctors doctor9 = new Doctors("Balaji","Surgeon", "5AM to 6AM",  "MS", "balaji@gmail.com" , "787223924", 21, 'M');
		Doctors doctor10 = new Doctors("Sathwik", "Pulmonoligist", "6AM to 7AM", "MBBS",  "sathwik@gmail.com" , "8936156924", 21, 'M');
	
		Patients patient1 = new Patients("Rahul", "LungCancer", "Low", "Pulmonoligist", "rahul3213@gmail.com", "703262768", 21, 'M');
		Patients patient2 = new Patients("Sukesh", "Cancer", "Low", "Radiplogist", "sukesh@gmail.com", "703262768", 21, 'M');
		Patients patient3 = new Patients("Vishal", "Anxiety Disorders", "High", "Psychiatrists", "vishal@gmail.com", "703262768", 21, 'M');
		Patients patient4 = new Patients("Pavan", "Diabeties", "High", "Podiatrists", "pavan@gmail.com", "703262768", 21, 'M');
		Patients patient5 = new Patients("Fazal", "Alzheimer Disease", "High", "Neurologist", "fazal@gmail.com", "703262768", 21, 'M');
		Patients patient6 = new Patients("Sunandha", "Kidney Disease", "Medium", "Nephrologist", "sunandha@gmail.com", "703262768", 21, 'F');
		Patients patient7 = new Patients("Satya", "Illness", "Low", "Internists", "satya@gmail.com", "703262768", 21, 'F');
		Patients patient8 = new Patients("Nissie", "Fever", "High", "Infectious Disease Specialists", "nissie@gmail.com", "703262768", 21, 'F');
		Patients patient9 = new Patients("sailakshmi", "Anemia", "High", "Hematologits", "sailakshmi@gmail.com", "703262768", 21, 'F');
		Patients patient10 = new Patients("Roshini", "Ulcer", "High", "Gastroentrologist", "roshini@gmail.com", "703262768", 21, 'F');
		
		Doctors doctor[] = {doctor1,doctor2,doctor3,doctor4,doctor5,doctor6, doctor7, doctor8, doctor9, doctor10};
		System.out.println("Doctor Details :");
		for(int i=0;i<doctor.length;i++) {
		System.out.println(doctor[i].DoctorDetails());
		System.out.println("");
		}
		
		Patients patient[] = {patient1,patient2,patient3,patient4,patient5, patient6, patient7, patient8, patient9, patient10};
		System.out.println("Patient Details:");
		for(int i=0;i<patient.length;i++) {
			System.out.println(patient[i].PatientDetails());
			System.out.println("");
		}
		System.out.println("Doctor and Patient Details:");
        for (int i = 0; i < doctor.length; i++) {
            System.out.println("Doctor Name: " + doctor[i].getname());
            System.out.println("Specialization: " + doctor[i].getSpecialization());
            System.out.println("Timings: " + doctor[i].getTimings());

            System.out.println("Patient Name: " + patient[i].getName());
            System.out.println("Problem : " + patient[i].getProblem());
            System.out.println("");
        }
	}

}
