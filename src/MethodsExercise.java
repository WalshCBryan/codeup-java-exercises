import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.Random;

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

//        System.out.print("Enter a number between 1 and 10: ");
//        System.out.println("userInput = " + getInteger(1, 10));

//        while (start) {
//            System.out.println("calculateFactorial = " + calculateFactorial());
//            System.out.println("would you like to continue? (y/n)");
//            start = scan.nextLine().equalsIgnoreCase("y");
//        }


//        do {
//            System.out.println("How many sides on your die?");
//            rollDice(getInteger(1, 100));
//
//            System.out.println("would you like to continue? (y/n)");
//        } while (scan.nextLine().equalsIgnoreCase("y"));


        do {
            Random random = new Random();
            int winningNumber = random.nextInt(100) + 1;
            System.out.println("Guess the number 1-100");
            guessGame(getInteger(1, 100), winningNumber);

            System.out.println("would you like to continue? (y/n)");
        } while (scan.nextLine().equalsIgnoreCase("y"));

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

    public static void rollDice(int sides) {
//        create an instance of the random class
        Random random = new Random();
        int random1 = random.nextInt(sides) + 1;
        int random2 = random.nextInt(sides) + 1;
        System.out.println("random1 = " + random1);
        System.out.println("random2 = " + random2);
    }


    public static void guessGame(int firstGuess, int winningNumber ) {

//        guess = Integer.parseInt(scan.nextLine());
        if (firstGuess == winningNumber) {
            System.out.println("Great guess, you won!!");
        } else if (firstGuess < winningNumber) {
            System.out.println("guess higher! try again:");
            guessGame(getInteger(1,100),winningNumber);
        } else {
            System.out.println("guess lower! try again:");
            guessGame(getInteger(1,100),winningNumber);
        }
    }


}
