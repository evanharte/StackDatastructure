import java.util.Arrays;

public class PalindromeCheck {
    public static boolean isPalindrome(String word) {
        int n = word.length();
        char [] stack = new char[n];
        char [] reverse = new char[n];
        int top = 0;

        // Push all characters of the word to the "stack"
        for (int i = 0; i < n - 1; i++) {
            stack[top] = word.charAt(i);
            top++;
        }

        // Build the reversed word by creating a reverse loop starting at top and working towards zero and pushing chars to char [] reverse.
        while (top > 0) {
            reverse[top] = word.charAt(top--);
            top--;
        }

        // Compare the original word with the reversed word
        System.out.println(Arrays.toString(stack));
        System.out.println(Arrays.toString(reverse));
        return word.equals(Arrays.toString(reverse));
    }

    public static void main(String[] args) {
        String word = "racecar";
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
