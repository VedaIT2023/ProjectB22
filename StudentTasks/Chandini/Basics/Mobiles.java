package com.package1.phones;
import java.util.*;
public class Mobiles {
	String name,colour,ram,storage,type;
	int price,version;
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  Mobiles android=new Mobiles();
	  android.colour="Black";
	  android.type="Redme";
	  
	  System.out.println("Properties of android :");
	  System.out.println("Colour of an android :"+android.colour);
	  System.out.println("type of an android : "+android.type);
	  System.out.println("version of an android : "+android.version);
	  
	  Mobiles android1=new Mobiles();
	  android1.name="Samsung";
	  android1.ram="4GB";
	  android1.storage="64GB";
	  
	  System.out.println("Properties of android1 :");
	  System.out.println("price of an android1 :"+android1.name);
	  System.out.println("ram of an android1 :"+android1.ram);
	  System.out.println("storage of an android1 :"+android1.storage);
	  
	  
	  Mobiles android2=new Mobiles();
	  android2.name="Realme";
	  android2.price=16000;
	  
	  System.out.println("Properties of android2 :");
	  System.out.println("name of an android2 :"+android2.name);
	  System.out.println("price of an android2 :"+android2.price);
	  
	  Mobiles iphone=new Mobiles();
	  iphone.colour="White";
	  iphone.name="Iphone";
	  iphone.price=50000;
	  
	  System.out.println("Properties of Iphone :");
	  System.out.println("Colour of Iphone :"+iphone.colour);
	  System.out.println("name of an Iphone :"+iphone.name);
	  System.out.println("price of an Iphone:"+iphone.price);
	 
	  Mobiles iphone1=new Mobiles();
	  iphone1.colour="White";
	  iphone1.name="";
	  iphone1.price=60000;
	  
	  System.out.println("Properties of Iphone1 :");
	  System.out.println("Colour of an Iphone1 :"+iphone1.colour);
	  System.out.println("name of an Iphone1 :"+iphone1.name);
	  System.out.println("price of an Iphone1 :"+iphone1.price);
	 
	  Mobiles iphone2=new Mobiles();
	  iphone2.colour="White";	  
	  iphone2.price=60000;
	  
	  System.out.println("Properties of Iphone2 :");
	  System.out.println("Colour of an Iphone2 :"+iphone2.colour);
	  System.out.println("name of an Iphone2 :"+iphone2.name);
	  System.out.println("price of an Iphone2 :"+iphone2.price);
	  
	 
  }
}
