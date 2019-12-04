package Codeup;

public class CodeupTesting {
    public static void main(String[] args) {

        //    creating information array to pass into constructor
        String[] student1 = {"sophie","K","Olympic","Macbook Pro"};

        CodeupStudent sophie = new CodeupStudent(student1, true);

        sophie.greeting();
        sophie.study();
        sophie.giveBusinessCards();

    }






}
