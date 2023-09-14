package com.vedait.hospitals;

public class GeneralWard {
	int capacity;
	String wardType;
	boolean hasPrivateRooms;
	GeneralWard(String wardType,int capacity,boolean hasPrivateRooms){
		this.capacity=capacity;
		this.wardType=wardType;	
		this.hasPrivateRooms=hasPrivateRooms;
	}

}
