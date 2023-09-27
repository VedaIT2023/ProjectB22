package com.City.Task;

public class City {
	String name;
	int area;
	long population;
	int malls;
	int policeStations;
	int hospitals;
	int colleges;
	int busStands;
	public void cityDetails(String name,int area,long population,int malls,int policeStations,int hospitals,int colleges,int busStands) {
		this.name = name;
		this.area = area;
		this.population = population;
		this.malls = malls;
		this.policeStations = policeStations;
		this.hospitals = hospitals;
		this.colleges = colleges;
		this.busStands = busStands;
		
		System.out.println("Name : "+name);
		System.out.println("Area : "+area);
		System.out.println("Population : "+population);
		System.out.println("No of Mall : "+malls);
		System.out.println("No of Police Stations : "+policeStations);
		System.out.println("No of Hospitals : "+hospitals);
		System.out.println("No of Colleges : "+colleges);
		System.out.println("No of BusStands : "+busStands);
	
	
	}
}
