package util;

import java.util.Scanner;


public class Input {
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
        int input = Integer.parseInt(scanner.nextLine());
        if (input < min) {
            System.out.println("input is less than miniumum, try again:");
            return getInt(min, max);
        } else if (input > max) {
            System.out.println("input is more than maxiumum, try again:");
            return getInt(min, max);
        }
        return input;
    }



    public int getInt() {
//        System.out.println("give me an integer\n");
        int input = scanner.nextInt();
        return input;

    }

   public double getDouble(double min, double max) {
        System.out.printf("Give me a number between %f and %f%n",min, max);
        double input = Double.parseDouble(scanner.next());
            if (input < min) {
                System.out.println("input is less than miniumum, try again:");
                return getDouble(min, max);
            } else if (input > max) {
                System.out.println("input is more than maxiumum, try again:");
                return getDouble(min, max);
            }
            return input;

    }

    public double getDouble() {
        System.out.println("enter a number\n");
        double input = scanner.nextDouble();
        return input;
    }

}

