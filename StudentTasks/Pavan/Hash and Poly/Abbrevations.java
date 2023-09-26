package com.vedait.Hash.Poly;
import java.util.HashMap;
import java.util.Scanner;
public class Abbrevations {

	public static void main(String[] args) {
		
		HashMap<String,String> abbrevations = new HashMap();
		
		abbrevations.put("LOL", "Laugh Out Loud");
		abbrevations.put("OMG", "Oh My God");
		abbrevations.put("IDK", "I Don't Know");
		abbrevations.put("ASAP", "As soon as possible");
		abbrevations.put("B2W", "Back to work");
		abbrevations.put("<3", "Love");
		abbrevations.put("CMB", "Call me back");
		abbrevations.put("CU", "See you'");
		abbrevations.put("HBD", "Happy Birthday");
		abbrevations.put("GD", "Goodbye");
		abbrevations.put("IDK", "I don't know");
		abbrevations.put("PLZ", "Please");
		abbrevations.put("RUOK", "Are you okay ?");
		abbrevations.put("U", "you");
		abbrevations.put("WRU", "Where are you ?");
		abbrevations.put("BCCI", "Board of Control for Cricket in India");
		abbrevations.put("IRCTC", "Indian Railway Catering and Tourism Corporation");
		abbrevations.put("RTO", "Regional Transport Office");
		abbrevations.put("Pax", "The number of people");
		abbrevations.put("ISRO", "India Space Research Organization");
		abbrevations.put("CAA", "Civil Aviation Authority  ");
		abbrevations.put("UPA", "United Progressive Alliance ");
		abbrevations.put("XO", "Hugs and Kisses / Love");
		
		Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter an abbreviation : ");
            
            String abbreviation = scanner.nextLine().toUpperCase(); 
            
            String fullForm = abbrevations.get(abbreviation);
            	if (fullForm != null) {
            		System.out.println("Full form of " + abbreviation + " is: " + fullForm);
            	} else {
            		System.out.println("Abbreviation not found in dictionary.");
            		}
        		}
        }
	}


