package com.vedait.institute;

import java.util.ArrayList;

public class Institute {
	
	String name;
	ArrayList<Students> student;
	ArrayList<Employee> employees;
	ArrayList<Rooms> room;
	
	Institute(String name,ArrayList<Students> student,ArrayList<Employee> employees,ArrayList<Rooms> room){
		this.name=name;
		this.student=student;
		this.employees=employees;
		this.room=room;
	}


public void printStudentDetails() {
    System.out.println("Student Details for " + name);
    for (int i=0;i<student.size();i++) {
        System.out.println("Student Name: " + student.get(i).studentName);
        System.out.println("Student ID: " + student.get(i).studentId);
        System.out.println("Student EMAIL: " + student.get(i).eMail);
        System.out.println("Student Course: " + student.get(i).courseName);
        System.out.println("Instructor : " + student.get(i).Instructor);
        System.out.println("Batch : " + student.get(i).batchTimings);
        System.out.println();
    }
}

public void printRoomDetails() {
    System.out.println("Rooms Details for " + name);
    for (int i=0;i<room.size();i++) {
        System.out.println("Room Number : " + room.get(i).roomNum);
        System.out.println("Room Type : " + room.get(i).roomType);
        System.out.println("No. Of Fans : " + room.get(i).numOfFans);
        System.out.println("No. of Lights : " + room.get(i).numOfLights);
        System.out.println("No. of AC'S : " + room.get(i).numOfAcs);
        System.out.println("Is Projector Available : " + room.get(i).isProjectorAvailable);
        System.out.println();
    }
}

public void printEmployeeDetails() {
    System.out.println("Employee Details for " + name);
    for (int i=0;i<employees.size();i++) {
        System.out.println("Employee Name: " + employees.get(i).employeeName);
        System.out.println("Employee ID: " + employees.get(i).employeeId);
        System.out.println("Employee EMAIL: " + employees.get(i).eMail);
        System.out.println("Course Name: " + employees.get(i).courseName);
        System.out.println("Number of Batches Alloted: " + employees.get(i).batchesAlloted);
        System.out.println("Class Timings: " + employees.get(i).classTiming);
        System.out.println("Each Class Duration: " + employees.get(i).eachClassDuration);
        System.out.println();
    }
}

}
