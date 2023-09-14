package com.vedait.institute;

public class ApplicationMain {

	public static void main(String[] args) {
				
		Students chandini=new Students("Chandini",001,"chandini@gmail.com","Java Full Stack","Dinesh","7:00 AM to 9:00 AM");
		Students veni = new Students("Veni",002,"veni@gmail.com","Java Full Stack","Anil","11:00 AM to 1:00 PM");
		
		Students[] students= {chandini,veni};
		
		Employee dinesh = new Employee("Dinesh", 101,"dinesh@vedait.com","Java Full Stack", 2,"7:00 AM to 9:00 AM , 10:00 AM to 12:00 AM",2);
		Employee anil = new Employee("anil", 102,"anil@vedait.com" ,"Java Full Stack", 2,"9:00 AM to 11:00 AM , 11:00 AM to 1:00 PM", 2);
		
		Employee[] employees= {dinesh,anil};
		
		Rooms room1 = new Rooms(101, "Theory class room",4,12,2,true);
		Rooms room2 = new Rooms(1012, "Lab class room",4,12,2,true);
		
		Rooms[] rooms= {room1,room2};
		
		Institute vedait = new Institute("VEDA IT",students,employees,rooms);
		
		
		vedait.printEmployeeDetails();
		vedait.printStudentDetails();
		vedait.printRoomDetails();
		}

}


