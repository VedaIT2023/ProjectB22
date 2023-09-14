package com.vedait.city;
import java.util.List;
public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BusStand MGbusstand = new BusStand("MG Bus station", "Imlibun, Hyderabad", 50, true, true, true,"+91 8000800099" );
		
		
		BusStand KPHBbusstand = new BusStand("KPHB Bus station","KUKATPALLY HOUSING BOARD COLONY,KUKATPALLY Hyderabad",20,
				true, true, true,"+91 8000800098");
		
        BusStand secundrabadbusstand = new BusStand("secundrabad Bus station","secundrabad",60,true, true, true,"+91 8000800097");
		
        
        BusStand miyapurbusstand = new BusStand("miyapur Bus station","Miyapur",30,true, true, true,"+91 8000800096");
		
        BusStand[] bs= {MGbusstand,KPHBbusstand,secundrabadbusstand,miyapurbusstand};
        
        
	
		
		Colleges  jntuh = new Colleges("JNTUH","KPHB","jntu dean",250,List.of("CSE","ECE","EEE","MECH","CIVIL","CHEMICAL"),"NAAC A++",
				300,40000);
		
		
		Colleges  osmania = new Colleges("OSMANIA UNIVERSITY","HYDERABAD","OSMANIA DEAN",350,List.of("BA LLB Hons"),"NAAC A++",
				400,50000);
		
		
		Colleges  nalsar = new Colleges("NALSAR UNIVERSITY OF LAW","HYDERABAD","NALSAR DEAN",250,List.of("CSE","ECE","EEE","MECH","CIVIL","CHEMICAL","ZOOLOGY","MICRPBIOLOGY"),
				"NAAC A++",200,30000);
		
		Colleges  uof = new Colleges("UNIVERSITY OF HYDERABAD","GACHIBOWLI","UOF DEAN",150,List.of("BIO CHEMISTRY","PLANT BIOLOGY","BIOTECHNOLOGY"),
				"NAAC A++",150,50000);
		
		
		
		Colleges[] clg = {jntuh,osmania,nalsar,uof};
		
		
		Hospital apollo = new Hospital("Apollo", "hyderabad", List.of("cardiology","Neurology","orthopedics"), List.of("Jubliee Hills","Secundrabad","Hyderguda")
				,1000, 500);
			
		
		Hospital yashoda = new Hospital("YASHODA","hyderabad",List.of("cardiology","orthopedics"),List.of("somajiguda"),1000,500);
		
		
		Hospital medicover = new Hospital("MEDICOVER","HYDERABAD",List.of("orthopedics"),List.of("cyberabad"),1000,500);

		
		Hospital kiims = new Hospital("KIIMS","SECUNDRABAD",List.of("cardiology"),List.of("Secundrabad"),1000,500);
		
		Hospital[] hsptl= {apollo,yashoda,medicover,kiims};
		
		
		Malls forum = new Malls("FORUM","kphb",4,5,100,true,500);
		
		Malls galleria = new Malls("GALLERIA","PANJAGUTTA",5,6,200,true,800);
		
		Malls inorbit = new Malls("INORBIT","MADHAPUR",5,5,100,true,800); 
		
		Malls manjeera = new Malls("MANJEERA","KPHB",3,3,50,true,200);
		
		Malls [] ml = {forum,galleria,inorbit,manjeera};
		
		
		PoliceStations gachibowliPS = new PoliceStations("GAUCHIBOWLI POLICE STATION", "GAUCHIBOWLI", 20, "100", 3, 
				List.of("theft"), "24/7");
		
		PoliceStations kphbPS = new PoliceStations("KPHB POLICE STATION","KPHB",25,"100",3,List.of("theft","drunk and drive"), "24/7");
		
		
		PoliceStations srnagarPS = new PoliceStations("SR NAGAR POLICE STATION","SR NAGAR",20,"100",3,List.of("theft","drunk and drive"), "24/7");
		
		
		PoliceStations panjaguttaPS = new PoliceStations("PANJAGTTA POLICE STATION","PANJAGUTTA",30,"100",1,List.of("theft"), "24/7");
		
		PoliceStations[] ps = {gachibowliPS,kphbPS,srnagarPS,panjaguttaPS};
		
		
		
		RailwayStation secundrabadRS = new RailwayStation("SECUNDRABAD RAILWAY STATION","SECUNDRABAD",List.of(1,2,3),3000,2000,true,true);
		
		RailwayStation lingampallyRS = new RailwayStation("LINGAMPALLY RAILWAY STATION","LINGAMPALLY",List.of(1,2),3000,2000,true,true);
		
		RailwayStation nampallyRS = new RailwayStation("NAMPALLY RAILWAY STATION","NAMPALLY",List.of(1,2,3,4),3000,2000,true,true);
		
		RailwayStation kachegudaRS = new RailwayStation("KACHEGUDA RAILWAY STATION","KACHEGUDA",List.of(1,2,3),3000,2000,true,true);
		
		RailwayStation[] rs = {secundrabadRS,lingampallyRS,nampallyRS,kachegudaRS};
		
		City hyderabad = new City("Hyderabad", 106243, 1200000, bs , clg, hsptl, ml, ps, rs);
		
		hyderabad.printDetails();
		hyderabad.printBusStandDetails();
		hyderabad.printCollegeDetails();
		hyderabad.printHospitalDetails();
		hyderabad.printMallDetails();
		hyderabad.printPoliceStationDetails();
		hyderabad.printRailwayStationDetails();
		
		
		
		/*
		City visakapatnam = new City();
		
		BusStand rtccomplex = new BusStand();
		
		rtccomplex.name= "RTC COMPLEX";
		rtccomplex.buses=100;
		rtccomplex.contactInformation="+91 9000800099";
		rtccomplex.location="DWARAKA NAGAR, VISAKAPATNAM";
		rtccomplex.parkingAvailable=true;
		rtccomplex.accessibleForDifferentlyAbled=true;
		rtccomplex.securityMeasures=true;
		
		BusStand waltairbusstand = new BusStand();
		
		waltairbusstand.name= "waltair Bus station";
		waltairbusstand.buses=20;
		waltairbusstand.contactInformation="+91 9000800098";
		waltairbusstand.location="waltair, visakapatnam";
		waltairbusstand.parkingAvailable=true;
		waltairbusstand.accessibleForDifferentlyAbled=true;
		waltairbusstand.securityMeasures=true;
		
        BusStand simhachalambusstand = new BusStand();
		
        simhachalambusstand.name= "simhachalam Bus station";
        simhachalambusstand.buses=60;
        simhachalambusstand.contactInformation="+91 9000800097";
        simhachalambusstand.location="simhachalam,visakapatnam";
        simhachalambusstand.parkingAvailable=true;
        simhachalambusstand.accessibleForDifferentlyAbled=true;
        simhachalambusstand.securityMeasures=true;
        
        BusStand endadabusstand = new BusStand();
		
        endadabusstand.name= "endada Bus station";
        endadabusstand.buses=30;
        endadabusstand.contactInformation="+91 9000800096";
        endadabusstand.location="Endada";
        endadabusstand.parkingAvailable=true;
        endadabusstand.accessibleForDifferentlyAbled=true;
        endadabusstand.securityMeasures=true;
		
		
		
        visakapatnam.area=96234;
		
		Colleges  au = new Colleges();
		
		au.name="ANDHRA UNIVERSITY";
		au.coursesOffered=List.of("CSE","ECE","EEE","MECH","CIVIL","CHEMICAL","MARINE");
		au.location="maddilapalem";
		au.campusSize=300;
		au.accreditation="NAAC A++";
		au.dean="AU DEAN";
		au.tuitionFees=54000;
		au.facultyCount=250;
		
		Colleges  gvp = new Colleges();
		
		gvp.name="Gayatri vidya parishad college of engineering";
		gvp.coursesOffered=List.of("CSE","ECE","EEE","MECH","CIVIL","CHEMICAL");
		gvp.location="madhurawada, visakapatnam";
		gvp.campusSize=400;
		gvp.accreditation="NAAC A++";
		gvp.dean="GVP DEAN";
		gvp.tuitionFees=54000;
		gvp.facultyCount=350;
		
		Colleges  anits = new Colleges();
		
		anits.name="ANIL NEERUKONDA INSTITUTE OF TECHNOLOGY AND SCIENCES";
		anits.coursesOffered=List.of("CSE","ECE","EEE","MECH","CIVIL","CHEMICAL","CSM","CSD");
		anits.location="TAGARAPUVALAS, VISAKAPATNAM";
		anits.campusSize=400;
		anits.accreditation="NAAC A++";
		anits.dean="ANITS DEAN";
		anits.tuitionFees=54000;
		anits.facultyCount=350;
		
		Colleges  geetham = new Colleges();
		
		geetham.name="GEETHAM UNIVERSITY";
		geetham.coursesOffered=List.of("CSE","ECE","EEE","MECH","CIVIL","CHEMICAL","CSM","CSD");
		geetham.location="RUSHIKONDA, VISAKAPATNAM";
		geetham.campusSize=400;
		geetham.accreditation="NAAC A++";
		geetham.dean="GEETHAM DEAN";
		geetham.tuitionFees=500000;
		geetham.facultyCount=350;
		
		
		
		Hospital apollovizag = new Hospital();
			
		apollovizag.name="Apollo";
		apollovizag.location="ramnagar";
		apollovizag.speciality=List.of("cardiology","Neurology","orthopedics");
		apollovizag.beds=1000;
		apollovizag.staff=500;
		apollovizag.branches=List.of("Ramnagar");
	  apollovizag.addPatient("K");
		
		Hospital care = new Hospital();
		
		care.name="CARE";
		care.location="waltair";
		care.speciality=List.of("cardiology","orthopedics");
		care.beds=1000;
		care.staff=500;
		care.branches=List.of("waltair");
	  //care.addPatient("K");
		
		Hospital sevenhills = new Hospital();
		
		sevenhills.name="seven hills";
		sevenhills.location="visakapatnam";
		sevenhills.speciality=List.of("cardiology","Neurology");
		sevenhills.beds=1000;
		sevenhills.staff=500;
		sevenhills.branches=List.of("waltair");
	  //sevenhills.addPatient("K");
		
		Hospital amma = new Hospital();
		
		amma.name="AMMA HOSPITALS";
		amma.location="visakapatnam";
		amma.speciality=List.of("cardiology","ortheopedics");
		amma.beds=1000;
		amma.staff=500;
		amma.branches=List.of("visakapatnam");
	  //amma.addPatient("K");
		
		Malls cmr = new Malls();
		
		cmr.name="CMR";
		cmr.location="maddilapalem";
		cmr.numberOfFloors=4;
		cmr.numberOfShops=200;
		cmr.parkingAvailable=true;
		cmr.parkingCapacity=500;
		cmr.totalArea=4; 
		
		Malls chitralaya = new Malls();
		
		chitralaya.name="CHITRALAYA";
		chitralaya.location="JAGADAMBA";
		chitralaya.numberOfFloors=3;
		chitralaya.numberOfShops=200;
		chitralaya.parkingAvailable=true;
		chitralaya.parkingCapacity=800;
		chitralaya.totalArea=5;
		
		Malls vmall = new Malls();
		
		vmall.name="V MALL";
		vmall.location="kailashmetta";
		vmall.numberOfFloors=3;
		vmall.numberOfShops=100;
		vmall.parkingAvailable=true;
		vmall.parkingCapacity=200;
		vmall.totalArea=2; 
		
		Malls relaincecentro = new Malls();
		
		relaincecentro.name="RELIANCE CENTRO";
		relaincecentro.location="town kotha road, visakapatnam";
		relaincecentro.numberOfFloors=3;
		relaincecentro.numberOfShops=50;
		relaincecentro.parkingAvailable=true;
		relaincecentro.parkingCapacity=200;
		relaincecentro.totalArea=2;
		
		PoliceStations dwarakPS = new PoliceStations();
		
		dwarakPS.name="DWARAKA NAGAR POLICE STATION";
		dwarakPS.location="DWARAKA NAGAR";
		dwarakPS.officers=20;
		dwarakPS.vehicles=3;
		dwarakPS.phoneNumber="100";
		dwarakPS.workingHours="24/7";  
		
		PoliceStations bheemliPS = new PoliceStations();
		
		bheemliPS.name="BHEEMLI POLICE STATION";
		bheemliPS.location="BHEEMLI";
		bheemliPS.officers=25;
		bheemliPS.vehicles=3;
		bheemliPS.phoneNumber="100";
		bheemliPS.workingHours="24/7";
		
		PoliceStations MVPPS = new PoliceStations();
		
		MVPPS.name="MVP POLICE STATION";
		MVPPS.location="MVP";
		MVPPS.officers=20;
		MVPPS.vehicles=3;
		MVPPS.phoneNumber="100";
		MVPPS.workingHours="24/7";
		
		PoliceStations GAJUWAKAPS = new PoliceStations();
		
		GAJUWAKAPS.name="GAJUWAKAPS POLICE STATION";
		GAJUWAKAPS.location="GAJUWAKAPS";
		GAJUWAKAPS.officers=30;
		GAJUWAKAPS.vehicles=1;
		GAJUWAKAPS.phoneNumber="100";
		GAJUWAKAPS.workingHours="24/7";
		
		RailwayStation DUVVADARS = new RailwayStation();
		DUVVADARS.name="DUVVADA RAILWAY STATION";
		DUVVADARS.location="DUVVADA";
		DUVVADARS.canteens=true;
		DUVVADARS.capacity=3000;
		DUVVADARS.currentOccupancy=2000;
		DUVVADARS.parking=true;
		DUVVADARS.platforms=List.of(1,2,3);
		
		RailwayStation VISAKAPATNAMRS = new RailwayStation();
		VISAKAPATNAMRS.name="VISAKAPATNAM RAILWAY STATION";
		VISAKAPATNAMRS.location="VISAKAPATNAM";
		VISAKAPATNAMRS.canteens=true;
		VISAKAPATNAMRS.capacity=3000;
		VISAKAPATNAMRS.currentOccupancy=2000;
		VISAKAPATNAMRS.parking=true;
		VISAKAPATNAMRS.platforms=List.of(1,2,3,4,5);
		
		RailwayStation MARRIPALEMRS = new RailwayStation();
		MARRIPALEMRS.name="NAMPALLY RAILWAY STATION";
		MARRIPALEMRS.location="NAMPALLY";
		MARRIPALEMRS.canteens=true;
		MARRIPALEMRS.capacity=3000;
		MARRIPALEMRS.currentOccupancy=2000;
		MARRIPALEMRS.parking=true;
		MARRIPALEMRS.platforms=List.of(1,2,3,4);
		
		RailwayStation SIMHACHALAMRS = new RailwayStation();
		SIMHACHALAMRS.name="SIMHACHALAMRS RAILWAY STATION";
		SIMHACHALAMRS.location="SIMHACHALAMRS";
		SIMHACHALAMRS.canteens=true;
		SIMHACHALAMRS.capacity=3000;
		SIMHACHALAMRS.currentOccupancy=2000;
		SIMHACHALAMRS.parking=true;
		SIMHACHALAMRS.platforms=List.of(1,2,3);*/
		
	}

}
