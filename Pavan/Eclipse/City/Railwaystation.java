package com.vedait.City;

public class Railwaystation {
	
	String name;
	int ticketCounter,enquiry,platForms,shops,waitingRooms,washRooms,waterTaps,policeStation;
					
	void ticketCounter() {
			System.out.println(this.name+ " ticket counter is Opened");
	}
				
	void enquiry() {
			System.out.println(this.name+  " enquiry counter is closed");
	}
				
	void platForms() {
			System.out.println(this.name + " Some platforms are under Construction");
	}
				
	public void RailwayStation() {
					
		Railwaystation csmTerminus = new Railwaystation();
		
		csmTerminus.name = "Chhatrapati Shivaji Maharaj Terminus";
		csmTerminus.ticketCounter = 5;
		csmTerminus.platForms = 18;
		csmTerminus.shops = 40;
		csmTerminus.waitingRooms = 4;
		csmTerminus.waterTaps = 70;
		csmTerminus.policeStation = 2;
		
		System.out.println("\nName: "+csmTerminus.name);
		System.out.println("Total no.of Ticket Counter: "+csmTerminus.ticketCounter);
		System.out.println("Total no.of PlatForms: "+csmTerminus.platForms);
		System.out.println("Total no.of Shops: "+csmTerminus.shops);
		System.out.println("Total no.of Waiting Rooms: "+csmTerminus.waitingRooms);
		System.out.println("Total no.of Water Taps: "+csmTerminus.waterTaps);
		System.out.println("Police Station: "+csmTerminus.policeStation);
					
		csmTerminus.ticketCounter();
		
		Railwaystation mumbaicentral = new Railwaystation();
		
		mumbaicentral.name = "Mumbai Central";
		mumbaicentral.ticketCounter = 1;
		mumbaicentral.platForms = 15;
		mumbaicentral.shops = 35;
		mumbaicentral.waitingRooms = 4;
		mumbaicentral.waterTaps = 55;
		mumbaicentral.policeStation = 2;
		
		System.out.println("\nName: "+mumbaicentral.name);
		System.out.println("Total no.of Ticket Counter: "+mumbaicentral.ticketCounter);
		System.out.println("Total no.of PlatForms: "+mumbaicentral.platForms);
		System.out.println("Total no.of Shops: "+mumbaicentral.shops);
		System.out.println("Total no.of Waiting Rooms: "+mumbaicentral.waitingRooms);
		System.out.println("Total no.of Water Taps: "+mumbaicentral.waterTaps);
		System.out.println("Police Station: "+mumbaicentral.policeStation);
		mumbaicentral.enquiry();
						
		Railwaystation villeParle = new Railwaystation();
		
		villeParle.name = "Ville Parle";
		villeParle.ticketCounter = 2;
		villeParle.platForms = 12;
		villeParle.shops = 30;
		villeParle.waitingRooms = 4;
		villeParle.washRooms = 10;
		villeParle.waterTaps = 50;
		villeParle.policeStation = 1;
		
		System.out.println("\nName: "+villeParle.name);
		System.out.println("Total no.of Ticket Counter: "+villeParle.ticketCounter);
		System.out.println("Total no.of PlatForms: "+villeParle.platForms);
		System.out.println("Total no.of Shops: "+villeParle.shops);
		System.out.println("Total no.of Waiting Rooms: "+villeParle.waitingRooms);
		System.out.println("Total no.of Wash Rooms: "+villeParle.washRooms);
		System.out.println("Total no.of Water Taps: "+villeParle.waterTaps);
		System.out.println("Police Station: "+villeParle.policeStation);
		villeParle.platForms();							
		
		Railwaystation vikhroli = new Railwaystation();

		vikhroli.name = "Vikhroli";
		vikhroli.ticketCounter = 2;
		vikhroli.platForms = 10;
		vikhroli.shops = 25;
		vikhroli.waitingRooms = 10;
		vikhroli.waterTaps = 40;
		

		System.out.println("\nName: "+vikhroli.name);
		System.out.println("Total no.of Ticket Counter: "+vikhroli.ticketCounter);
		System.out.println("Total no.of PlatForms: "+vikhroli.platForms);
		System.out.println("Total no.of Shops: "+vikhroli.shops);
		System.out.println("Total no.of Waiting Rooms: "+vikhroli.waitingRooms);
		System.out.println("Total no.of Water Taps: "+vikhroli.waterTaps);
		vikhroli.ticketCounter();
		vikhroli.enquiry();								
		vikhroli.platForms();				
						
	}

}
