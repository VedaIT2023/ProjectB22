public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int subtract(int a, int b, int c) {
        return a - b - c;
    }
    public static int subtract(int a, int b, int c, int d) {
        return a - b - c - d;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public static int multiply(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
    public static double divide(double a, double b, double c) {
        return a / (b * c);
    }
    public static double divide(double a, double b, double c, double d) {
        return a / (b * c * d);
    }
    public static void main(String[] args) {
        int result1 = add(5, 10);
        int result2 = subtract(20, 7);
        int result3 = multiply(4, 3, 2);
        double result4 = divide(15.0, 3.0);

        System.out.println("Addition Result: " + result1);
        System.out.println("Subtraction Result: " + result2);
        System.out.println("Multiplication Result: " + result3);
        System.out.println("Division Result: " + result4);
    }
}
