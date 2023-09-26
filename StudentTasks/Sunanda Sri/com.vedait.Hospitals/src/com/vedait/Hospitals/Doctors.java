package com.vedait.Hospitals;

public class Doctors extends Commonproperties {
	String specialist, qualification;
	Doctors(String fname, String lname, String email, String phonenumber, int age, char gender,String specialist,String qualification) {
		super(fname, lname, email, phonenumber, age, gender);
		this.specialist = specialist;
		this.qualification = qualification;

		}
	
	public String doctor() {
		return "Name: "+fname+" "+lname+"\n"+"Email :" + email + "\n" +  "Phonenumber :" + phonenumber +
				"\n" + "Age :" + age + "\n" + "Gender :" + gender + "\n" + "Specialist :" + specialist + "\n" + "Qualification :"
				+ qualification;
		// TODO Auto-generated method stub

	}

}
