public class PalindromeCheck {
    public static boolean isPalindrome(String word) {
        int n = word.length();
        char [] stack = new char[n];
        char [] reverse = new char[n];
        int top = 0;

        // Push all characters of the word to the "stack"
        for (int i = 0; i < n; i++) {
            stack[top] = word.charAt(i);
            top++;
        }

        // Build the reversed word by creating a reverse loop starting at top and working towards zero and pushing chars to char [] reverse.
        int index = 0;
        while (top > 0) {
            reverse[index++] = stack[--top];
        }

        // Build char arrays into String words and compare
        String regularWord = new String(stack);
        String reversedWord = new String(reverse);

        // The below can be uncommented to check output of regularWord and reversedWord
//        System.out.println(regularWord);
//        System.out.println(reversedWord);

        if (regularWord.equals(reversedWord)) {
            System.out.println(word + " is a palindrome");
            return true;
        } else {
            System.out.println(word + " is not a palindrome");
            return false;
        }
    }

    public static void main(String[] args) {
        String word = "scooby";
        isPalindrome(word);

        String word2 = "kayak";
        isPalindrome(word2);

        String word3 = "roberto";
        isPalindrome(word3);

        String word4 = "never odd or even";
        isPalindrome(word4);

        String word5 = "neveroddoreven";
        isPalindrome(word5);
    }
}
