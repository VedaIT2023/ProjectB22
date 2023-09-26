package com.vedait.institute;

public class Students {

	public static void main(String[] args) {
		String name,email,course;
	int idno;
	char gender;
	double coursefee;
	long phno;

	void attendence(){
		System.out.println(this.name +" will daily attend the class");
	}
	
	void learn(){
		System.out.println(this.name + " is good at learning");
	}
	
	Students(String name,String email,char gender,long phno,int idno,String course,double coursefee){
		
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.phno = phno;
		this.idno = idno;
		this.course = course;
		this.coursefee = coursefee;
		
		}
	public String students () {
        return "Name: " + name + "\n" +
               "Email: " + email + "\n" +
               "Gender: " + gender + "\n" +
               "Phone Number: " + phno + "\n" +
               "ID Number: " + idno + "\n" +
               "Course: " + course + "\n" +
               "Course Fee: " + coursefee ;
	}

}
