package polymorphism;

public class Calculator {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int add(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static int add(int num1, int num2, int num3, int num4, int num5) {
        return num1 + num2 + num3 + num4 + num5;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int subtract(int num1, int num2, int num3) {
        return num1 - num2 - num3;
    }

    public static int subtract(int num1, int num2, int num3, int num4) {
        return num1 - num2 - num3 - num4;
    }

    public static int subtract(int num1, int num2, int num3, int num4, int num5) {
        return num1 - num2 - num3 - num4 - num5;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int multiply(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static int multiply(int num1, int num2, int num3, int num4) {
        return num1 * num2 * num3 * num4;
    }

    public static int multiply(int num1, int num2, int num3, int num4, int num5) {
        return num1 * num2 * num3 * num4 * num5;
    }

    public static void main(String[] args) {
        System.out.println("Addition:");
        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 4));
        System.out.println(add(2, 3, 4, 5));
        System.out.println(add(2, 3, 4, 5, 6));

        System.out.println("Subtraction:");
        System.out.println(subtract(10, 5));
        System.out.println(subtract(20, 5, 3));
        System.out.println(subtract(30, 5, 3, 2));
        System.out.println(subtract(40, 5, 3, 2, 1));

        System.out.println("Multiplication:");
        System.out.println(multiply(2, 3));
        System.out.println(multiply(2, 3, 4));
        System.out.println(multiply(2, 3, 4, 5));
        System.out.println(multiply(2, 3, 4, 5, 6));
    }
}

