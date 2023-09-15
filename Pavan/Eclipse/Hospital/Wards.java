package com.vedait.Hospital;

public class Wards {
	String name;
	int occupancy,beds;

	Wards(String name,int occupancy,int beds){
		this.name = name;
		this.occupancy = occupancy;
		this.beds = beds;
		}
	public String wards() {
		return "Name: "+ name + "\n"+"Occupancy :" + occupancy + "\n" +  "Total Beds :" + beds  ;
		
		}
}
