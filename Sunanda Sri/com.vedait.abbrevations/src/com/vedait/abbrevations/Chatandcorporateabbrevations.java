package com.vedait.abbrevations;

import java.util.HashMap;
import java.util.Scanner;

public class Chatandcorporateabbrevations {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        HashMap<String, String> abbrevationsMap = new HashMap<>();
		        
		        abbrevationsMap.put("MMB","Message me back");
		        abbrevationsMap.put("YNT", "Why not?");
		        abbrevationsMap.put("B/W", "Between");
		        abbrevationsMap.put("TC", "Take care");
		        abbrevationsMap.put("MU", "Miss you");
		        abbrevationsMap.put("S2R", "Send to receive");
		        abbrevationsMap.put("HF", "Have fun");
		        abbrevationsMap.put("CTN", "Can’t talk now");
		        abbrevationsMap.put("IAC", "In any case");
		        abbrevationsMap.put("AS", "Age & sex");
		        abbrevationsMap.put("B4", "Before");
		        abbrevationsMap.put("POS", "Parent over shoulder");
		        abbrevationsMap.put("OT", "Off topic");
		        abbrevationsMap.put("FTW", "For the win");
		        abbrevationsMap.put("HW","Homework");
		        abbrevationsMap.put("W8","Wait");
		        abbrevationsMap.put("PC","Personal computer");
		        abbrevationsMap.put("ITT","In this thread");
		        abbrevationsMap.put("RBTL","Read between the lines");
		        abbrevationsMap.put("ETA","Estimated time of arrival");
		        abbrevationsMap.put("BCNU","Be seeing you");
		        abbrevationsMap.put("XOXO","Hugs and kisses");
		        abbrevationsMap.put("AFK","Away from keyboard");
		        abbrevationsMap.put("BB","Bye bye");
		        abbrevationsMap.put("DIY","Do it yourself");
		        abbrevationsMap.put("IDGI","I don’t get it");
		        abbrevationsMap.put("IDC","I don’t care");
		        abbrevationsMap.put("IDK","I don’t know");
		        abbrevationsMap.put("FBO","Facebook official");
		        abbrevationsMap.put("CFY","Calling for you");
		        abbrevationsMap.put("AAMOF","As a matter of fact");
		        abbrevationsMap.put("TYT","Take your time");
		        abbrevationsMap.put("TY","Thank you");
		        abbrevationsMap.put("GG","Good game");
		        abbrevationsMap.put("IRL","In real life");
		        abbrevationsMap.put("W/E","Whatever");
		        abbrevationsMap.put("GJ","Good job");
		        abbrevationsMap.put("HMB","Hit me back");
		        abbrevationsMap.put("POV","Point of view");
		        abbrevationsMap.put("R8","Right");
		        abbrevationsMap.put("BTW","By the way");
		        abbrevationsMap.put("W8AM","Wait a minute");
		        abbrevationsMap.put("SU","Shut up");
		        abbrevationsMap.put("PIC","Picture");
		        abbrevationsMap.put("NC","No comment");
		        abbrevationsMap.put("SEC","Second");
		        abbrevationsMap.put("IMO","In my opinion");
		        abbrevationsMap.put("JK","Just kidding");
		        abbrevationsMap.put("LMK","Let me know");
		        abbrevationsMap.put("KK","Okay cool");
		        abbrevationsMap.put("G2B","Going to bed");
		        abbrevationsMap.put("PPL","People");
		        abbrevationsMap.put("GTG","Got to go");
		        abbrevationsMap.put("NP","No problem");
		        abbrevationsMap.put("RIP","Rest in peace");
		        abbrevationsMap.put("SMH","Shaking my head");
		        abbrevationsMap.put("PLZ","Please");
		        abbrevationsMap.put("RT","Real time");
		        abbrevationsMap.put("DI","Download");
		        abbrevationsMap.put("CYL","Call you later");
		        abbrevationsMap.put("GM","Good morning");
		        abbrevationsMap.put("GR8","Great");
		        abbrevationsMap.put("YOLO","You only live once");
		        abbrevationsMap.put("GN","Good night");
		        abbrevationsMap.put("WD","Well done");
		        abbrevationsMap.put("RE","Regarding");
		        abbrevationsMap.put("SFW","Safe for work");
		        abbrevationsMap.put("NWS","Not work safe");
		        abbrevationsMap.put("BG","Big grin");
		        abbrevationsMap.put("TTYS","Talk to you soon");
       
		        
		        abbrevationsMap.put("CEO", "Chief Executive Officer");
		        abbrevationsMap.put("CFO", "Chief Financial Officer");
		        abbrevationsMap.put("COO", "Chief Operating Officer");
		        abbrevationsMap.put("CTO", "Chief Technology Officer");
		        abbrevationsMap.put("CMO", "Chief Marketing Officer");
		        abbrevationsMap.put("HR", "Human Resources");
		        abbrevationsMap.put("IT", "Information Technology");
		        abbrevationsMap.put("QA", "Quality Assurance");
		        abbrevationsMap.put("PM", "Project Manager");
		        abbrevationsMap.put("B2B", "Business-to-Business");
		        abbrevationsMap.put("B2C", "Business-to-Consumer");
		        abbrevationsMap.put("KPI", "Key Performance Indicator");
		        abbrevationsMap.put("ROI", "Return on Investment");
		        abbrevationsMap.put("CRM", "Customer Relationship Management");
		        abbrevationsMap.put("ERP", "Enterprise Resource Planning");
		        abbrevationsMap.put("M&A", "Mergers and Acquisitions");
		        abbrevationsMap.put("IP", "Intellectual Property");
		        abbrevationsMap.put("SWOT", "Strengths, Weaknesses, Opportunities, Threats");

		        System.out.print("Enter the chat abbreviation: ");
		        String chatAbbreviation = sc.nextLine().toUpperCase();

		        System.out.print("Enter the corporate abbreviation: ");
		        String corporateAbbreviation = sc.nextLine().toUpperCase();

		        String chatFullForm = abbrevationsMap.get(chatAbbreviation);
		        String corporateFullForm = abbrevationsMap.get(corporateAbbreviation);

		        if (chatFullForm != null) {
		            System.out.println("Chat Abbreviation Full Form: " + chatFullForm);
		        } else {
		            System.out.println("Chat Abbreviation not found: " + chatAbbreviation);
		        }

		        if (corporateFullForm != null) {
		            System.out.println("Corporate Abbreviation Full Form: " + corporateFullForm);
		        } else {
		            System.out.println("Corporate Abbreviation not found: " + corporateAbbreviation);
		        }

		        sc.close();
		    }
		}