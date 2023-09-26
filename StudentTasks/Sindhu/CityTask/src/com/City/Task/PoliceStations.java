package com.City.Task;

public class PoliceStations {
	String name;
	int staff;
	int benches;
	int files;
	public void policeStationDetails(String name,int staff,int benches,int files) {
		this.name = name;
		this.staff = staff;
		this.benches = benches;
		this.files = files;
		
		System.out.println("Name : "+name);
		System.out.println("staff : "+staff);
		System.out.println("No of benches : "+benches);
		System.out.println("No of Files : "+files);
		
	}
}
