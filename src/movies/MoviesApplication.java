package movies;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;
import util.Input;


public class MoviesApplication {

//    String[] MoviesArray;


    public static void main(String[] args) {
        Input input = new Input();

        Scanner scanner = new Scanner(System.in);


        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - view movies in the musical category\n" +
                "7 - view movies in the comedy category\n" +
                "8 - Add a Movie\n" +
                "\n" +
                "Enter your choice:");
        int selection = input.getInt();

        Movie[] newMoviesArray = MoviesArray.findAll();

        boolean wantsToContinue = true;

        while (wantsToContinue) {
            if (selection == 1) {
                System.out.println("Showing all movies");
                for (Movie movie : newMoviesArray) {
                    System.out.printf("%s ... a %s%n", movie.getName(), movie.getCategory());
                }
            } else if (selection == 2) {
                System.out.println("Showing all animated movies");
                System.out.println("~~~~~~~~~~~~");
                for (Movie movie : newMoviesArray) {
                    if (movie.getCategory().equalsIgnoreCase("animated")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 3) {
                System.out.println("Showing all drama movies");
                for (Movie movie : newMoviesArray) {
                    if (movie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 4) {
                System.out.println("Showing all horror movies");
                System.out.println("~~~~~~~~~~~~");
                for (Movie movie : newMoviesArray) {
                    if (movie.getCategory().equalsIgnoreCase("horror")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 5) {
                System.out.println("Showing all sci-fi movies");
                System.out.println("~~~~~~~~~~~~");
                for (Movie movie : newMoviesArray) {
                    if (movie.getCategory().equalsIgnoreCase("scifi")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 6) {
                System.out.println("Showing all musicals");
                System.out.println("~~~~~~~~~~~~");
                for (Movie movie : newMoviesArray) {
                    if (movie.getCategory().equalsIgnoreCase("musical")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 7) {
                System.out.println("Showing all comedies");
                System.out.println("~~~~~~~~~~~~");
                for (Movie movie : newMoviesArray) {
                    if (movie.getCategory().equalsIgnoreCase("comedy")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (selection == 8) {
                System.out.println("Enter a title");
                String newName = scanner.nextLine();
                System.out.println("Enter a category");
                String newCat = scanner.nextLine();
                newMoviesArray = Movie.addMovie(newMoviesArray,newName,newCat);

            } else if (selection == 0) {
                System.out.println("Thank you!");
                wantsToContinue = false;
                System.exit(1);
            } else {
                System.out.println("Oops, something went wrong");
            }

            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - view movies in the musical category\n" +
                    "7 - view movies in the comedy category\n" +
                    "8 - Add a Movie\n" +
                    "\n" +
                    "Enter your choice:");
            selection = input.getInt();

        }
    }
}
