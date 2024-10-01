package Sept.Task3009;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt(); // Read user input

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(number); // Calculate factorial
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        scanner.close(); // Close the scanner
    }
    public static int calculateFactorial(int num) {
        int result = 1; // Initialize result

        for (int i = 1; i <= num; i++) {
            result *= i; // Multiply result by i
        }

        return result; // Return the final result
    }
}
