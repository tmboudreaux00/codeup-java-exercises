package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        boolean userInput = false;
        System.out.print("Enter a string: ");
        String getNextString = scanner.nextLine();
        return getNextString;
    }

    public boolean yesNo() {
        System.out.print("[y/N]");
        String userInput = scanner.nextLine().toLowerCase();

        return userInput.equals("yes") || userInput.equals("y");
    }

    public int getInt (int min, int max){
        boolean waitingInt = true;
        int num = 0;
        do {
            System.out.printf("Enter a number from %d and %d:\n", min, max);
            String userInput = scanner.nextLine();
            num = Integer.parseInt(userInput);
            if (num >= min && num <= max) {
                waitingInt = false;
            }
        } while (waitingInt);
        return num;
    }

    public double getDouble (double min, double max){
        boolean waitingDouble = true;
        double numDouble = 0;
        do {
            System.out.printf("Enter a number from %.2f and %.2f:\n", min, max);
            String userInput = scanner.nextLine();
            numDouble = Double.parseDouble(userInput);
            if (numDouble >= min && numDouble <= max){
                waitingDouble = false;
            }
        } while (waitingDouble);
        return numDouble;
    }

}