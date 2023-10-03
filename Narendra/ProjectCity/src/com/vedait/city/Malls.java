package com.vedait.city;

public class Malls {
	String name;
    String location;
    double totalArea;
    int numberOfFloors;
    int numberOfShops;
    boolean parkingAvailable;
    int parkingCapacity;
    
    Malls(String name,String location,double totalarea,int numberOfFloors,int numberOfShops,boolean parkingAvailable,int parkingCapacity){
    	this.name=name;
    	this.location=location;
    	this.totalArea=totalarea;
    	this.numberOfFloors=numberOfFloors;
    	this.numberOfShops=numberOfShops;
    	this.parkingAvailable=parkingAvailable;
    	this.parkingCapacity=parkingCapacity;
    	
    }
}
