package com.package1.phones;
import java.util.*;
public class Watches {
	String name,colour,model;
	char wresistance;
	int price;
	
	 
	public static void main(String args[]) {
		//Scanner sc=new Scanner(System.in);
		 Watches watch1=new Watches("Fossil",12000,'Y',"Rose gold","Digital");
		watch1.Startwatch(watch1);
		watch1.Stopwatch(watch1);
		Watches watch2=new Watches("Fasttrack",15000,'N',"Black","Digital");
		watch2.Startwatch(watch2);
		watch2.Stopwatch(watch2);
		Watches watch3=new Watches("MI",2000,'Y',"Black","SmartWatch");
		watch3.Startwatch(watch3);
		watch3.Stopwatch(watch3);
		
	}	
	    Watches(String name,int price,char wresistance,String colour,String model){
	    	
		this.name=name;
		this.price=price;
		this.wresistance=wresistance;
		this.colour=colour;
		this.model=model;
	    }
		
		void Startwatch(Watches watch1) {
		 
         System.out.println(watch1.name+" is working");
         System.out.println("price of "+watch1.name+"  is "+watch1.price);
         System.out.println("colour of "+watch1.name+" is "+watch1.colour);
         System.out.println("wresistance of "+watch1.name+" is "+watch1.wresistance);
         System.out.println("model of "+watch1.name+"  is "+watch1.model);
		}
		void Stopwatch(Watches watch1) {
		 System.out.println(watch1.name+" is not working");	
		}
        
 }

