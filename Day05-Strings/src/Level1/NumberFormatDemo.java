import java.util.Scanner;
public class NumberFormatDemo {
        public static void generateException(String text) {
            System.out.println("Attempting to parse text into a number...");
            int number = Integer.parseInt(text);

            System.out.println("Parsed Number: " + number); // Will not run if exception occurs
        }
        public static void handleException(String text) {
            try {
              

                int number = Integer.parseInt(text);

                System.out.println("Parsed Number: " + number);

            } catch (NumberFormatException e) {
                System.out.println("Caught NumberFormatException!");
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

            System.out.print("Enter a value to parse into an integer: ");
            String text = sc.next();

            System.out.println("\n--- Generating NumberFormatException (Uncontrolled) ---");
            try {
                generateException(text);
            } catch (NumberFormatException e) {
                System.out.println("Caught in main: " + e.getMessage());
            }

            System.out.println("\n--- Handling NumberFormatException Gracefully ---");
            handleException(text);

            sc.close();
        }
    }



