package com.vedait.city;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		City Hyderabad = new City();
		
		Hospital kims = new Hospital();
		kims.address = "Secunderabad ";
		kims.bed = 5000;
		kims.doctors = 500;
		kims.lights = 7000;
		kims.name = "KIMS";
		kims.nurse =1000;
		
		Hospital yashoda = new Hospital();
		yashoda.address = "Hi TechCity ";
		yashoda.bed = 2000;
		yashoda.doctors = 400;
		yashoda.lights = 3000;
		yashoda.name = "Yashoda";
		yashoda.nurse =750;
		
		
		Hospital care = new Hospital();
		care.address = "Banjara Hills ";
		care.bed = 3000;
		care.doctors = 600;
		care.lights = 2000;
		care.name = "Care";
		care.nurse =900;
		
		Hospital star = new Hospital();
		star.address = "nanakramguda ";
		star.bed = 4000;
		star.doctors = 700;
		star.lights = 1500;
		star.name = "Star";
		star.nurse =700;
		
		
		 
		
		RailwayStation ligampally = new RailwayStation();
		ligampally.address = "Ligampally";
		ligampally.fans = 100;
		ligampally.lights =200;
		ligampally.platforms= 10;
		ligampally.name = "Ligampally railyaway station";
		ligampally.waitinglisthalls = 8;
		
		RailwayStation begumpet = new RailwayStation();
		begumpet.address = "Begumpet";
		begumpet.fans = 50;
		begumpet.lights =100;
		begumpet.platforms= 5;
		begumpet.name = "Greenland flyover,begumpet";
		begumpet.waitinglisthalls = 6;
		
		
		
		RailwayStation kazipet = new RailwayStation();
		kazipet.address = "Kazipet";
		kazipet.fans = 50;
		kazipet.lights =60;
		kazipet.platforms= 5;
		kazipet.name = "Kazipet railyaway station";
		kazipet.waitinglisthalls = 5;
		
		RailwayStation kachiguda = new RailwayStation();
		kachiguda.address = "Kachiguda";
		kachiguda.fans = 60;
		kachiguda.lights =80;
		kachiguda.platforms= 5;
		kachiguda.name = "Kachiguda railway station";
		kachiguda.waitinglisthalls = 4;
		
		
		Mall atriumMall = new Mall();
		atriumMall.lifts = 2;
		atriumMall.lights = 100;
		atriumMall.name ="Atrium Malll";
		atriumMall.people = 2000;
		atriumMall.workers = 300;
		
		Mall manjeeraMall = new Mall();
		manjeeraMall.lifts = 3;
		manjeeraMall.lights = 80;
		manjeeraMall.name ="Manjeera Mall";
		manjeeraMall.people = 3000;
		manjeeraMall.workers = 400;
		
		Mall podiumMall = new Mall();
		podiumMall.lifts = 2;
		podiumMall.lights = 100;
		podiumMall.name ="Podium Mall";
		podiumMall.people = 1000;
		podiumMall.workers = 200;
		
		Mall hyderabadCentral= new Mall();
		hyderabadCentral.lifts = 4;
		hyderabadCentral.lights = 300;
		hyderabadCentral.name ="Hyderabad Central";
		hyderabadCentral.people = 3500;
		hyderabadCentral.workers = 400;
		
		
		PoliceStation miyapur = new PoliceStation();
		miyapur.address = "Miyapur";
		miyapur.name = "Miyapur Police Station";
		miyapur.noofpolice = 40;
		miyapur.lights = 10;
		miyapur.fans = 20;
		
		
		PoliceStation panjagutta = new PoliceStation();
		panjagutta.address = "Miyapur";
		panjagutta.name = "Miyapur Police Station";
		panjagutta.noofpolice = 40;
		panjagutta.lights = 10;
		panjagutta.fans = 20;

		
		PoliceStation gachibowli = new PoliceStation();
		gachibowli.address = "Miyapur";
		gachibowli.name = "Miyapur Police Station";
		gachibowli.noofpolice = 40;
		gachibowli.lights = 10;
		gachibowli.fans = 20;

		PoliceStation saifabad = new PoliceStation();
		saifabad.address = "Miyapur";
		saifabad.name = "Miyapur Police Station";
		saifabad.noofpolice = 40;
		saifabad.lights = 10;
		saifabad.fans = 20;

		
		BusStation kphb = new BusStation();
		kphb.name ="KPHB BUS STAND";
		kphb.address = "KPHB metro";
		kphb.noofbuses = 600;
		kphb.noofconductors = 1000;
		kphb.lights = 20;
		kphb.fans = 10;
		
		
		BusStation ameerpet = new BusStation();
		ameerpet.name ="Ameerpet BUS STAND";
		ameerpet.address = "Ameerpet";
		ameerpet.noofbuses = 800;
		ameerpet.noofconductors = 1500;
		ameerpet.lights = 50;
		ameerpet.fans = 40;
		
		
		BusStation jubilee  = new BusStation();
		jubilee.name ="Jubilee BUS STAND";
		jubilee.address = "Jubilee";
		jubilee.noofbuses = 800;
		jubilee.noofconductors = 1500;
		jubilee.lights = 50;
		jubilee.fans = 40;
		
		
		BusStation madhapur  = new BusStation();
		madhapur.name ="Madhapur BUS STAND";
		madhapur.address = "Madhapur";
		madhapur.noofbuses = 800;
		madhapur.noofconductors = 1500;
		madhapur.lights = 50;
		madhapur.fans = 40;
		
		
		Hyderabad.area = 290500;
		Hyderabad.hospital = kims;
		Hyderabad.mall = manjeeraMall;
		Hyderabad.railwayStation = ligampally;
		
		
		System.out.println("address of hospital:"+kims.address);
		System.out.println("No of beds in hospital:"+kims.bed);
		System.out.println("No of doctors:" +kims.doctors);
		System.out.println("No of lights:"+kims.lights );
		System.out.println("Name of the hospital:"+kims.name);
		System.out.println("no of nurse:"+kims.nurse);
		System.out.println(" ");
		System.out.println("address of hospital:"+yashoda.address);
		System.out.println("No of beds in hospital:"+yashoda.bed);
		System.out.println("No of doctors:" +yashoda.doctors);
		System.out.println("No of lights:"+yashoda.lights );
		System.out.println("Name of the hospital:"+yashoda.name);
		System.out.println("no of nurse:"+yashoda.nurse);
		System.out.println(" ");
		System.out.println("address of hospital:"+care.address);
		System.out.println("No of beds in hospital:"+care.bed);
		System.out.println("No of doctors:" +care.doctors);
		System.out.println("No of lights:"+care.lights );
		System.out.println("Name of the hospital:"+care.name);
		System.out.println("no of nurse:"+care.nurse);
		System.out.println(" ");
		System.out.println("address of hospital:"+star.address);
		System.out.println("No of beds in hospital:"+star.bed);
		System.out.println("No of doctors:" +star.doctors);
		System.out.println("No of lights:"+star.lights );
		System.out.println("Name of the hospital:"+star.name);
		System.out.println("no of nurse:"+star.nurse);
		
		System.out.println(" ");
		
		System.out.println("Name of the mall:"+atriumMall.name);
		System.out.println("No of lifts:"+atriumMall.lifts );
		System.out.println("No of fans:"+atriumMall.lights );
		System.out.println("No of lights:"+atriumMall.people  );
		System.out.println("No of workers:"+atriumMall.workers );
		System.out.println(" ");
		System.out.println("Name of the mall:"+hyderabadCentral.name);
		System.out.println("No of lifts:"+hyderabadCentral.lifts );
		System.out.println("No of fans:"+hyderabadCentral.lights );
		System.out.println("No of lights:"+hyderabadCentral.people  );
		System.out.println("No of workers:"+hyderabadCentral.workers );
		System.out.println(" ");
		System.out.println("Name of the mall:"+podiumMall.name);
		System.out.println("No of lifts:"+podiumMall.lifts );
		System.out.println("No of fans:"+podiumMall.lights );
		System.out.println("No of lights:"+podiumMall.people  );
		System.out.println("No of workers:"+podiumMall.workers );
		System.out.println(" ");
		System.out.println("Name of the mall:"+manjeeraMall.name);
		System.out.println("No of lifts:"+manjeeraMall.lifts );
		System.out.println("No of fans:"+manjeeraMall.lights );
		System.out.println("No of lights:"+manjeeraMall.people  );
		System.out.println("No of workers:"+manjeeraMall.workers );
		System.out.println(" ");
		
	
		System.out.println("Address of railwaystation:"+ligampally.address);
		System.out.println("No of fans:"+ligampally.fans);
		System.out.println("No of lights:"+ligampally.lights );
		System.out.println("No of platforms:"+ligampally.platforms);
		System.out.println("No of name:"+ligampally.name);
		System.out.println("No of waitinghall:"+ligampally.waitinglisthalls);
		System.out.println(" ");
		
		System.out.println("Address of railwaystation:"+begumpet.address);
		System.out.println("No of fans:"+begumpet.fans);
		System.out.println("No of lights:"+begumpet.lights );
		System.out.println("No of platforms:"+begumpet.platforms);
		System.out.println("No of name:"+begumpet.name);
		System.out.println("No of waitinghall:"+begumpet.waitinglisthalls);
		System.out.println(" ");
		
		System.out.println("Address of railwaystation:"+kazipet.address);
		System.out.println("No of fans:"+kazipet.fans);
		System.out.println("No of lights:"+kazipet.lights );
		System.out.println("No of platforms:"+kazipet.platforms);
		System.out.println("No of name:"+kazipet.name);
		System.out.println("No of waitinghall:"+kazipet.waitinglisthalls);
		System.out.println(" ");
		
		System.out.println("Address of railwaystation:"+kachiguda.address);
		System.out.println("No of fans:"+kachiguda.fans);
		System.out.println("No of lights:"+kachiguda.lights );
		System.out.println("No of platforms:"+kachiguda.platforms);
		System.out.println("No of name:"+kachiguda.name);
		System.out.println("No of waitinghall:"+kachiguda.waitinglisthalls);
		System.out.println(" ");

		
		System.out.println("Address of the policestation:"+miyapur.address);
		System.out.println("Name of the policestation:"+miyapur.name);
		System.out.println("No of lights in policestation:"+miyapur.lights);
		System.out.println("No of fans in policestation:"+miyapur.fans);
		System.out.println("no of police :"+miyapur.noofpolice);
		System.out.println(" ");
		
		System.out.println("Address of the policestation:"+gachibowli.address);
		System.out.println("Name of the policestation:"+gachibowli.name);
		System.out.println("No of lights in policestation:"+gachibowli.lights);
		System.out.println("No of fans in policestation:"+gachibowli.fans);
		System.out.println("no of police :"+gachibowli.noofpolice);
		System.out.println(" ");
		
		System.out.println("Address of the policestation:"+saifabad.address);
		System.out.println("Name of the policestation:"+saifabad.name);
		System.out.println("No of lights in policestation:"+saifabad.lights);
		System.out.println("No of fans in policestation:"+saifabad.fans);
		System.out.println("no of police :"+saifabad.noofpolice);
		System.out.println(" ");
		
		System.out.println("Address of the policestation:"+panjagutta.address);
		System.out.println("Name of the policestation:"+panjagutta.name);
		System.out.println("No of lights in policestation:"+panjagutta.lights);
		System.out.println("No of fans in policestation:"+panjagutta.fans);
		System.out.println("no of police :"+panjagutta.noofpolice);
		System.out.println(" ");
		
		
		System.out.println("Address of the BusStation:"+kphb.address);
		System.out.println("Name of the BusStation:"+kphb.name);
		System.out.println("No of buses:"+kphb.noofbuses);
		System.out.println("No of buses:"+kphb.noofconductors);
		System.out.println("No of fans:"+kphb.fans);
		System.out.println("No of lights:"+kphb.lights);
		
		
		System.out.println(" ");
		
		
		System.out.println("Address of the BusStation:"+ameerpet.address);
		System.out.println("Name of the BusStation:"+ameerpet.name);
		System.out.println("No of buses:"+ameerpet.noofbuses);
		System.out.println("No of buses:"+ameerpet.noofconductors);
		System.out.println("No of fans:"+ameerpet.fans);
		System.out.println("No of lights:"+ameerpet.lights);
		
		
		System.out.println(" ");
		
		
		System.out.println("Address of the BusStation:"+jubilee.address);
		System.out.println("Name of the BusStation:"+jubilee.name);
		System.out.println("No of buses:"+jubilee.noofbuses);
		System.out.println("No of buses:"+jubilee.noofconductors);
		System.out.println("No of fans:"+jubilee.fans);
		System.out.println("No of lights:"+jubilee.lights);
		
		System.out.println(" ");
		
		System.out.println("Address of the BusStation:"+madhapur.address);
		System.out.println("Name of the BusStation:"+madhapur.name);
		System.out.println("No of buses:"+madhapur.noofbuses);
		System.out.println("No of buses:"+madhapur.noofconductors);
		System.out.println("No of fans:"+madhapur.fans);
		System.out.println("No of lights:"+madhapur.lights);
		
		System.out.println(" ");
		
		System.out.println(Hyderabad.area);
		System.out.println(Hyderabad.mall);
		System.out.println(Hyderabad.railwayStation);
		System.out.println(Hyderabad.hospital);
		
		
	}

}
