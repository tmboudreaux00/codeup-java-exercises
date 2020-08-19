package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
