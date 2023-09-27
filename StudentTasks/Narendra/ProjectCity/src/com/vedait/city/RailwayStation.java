package com.vedait.city;

import java.util.List;

public class RailwayStation {
	String name;
	String location;
    List<Integer> platforms;
    int capacity;
    int currentOccupancy;
    boolean canteens;
    boolean parking;
    RailwayStation(String name,String location,List<Integer> platforms,int capacity,int currentOccupancy,boolean canteens,boolean parking){
    	this.name=name;
    	this.location=location;
    	this.platforms=platforms;
    	this.capacity=capacity;
    	this.currentOccupancy=currentOccupancy;
    	this.canteens=canteens;
    	this.parking=parking;   	
    }
}
