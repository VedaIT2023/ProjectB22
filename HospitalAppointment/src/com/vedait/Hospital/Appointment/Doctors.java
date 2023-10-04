package com.vedait.Hospital.Appointment;

public class Doctors {

	int doctorid;
	String doctorname;
	String specialization;
	
	Doctors(String doctorname,String specialization,int doctorid ){
		
		this.doctorid = doctorid;
		this.doctorname = doctorname;
		this.specialization = specialization;
		
	}
	

	public String getDoctorName() {
        return doctorname;
    }

    public String getSpecialization() {
        return specialization;
    }
   
    
	public String toString(){
		return  "Doctor ID:" + doctorid+"\n" 
				+ "Doctor Name  :" + doctorname + "\n" +
<<<<<<< Updated upstream
                "Specialization :" + specialization + "\n"  
                ;
=======
                "Specialization :" + specialization + "\n";
>>>>>>> Stashed changes
		
	}
}
