import java.util.Scanner;

public class Rijbewijs {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int leeftijd = sc.nextInt();

        System.out.println("Wat is je leeftijd?");

        boolean rijbewijs = true;

        if (!rijbewijs) {
            System.out.println("Dan mag je nooit rijden.");
        } else if (leeftijd < 18) {
            System.out.println("Dan mag je rijden onder begeleiding.");
        } else {
            System.out.println("Dan mag je rijden");
        }






    }
}
