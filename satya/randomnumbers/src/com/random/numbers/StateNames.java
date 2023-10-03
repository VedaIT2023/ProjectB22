package com.random.numbers;

		import java.util.Scanner;

		public class StateNames {
		    public static void main(String[] args) {
		        // Create a Scanner object to read user input
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter a state code
		        System.out.print("Enter a state code: ");
		        String stateCode = scanner.nextLine().toUpperCase(); // Convert input to uppercase

		        // Use a switch statement to map state codes to state names
		        String stateName;

		        switch (stateCode) {
		            case "AL":
		                stateName = "Alabama";
		                break;
		            case "AK":
		                stateName = "Alaska";
		                break;
		            case "AZ":
		                stateName = "Arizona";
		                break;
		            // Add more cases for other states here...
		            default:
		                stateName = "Unknown"; // Default case for unknown state codes
		        }

		        // Print the result
		        System.out.println("State name: " + stateName);

		        // Close the scanner
		        scanner.close();
		    }
		}

	


