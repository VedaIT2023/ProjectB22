package com.OOPS.polymorphism;

import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String,String> fullforms=new HashMap();
		fullforms.put("ASAP","As Soon as Possible");
		fullforms.put("IMO","In my opinion");
		fullforms.put("DIY","Do-it-yourself");
		fullforms.put("LOL","Laugh out loud");
		fullforms.put("LMK","Let me know");
		fullforms.put("OMW","On my way");
		fullforms.put("BRB","Be right back");
		fullforms.put("OMG","Oh my god");
		fullforms.put("WFH","Work from home");
		fullforms.put("CEO","Chief Executive Officer");
		fullforms.put("AIDS","Acquired Immune Deficiency Syndrome ");
		fullforms.put("AIIMS","All India Institute of Medical Sciences");
		fullforms.put("BSE","Bombay Stock Exchange");
		fullforms.put("CPI","Communist Party of India ");
		fullforms.put("DRAM","Dynamic Random Access Memory ");
		fullforms.put("EMI","Equated Monthly Instalment ");
		fullforms.put("FSSA","Food Safety and Standards Authority (of India)");
		fullforms.put("GST","Goods and Service Tax ");
		fullforms.put("GOOGLE","Global Organisation Of Oriented Group Language of Earth ");
		fullforms.put("GPRS","General Packet Radio System");
		fullforms.put("HTML","HyperText Markup Language");
		fullforms.put("HTTP","Hypertext Transfer Protocol ");
		fullforms.put("IFC","International Finance Corporation");
		fullforms.put("KYC"," Know your customer");
		fullforms.put("LASER","Light Amplification by Stimulated Emission of Radiation ");
		fullforms.put("MRI","Magnetic Resonance Imaging");
		fullforms.put("NSE"," National Stock Exchange ");
		fullforms.put("PTO","Please Turn Over");
		fullforms.put("LTE","Long Term Evalution");
	
	    Scanner SC = new Scanner(System.in);
	    System.out.print("Enter an abbreviation: ");
	    String abbreviation = SC.nextLine().toUpperCase(); 
   
	    String fullForm = fullforms.get(abbreviation);
	        if (fullForm != null) {
	            System.out.println("Full Form: " + fullForm);
	        } else {
	            System.out.println("Abbreviation not found.");
	        }
	    	
	}
	
}
	

	


