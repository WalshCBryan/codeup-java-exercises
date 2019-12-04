package Animals;

abstract class Animal {

    public boolean isAlive;
    public int age;
    public int numberOfLegs;
    public String food;
    public String habitat;


    public abstract String sound();

    public abstract String movement();

    public int getOlder() {
        return age + 1;
    }


}
