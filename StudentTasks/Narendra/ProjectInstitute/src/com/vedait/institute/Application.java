package com.vedait.institute;

import java.util.ArrayList;

public class Application {	
	public static void main(String args[]) {
	
	String[] courses= {"JAVA FULL STACK","PYTHON FULL STACK","TESTING","AMAZON WEB SERVICES"};
	int[] courseCost= {25000,25000,25000,25000};
	
	ArrayList<Courses> course = new ArrayList<Courses>(); 
	for(int i=0;i<courses.length;i++) {
		Courses cdetails = new Courses(courses[i],courseCost[i]);
		course.add(cdetails);
	
	}
	String[] studentNames= {"Narendra","Chandini","satish","diwakar"};
	int[] studentId= {001,002,003,004};
	String[] email= {"Narendra@gmail.com","Chandini@gmail.com","satish@gmail.com","diwakar@gmail.com"};
	String[] coursechosen= {"Java Full Stack","Java Full Stack","Java Full Stack","Java Full Stack"};
	String[] instructor={"dinesh","dinesh","dinesh","dinesh"};
	String[] batchTimings= {"7:00 AM to 9:00 AM","11:00 AM to 1:00 PM","7:00 AM to 9:00 AM","7:00 AM to 9:00 AM"};
	ArrayList<Students> student = new ArrayList<Students>(); 
	for(int i=0;i<email.length;i++) {
		Students studentdetails = new Students(studentNames[i],studentId[i],email[i],coursechosen[i],instructor[i],batchTimings[i]);
		student.add(studentdetails);
	
	}
	
	String[] facultyNames= {"Dinesh","anil"};
	int[] facultyId= {101,102};
	String[] facultyEmail= {"dinesh@gmail.com","anil@gmail.com"};
	String[] courseTeaching= {"Java Full Stack","Java Full Stack"};
	int[] noOfBatchesAlloted={2,2};
	String[] Timings= {"7:00 AM to 9:00 AM , 10:00 AM to 12:00 AM","9:00 AM to 11:00 AM , 11:00 AM to 1:00 PM"};
	int[] noOfHoursEachClass= {2,2};
	ArrayList<Faculty> faculty = new ArrayList<Faculty>(); 
	for(int i=0;i<facultyEmail.length;i++) {
		Faculty facultydetails = new Faculty(facultyNames[i],facultyId[i],facultyEmail[i],courseTeaching[i],noOfBatchesAlloted[i],Timings[i],noOfHoursEachClass[i]);
		faculty.add(facultydetails);
	
	}
	
	
	
	Institution vedait = new Institution("VEDA IT",course,student,faculty);
	
	vedait.printCourseDetails();
	vedait.printFacultyDetails();
	vedait.printStudentDetails();
	}
}
