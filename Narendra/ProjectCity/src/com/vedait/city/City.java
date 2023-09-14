package com.vedait.city;
import java.util.*;
public class City {

	String name;
	double area;
	int population;
	BusStand[] busstand;
	Colleges[] college;
	Hospital[] hospital;
	Malls[] mall;
	PoliceStations[] policestation;
	RailwayStation[] railwaystation;
	
	City(String name,double area,int population,BusStand[] bs,
			Colleges[] college,Hospital[] hospital,Malls[] mall,PoliceStations[] policestation,RailwayStation[] railwaystation){
		
		this.name=name;
		
		this.area=area;
		
		this.population=population;
		
		this.busstand=bs;
		
		this.college=college;
		
		this.hospital=hospital;
		
		this.mall=mall;
		
		this.railwaystation=railwaystation;
		
		this.policestation=policestation;
				
	}
	
	
	public void printDetails() {
		System.out.println("City name : " + name);
		System.out.println("City Area : " + area);
		System.out.println("City popupation : " + population);
		System.out.println("-----------------------------------------");
	}
	
	
	
	public void printHospitalDetails() {
        System.out.println("Hospitals in " + name + ":");
        for (Hospital hospital : hospital) {
            System.out.println("Hospital Name: " + hospital.name);
            System.out.println("Location: " + hospital.location);
            System.out.println("Specialties: " + Arrays.toString(hospital.speciality.toArray()));
            System.out.println("Available Branches: " + Arrays.toString(hospital.branches.toArray()));
            System.out.println("Total Beds: " + hospital.beds);
            System.out.println("Total Staff: " + hospital.staff);
            System.out.println("-----------------------------------------");
        }
	}
        
        public void printBusStandDetails() {
            System.out.println("Bus Stands in " + name + ":");
            for (BusStand busStand : busstand) {
                System.out.println("Bus Stand Name: " + busStand.name);
                System.out.println("Location: " + busStand.location);
                System.out.println("Contact Number:: " + busStand.contactInformation);
                System.out.println("Has parking: " + (busStand.parkingAvailable ? "Yes" : "No"));
                System.out.println("Have SecurityMwasures: " + (busStand.securityMeasures ? "Yes" : "No"));
                System.out.println("Contact Number: " + busStand.buses);
                System.out.println("-----------------------------------------");
            }
        }
        
        public void printCollegeDetails() {
            System.out.println("Colleges in " + name + ":");
            for (Colleges college : college) {
                System.out.println("College Name: " + college.name);
                System.out.println("Location: " + college.location);
                System.out.println("Dean: " + college.dean);
                System.out.println("Size of Campus: " + college.campusSize);
                System.out.println("Courses Offered: " + String.join(", ", college.coursesOffered));
                System.out.println("Accreditation: " + college.accreditation);
                System.out.println("Total Faculty: " + college.facultyCount);
                System.out.println("Annual Tuition Fee: " + college.tutionFees);
                System.out.println("-----------------------------------------");
            }
        }
	
        public void printRailwayStationDetails() {
            System.out.println("Railway Stations in " + name + ":");
            for (RailwayStation station : railwaystation) {
                System.out.println("Station Name: " + station.name);
                System.out.println("Location: " + station.location);
                System.out.println("Platforms: " + station.platforms);
                System.out.println("Total Passengers: " + station.currentOccupancy);
                System.out.println("Total Capacity: " + station.capacity);
                System.out.println("Has Parking: " + (station.parking ? "Yes" : "No"));
                System.out.println("Has Canteens: " + (station.canteens ? "Yes" : "No"));
                System.out.println("-----------------------------------------");
            }
        }
        
        public void printPoliceStationDetails() {
            System.out.println("Police Stations in " + name + ":");
            for (PoliceStations policeStation : policestation) {
                System.out.println("Police Station Name: " + policeStation.name);
                System.out.println("Location: " + policeStation.location);
                System.out.println("Number of Officers: " + policeStation.officers);
                System.out.println("Emergency Phone Number: " + policeStation.phoneNumber);
                System.out.println("Number of Police Vehicles: " + policeStation.vehicles);
                System.out.println("Services Offered: " + String.join(", ", policeStation.crimeRecords));
                System.out.println("Availability: " + policeStation.workingHours);
                System.out.println("-----------------------------------------");
            }
        }
        
        public void printMallDetails() {
            System.out.println("Malls in " + name + ":");
            for (Malls mall : mall) {
                System.out.println("Mall Name: " + mall.name);
                System.out.println("Location: " + mall.location);
                System.out.println("Number of Floors: " + mall.numberOfFloors);
                System.out.println("Number of Shops: " + mall.numberOfShops);
                System.out.println("Parking Available: " + (mall.parkingAvailable ? "Yes" : "No"));
                System.out.println("Capacity: " + mall.parkingCapacity);
                System.out.println("Total Area: " + mall.totalArea+"Acres");
                System.out.println("-----------------------------------------");
            }
        }
	

}
