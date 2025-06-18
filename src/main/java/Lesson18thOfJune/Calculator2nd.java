package Lesson18thOfJune;
import java.util.Scanner;

public class Calculator2nd {
    public static void main(String[] args) {

        try {
            calculator();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

        static void calculator() throws Exception {
            Scanner scan = new Scanner(System.in);

            System.out.println("What do you want to calculate?");
            String input = scan.nextLine();
            String[] toCalculate = input.trim().split(" ");

            if (toCalculate.length != 3) {
                throw new Exception("Invalid input!");
            }

            int num1;
            int num2;

            try {
                num1 = Integer.parseInt(toCalculate[0]);
            } catch (Exception e) {
                throw new Exception("Linker getal is geen getal!");
            }

            String operator = toCalculate[1];

            if (!"+-*/".contains(toCalculate[1])) {
                throw new Exception("Invalid operator!");
            }

            try {
                num2 = Integer.parseInt(toCalculate[2]);
            } catch (Exception e) {
                throw new Exception("Rechter getal is geen getal!");
            }

            switch (operator) {
                case "+":
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("You can't divide by zero!");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
            }
        }
    }

