import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//counts 5-15
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }


//        counts every other 0-100
//        int x = 0;
//        do {
//            System.out.println(x);
//           x += 2;
//        } while (x <= 100);

////counts backward by 5 from 100-(-10)
//        int x = 100;
//        do {
//            System.out.println(x);
//            x -= 5;
//        } while (x >= -10);


//prints square of x so long as this number is less than 1mil
//        important to use long because result would exceed int
//        long x = 2L;
//        do {
//            System.out.println(x);
//            x *= x;
//        } while (x <= 1000000);


        //counts 5-15
//        for(int i = 5; i<= 15; i++) {
//            System.out.println(i);
//        }

//        counts 100-(-10) by 5
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }


        //prints square of x so long as this number is less than 1mil
//        important to use long because result would exceed int
//        for (long i = 2L; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }


//        for(int i = 0; i <= 100; i++){
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
//
        System.out.println("Enter a number");
        int ui = scanner.nextInt();

//        reset scanner
        scanner.nextLine();

        System.out.println("I'm going to give you all the squares and cubes of numbers up to the number you've given. Would you like to continue?\n Enter true/false");
        boolean wantsToContinue = scanner.nextBoolean();

if(wantsToContinue) {
    System.out.println("Here is your table!\nnumber | squared | cubed\n------ | ------- | -----");
    int i = 1;

    while (i <= ui && wantsToContinue) {
        int square = (i * i);
        int cube = (i * i * i);
        System.out.format("%d      | %2d       | %2d\n", i, square, cube);
        i++;
    }
}


//        do {
//            System.out.printf("%d      |%d       |%d      \n", i, i2, i3);
//            i++;
//        } while (i <= ui && wantsToContinue);

//        scanner.nextLine();

        System.out.println("Gimme your grades!!!");
        int grade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Are you sure you want to know??");
        boolean wantsGrade = scanner.nextBoolean();

        if(wantsGrade){
            if(grade <= 100 && grade >= 88){
                System.out.println("A");
            } else if (grade <= 87 && grade >= 80) {
                System.out.println("B");
            } else if (grade <= 79 && grade >= 76) {
                System.out.println("C");
            } else if (grade <= 66 && grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }


//
//        int caseSwitch = 1;
//
//        switch (caseSwitch) {
//            case (grade <= 100 & grade >= 88):
//                System.out.println("Case 1");
//                // Fall through!
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }

    }
}
