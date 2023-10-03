public class PrivateFunction{
	public static void main(String[] args){
	sum();
	int a=12;
	int b=23;
	int c=12;
	int d=54;
	sum(a,b);
	int result = returnSum(a,b);
	System.out.println("Final result is "+ result);
	int resultMul = mult(a,b);
	System.out.println("Multiplication of two numbers is " + resultMul);
	int resultMul1 = mult(c,d);
	System.out.println("Multiplication of two numbers is " + resultMul1);
	int resultSub = sub(a,b);
	System.out.println("Sub of numbebrs is " + resultSub);
	sub();
}
	private static void sum(){
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Sum of "+ a + " and " + b + " is " + c);
}
	private static void sum(int number1 , int number2){
	int answer = number1+number2;
	System.out.println("sum of numbers is " + answer);
	
}
	private static int returnSum(int number1 , int number2){
	int answer = number1+number2;
	return answer;
}
	private static int mult(int num1, int num2){
	int answer = num1*num2;
	return answer;
}	
	private static int sub(int num1, int num2){
	int answer = num1-num2;
	return answer;
	
}
	private static void sub(){
	int num1=12; 
	int num2=23;
	int sub=num2-num1;
	System.out.println("Sub of two numbers is "+sub);
}
}