package com.vedait.Hospital;

public class Doctors extends Commonproperties {

	String specialist, qualification;
	Doctors(String fname, String lname, String email, String phno, int age, char gender,String specialist,String qualification) {
		super(fname, lname, email, phno, age, gender);
		this.specialist = specialist;
		this.qualification = qualification;

		}
	
	public String doctor() {
		return "Name: "+fname+" "+lname+"\n"+"Email :" + email + "\n" +  "PhNo :" + phno +
				"\n" + "Age :" + age + "\n" + "Gender :" + gender + "\n" + "Specialist :" + specialist + "\n" + "Qualification :"
				+ qualification;
		
		}
}
