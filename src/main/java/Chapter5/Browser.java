package Chapter5;
import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String usedBrowser = scanner.nextLine();

        switch (usedBrowser) {
            case "Chrome":
                System.out.println("Je gebruikt een moderne browser");

            case "Firefox":
                System.out.println("Je gebruikt een moderne browser");

            case "Opera":
                System.out.println("Je gebruikt een moderne browser");

            case "IE":
                System.out.println("Waarom gebruik je Internet Explorer?");

            case "Edge":
                System.out.println("Je gebruikt Edge");

                default:
                    System.out.println("Je gebruikt een niet ondersteunde browser");


        }
    }
}

