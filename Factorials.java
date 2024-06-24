//Write a recursive function to calculate the factorial of a number

import java.util.Scanner;

public class Factorials {
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Factorial of :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("The factorial of " + number + " is " + factorial(number) + ".");
        scanner.close();
    }
}
