package shapes;

public class Square extends Rectangle {

    private int side;


    public Square(int sideExternal) {
        super(sideExternal, sideExternal);
        this.side = sideExternal;
    }


@Override
    public int getPerimeter() {
        int perimeter = (4 * side);
    System.out.println("This square has sides with a length of " + this.side);
    System.out.println(("the perimeter of this square is " + perimeter));
        return perimeter;
    }


@Override
    public int getArea() {
        int area = side * side;
    System.out.println("This square has sides with a length of " + this.side);
    System.out.println(("the area of this square is " + area));
        return area;
    }


}
