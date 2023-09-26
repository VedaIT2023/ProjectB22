package com.City.task;

public class Cityplaces { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospitallists();
		PoliceStationlists();
		RailwayStationlists();
		Mallslists();
		BusStandlists();
		Collagelists();
	}
	   public static void Hospitallists() {
		
	     Hospital Yoshoda = new Hospital("yoshoda",120,80,25,15,100);
			System.out.println("Name :" +Yoshoda.name);
			System.out.println("Beds :" +Yoshoda.beds);
			System.out.println("Patients :" +Yoshoda.patients);
			System.out.println("Doctors :" +Yoshoda.doctors);
			System.out.println("Genralwards :" +Yoshoda.genralwards);
			System.out.println("OxygenCylinders :" +Yoshoda.oxygencylinders);
			
			System.out.println(" ");
		
		Hospital care = new Hospital("care",240,140,45,20,120);
			System.out.println("Name :" +care.name);
			System.out.println("Beds :" +care.beds);
			System.out.println("Patients :" +care.patients);
			System.out.println("Doctors :" +care.doctors);
			System.out.println("Genralwards :" +care.genralwards);
			System.out.println("OxygenCylinders :" +care.oxygencylinders);
	
			System.out.println(" ");
			
	   Hospital ramesh = new Hospital("ramesh",160,90,30,18,100);
	        System.out.println("Name :" +ramesh.name);
		    System.out.println("Beds :" +ramesh.beds);
		    System.out.println("Patients :" +ramesh.patients);
		    System.out.println("Doctors :" +ramesh.doctors);
		    System.out.println("Genralwards :" +ramesh.genralwards);
		    System.out.println("OxygenCylinders :" +ramesh.oxygencylinders);
		    
		    System.out.println(" ");
		    
	   Hospital varam = new Hospital("varam",80,30,8,9,35);
	   		System.out.println("Name :" +varam.name);
	   		System.out.println("Beds :" +varam.beds);
	   		System.out.println("Patients :" +varam.patients);
	   		System.out.println("Doctors :" +varam.doctors);
	   		System.out.println("Genralwards :" +varam.genralwards);
	   		System.out.println("OxygenCylinders :" +varam.oxygencylinders);
	
	}
	   
	   public static void PoliceStationlists() {
		   System.out.println(" ");
	    PoliceStation KPHB = new PoliceStation("KPHB",10,4,12,24,"OPP KPHBsignal");
	  		System.out.println("Name :" +KPHB.name);
	  		System.out.println("Lights :" +KPHB.lights);
	  		System.out.println("Cells :" +KPHB.cells);
	  		System.out.println("Fans :" +KPHB.fans);
	  		System.out.println("Officers :" +KPHB.officers);
	  		System.out.println("Address :" +KPHB.address);
	  		
	  		System.out.println(" ");
	  		
	  	PoliceStation Himyatnagar = new PoliceStation("Himyatnagar",10,4,12,24,"Road no:10");
	  		System.out.println("Name :" +Himyatnagar.name);
	  		System.out.println("Lights :" +Himyatnagar.lights);
	  		System.out.println("Cells :" +Himyatnagar.cells);
	  		System.out.println("Fans :" +Himyatnagar.fans);
	  		System.out.println("Officers :" +Himyatnagar.officers);
	  		System.out.println("Address :" +Himyatnagar.address);
	  		
	  		System.out.println(" ");
	  		
	  	PoliceStation Raidurgam = new PoliceStation("Raidurgam",10,4,12,24,"Beside MetroStation");
	  		System.out.println("Name :" +Raidurgam.name);
	  		System.out.println("Lights :" +Raidurgam.lights);
	  		System.out.println("Cells :" +Raidurgam.cells);
	  		System.out.println("Fans :" +Raidurgam.fans);
	  		System.out.println("Officers :" +Raidurgam.officers);
	  		System.out.println("Address :" +Raidurgam.address);
	  		
	  		System.out.println(" ");
	  		
	  	PoliceStation OldCity = new PoliceStation("OldCity",10,4,12,24,"Near Charminar");
	  		System.out.println("Name :" +OldCity.name);
	  		System.out.println("Lights :" +OldCity.lights);
	  		System.out.println("Cells :" +OldCity.cells);
	  		System.out.println("Fans :" +OldCity.fans);
	  		System.out.println("Officers :" +OldCity.officers);
	  		System.out.println("Address :" +OldCity.address);	

	   }
	   
	   public static void RailwayStationlists() {
		      System.out.println(" ");
		  RailwayStation Begumpet = new RailwayStation("Begumpet",4,16,2,40,20);
		    System.out.println("Name :" +Begumpet.name);
	  		System.out.println("Platforms :" +Begumpet.platforms);
	  		System.out.println("Shops :" +Begumpet.shops);
	  		System.out.println("Waitinghalls :" +Begumpet.waitinghalls);
	  		System.out.println("Lights :" +Begumpet.lights);
	  		System.out.println("Fans :" +Begumpet.fans);
	  		
	  		System.out.println(" ");
	  		
	  	 RailwayStation Lingampalli = new RailwayStation("Lingampalli",2,6,2,30,15);
			    System.out.println("Name :" +Lingampalli.name);
		  		System.out.println("Platforms :" +Lingampalli.platforms);
		  		System.out.println("Shops :" +Lingampalli.shops);
		  		System.out.println("Waitinghalls :" +Lingampalli.waitinghalls);
		  		System.out.println("Lights :" +Lingampalli.lights);
		  		System.out.println("Fans :" +Lingampalli.fans);
		  		
		  		System.out.println(" ");
		  		
		 RailwayStation Secunderabad = new RailwayStation("Secunderabad",20,80,18,90,125);
			    System.out.println("Name :" +Secunderabad.name);
		  		System.out.println("Platforms :" +Secunderabad.platforms);
		  		System.out.println("Shops :" +Secunderabad.shops);
		  		System.out.println("Waitinghalls :" +Secunderabad.waitinghalls);
		  		System.out.println("Lights :" +Secunderabad.lights);
		  		System.out.println("Fans :" +Secunderabad.fans);
		  		
		  		System.out.println(" ");
		  		
		 RailwayStation kachiguda = new RailwayStation("kachiguda",10,40,8,60,85);
			  System.out.println("Name :" +kachiguda.name);
			  System.out.println("Platforms :" +kachiguda.platforms);
	   		  System.out.println("Shops :" +kachiguda.shops);
			  System.out.println("Waitinghalls :" +kachiguda.waitinghalls);
			  System.out.println("Lights :" +kachiguda.lights);
			  System.out.println("Fans :" +kachiguda.fans);	
	   }
	   	public static void Mallslists() {
	   			System.out.println(" ");
		 Malls Nexus =new Malls("Nexus",6,60,30,18.4,"KPHB"); 
		 	System.out.println("Name :" +Nexus.name);
		 	System.out.println("Floors :" +Nexus.floors);
		 	System.out.println("Shops :" +Nexus.shops);
		 	System.out.println("Vehicals :" +Nexus.vehicals);
		 	System.out.println("Parkingarea :" +Nexus.parkingarea);
		 	System.out.println("Address :" +Nexus.address);
		 	
		 	System.out.println(" ");
		 	
		 Malls AMB =new Malls("AMB",10,100,80,38.4,"Kondapur"); 
		 	System.out.println("Name :" +AMB.name);
		 	System.out.println("Floors :" +AMB.floors);
		 	System.out.println("Shops :" +AMB.shops);
		 	System.out.println("Vehicals :" +AMB.vehicals);
		 	System.out.println("Parkingarea :" +AMB.parkingarea);
		 	System.out.println("Address :" +AMB.address);	
		 	
		 	System.out.println(" ");
		 	
		 Malls Manjera =new Malls("Manjera",8,70,40,12.4,"Kukatpally"); 
		 	System.out.println("Name :" +Manjera.name);
		 	System.out.println("Floors :" +Manjera.floors);
		 	System.out.println("Shops :" +Manjera.shops);
		 	System.out.println("Vehicals :" +Manjera.vehicals);
		 	System.out.println("Parkingarea :" +Manjera.parkingarea);
		 	System.out.println("Address :" +Manjera.address);
		 	
		 	System.out.println(" ");
		 	
		 Malls Inorbit =new Malls("Inorbit",4,55,120,22.4,"Panjaguta"); 
		 	System.out.println("Name :" +Inorbit.name);
		 	System.out.println("Floors :" +Inorbit.floors);
		 	System.out.println("Shops :" +Inorbit.shops);
		 	System.out.println("Vehicals :" +Inorbit.vehicals);
		 	System.out.println("Parkingarea :" +Inorbit.parkingarea);
		 	System.out.println("Address :" +Inorbit.address);
	   }
	   	public static void BusStandlists() {
	   		  System.out.println(" ");
	   	BusStand MGBS =new BusStand("MGBS",75,155,220,60,160); 
		 	System.out.println("Name :" +MGBS.name);
		 	System.out.println("Platforms :" +MGBS.platforms);
		 	System.out.println("Buses :" +MGBS.buses);
		 	System.out.println("Drivers :" +MGBS.drivers);
		 	System.out.println("Stalls :" +MGBS.stalls);
		 	System.out.println("Lights :" +MGBS.lights);
		 	
		 	System.out.println(" ");
		 	
		BusStand KPHB =new BusStand("KPHB",15,55,120,20,60); 
		 	System.out.println("Name :" +KPHB.name);
		 	System.out.println("Platforms :" +KPHB.platforms);
		 	System.out.println("Buses :" +KPHB.buses);
		 	System.out.println("Drivers :" +KPHB.drivers);
		 	System.out.println("Stalls :" +KPHB.stalls);
		 	System.out.println("Lights :" +KPHB.lights);
		 	
		 	System.out.println(" ");
		 	
	    BusStand Jubliee =new BusStand("Jubliee",10,35,110,16,40); 
		 	System.out.println("Name :" +Jubliee.name);
		 	System.out.println("Platforms :" +Jubliee.platforms);
		 	System.out.println("Buses :" +Jubliee.buses);
		 	System.out.println("Drivers :" +Jubliee.drivers);
		 	System.out.println("Stalls :" +Jubliee.stalls);
		 	System.out.println("Lights :" +Jubliee.lights);
		 	
		 	System.out.println(" ");
		 	
		BusStand Miyapur =new BusStand("Miyapur",20,135,140,22,66); 
		 	System.out.println("Name :" +Miyapur.name);
		 	System.out.println("Platforms :" +Miyapur.platforms);
		 	System.out.println("Buses :" +Miyapur.buses);
		 	System.out.println("Drivers :" +Miyapur.drivers);
		 	System.out.println("Stalls :" +Miyapur.stalls);
		 	System.out.println("Lights :" +Miyapur.lights);
	}
	   	public static void Collagelists() {
	   		  System.out.println(" ");
	   	Collage JNTU =new Collage("JNTU",10,13,110,822,126); 
		 	System.out.println("Name :" +JNTU.name);
		 	System.out.println("Floors :" +JNTU.floors);
		 	System.out.println("Libraries :" +JNTU.libraries);
		 	System.out.println("Classes :" +JNTU.classes);
		 	System.out.println("Students :" +JNTU.students);
		 	System.out.println("Staffmembers :" +JNTU.staffmembers);
		 	
		 	System.out.println(" ");
		 	
		Collage CMR =new Collage("CMR",12,3,80,632,86); 
		 	System.out.println("Name :" +CMR.name);
		 	System.out.println("Floors :" +CMR.floors);
		 	System.out.println("Libraries :" +CMR.libraries);
		 	System.out.println("Classes :" +CMR.classes);
		 	System.out.println("Students :" +CMR.students);
		 	System.out.println("Staffmembers :" +CMR.staffmembers);
		 	
		 	System.out.println(" ");
		 	
		Collage GITAM =new Collage("GITAM",15,8,210,1222,116); 
		 	System.out.println("Name :" +GITAM.name);
		 	System.out.println("Floors :" +GITAM.floors);
		 	System.out.println("Libraries :" +GITAM.libraries);
		 	System.out.println("Classes :" +GITAM.classes);
		 	System.out.println("Students :" +GITAM.students);
		 	System.out.println("Staffmembers :" +GITAM.staffmembers);
		 	
		 	System.out.println(" ");
		 	
	    Collage CBIT =new Collage("CBIT",8,4,69,696,78); 
		 	System.out.println("Name :" +CBIT.name);
		 	System.out.println("Floors :" +CBIT.floors);
		 	System.out.println("Libraries :" +CBIT.libraries);
		 	System.out.println("Classes :" +CBIT.classes);
		 	System.out.println("Students :" +CBIT.students);
		 	System.out.println("Staffmembers :" +CBIT.staffmembers);
	   	}
	   	
}
