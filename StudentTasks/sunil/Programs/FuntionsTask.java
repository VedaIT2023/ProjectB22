public class Funtions{
	public static void main(String[] args){
	int sumOf2=additionOf2Numbers(10,32);
	System.out.println("Addition of two Numbers is : " +sumOf2);
	
	int sumOf3 = additionOf3Numbers(10,20,23);
	System.out.println("Addition of Three Numbers is : " +sumOf3);

	int sumOf4 = additionOf4Numbers(10,20,54,62);
	System.out.println("Addition of Four Numbers is : " +sumOf4);

	int mulOf2 = multiplicationOf2Numbers(10,22);
	System.out.println("Multiplication of Two Numbers : " +mulOf2);

	int mulOf3 = multiplicationOf3Numbers(10,22,12);
	System.out.println("Multiplication of Three Numbers : " +mulOf3);

	int mulOf4 = multiplicationOf4Numbers(10,22,12,13);
	System.out.println("Multiplication of Four Numbers : " +mulOf4);

	int subOf2 = subtractionOf2Numbers(50,22);
	System.out.println("subtraction  of Two Numbers : " +subOf2);

	int subOf3 = subtractionOf3Numbers(50,22,10);
	System.out.println("subtraction  of Three Numbers : " +subOf3);

	int subOf4 = subtractionOf4Numbers(50,22,10,5);
	System.out.println("subtraction  of Four Numbers : " +subOf4);
	
	float division = divisionOf2Numbers(20,10);
	System.out.println("Division of Two Numbers is : " +division );

	float modulus = modulusOf2Number(20,11);
	System.out.println("Modulus of Two Numbers is : " +modulus);
}
	public static int additionOf2Numbers(int a, int b){
	int sum = a+b;
	return sum;
	}
	
	public static int additionOf3Numbers(int a,int b, int c){
	int sum = a+b+c;
	return sum;
	}

	public static int additionOf4Numbers(int a,int b,int c,int d){
	int sum = a+b+c+d;
	return sum;
	}

	public static int multiplicationOf2Numbers(int a,int b){
	int mul = a*b;
	return mul;
	} 

	public static int multiplicationOf3Numbers(int a,int b,int c){
	int mul = a*b*c;
	return mul;
	} 

	public static int multiplicationOf4Numbers(int a,int b,int c,int d){
	int mul = a*b*c*d;
	return mul;
	}

	public static int subtractionOf2Numbers(int a,int b){
	int sub = a-b;
	return sub;
	} 

	public static int subtractionOf3Numbers(int a,int b,int c){
	int sub = a-b-c;
	return sub;
	}

	public static int subtractionOf4Numbers(int a,int b,int c,int d){
	int sub = a-b-c-d;
	return sub;
	} 

	public static float divisionOf2Numbers(int a,int b){
	float div = a/b;
	return  div;
	}
	
	public static float modulusOf2Number(int a,int b){
	float mod = a%b;
	return mod;
	}
 }