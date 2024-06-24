/*Master Yoda, a renowned Jedi Master from the Star Wars universe, is known 
for his unique way of speaking. He often reverses the order of words in his 
sentences. For example, instead of saying "I am home" he might say "Home 
am I" Design a function that takes a sentence as input and returns a new 
sentence with the words reversed in the same order that Master Yoda would 
use */

import java.util.Scanner;

public class MasterYoda {
    public static String yodaSpeak(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        // Reverse the list of words
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        System.out.print("Enter a sentence :");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("Master Yoda would say \"" + yodaSpeak(input) + "\".");
        scanner.close();
    }
}
