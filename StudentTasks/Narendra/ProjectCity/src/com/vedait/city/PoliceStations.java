package com.vedait.city;

import java.util.List;

public class PoliceStations {
	String name;
    String location;
    int officers;
    String phoneNumber;
    int vehicles;
    List<String> crimeRecords;
    String workingHours;
    PoliceStations(String name,String location,int officers,String phoneNumber,int vehicles,
    		List<String> crimeRecords,String workingHours){
    	this.name=name;
    	this.location=location;
    	this.officers=officers;
    	this.phoneNumber=phoneNumber;
    	this.vehicles=vehicles;
    	this.crimeRecords=crimeRecords;
    	this.workingHours=workingHours;
    	
    }
}
