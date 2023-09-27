package com.vedait.hospitals;

public class IcuWard {
	int capacity;
	String wardType;
	boolean specializedEquipment;
	IcuWard(String wardType, int capacity, boolean specializedEquipment) {
        this.wardType=wardType;
        this.capacity=capacity;
        this.specializedEquipment = specializedEquipment;
    }

}
