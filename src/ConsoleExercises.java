import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", + pi);
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter number: ");
//        int userInt = scanner.nextInt();
//        System.out.println("You entered: --> " + userInt); //error occurs if not an int

//        System.out.print("Enter three words: ");
//        String userString1 = scanner.next();
//        String userString2 = scanner.next();
//        String userString3 = scanner.next();
//        System.out.format("You entered: %s, %s and %s", userString1, userString2, userString3);//Not enough and it will keep prompting. Too many and it will cut off the extra.

//       System.out.print("Enter a sentence: ");
//        String userSentence = scanner.next();
//        String userSentence1 = scanner.nextLine();
//        System.out.format("You entered %s%s", userSentence, userSentence1); //all words not captured if only using .next()

        //PERIMETER FUNCTION
        scanner.useDelimiter("\n");
        System.out.print("What is the length of the classroom?");
        float length = scanner.nextFloat();
        System.out.print("What is the width of the classroom?");
        float width = scanner.nextFloat();
        System.out.print("What is the height of the ceiling in the classroom?");
        float height = scanner.nextFloat();
        System.out.printf("The length is %.2f, the width is %.2f and the height is %.2f", length, width, height);
        float perimeter = (length * 2) + (width * 2);
        float area = (length * width);
        float volume = (length * width * height);
        System.out.printf("%nThe perimeter is %.3f, the area is %.3f and the volume is %.3f ft\u00b3", perimeter, area, volume);
    }
}
