public class Function {
	public static void main(String[] args) {
	additionOfTwoNumbers();
	additionOfThreeNumbers(2,4,6);
	additionOfFourNumbers(2,4,6,8);
	subtractionOfTwoNumbers(4,2);
	subtractionOfThreeNumbers(4,2,4);
	subtractionOfFourNumbers(4,2,4,6);
	mulOfTwoNumbers(2,3);
	int mul = mulOfThreeNumbers(2,3,4); 
	System.out.println("multiplicationOfThreeNumbers is :" +mul);
	division();
	float div = divOfThreeNumbers(2,4,4);
	System.out.println("Division Of Three Numbers:" +div);
	float mod = modOfTwoNumbers(2,4);
	System.out.println("Modulus of Two Numbers:" +mod);
	modOfThreeNumbers();
	float mod1 = modOfTwoNumbers();
	System.out.println("Modulus of two Numbers:" + mod1);
	}
	public static void additionOfTwoNumbers() {
	int a = 2;
	int b = 4;
	int add = a + b;
	System.out.println("Addition is :" +add);
	}
	public static void additionOfThreeNumbers(int a,int b,int c) {
	int add = a + b + c;
	System.out.println("Addition is :" +add);
	}
	public static void additionOfFourNumbers(int a,int b,int c,int d) {
	int add = a + b + c + d;
	System.out.println("Addition is :" +add);
	}
	public static void subtractionOfTwoNumbers(int a,int b) {
	int sub = a - b;
	System.out.println("Subtraction is :" +sub);
	}
	public static void subtractionOfThreeNumbers(int a,int b,int c) {
	int sub = a - b - c;
	System.out.println("Subtraction is :" +sub);
	}
	public static void subtractionOfFourNumbers(int a,int b,int c,int d) {
	int sub = a - b - c - d;
	System.out.println("Subtraction is :" +sub);
	}
	public static void mulOfTwoNumbers(int a,int b) {
	int mul = a * b;
	System.out.println("multiplication Of TwoNumbers :" +mul);
	}
	public static int mulOfThreeNumbers(int a,int b,int c) {
	int mul = a * b * c;
	return mul;
	}
	public static void division() {
	int a = 5;
	int b = 3;
	float div = (float)a/b;
	System.out.println("Division Of Two Numbers :" +div);
	}
	public static float divOfThreeNumbers(int a,int b,int c) {
	float div = (float)a / b / c;
	return div;
	}
	public static float modOfTwoNumbers(int a,int b) {
	float mod = (float)a % b;
	return mod;
	}
	public static void modOfThreeNumbers(int a,int b,int c) {
	float mod = (float)(a % b) % c;
	System.out.println("Modulus of Three Numbers:" +mod);
	}
	public static void modOfThreeNumbers() {
	int a = 2; 
	int b = 4;
	int c = 6;
	float mod = (float)(a % b) % c;
	System.out.println("Modulus of Three Numbers:" +mod);
	}
	public static float modOfTwoNumbers() {
	int a = 2;
	int b = 4;
	float mod = (float)(a % b);
	return mod;
	}
}
