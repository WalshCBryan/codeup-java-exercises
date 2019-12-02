package shapes;

import util.Input;
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        boolean wantsToContinue = false;
//        int circleCount = 0;
        Scanner scanner = new Scanner(System.in);



       do {
           double radius = input.getDouble();
           Circle circle1 = new Circle(radius);
        System.out.println("Radius of Circle is " + circle1.getRadius());
           System.out.printf("Area of circle is %.3f%n", circle1.getArea());
           System.out.printf("Circumference of circle is %.3f%n", circle1.getCircumference());
           System.out.println("Do you want to make another circle?");
//         scanner.nextLine();
           wantsToContinue = input.yesNo();
           if (!wantsToContinue) {
               System.out.println("The circle count is " + circle1.showCounter());
           }
//           circleCount++;
       }  while (wantsToContinue);






    }

}


//    Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)