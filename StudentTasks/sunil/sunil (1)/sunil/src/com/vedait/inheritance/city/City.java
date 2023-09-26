package com.vedait.inheritance.city;

public class City {
	String name;
	long population;
	double area;
	Hospital[] hospitals;
	PoliceStation[] policeStation ;
	College[] colleges;
	Malls[] malls;
	RailwayStation[] railwayStations;
	 
	City(String name,long population,double area,Hospital[] hospitals,PoliceStation[] policeStation,College[] colleges,Malls[] malls,RailwayStation[] railwayStation) {
		this.name=name;
		this.population=population;
		this.area=area;
		this.hospitals=hospitals;
		this.policeStation=policeStation;
		this.colleges=colleges;
		this.malls=malls;
		this.railwayStations=railwayStations;
	}
	
}