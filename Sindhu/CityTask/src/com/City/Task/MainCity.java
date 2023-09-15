package com.City.Task;

public class MainCity {

	public static void main(String[] args) {
		
		System.out.println("City1 Details : ");
		System.out.println("     ");
		City city1 = new City();
		city1.cityDetails("Hyderabad",1005,9283000,2,2,1,2,1);
		
		System.out.println("     ");
		System.out.println("Malls Details");
		System.out.println("      ");
		System.out.println("Mall1 Details : ");
		Malls hml1 = new Malls();
		hml1.mallDetails("Forum","Miyapur",32,18);
		System.out.println("     ");
		System.out.println("Mall2 Details : ");
		Malls hml2 = new Malls();
		hml2.mallDetails("InOrbit","ECL",42,28);
		
		System.out.println("     ");
		System.out.println("Police Station Details");
		System.out.println("     ");	
		System.out.println("PS1 Details : ");
		PoliceStations hps1 = new PoliceStations();
		hps1.policeStationDetails("JNTU PS",12,6,126);
		System.out.println("     ");
		System.out.println("PS2 Details : ");
		PoliceStations hps2 = new PoliceStations();
		hps2.policeStationDetails("Miyapur PS",24,12,246);
		
		System.out.println("     ");
		System.out.println("Hospitals Details");
		System.out.println("      ");
		System.out.println("Hospital1 Details : ");
		Hospitals hh1 = new Hospitals();
		hh1.hospitalDetails("Apollo",12,38,32,6);
		System.out.println("     ");
		System.out.println("Hospital2 Details : ");
		Hospitals hh2= new Hospitals();
		hh2.hospitalDetails("Yashoda",24,38,23,4);
		
		System.out.println("     ");
		System.out.println("Colleges Details");
		System.out.println("     ");
		System.out.println("College1 Details");
		Colleges hc1 = new Colleges();
		hc1.collegeDetails("JNTU College","Kukatpally",8,24,44);
		System.out.println("     ");
		System.out.println("College2 Details");
		Colleges hc2 = new Colleges();
		hc2.collegeDetails("JNTU College","Osmania",6,26,46);
		System.out.println("     ");
		System.out.println("BusStand Details ");
		System.out.println("     ");
		BusStands hbs = new BusStands();
		hbs.busStandDetails("Miyapur BS","Miyapur cross Road",34,12);
		
		System.out.println("\n\n");
		
		System.out.println("City2 Details : ");
		System.out.println("     ");
		//City 2 Starts
		System.out.println("City2 Details : ");
		City city2 = new City();
		city2.cityDetails("Chennai",426,6407000,3,2,2,1,1);
		
		System.out.println("     ");
		System.out.println("Malls Details");
		System.out.println("     ");
		System.out.println("Mall1 Details : ");
		Malls cml1 = new Malls();
		cml1.mallDetails("VR Mall","Anna Nagar",42,28);
		System.out.println("     ");
		System.out.println("Mall2 Details : ");
		Malls cml2 = new Malls();
		cml2.mallDetails("Pheonix Mall","Gandhi Nagar",62,38);
		System.out.println("     ");
		System.out.println("Police Station Details");
		System.out.println("     ");
		System.out.println("PS1 Details : ");
		PoliceStations cps1 =new PoliceStations();
		cps1.policeStationDetails("F3 PS",26,14,126);
		System.out.println("     ");
		System.out.println("PS2 Details : ");
		PoliceStations cps2 = new PoliceStations();
		cps2.policeStationDetails("F4 PS",32,22,246);
		System.out.println("     ");
		System.out.println("Hospitals Details");
		System.out.println("       ");
		System.out.println("Hospital1 Details : ");
		System.out.println("       ");
		Hospitals ch1 = new Hospitals();
		ch1.hospitalDetails("VS hospital",12,38,32,6);
		System.out.println("     ");
		System.out.println("Hospital2 Details : ");
		System.out.println("      ");
		Hospitals ch2= new Hospitals();
		ch2.hospitalDetails("LifeLine hospital",24,38,23,4);
		System.out.println("     ");
		System.out.println("Colleges Details");
		System.out.println("     ");
		System.out.println("College1 Details");
		Colleges cc1 = new Colleges();
		cc1.collegeDetails("NITTTR College","Kumanya",12,32,64);
		System.out.println("     ");
		System.out.println("College2 Details");
		Colleges cc2 = new Colleges();
		cc2.collegeDetails("Anna College","marinam Inner Ring Road",6,26,46);
		System.out.println("     ");
		System.out.println("BusStand Details ");
		System.out.println("     ");
		BusStands cbs = new BusStands();
		cbs.busStandDetails("CMBT BusStand","Koyambedu",66,2);
		System.out.println("\n\n");
		System.out.println("City3 Details : ");
		System.out.println("    ");
		//City 3  Starts
		City city3 = new City();
		city3.cityDetails("Banglore",741,11644000,2,1,2,1,1);
		System.out.println("\n\n");
		System.out.println("Malls in Banglore");
		
		System.out.println("Mall1 Details : ");
		System.out.println("     ");
		
		Malls bml1 = new Malls();
		bml1.mallDetails("Orion","Subramanya Nagar",26,16);
		
		System.out.println("\n\n");
		System.out.println("Mall2 Details : ");
		System.out.println("     ");
		
		Malls bml2 = new Malls();
		bml2.mallDetails("Garuda","GBL ALTAIR",24,12);
		
		System.out.println("     ");
		System.out.println("Police Station Details");
		
	

	}

}
