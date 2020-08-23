package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Circle small = new Circle();
        small.setRadius(2);
        System.out.println("The radius of the example circle is: " + small.getRadius());
        System.out.println("The area of the example circle is: " + small.getArea());
        System.out.println("The circumference of the example circle is: " + small.getCircumference() + "\n");
        Input inprompt = new Input();
        boolean prompt;
        int circleCount = 1;
        do {
            Input in = new Input();
            Circle input = new Circle(in.getDouble());
            System.out.println("\nThe radius of your circle is: " + input.getRadius());
            System.out.println("The area of your circle is: " + input.getArea());
            System.out.println("The circumference of your circle is: " + input.getCircumference());
            prompt = inprompt.yesNo();
            if (prompt){
                circleCount += 1;
            } else {
                System.out.println("Number of circles calculated: " + circleCount);
            }
        } while(prompt);
    }
}

