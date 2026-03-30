public class PalindromeCheckerApp {

    // Palindrome service class (encapsulated logic)
    static class PalindromeChecker {

        // Method to check palindrome
        public boolean checkPalindrome(String input) {

            int start = 0;
            int end = input.length() - 1;

            while (start < end) {
                if (input.charAt(start) != input.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }

    public static void main(String[] args) {

        // Hardcoded string
        String input = "level";

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Call method
        boolean result = checker.checkPalindrome(input);

        // Print result
        if (result) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}