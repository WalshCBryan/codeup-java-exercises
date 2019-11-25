//package methods;
// remove this first line

public class MethodsLecStudent {

//  METHODS

/*
    TO DO TOGETHER: Write a public static method called orderFood that
    prints the message "I would like fries please."
 */

    public static void orderFood() {
        System.out.println("I would like fries, please");
    }
/*
    TO DO: Create a main method in this class. Use it to call your
    orderFood method. Run the program to see the results.
 */
//AT BOTTOM

/*
    TO DO: Write a public static method called favoriteSong that prints
    your favorite song.
 */

    public static void favoriteSong() {
        System.out.println("row row row, your boat");
    }

/*
    TO DO: Write a public static method called weeksIn that prints
    message saying how many weeks you've been at Codeup.
 */

    public static void weeksIn() {
        System.out.println("10 weeks");
    }

//  METHOD OVERLOADING

/*
    TO DO TOGETHER: Overload your orderFood method. Create a version that
    takes in one String parameter which can replace the item they are
    ordering.
 */

    public static void orderFood(String order) {
        System.out.println("I would like " + order + ", please");
    }

/*
    TO DO: Overload orderFood again. Create a version that takes in two
    parameters: a String replacing the item being ordered, and an int that
    represents how many of the item they would like to order. Display a new
    message using these arguments.
 */

    public static void orderFood(int num, String order) {
        System.out.printf("I would like %d %s, please\n", num, order);
    }


    /*
        TO DO TOGETHER: We'll overload orderFood again. We'll still have two
        parameters in this new version, however they will both be Strings
        representing two different items the customer wants. Let's display a
        new message reflecting the change.
     */
    public static void orderFood(String order1, String order2) {
        System.out.printf("I would like %s and %s, please!\n", order1, order2);
    }

//  RECURSION

//    public static void count(int n) {
//        if (n <= 0) {
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n - 1);
//    }
//
//
//    public static long getPower(int base, int exponent) {
//        if (exponent == 0) {
//            return 1;
//        } else if (exponent == 1) {
//            return base;
//        } else if (exponent == 2) {
//            return base * base;
//        }
//        return base * getPower(base, exponent - 1);
//    }
//
//    5^4 or 5*5*5*5
//
//    return 5 * getpower(5,3)
//        return 5 * getpower (5,2)
//            return 5 * 5;
//                return 5*5*5*5;
//


/*
    BONUS: Take a look at the Fibonacci sequence. Write a
    recursive method that accepts an int argument representing the number
    or results printed out following the Fibonacci sequence.

    For example:

    fibonacci(5) would print -> 0 1 1 2 3
    fibonacci(10) would print -> 0 1 1 2 3 5 8 13 21 34
 */

// HINT: The recursive method should return an int for each number in the series

// HINT: you may need an additional method using a for loop to actually print
// each number. This is the one you'll call in your main()


    public static void main(String[] args) {
//        orderFood();
//        orderFood("a shake");
//        orderFood(17, "Burgers");
//        orderFood("barbecue", "foot massage");
//        favoriteSong();
//        weeksIn();
//        count(5);
//        getPower(5,4);
    }

}