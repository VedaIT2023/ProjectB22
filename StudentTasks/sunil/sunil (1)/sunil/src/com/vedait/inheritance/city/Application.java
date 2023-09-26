package com.vedait.inheritance.city;

import com.vedait.inheritance.institute.Student;

public class Application {
	public static void main(String[] args) {

		Hospital appolo=new Hospital("Appolo",5,20,100,6,5,5);
		Hospital kims=new Hospital("Kims",5,20,100,6,5,5);
		Hospital microCare=new Hospital("Micro Care",5,20,100,6,5,5);
		Hospital remedy=new Hospital("Remedy",5,20,100,6,5,5);

		Hospital[] hsps= {appolo,kims,microCare,remedy};
		
		PoliceStation kukatpally = new PoliceStation("Kukatpallu",20, 10, 10, 10, 8);
		PoliceStation miyapur = new PoliceStation("Miyaour",20, 10, 10, 10, 8);
		PoliceStation ameerpet = new PoliceStation("Ameerpet",20, 10, 10, 10, 8);
		PoliceStation panjaguta = new PoliceStation("Panjaguta",20, 10, 10, 10, 8);

		PoliceStation[] ps= {kukatpally,miyapur,ameerpet,panjaguta};
		
		College chaitanya=new College("Chaitanya", 4, 20, 20, 1000, 60, 60);
		College narayana=new College("Narayana", 4, 20, 20, 1000, 60, 60);
		College ravindra=new College("Ravindra", 4, 20, 20, 1000, 60, 60);
		College osmania=new College("Osmania", 4, 20, 20, 1000, 60, 60);

		College[] colleges= {chaitanya,narayana,ravindra,osmania};
		
		Malls forum=new Malls("Forum Mall", 5, 10, 40, 5, 8, 2);
		Malls siddhu=new Malls("Siddhu Mall", 5, 10, 40, 5, 8, 2);
		Malls reddy=new Malls("Reddy Mall", 5, 10, 40, 5, 8, 2);
		Malls sumanth=new Malls("Sumanth Mall ", 5, 10, 40, 5, 8, 2);

		Malls[] malls= {forum,siddhu,reddy,sumanth};
		
		RailwayStation kacheguda = new RailwayStation("Kacheguda", 10, 5, 4, 3, 50, 50);
		RailwayStation secendrabad = new RailwayStation("Secendrabad", 10, 5, 4, 3, 50, 50);
		RailwayStation malakpet = new RailwayStation("Malkpet", 10, 5, 4, 3, 50, 50);
		RailwayStation falaknuma = new RailwayStation("Falaknuma", 10, 5, 4, 3, 50, 50);
 
		 RailwayStation[] railwayStations= {kacheguda,secendrabad,malakpet,falaknuma};
		
		City hyderabad = new City("Hyderabad", 1256465554, 562.324, hsps,ps, colleges,malls, railwayStations);
		 
		System.out.println(hyderabad.hospitals.length);
		System.out.println("Name of the Station is : "+kacheguda.name);
		
		for(int i=0;i<hsps.length;i++) {
			System.out.println(hsps[i].name+"\n"+hsps[i].beds);
			System.out.println("  ");
		}

	}
	
	


}
