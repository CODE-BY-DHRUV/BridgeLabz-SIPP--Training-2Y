import java.util.Scanner;
public class IllegalArgumentDemo {
        public static void generateException(String text) {
            System.out.println("Generating substring with invalid indices...");
            String sub = text.substring(text.length(), text.length() - 1);

            System.out.println("Generated Substring: " + sub);
        }
        public static void handleException(String text) {
            try {
                System.out.println("Attempting to generate substring with invalid indices...");

                String sub = text.substring(text.length(), text.length() - 1);

                System.out.println("Generated Substring: " + sub);

            } catch (IllegalArgumentException e) {

                System.out.println("Caught IllegalArgumentException!");
                System.out.println("Error Message: " + e.getMessage());
            } catch (RuntimeException e) {

                System.out.println("Caught a generic RuntimeException!");
                System.out.println("Error Message: " + e.getMessage());
            } finally {

                System.out.println("Finally block executed. Clean up completed.");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = sc.next();

            System.out.println("\n--- Generating IllegalArgumentException (Uncontrolled) ---");
            try {
                generateException(text);
            } catch (IllegalArgumentException e) {
                System.out.println("Caught in main: " + e.getMessage());
            }

            System.out.println("\n--- Handling IllegalArgumentException Gracefully ---");
            handleException(text);

            sc.close();
        }
    }


