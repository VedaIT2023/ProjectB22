package com.vedait.institute;

public class Application {	
	int cnt=0;
	public static void main(String args[]) {
	
	Courses javafullstack = new Courses("JAVA FULL STACK","25,000");
	Courses pythonfullstack = new Courses("PYTHON FULL STACK","25,000");
	Courses testing = new Courses("TESTING","25,000");
	Courses aws = new Courses("AMAZON WEB SERVICES","25,000");
	
	Courses[] course= {javafullstack,pythonfullstack,testing,aws};
	
	
	Students narendra=new Students("Narendra",001,"narendra@gmail.com","Java Full Stack","Dinesh","7:00 AM to 9:00 AM");
	Students chandini = new Students("Chandini",002,"chandini@gmail.com","Java Full Stack","Dinesh","7:00 AM to 9:00 AM");
	
	Students[] student= {narendra,chandini};
	
	Faculty dinesh = new Faculty("Dinesh", 101,"dinesh@vedait.com","Java Full Stack", 2,"7:00 AM to 9:00 AM , 10:00 AM to 12:00 AM",2);
	Faculty anil = new Faculty("anil", 102,"anil@vedait.com" ,"Java Full Stack", 2,"9:00 AM to 11:00 AM , 11:00 AM to 1:00 PM", 2);
	
	Faculty[] faculty= {dinesh,anil};
	
	Institution vedait = new Institution("VEDA IT",course,student,faculty);
	
	vedait.printCourseDetails();
	vedait.printFacultyDetails();
	vedait.printStudentDetails();
	}
}
