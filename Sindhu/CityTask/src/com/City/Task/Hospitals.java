package com.City.Task;

public class Hospitals {
	String name;
	int doctors;
	int nurses;
	int generalRooms;
	int emergencyRooms;
	public void hospitalDetails(String name,int doctors,int nurses,int generalRooms,int emergencyRooms) {
		this.name = name;
		this.doctors = doctors;
		this.nurses = nurses;
		this.generalRooms = generalRooms;
		this.emergencyRooms = emergencyRooms;
		System.out.println("Name : "+name);
		System.out.println("No of Doctors : "+doctors);
		System.out.println("No of Nurses : "+nurses);
		System.out.println("No of General Rooms : "+generalRooms);
		System.out.println("No of Emergency Rooms: "+emergencyRooms);
		
	}
}
