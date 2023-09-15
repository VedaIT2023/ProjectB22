package com.vedait.City;

public class City {
	String name;
	int population;
	double area;
	
	public void mumbai() {
		City mumbai = new City();
		
		mumbai.name = "MUMBAI";
		mumbai.population = 21;
		mumbai.area = 603.4;
		System.out.println("City Name : " + mumbai.name);
		System.out.println("Total Population : " + mumbai.population + "million");
		System.out.println("Total Area in sqkm : " + mumbai.area + "sqkm" );
	}
	
	public static void main(String[] args) {
		
		City C = new City();
		C.mumbai();
		
		mall M =  new mall();
		M.Mall();
		
		
		Railwaystation N = new Railwaystation();
		N.RailwayStation();
		
		Hospitals V =new Hospitals();
		V.hospital();
		
		Colleges D = new Colleges();
		D.colleges();
		
		Policestation P = new Policestation();
		P.PoliceStation();
		
		
	}

}
