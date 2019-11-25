import java.util.Scanner;

public class MethodsExercise {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean start = true;


//        addition(3, 7);
//        subtraction(10, 2);
//        multiplication(12, 3);
//        division(12, 7);
//        division(12, 0);
//        modulus(17, 3);

        System.out.print("Enter a number between 1 and 10: ");
        System.out.println("userInput = " + getInteger(1, 10));

        while (start) {
            System.out.println("calculateFactorial = " + calculateFactorial());
            System.out.println("would you like to continue? (y/n)");
            start = scan.nextLine().equalsIgnoreCase("y");
        }

    }


    public static void addition(int num1, int num2) {
        System.out.println((num1 + num2));

    }

    public static void subtraction(int num1, int num2) {
        System.out.println((num1 - num2));
    }

    public static void multiplication(int num1, int num2) {
        System.out.println((num1 * num2));
    }

    public static void division(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by 0");
        } else System.out.println((num1 / num2));
    }

    public static void modulus(int num1, int num2) {
        System.out.println((num1 % num2));
    }

    public static int getInteger(int min, int max) {
        int input = Integer.parseInt(scan.nextLine());
        if (input < min) {
            System.out.println("input is less than miniumum, try again:");
            return getInteger(min, max);
        } else if (input > max) {
            System.out.println("input is more than maxiumum, try again:");
            return getInteger(min, max);
        }
        return input;
    }

    public static long calculateFactorial() {
        System.out.print("Enter a number between 1 and 10: ");
        int number = getInteger(1, 10);
        long output = 1;
        for (int counter = 1; counter <= number; counter++) {
            output *= counter;

        }
        return output;
    }


}
