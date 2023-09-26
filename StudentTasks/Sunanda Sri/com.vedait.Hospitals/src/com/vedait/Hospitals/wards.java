package com.vedait.Hospitals;

public class wards {

	String name;
	int occupancy,beds;

	wards(String name,int occupancy,int beds){
		this.name = name;
		this.occupancy = occupancy;
		this.beds = beds;
		}
	public String wards () {
		return "Name: "+ name + "\n"+"Occupancy :" + occupancy + "\n" +  "Total Beds :" + beds  ;

	}

}
