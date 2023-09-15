package com.vedait.institute;
import java.util.ArrayList;
public class Institution {
	String name;
	//Reception[] reception[];
	ArrayList<Courses> course;
	ArrayList<Students> student;
	ArrayList<Faculty> faculty;
	//Pantry[] pantry;
	
	Institution(String name,ArrayList<Courses> course,ArrayList<Students> student,ArrayList<Faculty> faculty){
		this.name=name;
		this.course=course;
		this.student=student;
		this.faculty=faculty;
	}


public void printStudentDetails() {
    System.out.println("Student Details for " + name);
    for (int i=0;i<student.size();i++) {
        System.out.println("Student Name: " + student.get(i).sName);
        System.out.println("Student ID: " + student.get(i).sId);
        System.out.println("Student EMAIL: " + student.get(i).eMail);
        System.out.println("Student Course: " + student.get(i).cName);
        System.out.println("Instructor : " + student.get(i).Instructor);
        System.out.println("Batch : " + student.get(i).batchTimings);
        System.out.println();
    }
}

public void printCourseDetails() {
    System.out.println("Course Details for " + name);
    for (int i=0;i<course.size();i++) {
        System.out.println("Course Name: " + course.get(i).cName);
        System.out.println("Course Fee: " + course.get(i).cFee);
        System.out.println();
    }
}

public void printFacultyDetails() {
    System.out.println("Faculty Details for " + name);
    for (int i=0;i<faculty.size();i++) {
        System.out.println("Faculty Name: " + faculty.get(i).fName);
        System.out.println("Faculty ID: " + faculty.get(i).fId);
        System.out.println("Faculty EMAIL: " + faculty.get(i).eMail);
        System.out.println("Course Name: " + faculty.get(i).cName);
        System.out.println("Number of Batches Alloted: " + faculty.get(i).batchesAlloted);
        System.out.println("Class Timings: " + faculty.get(i).classTiming);
        System.out.println("Each Class Duration: " + faculty.get(i).eachClassDuration);
        System.out.println();
    }
}

}