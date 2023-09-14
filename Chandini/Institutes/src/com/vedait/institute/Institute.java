package com.vedait.institute;

public class Institute {
	
	String name;
	Students[] students;
	Employee[] employees;
	Rooms[] rooms;
	
	Institute(String name,Students[] students,Employee employees[],Rooms[] rooms){
		this.name=name;
		this.students=students;
		this.employees=employees;
		this.rooms=rooms;
	}


public void printStudentDetails() {
    System.out.println("Student Details for " + name);
    for (Students student : students) {
        System.out.println("Student Name: " + student.studentName);
        System.out.println("Student ID: " + student.studentId);
        System.out.println("Student EMAIL: " + student.eMail);
        System.out.println("Student Course: " + student.courseName);
        System.out.println("Instructor : " + student.Instructor);
        System.out.println("Batch : " + student.batchTimings);
        System.out.println();
    }
}

public void printRoomDetails() {
    System.out.println("Rooms Details for " + name);
    for (Rooms room : rooms) {
        System.out.println("Room Number : " + room.roomNum);
        System.out.println("Room Type : " + room.roomType);
        System.out.println("No. Of Fans : " + room.numOfFans);
        System.out.println("No. of Lights : " + room.numOfLights);
        System.out.println("No. of AC'S : " + room.numOfAcs);
        System.out.println("Is Projector Available : " + room.isProjectorAvailable);
        System.out.println();
    }
}

public void printEmployeeDetails() {
    System.out.println("Employee Details for " + name);
    for (Employee employees : employees) {
        System.out.println("Employee Name: " + employees.employeeName);
        System.out.println("Employee ID: " + employees.employeeId);
        System.out.println("Employee EMAIL: " + employees.eMail);
        System.out.println("Course Name: " + employees.courseName);
        System.out.println("Number of Batches Alloted: " + employees.batchesAlloted);
        System.out.println("Class Timings: " + employees.classTiming);
        System.out.println("Each Class Duration: " + employees.eachClassDuration);
        System.out.println();
    }
}

}
