package stateproject;
import java.util.Scanner;
public class State {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner var=new Scanner(System.in);
		
		System.out.println("Enter State Code:");
		String stateCode=var.nextLine();
		
		 String stateName = getStateName(stateCode);
		 
		 if (stateName != null) {
	            System.out.println("State Name: " + stateName);
	        } else {
	            System.out.println("State code not found.");
	        }
	        
	        
	    }

	    public static String getStateName(String stateCode) {
	        switch (stateCode) {
	            case "AP":
	                return "AndhraPradesh";
	            case "AR":
	                return "ArunachalPradesh";
	            case "AS":
	                return "Assam";
	            case "BR":
	            	return "Bihar";
	            case "CG":
	            	return "Chhattisgarh";
	            case "GA":
	            	return "Goa";
	            case "GJ":
	                return "Gujarat";
	            case "HR":
	                return "Haryana";
	            case "HP":
	                return "Himachal Pradesh";
	            case "JK":
	            	return "Jammu and Kashmir";
	            case "JH":
	            	return "Jharkhand" ; 			
	            case "KA":
	            	return "Karnataka";
	            case "KL":
	                return "Kerala";
	            case "MP":
	                return "Madhya Pradesh";
	            case "MN":
	                return "Manipur";
	            case "MH":
	            	return "Maharashtra";
	            case "ML":
	            	return "Meghalaya";
	            case "MZ":
	            	return "Mizoram";
	            case "NL":
	                return "Nagaland";
	            case "OR":
	                return "Orissa";
	            case "PB":
	                return " Punjab";
	            case "RJ":
	            	return "Rajasthan";
	            case "SK":
	            	return "Sikkim" ; 			
	            case "TN":
	            	return "Tamil Nadu";
	            case "TR":
	            	return "Tripura";
	            case "UK":
	                return " Uttarakhand";
	            case "UP":
	            	return "UttarPradesh";
	            case "WB":
	            	return "West Bengal" ; 			
	            case "TG":
	            	return "Telangana";
	           
	            	
	            default:
	                return null; 
	        }
	    }

}
