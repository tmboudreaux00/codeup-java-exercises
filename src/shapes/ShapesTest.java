package shapes;

public class ShapesTest {
    public static void main(String[] args) {
       Rectangle rec1 = new Rectangle(10, 10);
       Square sq1 = new Square(10, 10);
        System.out.println(rec1.getPerimeter());
        System.out.println(rec1.getArea());
        System.out.println(sq1.getPerimeter());
        System.out.println(sq1.getArea());
    }
}
