package com.vedait.City;

public class Hospitals {
	String name,location;
	int spDoctors,totalRooms,icuRooms,operationTheaters,wardsRooms,wards,beds,jrDoctors;
	
	void pharmacy(){
		System.out.println(this.name+ " pharmacy  opens 24/7");
	}
	void opTheaters() {
		System.out.println(this.name+ " op theaters perform operations");
	}
	void ward() {
		System.out.println(this.name+ " wards are opened");
	}

	public void hospital() {
		
		Hospitals ghMumbai = new Hospitals();
		
		ghMumbai.name = "Global Hospitals Mumbai";
		ghMumbai.location = "35,Dr Ernest Borges Rd";
		ghMumbai.icuRooms = 30;
		ghMumbai.wardsRooms = 15;
		ghMumbai.wards = 150;
		ghMumbai.beds = 570;
		ghMumbai.spDoctors = 15;
		ghMumbai.jrDoctors = 20;
		
		System.out.println("\nHospital Name: "+ghMumbai.name);
		System.out.println("Specialist Doctors: "+ghMumbai.spDoctors);
		System.out.println("Junior Doctors: "+ghMumbai.jrDoctors);
		System.out.println("Location: "+ghMumbai.location);
		System.out.println("Total no.of ICUs: "+ghMumbai.icuRooms);
		System.out.println("Total no.of Ward Rooms: "+ghMumbai.wardsRooms);
		System.out.println("Total no.of Wards Beds: "+ghMumbai.wards);
		System.out.println("Total no.of Beds: "+ghMumbai.beds);
		ghMumbai.pharmacy();
		
		Hospitals nssHospital = new Hospitals();
		
		nssHospital.name = "Nanavati Super Specialty Hospital Mumbai";
		nssHospital.location = "S.V.Road,Vile Parle(West)";
		nssHospital.icuRooms = 25;
		nssHospital.wardsRooms = 20;
		nssHospital.operationTheaters = 10;
		nssHospital.wards = 160;
		nssHospital.beds = 500;
		nssHospital.spDoctors = 25;
		nssHospital.jrDoctors = 15;
		
		System.out.println("\nHospital Name: "+nssHospital.name);
		System.out.println("Specialist Doctors: "+nssHospital.spDoctors);
		System.out.println("Junior Doctors: "+nssHospital.jrDoctors);
		System.out.println("Location: "+nssHospital.location);
		System.out.println("total Number of Opertion Theaters : "+nssHospital.operationTheaters);
		System.out.println("Total no.of ICUs: "+nssHospital.icuRooms);
		System.out.println("Total no.of Ward Rooms: "+nssHospital.wardsRooms);
		System.out.println("Total no.of Wards Beds: "+nssHospital.wards);
		System.out.println("Total no.of Beds: "+nssHospital.beds);
		nssHospital.opTheaters();
		
		Hospitals apollo = new Hospitals();
		
		apollo.name = "Apollo Hospital Navi Mumbai";
		apollo.location = "Parsik Hill Road Sector 23";
		apollo.totalRooms = 400;
		apollo.icuRooms = 23;
		apollo.wardsRooms = 35;
		apollo.operationTheaters = 9;
		apollo.wards = 140;
		apollo.beds = 450;
		apollo.spDoctors = 30;
		apollo.jrDoctors = 15;
		
		System.out.println("\nHospital Name: "+apollo.name);
		System.out.println("Specialist Doctors: "+apollo.spDoctors);
		System.out.println("Total Rooms: "+apollo.totalRooms);
		System.out.println("Junior Doctors: "+apollo.jrDoctors);
		System.out.println("Location: "+apollo.location);
		System.out.println("total Number of Opertion Theaters : "+apollo.operationTheaters);
		System.out.println("Total no.of ICUs: "+apollo.icuRooms);
		System.out.println("Total no.of Ward Rooms: "+apollo.wardsRooms);
		System.out.println("Total no.of Wards Beds: "+apollo.wards);
		System.out.println("Total no.of Beds: "+apollo.beds);
		apollo.ward();
		
		Hospitals kokilaben = new Hospitals();
		
		kokilaben.name = "Kokilaben Dhirubhai Ambani Hospital Mumbai";
		kokilaben.location = "Rao Saheb Achutrao Patwardhan Marg";
		kokilaben.totalRooms = 650;
		kokilaben.icuRooms = 45;
		kokilaben.wardsRooms = 40;
		kokilaben.operationTheaters = 19;
		kokilaben.wards = 200;
		kokilaben.beds = 1000;
		kokilaben.spDoctors = 50;
		kokilaben.jrDoctors = 35;
		
		System.out.println("\nHospital Name: "+kokilaben.name);
		System.out.println("Specialist Doctors: "+kokilaben.spDoctors);
		System.out.println("Total Rooms: "+kokilaben.totalRooms);
		System.out.println("Junior Doctors: "+kokilaben.jrDoctors);
		System.out.println("Location: "+kokilaben.location);
		System.out.println("total Number of Opertion Theaters : "+kokilaben.operationTheaters);
		System.out.println("Total no.of ICUs: "+kokilaben.icuRooms);
		System.out.println("Total no.of Ward Rooms: "+kokilaben.wardsRooms);
		System.out.println("Total no.of Wards Beds: "+kokilaben.wards);
		System.out.println("Total no.of Beds: "+kokilaben.beds);
		kokilaben.ward();
		kokilaben.pharmacy();
		kokilaben.opTheaters();
	}

}
