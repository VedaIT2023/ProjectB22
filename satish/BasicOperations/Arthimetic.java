public class Arthimetic{

    public static void main(String[] args){
        int num1, num2, sum, mul, mod, sub;
        float div;
        num1 = 12;
        num2 = 14;
	sum = num1 + num2;
	mul = num1 * num2;
	sub = num1 - num2;
	mod = num1 % num2;
	div = (float)num1 / (float)num2;
	System.out.println("Addition = " + sum);
	System.out.println("Substraction = " + sub);
	System.out.println("Multiplication = " + mul);
	System.out.println("Division = " + div);
	System.out.println("Modulus = " + mod); 
}
}