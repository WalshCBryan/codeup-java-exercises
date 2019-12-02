import java.util.Arrays;


public class ArraysExercises {


    public static Person[] addPerson(Person[] people, Person person){

        Person[] people1 = Arrays.copyOf(people, people.length + 1);
        people1[people.length] = person;
        return people1;

//need to make copy of original array with length+1,
//        then need to add new person object to new/copy at length-1,

    };




    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


//        String[] person = {"Hank", "Peggy", "Bobby"};
//        for (String people : person){
//            System.out.println(people);
//        }


        Person[] people = new Person[3];
        people[0] = new Person("Hank");
        people[1] = new Person("Peggy");
        people[2] = new Person("Bobby");


//        for(Person person : people) {
//            System.out.println(person.getName());
//        }



//        Person[] people = Arrays.copyOf(people, people.length + 1);
//        people[people.length] = new Person("LouAnne");

       people = addPerson(people, new Person("bill"));

       people = addPerson(people, new Person("ted"));

        for (Person person : people) {
            System.out.println(person.getName());
        };


//        Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.


    }
}
