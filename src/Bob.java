import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean again = true;
        do {
            System.out.println("Type @ Bob: ");
            String userInput = sc.nextLine();

            if (userInput.isEmpty()){
                System.out.println("Fine. Be that way.");
            } else {
                char lastChar = userInput.charAt(userInput.length()-1);
                switch(lastChar) {
                    case '?':
                        System.out.println("Sure.");
                        break;
                    case '!':
                        System.out.println("Whoa, chill out!");
                        break;
                    default:
                        System.out.println("Whatever.");
                        break;
                }
                System.out.println("Message Bob again? [y/N]: ");
                String response = sc.nextLine();
                if(!response.trim().equalsIgnoreCase("y")){
                    again = false;
                }
            }
        } while (again);
        System.out.println("Goodbye");
    }
}
