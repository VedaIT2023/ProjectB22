public class Fun {
    public static void main(String[] args) {
        addTwoNumbers();

	addThreeNumbers();

	int sum = addFourNumbers(10,20,30,40);
	System.out.println("Addition of four numbers is : " + sum);
	
	subTwoNumbers(5,2);

	int sub = subThreeNumbers();
	System.out.println("Substrction of three numbers is : " + sub);

	int sub1 = subFourNumbers(40,50,10,23);
	System.out.println("Substrction of four numbers is : " + sub1);
	
	mulofTwoNumbers();

	int mul = mulofThreeNumbers(2,3,4);
	System.out.println("Multiplication  of three numbers is : " + mul);

	mulofFourNumbers(5,6,7,8);

	float div = divofTwoNumbers(10,5);
	System.out.println("Division  of two numbers is : " + div);

	double div1 = divofThreeNumbers();
	System.out.println("Division  of three numbers is : " + div1);

	float mod = modofTwoNumbers(35,10);
	System.out.println("Modules  of two numbers is : " + mod);

	modofThreeNumbers(2,4,6);	

    }
	public static void addTwoNumbers() {
		int a = 10, b = 13;
		int sum = a + b;
        System.out.println("Addition of two numbers is : " + sum);
    }
	public static int addThreeNumbers(){
		int a = 13, b = 20, c = 10;
		int sum = a + b + c;
		System.out.println("Addition of three numbers is : " + sum);
	return sum; 
    }
	public static int addFourNumbers(int a,int b, int c, int d){
		int sum = a + b + c + d;
	 return sum;	   
    }
	public static void subTwoNumbers(int a,int b){
		int sub = a - b;
		System.out.println("Substrction of two numbers is : " + sub);
    }
	public static int subThreeNumbers(){
		int a = 10, b = 20, c =30;
		int sub  = a - b - c;
	return sub;
    }
	public static int subFourNumbers(int a, int b,int c,int d){
		int sub = a - b - c - d;
	return sub;
    }
    	public static void mulofTwoNumbers(){
		int a = 5, b = 10;
		int mul = a * b;
		System.out.println("Multiplication  of two numbers is : " + mul);
    }
	public static int mulofThreeNumbers(int a, int b, int c){
		int mul = a * b * c;
	return mul; 
    } 
	public static void mulofFourNumbers(int a,int b,int c,int d){
		int mul = a * b * c * d;
		System.out.println("Multiplication  of Four numbers is : " + mul);	
    }
	public static float divofTwoNumbers(int a,int b){
		float  div = (float)a/b;
	return  div;
    }
	public static double divofThreeNumbers(){
		int a = 10, b = 20, c = 10;
		double div = ((float)a/b)/c;
	return div;
    }
	public static float modofTwoNumbers(int a,int b){
		float mod = (float)a%b;
	return mod;
    }
	public static void modofThreeNumbers(int a,int b,int c){
		double mod1 = (float)a%b%c; 
	System.out.println("Modules  of three numbers is : " + mod1);
    }
}
