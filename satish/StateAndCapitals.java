package Satish;
import java.util.Scanner;
public class StateAndCapitals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the State code:");
		String StateCode = sc.nextLine();
		String states[] = {"AndhraPradesh", "Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat",
							"Haryana","Himachal Pradesh","Jammu and Kashmir","Jharkhand","Karnataka","Kerala",
							"Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Orissa",
							"Punjab","Rajasthan","Sikkim","Tamil Nadu","Tripura","Uttarakhand","Uttar Pradesh",
							"West Bengal", "Andaman and Nicobar Islands", "Chandigarh", "Daman and Diu",
							"Dadra and Nagar Haveli", "Delhi", "Lakshadweep","Pondicherry"};

		String stateCodes[] = {"AP", "AR", "AS", "BR", "CG", "GA", "GJ", "HR", "HP","J&K", "JK", "KA", "KL","MP",
							"MH","MN", "MG", "MZ","NL","OR", "PJ","RJ","SK","TN","TR","UK","UP","WB","AN","CH","DD",
							"DH","DL","LK","PD"};
		 boolean found = false;
	        for (int i = 0; i < stateCodes.length; i++) {
	            if (StateCode.equalsIgnoreCase(stateCodes[i])) {
	                System.out.println("State: " + states[i]);
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("State code not found.");
	        }

	        sc.close();

		}
	}

