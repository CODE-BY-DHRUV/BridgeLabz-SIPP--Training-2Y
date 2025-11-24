
    import java.util.Scanner;

    public class PalindromeCheck {

        public static boolean isPalindromeIterative(String text) {
            int start = 0;
            int end = text.length() - 1;

            while (start < end) {
                if (text.charAt(start) != text.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
        public static boolean isPalindromeRecursive(String text, int start, int end) {

            if (start >= end) {
                return true;
            }
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            return isPalindromeRecursive(text, start + 1, end - 1);
        }


        public static char[] reverseString(String text) {
            char[] reversed = new char[text.length()];
            int index = 0;

            for (int i = text.length() - 1; i >= 0; i--) {
                reversed[index++] = text.charAt(i);
            }
            return reversed;
        }


        public static boolean isPalindromeUsingArrays(String text) {
            char[] original = text.toCharArray(); // Original array
            char[] reversed = reverseString(text); // Reversed array

            for (int i = 0; i < original.length; i++) {
                if (original[i] != reversed[i]) {
                    return false;
                }
            }
            return true;
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter a text to check if it is a palindrome: ");
            String input = sc.nextLine();


            boolean iterativeResult = isPalindromeIterative(input);


            boolean recursiveResult = isPalindromeRecursive(input, 0, input.length() - 1);


            boolean arrayResult = isPalindromeUsingArrays(input);


            System.out.println("\nResults:");
            System.out.println("Logic 1 (Iterative Two-Pointer): " + (iterativeResult ? "Palindrome" : "Not Palindrome"));
            System.out.println("Logic 2 (Recursive): " + (recursiveResult ? "Palindrome" : "Not Palindrome"));
            System.out.println("Logic 3 (Using Character Arrays): " + (arrayResult ? "Palindrome" : "Not Palindrome"));

            sc.close();
        }
    }


