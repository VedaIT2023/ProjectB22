package com.vedait.city;

public class BusStand {
	String name;
	String location;
    int buses;
    boolean parkingAvailable;
    boolean securityMeasures;
    boolean accessibleForDifferentlyAbled;
    String contactInformation;   
    
    public BusStand(String name,String location,int buses,boolean parkingAvailable,boolean securityMeasures
    		,boolean accessibleForDifferentlyAbled,String contactInformation){
    	
    	this.name=name;
    	this.location=location;
    	this.buses=buses;
    	this.parkingAvailable=parkingAvailable;
    	this.securityMeasures=securityMeasures;
    	this.accessibleForDifferentlyAbled=accessibleForDifferentlyAbled;
    	this.contactInformation=contactInformation;
    	
    	
    }
}








