package com.vedait.City;

public class Policestation {
	
	String name,location;
	int polices,criminals,jail,jeep;
	
	void jeep() {
		System.out.println(this.name+ " staff uses Jeep to patrolling around the city");
	}
	
	void handcuffs() {
		System.out.println(this.name+" staff uses handcuffs to arest criminals");
	}
	
	void fir() {
		System.out.println(this.name+" staff uses fir to case a file");
	}


	public void PoliceStation() {
	
		Policestation ltMarg=new Policestation();
		
		ltMarg.name=" L T Marge Police Station";
		ltMarg.location="27,R Champsi,Kalbadevi";
		ltMarg.polices=30;
		ltMarg.criminals=60;
		ltMarg.jail=4;
		ltMarg.jeep=5;
		
        System.out.println("\nStation Name :"+ltMarg.name);
        System.out.println("Location:"+ltMarg.location);
        System.out.println("No of Police :"+ltMarg.polices);
        System.out.println("No of Criminals :"+ltMarg.criminals);
        System.out.println("No of Jails :"+ltMarg.jail);
        System.out.println("No of Jeeps :"+ltMarg.jeep);
        ltMarg.jeep();
     
        Policestation dbMarg=new Policestation();
		
		dbMarg.name=" D B Marge Police Station";
		dbMarg.location="397/A,Lamington RdKrishna Kunj";
		dbMarg.polices=50;
		dbMarg.criminals=100;
		dbMarg.jail=10;
		dbMarg.jeep=20;
		
        System.out.println("\nStation Name :"+dbMarg.name);
        System.out.println("Location:"+dbMarg.location);
        System.out.println("No of Police :"+dbMarg.polices);
        System.out.println("No of Criminals :"+dbMarg.criminals);
        System.out.println("No of Jails :"+dbMarg.jail);
        System.out.println("No of Jeeps :"+dbMarg.jeep);
        dbMarg.handcuffs();
        
        Policestation marineDrive=new Policestation();
		
		marineDrive.name=" Marine Drive Police Station";
		marineDrive.location="WRJF+2Vq,Dinshaw Vaccha Road";
		marineDrive.polices=60;
		marineDrive.criminals=70;
		marineDrive.jail=20;
		marineDrive.jeep=30;
		
        System.out.println("\nStation Name :"+marineDrive.name);
        System.out.println("Location:"+marineDrive.location);
        System.out.println("No of Police :"+marineDrive.polices);
        System.out.println("No of Criminals :"+marineDrive.criminals);
        System.out.println("No of Jails :"+marineDrive.jail);
        System.out.println("No of Jeeps :"+marineDrive.jeep);
        marineDrive.fir();
        
        Policestation shahuNagar=new Policestation();
		
		shahuNagar.name=" Shahu Nagar Police Station";
		shahuNagar.location="shahu nagar,Mahim east";
		shahuNagar.polices=70;
		shahuNagar.criminals=50;
		shahuNagar.jail=30;
		shahuNagar.jeep=50;
		
        System.out.println("\nStation Name :"+shahuNagar.name);
        System.out.println("Location:"+shahuNagar.location);
        System.out.println("No of Police :"+shahuNagar.polices);
        System.out.println("No of Criminals :"+shahuNagar.criminals);
        System.out.println("No of Jails :"+shahuNagar.jail);
        System.out.println("No of Jeeps :"+shahuNagar.jeep);
        shahuNagar.jeep();
        shahuNagar.handcuffs();
        shahuNagar.fir();
	}

}
