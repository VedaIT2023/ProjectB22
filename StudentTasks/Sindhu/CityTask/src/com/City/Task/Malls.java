package com.City.Task;

public class Malls {
	String name;
	String address;
	int shops;
	int halls;
	public void mallDetails(String name,String address,int shops,int halls) {
		this.name = name;
		this.address = address;
		this.shops = shops;
		this.halls = halls;
		
		System.out.println("Name : "+name);
		System.out.println("address : "+address);
		System.out.println("No of shops : "+shops);
		System.out.println("No of Halls : "+halls);
		
	}
}
