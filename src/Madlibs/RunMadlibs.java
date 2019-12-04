package Madlibs;

public class RunMadlibs {
    public static void main(String[] args) {

        String[] words = {"Fer","pink","shirt","Shirt Store"};

        Version1 version1 = new Version1(words);

        System.out.println("Once upon a time...");
        System.out.println("there was a person named...");
        System.out.println(version1.name);
        System.out.println(version1.goToLocation());
        System.out.println("he saw the manager and said...");
        System.out.println(version1.greeting());
        System.out.println("I would like to buy that");
        System.out.println(version1.color  + " " + version1.randomObject);
        System.out.println(version1.pickUpObject());
        System.out.println("Then he left");
    }
}
