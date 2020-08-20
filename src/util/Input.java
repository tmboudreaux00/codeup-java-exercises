package util;
import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    String getString(){
        System.out.print("Enter a string: ");
        String string = scanner.next();
        System.out.println(string);
        return string;
    }
    boolean yesNo(){
        System.out.print("Enter a boolean: [yes/no] ");
        String response = scanner.next().toLowerCase();
        boolean yesNo;
        if (response.equals("yes")){
            System.out.println("\nResponse is " + response);
            yesNo = true;
        } else if (response.equals("no")) {
            System.out.println("\nResponse is " + response);
            yesNo = false;
        } else {
            System.out.println("\nInvalid response");
            yesNo = false;
        }
        return yesNo;
    }
    int getInt(int min, int max){
        boolean flag = false;
        int num;
        do {
            System.out.print("Enter an int between 1 and 100: ");
            num = scanner.nextInt();
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
        int num = scanner.nextInt();
        return num;
    }
    double getDouble(double min, double max){
        boolean flag = false;
        double dubNum;
        do {
            System.out.print("Enter a double between 1.00 and 100.00: ");
            dubNum = scanner.nextDouble();
            if (dubNum >= min && dubNum <= max) {
                flag = true;
            } else {
                System.out.println("double out of range.");
            }
        } while (!flag);
        return dubNum;
    }
    double getDouble(){
        System.out.println("Enter a double: ");
        double dubNum = scanner.nextDouble();
        return dubNum;
    }
}