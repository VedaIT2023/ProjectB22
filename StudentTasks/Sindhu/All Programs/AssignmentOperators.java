public class AssignmentOperators{
	public static void main(String[] args){
		//AssignmentOperators : = , += , -= , *= , /= , %=;
		int age=20;
		age=age+5;
	System.out.println("Age is "+age);
		

		int num1 = 3, num2 = 4 ;
		int addition = num1 + num2;
	System.out.println(addition);
		int num3 = 200, num4 = 150;
		int subtraction= num3 - num4;
	System.out.println(subtraction);
		int multiplication = num3 * num4 * num1 * num2; 
	System.out.println(multiplication);
		double division =(double)num3/(double)num4;  //num3 & num4 r under int so mention double
	System.out.println(division);
		float num5 = 10, num6 = 20;
		float modulus = num5%num6;	//num5 and num6 are already taken as float so num5%num6
	System.out.println(modulus);
		float apples=21,applesEach;     //share apples to 5 students equally
		applesEach=apples/5;
	System.out.println("Each student gets : "+applesEach);
		apples%=5;
	System.out.println("Remaining apples are : "+apples);	
	}
}