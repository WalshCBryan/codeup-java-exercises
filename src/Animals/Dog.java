package Animals;

public class Dog extends Animal {

    public Dog(boolean isAlive, int age, int numberOfLegs, String food, String habitat) {
        this.isAlive = isAlive;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.food = food;
        this.habitat = habitat;
    }

    public String sound(){
        return "bork bork";
    }

    public String movement(){
        return "Run, swim, show me the belly";
    }

    public static void main(String[] args) {
        Dog bean = new Dog(true, 4, 4, "kibble", "couch");


        System.out.println("bean.getOlder() = " + bean.getOlder());
        System.out.println("bean.sound() = " + bean.sound());
        System.out.println("bean.movement() = " + bean.movement());
    }

}
