package shapes;



public class Circle {
    private double radius;
    public Circle() {}
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return (Math.pow(radius, 2) * Math.PI);
    }
    public double getCircumference(){
        return (2 * Math.PI * radius);
    }
}
