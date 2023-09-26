package com.vedait.institute;

public class Teachers {

	public static void main(String[] args) {
		String name,email,subject;
	char gender;
	long phno;
		
	void teach() {
		System.out.println(this.name + " will teach very nicely");
	}
	
	void douts() {
		System.out.println(this.name + " will clarify douts when we neded");
	}
		Teachers(String name,String email,char gender,long phno,String subject){
		
		this.name = name;
		this.email =  email;
		this.gender = gender;
		this.phno = phno;
		this.subject  = subject;
		
	}

		public String teachers () {
	        return "Name: " + name +  "\n" +
	               "Email: " + email + "\n" +
	               "Gender: " + gender + "\n" +
	               "Phone Number: " + phno + "\n" +
	               "Subject: " + subject;

	}

}
