public class Conditions {
	
	public static void main(String[] args){

		
		int age = 52;
		
		
		//Arithematic +,-,*,/,%
		//Assignment =, +=, -=, *=, /=, %=, (age += 5)
			
		//Comparison Operators <,>,<=,>=,==,!=
		
		//Conditions : if(statement){Code} , 
		
		//Logical operators &&(only if all the statements are ture) ||(any of the statements are true)

		//15-23 Eligible for Student Fee Scheme	5000
		//24-40 Eligible for Business Fund Scheme 15000
		//41-51 Eligible for Mid Age pension of 2000
		//>51 then Eligible for Old age Pension of 100 	

		if(age >= 15 && age <= 23){	
			System.out.println("Eligible for Student Fee Scheme 5000");
		}

		if(age >= 24 && age <= 40){
			System.out.println("Eligible for Business Fund Scheme 15000");
		}

		if(age >= 41 && age <= 51){
			System.out.println("Eligible for Mid Age pension of 2000");

		}

		if(age > 51){
			System.out.println("Eligible for Mid Age pension of 2000");

		}


		if(age >= 15 && age <= 23){	
			System.out.println("Eligible for Student Fee Scheme 5000");
		}else if(age >= 24 && age <= 40){
			System.out.println("Eligible for Business Fund Scheme 15000");
		}else if(age >= 41 && age <= 51){
			System.out.println("Eligible for Mid Age pension of 2000");

		}else if(age > 51){
			System.out.println("Eligible for Mid Age pension of 2000");
		}
		//if() if() if() if().....
		// if(), else if(), else if(),....
	}
}





