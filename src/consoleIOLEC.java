import java.util.Scanner;

public class consoleIOLEC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Hey there, what happening?");

        String input = scanner.next();
        System.out.printf("%s %n", input);

        scanner.next();

        System.out.println("that all?");

        String nextInput = scanner.nextLine();
        System.out.printf("%s", nextInput);


//        scanner.next();
    }
}
