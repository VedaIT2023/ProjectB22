package com.vedait.students;

public class StudentDetails {

	
		String name,id,email;
		String course;
		char gender;
		
		StudentDetails(String name,String id,String email,String course,char gender){
			
			this.name = name;
			this.id = id;
			this.email = email;
			this.course = course;
			this.gender = gender;		
			
		}
		 public String Details(){
			return "Name: "+name+"\n"+
				    "Idno: "+id+ "\n" +
					"Email: "+email+"\n"+
				    "Course: "+course+"\n"+
					"Gender: "+gender+"\n";
					
				    
			 

	}

}
