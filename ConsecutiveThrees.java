/*Design a function that takes a list of integers as input. The function should 
return True if the list contains two consecutive threes (3 next to a 3) anywhere 
within the list. Otherwise, it should return False. For example, the function 
should return True for [1, 3, 3] and False for [1, 3, 1, 3]. */

public class ConsecutiveThrees {
    public static boolean hasConsecutiveThrees(int[] arr) {
        // Iterate through the array up to the second-to-last element
        for (int i = 0; i < arr.length - 1; i++) {
            // Check if the current element and the next element are both 3
            if (arr[i] == 3 && arr[i + 1] == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasConsecutiveThrees(new int[] { 1, 3, 3 }));
        System.out.println(hasConsecutiveThrees(new int[] { 1, 3, 1, 3 }));
        System.out.println(hasConsecutiveThrees(new int[] { 3, 3, 3 }));
        System.out.println(hasConsecutiveThrees(new int[] { 1, 2, 3, 3, 4 }));
        System.out.println(hasConsecutiveThrees(new int[] { 3, 1, 3 }));
    }
}
