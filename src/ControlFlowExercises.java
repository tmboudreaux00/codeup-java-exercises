import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        //int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//        int i = 0;
//        do {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        } while (i <= 100);
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//
//        } while (i < 1000000);

//        for (int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//            continue;
//        }

//            for (long i = 2; i <= 1000000; i *= i){
//                System.out.println(i);
//            }
        //FIZZBUZZ
//        for (int i = 0; i <= 100; i++){
//            if (i % 15 == 0) {
//                System.out.printf("\nFIZZBUZZ! (%s)", i);
//            } else if (i % 5 == 0) {
//                System.out.printf("\nBUZZ! (%s)", i);
//            } else if (i % 3 == 0) {
//                System.out.printf("\nFIZZ! (%s)", i);
//            } else {
//                System.out.printf("\n%s", i);
//            }
//        }

        System.out.print("Enter a number: ");
        int userInt = scanner.nextInt();
        System.out.println("\n\nHere is your table!\n\nnumber | squared | cubed\n------ | ------- | -----");
        int i;
        int j;
        int k;
        for (i = 1; i <= userInt; i++) {
            j = i * i;
            k = j * i;
            if (j < 10) {
                System.out.printf("%s      | %s       | %s\n", i, j, k);
            } else {
                System.out.printf("%s      | %s      | %s\n", i, j, k);
           }
        }
        System.out.print("Do you want to continue? [y/N]");
        String confirm = scanner.next();
        boolean confirmation = confirm.equals("y");
        if (confirmation == true){
            System.out.print("Enter a grade 0 - 100: ");
            int userGrade = scanner.nextInt();
            String APlus = "A+";
            String A = "A";
            String AMinus = "A-";
            String BPlus = "B+";
            String B = "B";
            String BMinus = "B-";
            String CPlus = "C+";
            String C = "C";
            String CMinus = "C-";
            String DPlus = "D+";
            String D = "D";
            String DMinus = "D-";
            String F = "F";
            if (userGrade <= 59) {
                System.out.printf("Your Grade is: %s", F);
            } else if (userGrade >= 60 && userGrade <= 61) {
                System.out.printf("Your grade is %s", DMinus);
            } else if (userGrade >= 62 && userGrade <= 64) {
                System.out.printf("Your grade is %s", D);
            } else if (userGrade >= 65 && userGrade <= 66) {
                System.out.printf("Your grade is %s", DPlus);
            } else if (userGrade >= 67 && userGrade <= 70) {
                System.out.printf("Your grade is %s", CMinus);
            } else if (userGrade >= 71 && userGrade <= 75) {
                System.out.printf("Your grade is %s", C);
            } else if (userGrade >= 76 && userGrade <= 79) {
                System.out.printf("Your grade is %s", CPlus);
            } else if (userGrade >= 80 && userGrade <= 81) {
                System.out.printf("Your grade is %s", BMinus);
            } else if (userGrade >= 82 && userGrade <= 85) {
                System.out.printf("Your grade is %s", B);
            } else if (userGrade >= 86 && userGrade <= 87) {
                System.out.printf("Your grade is %s", BPlus);
            } else if (userGrade >= 88 && userGrade <= 91) {
                System.out.printf("Your grade is %s", AMinus);
            } else if (userGrade >= 92 && userGrade <= 96) {
                System.out.printf("Your grade is %s", A);
            } else if (userGrade >= 97 && userGrade <= 100) {
                System.out.printf("Your grade is %s", APlus);
            }
        } else if (confirmation == false){
            System.out.println("Well....bye...");
        }
    }
}
