package arraylist;

public class Doctor {
	
	String name,specialization,timings;
	char gender;
	
	
    Doctor(String name,String specialization,String timings,char gender){
		
		this.name = name;
		this.specialization = specialization;
		this.timings = timings;
		this.gender = gender;
	
    }
		
			public String DoctorDetails(){
			return "Name: "+name+"\n"+
				   "Specialatization: "+specialization+"\n"+
				   "Timings:"+timings+"\n"+
				   "Gender: "+gender+"\n";
					
	}

	
}
