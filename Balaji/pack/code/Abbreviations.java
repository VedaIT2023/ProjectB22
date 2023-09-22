package com.pack.code;

import java.util.HashMap;
import java.util.Scanner;

public class Abbreviations {

	public static void main(String[] args) {
		
				Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the Abbreviation: ");
		        String abbreviation = scanner.nextLine().toUpperCase();

		        HashMap<String, String> abbreviations = new HashMap<>();
		        abbreviations.put("ASAP", "As soon as possible");
		        abbreviations.put("IMO", "In my opinion");
		        abbreviations.put("DIY", "Do-it-yourself");
		        abbreviations.put("LOL", "Laugh out loud");
		        abbreviations.put("LMK", "Let me know");
		        abbreviations.put("OMW", "On my way");
		        abbreviations.put("BRB", "Be right back");
		        abbreviations.put("OMG", "Oh my god");
		        abbreviations.put("WFH", "Work from home");
		        abbreviations.put("CEO", "Chief Executive Officer");
		        abbreviations.put("AIDS", "Acquired Immune Deficiency Syndrome");
		        abbreviations.put("AIIMS", "All India Institute of Medical Sciences");
		        abbreviations.put("BSE", "Bombay Stock Exchange");
		        abbreviations.put("CPI", "Communist Party of India");
		        abbreviations.put("DRAM", "Dynamic Random Access Memory");
		        abbreviations.put("EMI", "Equated Monthly Instalment");
		        abbreviations.put("FSSA", "Food Safety and Standards Authority (of India)");
		        abbreviations.put("GST", "Goods and Service Tax");
		        abbreviations.put("GOOGLE", "Global Organisation Of Oriented Group Language of Earth");
		        abbreviations.put("GPRS", "General Packet Radio System");
		        abbreviations.put("HTML", "HyperText Markup Language");
		        abbreviations.put("HTTP", "Hypertext Transfer Protocol");
		        abbreviations.put("IFC", "International Finance Corporation");
		        abbreviations.put("KYC", "Know your customer");
		        abbreviations.put("LASER", "Light Amplification by Stimulated Emission of Radiation");
		        abbreviations.put("MRI", "Magnetic Resonance Imaging");
		        abbreviations.put("NSE", "National Stock Exchange");
		        abbreviations.put("PTO", "Please Turn Over");
		        abbreviations.put("LTE", "Long Term Evolution");
		        abbreviations.put("ASAP", "As soon as possible");
		        abbreviations.put("IMO","In my opinion");
				abbreviations.put("DIY","Do-it-yourself");
				abbreviations.put("LOL","Laugh out loud");
				abbreviations.put("LMK","Let me know");
				abbreviations.put("OMW","On my way");
				abbreviations.put("BRB","Be right back");
				abbreviations.put("OMG","Oh my god");
				abbreviations.put("WFH","Work from home");
				abbreviations.put("CEO","Chief Executive Officer");
				abbreviations.put("AIDS","Acquired Immune Deficiency Syndrome ");
				abbreviations.put("AIIMS","All India Institute of Medical Sciences");
				abbreviations.put("BSE","Bombay Stock Exchange");
				abbreviations.put("CPI","Communist Party of India ");
				abbreviations.put("DRAM","Dynamic Random Access Memory ");
				abbreviations.put("EMI","Equated Monthly Instalment ");
				abbreviations.put("FSSA","Food Safety and Standards Authority (of India)");
				abbreviations.put("GST","Goods and Service Tax ");
				abbreviations.put("USB", "Universal Serial Bus");
				abbreviations.put("PDF", "Portable Document Format");
				abbreviations.put("GPS", "Global Positioning System");
				abbreviations.put("WiFi", "Wireless Fidelity");
				abbreviations.put("CPU", "Central Processing Unit");
				abbreviations.put("RAM", "Random Access Memory");
				abbreviations.put("FBI", "Federal Bureau of Investigation");
				abbreviations.put("NASA", "National Aeronautics and Space Administration");
				abbreviations.put("UNESCO", "United Nations Educational, Scientific and Cultural Organization");
				abbreviations.put("NATO", "North Atlantic Treaty Organization");
				abbreviations.put("GOOGLE","Global Organisation Of Oriented Group Language of Earth ");
				abbreviations.put("GPRS","General Packet Radio System");
				abbreviations.put("HTML","HyperText Markup Language");
				abbreviations.put("HTTP","Hypertext Transfer Protocol ");
				abbreviations.put("IFC","International Finance Corporation");
				abbreviations.put("KYC"," Know your customer");
				abbreviations.put("LASER","Light Amplification by Stimulated Emission of Radiation ");
				abbreviations.put("MRI","Magnetic Resonance Imaging");
				abbreviations.put("NSE"," National Stock Exchange ");
				abbreviations.put("PTO","Please Turn Over");
				abbreviations.put("LTE","Long Term Evalution");
				
		        
		        String fullForm = abbreviations.get(abbreviation);
		        if (fullForm == null) {
		            System.out.println("Abbreviation not found");

		        } else {
		        	System.out.println("Abbreviation: "+abbreviation+"\nFull Form: " + fullForm);


		        }
	}

}
