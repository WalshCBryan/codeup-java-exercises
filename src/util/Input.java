package util;

import org.w3c.dom.ls.LSOutput;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.Scanner;


public class Input {
    double num;
    long longnum;
    private Scanner scanner = new Scanner(System.in);


    public String getString() {
//        System.out.println("Enter a string\n");
        String input = scanner.nextLine();
        return input;
    }

    public boolean yesNo() {
        scanner.nextLine();
        System.out.println("Enter yes/no\n");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("yeah")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Give me a number between %d and %d%n", min, max);
        try {
            int input = Integer.valueOf(getString());

            if (input < min) {
                System.out.println("input is less than miniumum, try again:");
                return getInt(min, max);
            } else if (input > max) {
                System.out.println("input is more than maxiumum, try again:");
                return getInt(min, max);
            }
            return input;
        } catch (Exception e) {
            System.out.println("try a number!");
            return getInt(min, max);
        }
    }


    public int getInt() {
        System.out.println("give me an integer\n");
        int input = Integer.valueOf(getString());
        return input;

    }

    public double getDouble(double min, double max) {
        System.out.printf("Give me a number between %f and %f%n", min, max);
        try {
            double input = Double.valueOf(getString());
            if (input < min) {
                System.out.println("input is less than miniumum, try again:");
                return getDouble(min, max);
            } else if (input > max) {
                System.out.println("input is more than maxiumum, try again:");
                return getDouble(min, max);
            }
            return input;

        } catch (Exception e) {
            System.out.println("try a number");
            return getDouble(min, max);
        }
    }

    public double getDouble() {

        System.out.println("enter a number\n");
        double input = Double.valueOf(getString());
        return input;
    }


    public double getBinary() {
        System.out.println("enter a number\n");
        String input = scanner.nextLine();
        try {
            num = Integer.valueOf(input, 2);
        } catch (Exception e) {
            e.printStackTrace();
            getDouble();
        }
        return num;
    }


    public double getHex() {
        System.out.println("enter a number\n");
        String input = scanner.nextLine();
        try {
            num = Integer.valueOf(input, 2);
        } catch (Exception e) {
            e.printStackTrace();
            getDouble();
        }
        return num;
    }

    public static void main(String[] args) {


    }
}


