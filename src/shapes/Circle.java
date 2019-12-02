package shapes;

public class Circle {
    private static int CircleCount = 0;
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
        CircleCount++;
    }

    public double getArea() {
        double area = (Math.PI * radius * radius);
        return area;
    }

    public double getCircumference() {
        double diameter = (2 * radius);
        double circumfrence = (Math.PI * diameter);
        return circumfrence;

    }

    public double getRadius(){
        return radius;
    }

    public int showCounter(){
        return CircleCount;
    }


    public static void main(String[] args) {

        Circle circ1 = new Circle(4.56);

        System.out.println(circ1.getArea());
        System.out.println(circ1.getCircumference());

    }
}
// This class should have a private radius property that is set through the constructor, and various methods for getting information about the circle, detailed below.