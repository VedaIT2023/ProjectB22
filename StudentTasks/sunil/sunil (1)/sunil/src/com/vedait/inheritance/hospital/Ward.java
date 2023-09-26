package com.vedait.inheritance.hospital;

public class Ward {
	String name;
	int oxygenCylinders;
	int beds;
	int fans,lights;
	
	Ward(String name,int oxygenCylinders,int beds,int fans,int lights){
	this.name=name;
	this.oxygenCylinders=oxygenCylinders;
	this.beds=beds;
	this.fans=fans;
	this.lights=lights;
	}

}
