package util;
import java.util.Scanner;

public class Input {
    final private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public void clear() {
        this.scanner.nextLine();
    }

    public String getString(){
        return this.scanner.nextLine();
    }
    public boolean yesNo(){
        System.out.print("\nDo you want to continue?: [yes/no] ");
        String response = getString();
        response = response.toLowerCase();
        if (response.equals("yes")){
            return true;
        } else if (response.equals("no")) {
            System.out.println("\nProgram ended.");
            return false;
        } else {
            System.out.println("\nInvalid response");
            return yesNo();
        }
    }
    int getInt(int min, int max){
        boolean flag = false;
        int num;
        do {
            System.out.printf("Enter an int between %s and %s: ", min, max);
            num = this.scanner.nextInt();
            if (num >= min && num <= max) {
                flag = true;
            } else {
                System.out.println("int out of range.");
            }
        } while(!flag);
        return num;
    }
    int getInt(){
        System.out.print("Enter another int: ");
        int num = this.scanner.nextInt();
        return num;
    }

    double getDouble(double min, double max){
        boolean flag = false;
        double dubNum;
        do {
            System.out.printf("Enter a double between %s and %s: ", min, max);
            dubNum = this.scanner.nextDouble();
            if (dubNum >= min && dubNum <= max) {
                flag = true;
            } else {
                System.out.println("double out of range.");
            }
        } while (!flag);
        return dubNum;
    }
    public double getDouble(){
        System.out.println("Enter the radius: ");
        return this.scanner.nextDouble();
    }
}