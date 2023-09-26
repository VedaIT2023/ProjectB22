package com.City.Task;

public class BusStands {
	String name;
	String address;
	int buses;
	int stops;
	public void busStandDetails(String name,String address,int buses,int stops) {
		this.name = name;
		this.address = address;
		this.buses = buses;
		this.stops = stops;
		
		System.out.println("Name : "+name);
		System.out.println("address : "+address);
		System.out.println("No of buses : "+buses);
		System.out.println("No of stops : "+stops);
		
	}
}
