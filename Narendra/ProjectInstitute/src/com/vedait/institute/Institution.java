package com.vedait.institute;

public class Institution {
	String name;
	//Reception[] reception[];
	Courses[] course;
	Students[] students;
	Faculty faculty[];
	//Pantry[] pantry;
	
	Institution(String name,Courses[] course,Students[] students,Faculty faculty[]){
		this.name=name;
		this.course=course;
		this.students=students;
		this.faculty=faculty;
	}


public void printStudentDetails() {
    System.out.println("Student Details for " + name);
    for (Students student : students) {
        System.out.println("Student Name: " + student.sName);
        System.out.println("Student ID: " + student.sId);
        System.out.println("Student EMAIL: " + student.eMail);
        System.out.println("Student Course: " + student.cName);
        System.out.println("Instructor : " + student.Instructor);
        System.out.println("Batch : " + student.batchTimings);
        System.out.println();
    }
}

public void printCourseDetails() {
    System.out.println("Course Details for " + name);
    for (Courses course : course) {
        System.out.println("Course Name: " + course.cName);
        System.out.println("Course Fee: " + course.cFee);
        System.out.println();
    }
}

public void printFacultyDetails() {
    System.out.println("Faculty Details for " + name);
    for (Faculty faculty : faculty) {
        System.out.println("Faculty Name: " + faculty.fName);
        System.out.println("Faculty ID: " + faculty.fId);
        System.out.println("Faculty EMAIL: " + faculty.eMail);
        System.out.println("Course Name: " + faculty.cName);
        System.out.println("Number of Batches Alloted: " + faculty.batchesAlloted);
        System.out.println("Class Timings: " + faculty.classTiming);
        System.out.println("Each Class Duration: " + faculty.eachClassDuration);
        System.out.println();
    }
}

}