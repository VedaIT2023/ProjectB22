package com.vedait.Institute;

public class Institute {
 String name,email,course;
 long phno;
 Teachers tc[];
 Employees emp[];
 Students st[];
 
 Institute(String name,String email,String course,long phno,Teachers tc[],Employees emp[],Students st[]){
	 
	 this.name = name;
	 this.email = email;
	 this.course = course;
	 this.phno = phno;
	 this.tc = tc;
	 this.emp = emp;
	 this.st = st;
 }
 public String students () {
     return "Name: " + name + "\n" +
            "Email: " + email + "\n" +
            "Phone Number: " + phno + "\n" +
            "Course: " + course  ;
            	 
 
}
}