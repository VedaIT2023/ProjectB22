package arraylist;

public class Patients {
	
	String name,phno,suffering;
	char gender;
	
	Patients(String name, String phno, String suffering){
		
		this.name = name;
		this.phno =phno;
		this.suffering = suffering;
	
				
	}
	

	public String PatientDetails(){
	return "Name: "+name+"\n"+
		   "Phoneno: "+phno+"\n"+
		   "Suffering:"+suffering;
		 
	}

	
	
}
