import java.util.Scanner;

public class Kroeg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int leeftijd = sc.nextInt();

        if (leeftijd < 18) {
            System.out.println("Je mag niet naar binnen!");
        } else if (leeftijd < 65) {
            System.out.println("Je mag naar binnen!");
        } else {
            System.out.println("Dit is geen bejaardentehuis.");
        }

    }
}
