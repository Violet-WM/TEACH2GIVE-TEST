/*Design a function that determines whether a given string is a pangram. A 
pangram is a sentence or phrase containing every letter of the alphabet at 
least once. Punctuation and case are typically ignored. For example, the 
string "The quick brown fox jumps over the lazy dog" is a pangram, while 
"Hello, world!" is not.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static boolean isPangram(String s) {
        // Convert the string to lowercase to ignore case
        s = s.toLowerCase();

        // Create a set of all alphabet letters
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }

        // Check each character in the string
        for (char c : s.toCharArray()) {
            alphabet.remove(c);
        }

        // If the alphabet set is empty, the string is a pangram
        return alphabet.isEmpty();
    }

    public static void main(String[] args) {
        System.out.print("Sentence :");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        if (isPangram(sentence) == true) {
            System.out.println("The sentence \"" + sentence + "\" is a Pangram.");

        } else {
            System.out.println("The sentence \"" + sentence + "\" is not a pangram.");

        }
        scanner.close();

    }

}
