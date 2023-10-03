package com.City.task;

public class BusStand {
		String name;
		int platforms;
		int buses;
		int drivers;
		int stalls;
		int lights;
		
		  void Busesstart() {
			  System.out.println(this.name +"buses will start at moring 5:am");
		  }
		  void busesstop() {
			  System.out.println(this.name +"buses will stop at night 10:pm");
		  }
		  
		  	BusStand(String name,int platforms,int buses,int drivers,int stalls,int lights){
		  		this.name=name;
		  		this.platforms=platforms;
		  		this.buses=buses;
		  		this.drivers=drivers;
		  		this.stalls=stalls;
		  		this.lights=lights;
		  		
		  	}

}
