import java.util.*;

public class PalindromeCheckerApp {

    // Strategy Interface
    interface PalindromeStrategy {
        boolean check(String input);
    }

    // Stack-based Strategy
    static class StackStrategy implements PalindromeStrategy {
        public boolean check(String input) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }

            String reversed = "";
            while (!stack.isEmpty()) {
                reversed += stack.pop();
            }

            return input.equals(reversed);
        }
    }

    // Deque-based Strategy
    static class DequeStrategy implements PalindromeStrategy {
        public boolean check(String input) {
            Deque<Character> deque = new LinkedList<>();

            for (int i = 0; i < input.length(); i++) {
                deque.addLast(input.charAt(i));
            }

            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        // Choose strategy dynamically
        PalindromeStrategy strategy;

        // You can switch strategy here
        strategy = new StackStrategy();
        // strategy = new DequeStrategy();

        boolean result = strategy.check(input);

        // Print result
        if (result) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}