import java.util.Scanner;

public class celciusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the temperature in degrees Celcius?");
        int input1 = Integer.parseInt(scan.nextLine());
        int Fahrenheit = (input1 * 9/5) + 32;
        System.out.println("The temperature is " + (double) Fahrenheit + " degrees Fahrenheit.");
        System.out.println();

        System.out.println("What is the temperature in degrees Fahrenheit?");
        int input2 = Integer.parseInt(scan.nextLine());
        int Celcius = (input2 - 32) * 5/9;
        System.out.println("The temperature is " + Celcius + " degrees Celcius.");
    }
}
