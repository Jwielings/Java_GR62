package Testexponentials;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Exponential exponential = new Exponential();
        {
            int result = exponential.exponential(5, 4);
            System.out.println(result);
        }

    }

    Scanner scan = new Scanner(System.in);
    int input = Integer.parseInt(scan.nextLine());
}




