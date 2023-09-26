package com.vedait.City;

public class Colleges {

	
	String name;
	int blocks,classRooms,branches,labs,functionHall,totalstaff,labassisents,seminorHall;
		
	void classRooms() {
		   System.out.println(this.name+" class Rooms are Digital Classes");
	}
	void labs() {
		   System.out.println(this.name +" labs have high expensive equipments");
	}
	void functionHall() {
		   System.out.println(this.name+" Function Hall contains high occapancy");
		    	 
	 }
	void blocks() {
		   System.out.println(this.name+ " contains differnt blocks ");
	 }
		     
	public void colleges() {

		Colleges ict = new Colleges();
	        	
		ict.name ="Institute of Chemical Technology Mumbai";
	    ict.blocks = 5;
	    ict.classRooms = 70;
	    ict.branches = 9;
	    ict.labs = 25;
	    ict.functionHall = 1;
	    ict.totalstaff = 80;
	    ict.labassisents = 10;
	    ict.seminorHall = 2;
	        	
	    System.out.println("\nName :"+ict.name);
	    System.out.println("Total Blocks :"+ ict.blocks);
	    System.out.println("ClassRooms :"+ict.classRooms);
	    System.out.println("Branches :"+ict.branches);
	    System.out.println("Technical Labs :"+ict.labs);
	    System.out.println("Functional Halls :"+ict.functionHall);
	    System.out.println("Total Staff :"+ict.totalstaff);
	    System.out.println("Lab faculty :"+ict.labassisents);
	    System.out.println("Total SeminorHalls :"+ict.seminorHall);
	    ict.classRooms();
				
	    Colleges uom = new Colleges();
    	
		uom.name ="University of Mumbai";
	    uom.blocks = 8;
	    uom.classRooms = 50;
	    uom.branches = 8;
	    uom.labs = 35;
	    uom.functionHall = 1;
	    uom.totalstaff = 70;
	    uom.seminorHall = 2;
	        	
	    System.out.println("\nName :"+uom.name);
	    System.out.println("Total Blocks :"+ uom.blocks);
	    System.out.println("ClassRooms :"+uom.classRooms);
	    System.out.println("Branches :"+uom.branches);
	    System.out.println("Technical Labs :"+uom.labs);
	    System.out.println("Functional Halls :"+uom.functionHall);
	    System.out.println("Total Staff :"+uom.totalstaff);
	    System.out.println("Total SeminorHalls :"+uom.seminorHall);
	    uom.blocks();
	    
	    Colleges tiss = new Colleges();
    	
		tiss.name ="Tata Institute of Social Science Mumbai";
	    tiss.blocks = 7;
	    tiss.classRooms = 70;
	    tiss.branches = 6;
	    tiss.labs = 50;
	    tiss.functionHall = 1;
	    tiss.totalstaff = 80;
	    tiss.seminorHall = 1;
	        	
	    System.out.println("\nName :"+tiss.name);
	    System.out.println("Total Blocks :"+ tiss.blocks);
	    System.out.println("ClassRooms :"+tiss.classRooms);
	    System.out.println("Branches :"+tiss.branches);
	    System.out.println("Technical Labs :"+tiss.labs);
	    System.out.println("Functional Halls :"+tiss.functionHall);
	    System.out.println("Total Staff :"+tiss.totalstaff);
	    System.out.println("Total SeminorHalls :"+tiss.seminorHall);
	    tiss.labs();
	    
	    Colleges amity = new Colleges();
    	
		amity.name ="Amity university Mumbai";
	    amity.blocks = 10;
	    amity.classRooms = 80;
	    amity.branches = 9;
	    amity.labs = 80;
	    amity.functionHall = 2;
	    amity.totalstaff = 200;
	    amity.seminorHall = 4;
	        	
	    System.out.println("\nName :"+amity.name);
	    System.out.println("Total Blocks :"+ amity.blocks);
	    System.out.println("ClassRooms :"+amity.classRooms);
	    System.out.println("Branches :"+amity.branches);
	    System.out.println("Technical Labs :"+amity.labs);
	    System.out.println("Functional Halls :"+amity.functionHall);
	    System.out.println("Total Staff :"+amity.totalstaff);
	    System.out.println("Total SeminorHalls :"+amity.seminorHall);
	    amity.blocks();
	    amity.classRooms();
	    amity.labs();
	    amity.functionHall();
	}

}
