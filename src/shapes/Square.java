package shapes;

public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
    }

    @Override
    protected void setLength(double length) {

    }

    @Override
    protected void setWidth(double width) {
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return (this.width * this.length);
    }

//    private int side;
//    public Square(int sideExternal) {
//        super(sideExternal, sideExternal);
//        this.side = sideExternal;
//    }
////    since length and width are equal for squares, we could use super.length or super.width instead of this.side/side
//@Override
//    public int getPerimeter() {
//        int perimeter = (4 * side);
//    System.out.println("This square has sides with a length of " + this.side);
//    System.out.println(("the perimeter of this square is " + perimeter));
//        return perimeter;
//    }
//@Override
//    public int getArea() {
//        int area = side * side;
//    System.out.println("This square has sides with a length of " + this.side);
//    System.out.println(("the area of this square is " + area));
//        return area;
//    }


}
