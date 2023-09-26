package classproject;
import java.util.Scanner;

public class statenames {





	public static void main(String[] args) {
		
		String stateNames[] = {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", 
								"Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", 
								"Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", 
								"Mizoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", 
								"Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal", "Andaman and Nicobar Islands", 
								"Chandigarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Lakshadweep", 
								"Pondicherry", "Telangana"};
		String codes[] = {"AP", "AR", "AS", "BR", "CG", "GA", "GJ", "HR", "HP", "JK", "JH", "KA", "KL", 
							"MP", "MH", "MN", "ML", "MZ", "NL", "OR", "PB", "RJ", "SK", "TN", "TR", "UK", 
							"UP", "WB", "AN", "CH", "DH", "DD", "DL", "LD", "PY", "Ts"};

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the state code: ");
		String code = scanner.nextLine();
		
		for(int i=0; i<codes.length; i++) {
			if(codes[i].equalsIgnoreCase(code)) {
				System.out.println("State Code: "+code.toUpperCase()+" \nState Name: "+stateNames[i]);
			}
		}

	

}


}
