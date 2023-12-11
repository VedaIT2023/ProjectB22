
import java.util.ArrayList;

public class HospitalHelper {
	
	static public ArrayList<Doctor> doctorsList = new ArrayList(); 
	
	static void createDoctors() {
						
		
		
		addDoctor("Dinesh", "Cardio");
		addDoctor("Satish", "Physio");
		addDoctor("Sindhu", "Physio");
		addDoctor("Satya", "Physio");
		addDoctor("KAvita", "Physio");
		addDoctor("Balaji", "Physio");
		addDoctor("Kalyan", "Physio");
		addDoctor("Valli", "Physio");
		addDoctor("Naren", "Physio");
	}
	
	static void displayDoctorsList() {
		for(int i=0; i<doctorsList.size();i++) {
			Doctor d = HospitalHelper.doctorsList.get(i);
			System.out.println(d.id + " " + d.name + " " + d.specialisation);
		}

	}
	
	
	private static void addDoctor(String name, String specialisation) {			
		
		int id = 0;
		if(doctorsList.size()>0) {
			id = doctorsList.size()+1;
		}else {
			id = 1;
		}
		Doctor doc = new Doctor(name,id,specialisation,"","");
		doctorsList.add(doc);
	}
		

}
