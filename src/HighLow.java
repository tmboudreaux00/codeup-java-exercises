package exercises;

import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    boolean correct = false;

    public int randomNumber() {
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        int random = (int) (Math.random() * range) + min;
        return random;
    }
    public int guessNumber() {
        int randomNum = randomNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("You have 5 tries to guess a number between 1 and 100.\n\nYour number: ");
        int num = sc.nextInt();
        int numGuess = 1;
        do {
            if (num == randomNum && numGuess < 6) {
                numGuess += 1;
                correct = true;
                System.out.println("Guess #" + (numGuess - 1) + "\nYou guessed the correct number: " + num + "/" + randomNum);
                return num;
            } else if (num < randomNum && numGuess < 6) {
                if (numGuess == 4) {
                    numGuess += 1;
                    System.out.println("Guess #" + (numGuess - 1) + "\nToo low.\nLast guess. Guess again\n");
                    System.out.print("Your number: ");
                    num = sc.nextInt();
                } else if (numGuess == 5) {
                    correct = true;
                    numGuess += 1;
                    System.out.println("Guess #" + (numGuess - 1) + "\nIncorrect guess.\nThe number was: " + randomNum);
                } else {
                    numGuess += 1;
                    System.out.println("Guess #" + (numGuess - 1) + "\nToo low.\nGuess again\n");
                    System.out.print("Your number: ");
                    num = sc.nextInt();
                }
            } else if (num > randomNum && numGuess < 6){
                if (numGuess == 4){
                    numGuess += 1;
                    System.out.println("Guess #" + (numGuess - 1) + "\nToo high.\nLast guess. Guess again\n");
                    System.out.print("Your number: ");
                    num = sc.nextInt();
                }  else if (numGuess == 6) {
                    correct = true;
                    numGuess += 1;
                    System.out.println("Guess #" + (numGuess - 1) + "\nIncorrect guess.\nThe number was: " + randomNum);
                } else {
                    numGuess += 1;
                    System.out.println("Guess #" + (numGuess - 1) + "\nToo high.\nGuess again\n");
                    System.out.print("Your number: ");
                    num = sc.nextInt();
                }
            } else {
                correct = true;
                System.out.println("Game over.");
            }
        } while(!correct);
        return num;
    }

    public static void main (String[] args) {
        HighLow game = new HighLow();
        game.guessNumber();
    }
}