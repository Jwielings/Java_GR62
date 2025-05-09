import java.util.Scanner;

public class distanceTraveledInTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many meters have you traveled?");
        int distance = Integer.parseInt(scan.nextLine());

        System.out.println("In how many hours?");
        double hours = Double.parseDouble(scan.nextLine());

        System.out.println("In how many minutes?");
        double minutes = Double.parseDouble(scan.nextLine());

        System.out.println("In how many seconds?");
        double seconds = Double.parseDouble(scan.nextLine());

        minutes += hours * 60;
        seconds = seconds += minutes * 60;

        double hour = seconds / 3600;

        System.out.println("Your speed in meter/second is " + (distance / seconds) + ".");
        System.out.println("Your speed in km/h is " + ((double)distance/1000) / hour + ".");
        System.out.println("Your speed in m/h is " + ((double)distance/1609) / hour + ".");


        /* double time = (hours*3600) + (minutes*60) + seconds;

        System.out.println("Your speed in meter/second is " + (distance / time) + "." );
        System.out.println("Your speed in km/h is " + ((distance / time) * (3600/1000)) + "." );
        System.out.println("Your speed in m/h is " + ((distance / time) * (3600/1000)* 0.621371) + ".");

         */
    }
}
