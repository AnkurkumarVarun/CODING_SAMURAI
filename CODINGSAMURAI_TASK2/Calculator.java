

import java.util.*; 

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int choice = 0; 
        double num1, num2; 
        
        do {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            String ch = in.next();

            
            try {
                choice = Integer.parseInt(ch);
                switch (choice) {
                    // for performing Addition
                    case 1:
                        
                        num1 = getNumber("Enter the first number: ");
                        num2 = getNumber("Enter the second number: ");
                        double result = add(num1, num2);
                        System.out.println("Result: " + result);
                        break;

                    // for performing Substraction
                    case 2:
                       
                        num1 = getNumber("Enter the first number: ");
                        num2 = getNumber("Enter the second number: ");
                        result = subtract(num1, num2);
                        System.out.println("Result: " + result);
                        break;

                    // for performing Multiplication
                    case 3:
                        
                        num1 = getNumber("Enter the first number: ");
                        num2 = getNumber("Enter the second number: ");
                        result = multiply(num1, num2);
                        System.out.println("Result: " + result);
                        break;

                    // for performing Division
                    case 4:
                       
                        num1 = getNumber("Enter the first number: ");
                        num2 = getNumber("Enter the second number: ");
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            result = divide(num1, num2);
                            System.out.println("Result: " + result);
                        }
                        break;
                    // for Exiting the application
                    case 5:
                        System.out.println("Exiting calculator ,Have a great day.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer choice.");
            }
        } while (choice != 5);
        in.close();
    }

    // Function to get a valid numeric input from the user
    private static double getNumber(String message) {
        Scanner sc = new Scanner(System.in);
        double number;
        do {
            System.out.print(message);
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print(message);
                sc.next();
            }
            number = sc.nextDouble();
        } while (number == Double.POSITIVE_INFINITY || number == Double.NEGATIVE_INFINITY || Double.isNaN(number));
        return number;

    }

    // Function to perform addition
    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function to perform subtraction
    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function to perform multiplication
    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function to perform division
    private static double divide(double num1, double num2) {
        return num1 / num2;
    }
}