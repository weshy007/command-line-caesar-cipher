import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What plain statement do you want to have encrypted...");

        String plainText = scan.nextLine();
        System.out.println(" Specify your the value of change you'd ike on your text");

        int change = scan.nextInt();
        String encrypted = "";
        char alphabet;
        for (int i = 0; i < plainText.length(); i++) {
            alphabet = plainText.charAt(i);

            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + change);

                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                encrypted = encrypted + alphabet;
            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + change);

                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                encrypted = encrypted + alphabet;
            } else {
                encrypted = encrypted + alphabet;
            }
        }
        System.out.println("This is your encrypted text: " + encrypted);
    }
}