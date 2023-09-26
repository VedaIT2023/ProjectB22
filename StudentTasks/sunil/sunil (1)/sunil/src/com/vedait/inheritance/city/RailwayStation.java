package com.vedait.inheritance.city;

public class RailwayStation {
	String name;
	int platform;
	int ticketCounter;
	int entrance;
	int flyovers;
	int lights;
	int fans;
	
	RailwayStation(String name,int platform,int ticketCounter,int entrance,int flyovers,int lights,int fans){
		this.name=name;
		this.platform=platform;
		this.ticketCounter=ticketCounter;
		this.entrance=entrance;
		this.flyovers=flyovers;
		this.lights=lights;
		this.fans=fans;
	}

}
