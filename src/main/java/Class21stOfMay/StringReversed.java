package Class21stOfMay;
import java.util.Scanner;
public class StringReversed {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String input = scanner.nextLine();
        String buffer = "";
        String input2 = input;
        char charInput;

        for (int i = 0; i < input.length(); i++) {

            charInput = input.charAt(i);
            buffer = charInput + buffer;
        }

        System.out.println(buffer);
        if (input2.equals(buffer)) {
            System.out.println("Palindrome!");
        }
    }
}
