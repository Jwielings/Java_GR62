package Lesson18thOfJune;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        boolean confirmationFinal;

        do {
            try {
                System.out.println("What number do you want to calculate? Give 2 inputs.");
                int input1 = Integer.parseInt(scan.nextLine());
                int input2 = Integer.parseInt(scan.nextLine());
                int total;
                int total2;
                String confirmation;


                System.out.println("What would you like to do with these numbers, divide, multiply, plus or minus?");
                String operator1 = scan.nextLine().trim();
                if (!"+-*/".contains(operator1)) {
                    System.out.println("Invalid operator.");
                }


                total = input1 + input2;
                switch (operator1) {
                    case "+":
                        total = input1 + input2;
                        System.out.println("Result: " + (total));
                        break;
                    case "-":
                        total = input1 - input2;
                        System.out.println("Result: " + (total));
                        break;
                    case "/":
                        if (input2 == 0) {
                            System.out.println("Error: cannot divide by zero.");
                        } else {
                            System.out.println("Result: " + ((double) input1 / input2));
                        }
                        break;
                    case "*":
                        total = input1 * input2;
                        System.out.println("Result: " + (total));
                        break;

                }

                System.out.println("Would you like to keep calculating? y/n");
                confirmation = scan.nextLine().trim();
                String operator2;

                switch (confirmation) {
                    case "y":
                        System.out.println("Great! Let's continue.");
                        confirmationFinal = true;
                        break;
                    case "n":
                        System.out.println("Alright!");
                        confirmationFinal = false;
                        break;
                    default:
                        System.out.println("Invalid input, assuming you want to continue.");
                        confirmationFinal = true;


                        System.out.println("What numbers would you like to calculate? Give 2 inputs.");
                        input1 = Integer.parseInt(scan.nextLine());
                        input2 = Integer.parseInt(scan.nextLine());
                        System.out.println("What operator? +, -, * or /?");
                        operator2 = scan.nextLine();
                        if (!"+-*/".contains(operator2)) {
                            System.out.println("Invalid operator.");
                        }

                        switch (operator2) {
                            case "+":
                                total2 = input1 + input2;
                                System.out.println("Result :" + (total2));
                                break;
                            case "-":
                                total2 = input1 - input2;
                                System.out.println("Result :" + (total2));
                                break;
                            case "*":
                                total2 = input1 * input2;
                                System.out.println("Result :" + (total2));
                                break;
                            case "/":
                                if (input2 == 0) {
                                    System.out.println("Error: cannot divide by zero.");
                                } else {
                                    System.out.println("Result: " + ((double) input1 / input2));
                                }
                                break;
                        }

                        System.out.println("Would you like to calculate the total of the two calculated sums? y/n");
                        confirmation = scan.nextLine().trim();

                        if (confirmation.contains("n")) {
                            confirmationFinal = false;
                        } else {
                            System.out.println("Let's continue.");
                        }

                }
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid number");
                throw new RuntimeException(e);
            }
        } while (confirmationFinal);
    }
}
