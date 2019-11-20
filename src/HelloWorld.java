public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//
//        byte aNumber = 100;
//        short age = 29000 + 100;
//        int secondNumber = age + aNumber;
//        //    int is default, and so can accept operations using bytes and shorts
//        long account = 238765432345334566L;
//        //    L at end is important for longs!
//        float price = 4.50f;
//        //    f at end is important for floats, floats can accept scientific notation
//        double priceWithdiscount = price - 1.0f;
//        double specificDecimal = 5.86754324563786534;
//        //    allows for more specificity after decimal
//        char dollarSign = '$';
//        char gender = 'M';
//        //    char indicates a single character
//        boolean zachIsInTheRoom = (gender == 'M');
//        boolean ferIsInstructor = (true);
//
//
//        final String nameL = "BryGuy";
//// final is similar to const in that vars cannot be redefined
//// nameL = "not BryGuy";
//        System.out.println(nameL);
//
//// binary expression
//        System.out.println("aNumber = " + aNumber);
//
//// binary expression
//        aNumber++;
//        System.out.println("aNumber++;");
//        System.out.println("aNumber now = " + aNumber);
//
//// simulate an HTTP request
//        String ageParameter = "29";
//
//// must establish realAge as byte, then cast as (byte) and parseInt agePArameter
//// important to ensure we are using like data types
//        byte realAge = (byte) (Integer.parseInt(ageParameter) + 1);
//        System.out.println(realAge);
//
////        input from terminal
//        double pi = 3.14159;
//        int almostPi = (int) pi;
//        System.out.println("pi = " + pi);
//        System.out.println("almostPi(pi to int) = " + almostPi);


//        int myFavoriteNumber = 19;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "this is a string";
//        System.out.println(myString);
//
//        float myNumber = 3.14f;
//        System.out.println(myNumber);
//
//        float myNewNumber = 3.14f;


//        this code prints x, then adds 1 before printing x again
//            int x = 5;
//            System.out.println(x++);
//            System.out.println(x);


//        this code adds 1 to x before printing, then prints x again
//            int x = 5;
//            System.out.println(++x);
//            System.out.println(x);

//            class is a restricted word and cannot be used for variables.
//            int class = 3;


//        Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//        	at HelloWorld.main(HelloWorld.java:79)

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;


//        cannot convert string to int
//        Error:(83, 27) java: incompatible types: java.lang.String cannot be converted to int

//        int three = (int) "three";


////       longhand
//       int x = 4;
//       x = x + 5;
////       shorthand
//        int x = 4 + 5;
//        x += 5;
//
////        longhand
//        int x = 3;
//        int y = 4;
//        y = y * x;
////        shorthand
//        int x = 3;
//        int y = 4;
//        y *= x;
//
////        longhand
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
////        shorthand
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;



        int highestNum = 2147483647;
        System.out.println(highestNum+1);

      System.out.println(Integer.MAX_VALUE);

    }

}
