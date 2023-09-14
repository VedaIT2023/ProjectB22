package com.vedait.institute;

public class Rooms {
	int roomNum;
	String roomType;
	int numOfFans;
	int numOfLights;
	int numOfAcs;
	boolean isProjectorAvailable;
	Rooms(int roomNum,String roomType,int numOfFans,int numOfLights,int numOfAcs,boolean isProjectorAvailable){
		this.roomNum=roomNum;
		this.roomType=roomType;
		this.numOfFans=numOfFans;
		this.numOfLights=numOfLights;
		this.numOfAcs=numOfAcs;
		this.isProjectorAvailable=isProjectorAvailable;
	}
	

}
