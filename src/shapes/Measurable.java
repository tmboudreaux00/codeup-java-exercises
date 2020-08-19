package shapes;

public interface Measurable {
    protected double area;
    protected double perimeter;

    @Override
    public void setLength(double length){
        this.length = length;
    };
    public void setWidth(double width){
        this.width = width;
    };

    public double getPerimeter(){
        return 2 * (length + width);
    };
    public double getArea(){
        return length * width;
    };
}
