import java.util.Scanner;

public class MethodsExercises {

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
