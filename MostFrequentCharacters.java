/*Design a function that takes a string or sequence of characters as input and 
returns the character that appears most frequently.
//Eg 11189 => '1'
//hello => l */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacters {
    public static char mostFrequentChar(String s) {
        // Map to store the frequency of each character
        Map<Character, Integer> freq = new HashMap<>();

        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Find the character with the maximum frequency
        int maxFreq = 0;
        char maxChar = ' ';
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        System.out.print("Input :");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println("The most frequent character in \"" + input + "\" is " + (mostFrequentChar(input)) + ".");
        scanner.close();
    }
}
