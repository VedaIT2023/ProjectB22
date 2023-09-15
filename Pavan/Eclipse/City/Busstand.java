package com.vedait.City;

public class Busstand {
	String name ;
	int  drivers, passengers, horn, brakes, platforms, buses ;
	char fireextinguishers;
	void conducter() {
		System.out.println(this.name + "conductor give the tickets of respective Station");
	}
	void platforms() {
		System.out.println(this.name + "passengers arrives the platform");
	}

	public static void main(String[] args) {
		
		Busstand secunderabad = new Busstand();
		
		secunderabad.name = "SECUNDERABAD";
		secunderabad.drivers = 300;
		secunderabad.passengers = 3000;
		secunderabad.horn = 1;
		secunderabad.brakes = 1;
		secunderabad.platforms = 50;
		secunderabad.buses = 500;
		secunderabad.fireextinguishers = 'y';
		
		System.out.println("");
		System.out.println("Name of the Bus Station : " + secunderabad.name);
		System.out.println("No of Drivers : " + secunderabad.drivers);
		System.out.println("no of passengers : " + secunderabad.passengers);
		System.out.println("No of horns : " + secunderabad.horn);
		System.out.println("No of brakes : " + secunderabad.brakes);
		System.out.println("No of platforms : " + secunderabad.platforms);
		System.out.println("No of trains : " + secunderabad.buses);
		System.out.println("No of fireextinguishers : " + secunderabad.fireextinguishers);
		secunderabad.conducter();
		secunderabad.platforms();

	}

}
