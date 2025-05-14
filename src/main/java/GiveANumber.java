import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class GiveANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = scan.nextInt();

        int unevenTotal = 0;
        int evenTotal = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 1) {
                unevenTotal += i;
            } else {
                evenTotal += i;
            }
        }
        System.out.println("The sum of the uneven numbers until " + number + " is " + unevenTotal);
        System.out.println("The sum of the even numbers until " + number + " is " + evenTotal);
        System.out.println("The difference between the 2 sums is " + (evenTotal - unevenTotal));

    }
}








