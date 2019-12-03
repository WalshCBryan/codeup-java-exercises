package shapes;

public class ShapesTest {


    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        Rectangle box3 = new Rectangle(6,9);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        Rectangle box4 = new Square(8);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

    }
}




