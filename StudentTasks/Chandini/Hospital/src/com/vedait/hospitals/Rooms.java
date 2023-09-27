package com.vedait.hospitals;

public class Rooms {
	 int roomNumber;
     String roomType;
     int capacity;
     boolean isOccupied;

    public Rooms(int roomNumber, String roomType, int capacity,boolean isOccupied) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = capacity;
        this.isOccupied = false;
        
    }

}
