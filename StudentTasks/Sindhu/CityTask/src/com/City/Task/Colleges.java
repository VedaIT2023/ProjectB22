package com.City.Task;

public class Colleges {
	String name;
	String address;
	int branches;
	int classRooms;
	int faculty;
	public void collegeDetails(String name,String address,int branches,int classRooms,int faculty) {
		this.name = name;
		this.address = address;
		this.branches = branches;
		this.classRooms = classRooms;
		this.faculty = faculty;
		System.out.println("Name : "+name);
		System.out.println("address : "+address);
		System.out.println("No of branches : "+branches);
		System.out.println("No of classRooms : "+classRooms);
		System.out.println("Faculty Count : "+faculty);
	}
}



