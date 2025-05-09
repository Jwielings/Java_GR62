import java.util.Scanner;

public class CeasersEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String code = "DITISDECODZ";

        //Een voor een chars lezen
        // for loop

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            ch += 3;

            if (ch == 91 || ch == 92 || ch == 93)
                ch -= 26;

            System.out.print(ch);

        }
    }
}