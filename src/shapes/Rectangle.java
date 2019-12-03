package shapes;

public class Rectangle {

    private int width;
    private int length;


    public Rectangle(int lengthExternal, int widthExternal) {
        this.length = lengthExternal;
        this.width = widthExternal;
    }


    public int getPerimeter() {
        int perimeter = ((2 * length) + (2 * width));
        System.out.println("This rectangle a length of " + this.length + " and a width of " + this.length);
        System.out.println(("the perimeter of this rectangle is " + perimeter));
        return perimeter;
    }

    public int getArea() {
        int area = (length * width);
        System.out.println("This rectangle a length of " + this.length + " and a width of " + this.width);
        System.out.println(("the area of this rectangle is " + area));
        return area;
    }


}
