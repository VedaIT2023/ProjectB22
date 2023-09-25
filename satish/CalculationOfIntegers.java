package Satish;

public class CalculationOfIntegers {

	
			void addnumbers(int a,int b) {
				System.out.println("The Addition of two numbers : "+(a+b));
			}
			void addnumbers(int a,int b,int c) {
				System.out.println("The Addition of three numbers : "+(a+b+c));
			}
			void addnumbers(int a,int b,int c,int d) {
				System.out.println("The Addition of four numbers : "+(a+b+c+d));
			}
			void addnumbers(int a,int b,int c,int d,int e) {
				System.out.println("The Addition of five numbers : "+(a+b+c+d+e));
			}
			
			
			void subnumbers(int a,int b) {
				System.out.println("The Substraction of two numbers : "+(a-b));
			}
			void subnumbers(int a,int b,int c) {
				System.out.println("The Substraction of three numbers : "+(a-b-c));
			}
			void subnumbers(int a,int b,int c,int d) {
				System.out.println("The Substraction of four numbers : "+(a-b-c-d));
			}
			void subnumbers(int a,int b,int c,int d,int e) {
				System.out.println("The Substraction of five numbers : "+(a-b-c-d-e));
			}
			
			void mulnumbers(int a,int b) {
				System.out.println("The Multiplication of two numbers : "+a*b);
			}
			void mulnumbers(int a,int b,int c) {
				System.out.println("The Multiplication of three numbers : "+a*b*c);
			}
			void mulnumbers(int a,int b,int c,int d) {
				System.out.println("The Multiplication of four numbers : "+a*b*c*d);
			}
			void mulnumbers(int a,int b,int c,int d,int e) {
				System.out.println("The Multiplication of five numbers : "+a*b*c*d*e);
			}
			

			public static void main(String[] args) {
				CalculationOfIntegers calculator = new CalculationOfIntegers();
				calculator.addnumbers(10,30);
				calculator.addnumbers(10,30,60,20);
				System.out.println();
				
				calculator.subnumbers(100,30);
				calculator.subnumbers(100,30,25);
				System.out.println();
				
				calculator.mulnumbers(10,30,25,3,2);
				calculator.mulnumbers(10,3,2);
			}

	}
