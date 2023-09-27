package classtype;


public class operators {

	static void addnumbers(int a,int b) {
		System.out.println("The Addition of two numbers : "+(a+b));
	}
	static void addnumbers(int a,int b,int c) {
		System.out.println("The Addition of three numbers : "+(a+b+c));
	}
	static void addnumbers(int a,int b,int c,int d) {
		System.out.println("The Addition of four numbers : "+(a+b+c+d));
	}
	static void addnumbers(int a,int b,int c,int d,int e) {
		System.out.println("The Addition of five numbers : "+(a+b+c+d+e));
	}


	static void subnumbers(int a,int b) {
		System.out.println("The Substraction of two numbers : "+(a-b));
	}
	static void subnumbers(int a,int b,int c) {
		System.out.println("The Substraction of three numbers : "+(a-b-c));
	}
	static void subnumbers(int a,int b,int c,int d) {
		System.out.println("The Substraction of four numbers : "+(a-b-c-d));
	}
	static void subnumbers(int a,int b,int c,int d,int e) {
		System.out.println("The Substraction of five numbers : "+(a-b-c-d-e));
	}

	static void mulnumbers(int a,int b) {
		System.out.println("The Multiplication of two numbers : "+a*b);
	}
	static void mulnumbers(int a,int b,int c) {
		System.out.println("The Multiplication of three numbers : "+a*b*c);
	}
	static void mulnumbers(int a,int b,int c,int d) {
		System.out.println("The Multiplication of four numbers : "+a*b*c*d);
	}
	static void mulnumbers(int a,int b,int c,int d,int e) {
		System.out.println("The Multiplication of five numbers : "+a*b*c*d*e);
	}


	public static void main(String[] args) {
		operators.addnumbers(25,55);
		operators.addnumbers(1,849,90,34);
		System.out.println();

		operators.subnumbers(20,50);
		operators.subnumbers(10,15,89,67);
		System.out.println();

		operators.mulnumbers(17,89,88,45,7);
		operators.mulnumbers(6,15,78,9);
	}

}