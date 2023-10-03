package com.Vedait.Student.Chart;

public class Students {
	
		String name, qualification, stream, phno;
		String email;
		int age;
		char gender;


		Students(String name, String qualification, String stream, String email, String phno, int age, char gender ){
			this.name = name;
			this.email = email;
			this.qualification = qualification;
			this.stream = stream;
			this.phno = phno;
			this.age = age;	
			this.gender = gender;
		}
		public String StudentDetails() {
	        return "Name of the Person : " + name + "\nQualification : " + qualification + "\nStream : " +
		stream + "\nEmail : " + email + "\nPhone Number : " + phno + "\nage: " + age
	                + "\ngender: " + gender ;
		}	

	}

