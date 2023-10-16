package com.hospital.appointment.form;

public class PatientProperties {

	String pname, problem, doc_name ;
	int age, id;
	long Ph_no;
	char gender;
	
	PatientProperties(int id, String pname, int age, char gender, String problem,long Ph_no, String doc_name){
		this.Ph_no = Ph_no;
		this.doc_name = doc_name;
		this.id = id;
		this.pname = pname;
		this.age = age;
		this.problem = problem;
		
	}
	
	public String pDetials() {
		return "Patient ID: "+this.id+
				"\nName: "+this.pname+
				"\nAge: "+this.age+
				"\nProblem: "+this.problem+
				"\nPhone Number: "+this.Ph_no+
				"\n"+this.doc_name;
		}
}
