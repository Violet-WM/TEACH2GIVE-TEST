/*Design a function that reverses the digits of an integer. For example, 50 
should become 5 and -12 should become -21.*/

import java.util.Scanner;

public class ReverseDigits {
    public static int reverseInteger(int n) {
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        int reversedNum = 0;

        while (n != 0) {
            reversedNum = reversedNum * 10 + n % 10;
            n = n / 10;
        }

        return sign * reversedNum;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int reversedNumber = reverseInteger(number);

        System.out.println("The reversed form of the integer " + number + " is " + reversedNumber + ".");

        scanner.close();

    }
}
