import java.util.Scanner;

public class secondsInAYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many years?");
        int years = Integer.parseInt(scan.nextLine());

        System.out.println("months");
        int months = Integer.parseInt(scan.nextLine());

        System.out.println("days");
        int days = Integer.parseInt(scan.nextLine());

        years = years * (365*1440);
        months = (365 / 12) * months * 1440 ;
        days = (days*1440);
        int minutes = years + months + days;

        System.out.println(minutes);
    }
}
