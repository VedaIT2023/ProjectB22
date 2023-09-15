package com.vedait.City;

public class mall {
	
	String  name,multiplex,location,developer; 
	int totalstores,lifts,gamingcenter,floors,escalotors,foodcourts,time;
	double area;
	
	void time() {
		System.out.println(this.name + " Is Opened");
	}
	
	void escalotors() {
		System.out.println(this.name + " Escalotors are Working");
	}
	
	void movie() {
		System.out.println(this.name + " Movie Started");
	}
	
	void shopes() {
		System.out.println(this.name + " Shopess are Opened");
	}
	

	public void Mall() {
		
		mall oberoi = new mall();
		
		oberoi.name = "Oberoi mall";
		oberoi.location = "Goregon East,Mumbai";
		oberoi.floors = 4;
		oberoi.totalstores = 106;
		oberoi.lifts = 8;
		oberoi.time = 9;
		oberoi.gamingcenter = 1;
		oberoi.multiplex= "PVR ICON";
		
		System.out.println("\nMall Name :" + oberoi.name);
		System.out.println("Mall Location :" + oberoi.location);
		System.out.println("Total floors in mall :" + oberoi.floors);
		System.out.println("Total stores in mall :" + oberoi.totalstores);
		System.out.println("Total lifts in mall:" + oberoi.lifts);
		System.out.println("Opening time:" + oberoi.time + "AM");
		System.out.println("Gaming centers in mall :" + oberoi.gamingcenter);
		System.out.println("Multiplex :" + oberoi.multiplex);
		oberoi.time();
		
		mall infiniti = new mall();
		
		infiniti.name = "Infiniti mall";
		infiniti.location = "Malad,Mumbai";
		infiniti.floors = 4;
		infiniti.totalstores = 220;
		infiniti.escalotors= 8;
		infiniti.foodcourts = 2;
		infiniti.multiplex= "PVR cinemas";
		
		System.out.println("\nMall Name :" + infiniti.name);
		System.out.println("Mall Location :" + infiniti.location);
		System.out.println("Total floors in mall :" + infiniti.floors);
		System.out.println("Total stores in mall :" + infiniti.totalstores);
		System.out.println("Total Escalotors in mall:" + infiniti.escalotors);
		System.out.println("Food courts in in mall :" + infiniti.foodcourts);
		System.out.println("Multiplex :" + infiniti.multiplex);
		infiniti.escalotors();
		
		mall rcity = new mall();
		
		rcity.name = "R city mall";
		rcity.location = "Ghatkopar West,Mumbai";
		rcity.floors = 12;
		rcity.totalstores = 350;
		rcity.developer= "Runwal Group";
		rcity.area = 1.2;
		rcity.multiplex= "INOX Leisure Limited";
		
		System.out.println("\nMall Name :" + rcity.name);
		System.out.println("Mall Location :" + rcity.location);
		System.out.println("Total floors in mall :" + rcity.floors);
		System.out.println("Total stores in mall :" + rcity.totalstores);
		System.out.println("Developer of R city  mall:" + rcity.developer);
		System.out.println("Area of R city mall in  sqr feet :" + rcity.area + "million sqr feet");
		System.out.println("Multiplex :" + rcity.multiplex);
		rcity.movie();
		
		mall phoenix = new mall();
		
		phoenix.name = "Phoenix Palladium mall";
		phoenix.location = "Lower Parel,Mumbai";
		phoenix.floors = 15;
		phoenix.totalstores = 500;
		phoenix.foodcourts= 3;
		phoenix.gamingcenter = 2;
		phoenix.multiplex= "PVR ICON";
		
		System.out.println("\nMall Name :" + phoenix.name);
		System.out.println("Mall Location :" + phoenix.location);
		System.out.println("Total floors in mall :" + phoenix.floors);
		System.out.println("Total stores in mall :" + phoenix.totalstores);
		System.out.println("Food courts in in mall:" + phoenix.foodcourts);
		System.out.println("Gaming centers in mall  :" + phoenix.gamingcenter);
		System.out.println("Multiplex :" + phoenix.multiplex);
		phoenix.shopes();
		phoenix.movie();
	
	}

}
