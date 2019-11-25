import java.util.Scanner;


public class ConsoleExercises {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f%n", pi);
//
//
//        System.out.println("Enter an integer below");
//        int nextInput = scanner.nextInt();
//
//        System.out.printf("%d \n", nextInput);
//
//        System.out.println("Enter 3 words");
//        String firstInp = scanner.next();
//        String secondInp = scanner.next();
//        String thirdInp = scanner.next();
//
//        System.out.printf("%s %s %s \n",firstInp, secondInp, thirdInp);
////        System.out.println(secondInp);
////        System.out.println(thirdInp);
//
//
////TO RESET Scanner - do this when switching scan types (next, nextLine, nextInt, etc)
//        scanner.nextLine();
//
//        System.out.println("Enter a sentence");
//        String sentence = scanner.nextLine();
//        System.out.printf("You entered : %s \n", sentence);
//
//        //TO RESET Scanner
////        scanner.nextLine();
//
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
//
////        saves strLength and then converts var into integer
//        System.out.println("Enter length of the room");
//        String strLength = scanner.nextLine();
//        float length = Float.parseFloat(strLength);
//
////        parses input directly into int
//        System.out.println("Enter width of the room");
//        float width = Float.parseFloat(scanner.nextLine());
//
//    changing vars from int to float will allow for decimals
//
//       float area = (length * width);
//       float perimeter = ((length * 2) + (width *2));
//       float volume = (area * 8);
//        System.out.printf(" the length is %.2f ft\n", length);
//        System.out.printf(" the width is %.2f ft\n", width);
//        System.out.printf(" the area is %.2f ft\n", area);
//        System.out.printf(" the perimeter is %.2f ft \n", perimeter);
//        System.out.printf(" assuming 8 ft ceilings, the volume is %.2f cuft \n", volume);
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        will continue to scan until new line (return key)
        sc.useDelimiter("\n");

        String str = sc.next();

        System.out.println(str);


    //scan will continue until delimiter is seen
        sc.useDelimiter("-");

        String str2 = sc.next();

        System.out.println(str2);

    }
}

