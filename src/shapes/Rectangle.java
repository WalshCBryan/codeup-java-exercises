package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return (this.width * this.length);
    }


//    protected int width;
//    protected int length;
//    public Rectangle(int lengthExternal, int widthExternal) {
//        this.length = lengthExternal;
//        this.width = widthExternal;
//    }
//    public int getArea() {
//        int area = (length * width);
//        System.out.println("This rectangle a length of " + this.length + " and a width of " + this.width);
//        System.out.println(("the area of this rectangle is " + area));
//        return area;
//    }
//    public int getPerimeter() {
//        int perimeter = ((2 * length) + (2 * width));
//        System.out.println("This rectangle a length of " + this.length + " and a width of " + this.width);
//        System.out.println(("the perimeter of this rectangle is " + perimeter));
//        return perimeter;
//    }


}
