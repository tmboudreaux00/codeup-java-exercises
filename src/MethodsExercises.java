import java.util.Scanner;

public class MethodsExercises {
    //public static void main(String[] args) {
    //  Scanner sc = new Scanner(System.in);
//        System.out.print("Enter two numbers: ");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.print(x + " + " + y + " = " + addition(x, y) + "\n");
//        System.out.print(x + " - " + y + " = " + subtraction(x, y) + "\n");
//        System.out.print(x + " x " + y + " = " + multiplication(x, y) + "\n");
//        System.out.print(x + " / " + y + " = " + division(x, y) + "\n");
//        System.out.print(x + " % " + y + " = " + modulus(x, y) + "\n");
//    }
//
//    //Addition
//    public static long addition(int x, int y) {
//        long sum;
//        sum = x + y;
//        return sum;
//    };
//    //Subtraction
//    public static long subtraction(int x, int y) {
//        long difference;
//        difference = y - x;
//        return difference;
//    }
//    //Multiplication
//    public static long multiplication(int x, int y) {
//        long product;
//        product = x * y;
//        return product;
//    }
//    //Division
//    public static double division(int x, int y) {
//        double quotient;
//        quotient = (double)x / (double)y;
//        return quotient;
//    }
//    public static int modulus(int x, int y) {
//        int mod;
//        mod = x % y;
//        return mod;
//    }
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int uI = sc.nextInt();
        boolean valid;
        if (uI < min || uI > max) {
            do {
                System.out.print("Invalid number. \nEnter a number between 1 and 10: ");
                uI = sc.nextInt();
                if (uI < min || uI > max) {
                    valid = false;
                } else {
                    valid = true;
                }
            } while (!valid);
        }
        System.out.println(uI + " is between 1 and 10.");
        return uI;
    }

    public static long factorial(int num) throws ArithmeticException {
        int factorial = 1;
        int previousFactorial = 1;
        for (int i = 1; i<= num; ++i) {
            factorial = factorial * i;
            if (factorial > previousFactorial){
                System.out.println(" yep");
            }
        }
        return factorial;
    }

    public static void main(String[] args) {
        getInteger(1, 10);
    }
}
