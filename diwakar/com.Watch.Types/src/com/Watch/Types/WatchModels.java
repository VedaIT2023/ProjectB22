package com.Watch.Types;

public class WatchModels {
	String brand;
	String waterresistant;
	String displaytype;
	int belts;
	String strapcolour;
	int price;
	
	void watchstart() {
		System.out.println(this.brand +"watch started working");
	}
	void watchstop() {
		System.out.println(this.brand +"watch stop working");
	}	
    void alaramon() {
    	System.out.println(this.brand +"alaram is on");
    }
    void alaramoff() {
    	System.out.println(this.brand +"alaram is off");
    }		
    
    WatchModels(String brand,String waterresistant,String displaytype,int belts,String strapcolour,int price) {
    	this.brand=brand;
    	this.waterresistant=waterresistant;
    	this.displaytype=displaytype;
    	this.belts=belts;
    	this.strapcolour=strapcolour;
    	this.price=price;
	}
}
