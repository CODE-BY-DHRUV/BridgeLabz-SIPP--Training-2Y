import java.util.Scanner;
public class StringIndexDemo {
        public static void generateException(String text) {
            System.out.println("Accessing character at index " + text.length() + "...");

            char ch = text.charAt(text.length());
            System.out.println("Character: " + ch);
        }

        public static void handleException(String text) {
            try {
                System.out.println("Accessing character at index " + text.length() + "...");

                char ch = text.charAt(text.length());
                System.out.println("Character: " + ch);

            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Caught StringIndexOutOfBoundsException!");
                System.out.println("Error Message: " + e.getMessage());
            } finally {
                System.out.println("Finally block executed. Clean up done.");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = sc.next();

            System.out.println("\n--- Generating Exception (Program would crash if not handled) ---");
            try {
                generateException(text); // This is risky
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Caught in main: " + e.getMessage());
            }

            System.out.println("\n--- Handling Exception Gracefully ---");
            handleException(text);

            sc.close();
        }
    }


