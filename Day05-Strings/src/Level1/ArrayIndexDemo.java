import java.util.Scanner;
public class ArrayIndexDemo {
        public static void generateException(String[] names) {
            System.out.println("Accessing an index beyond the array length...");
            System.out.println("Name at index " + names.length + ": " + names[names.length]);

            System.out.println("This line will not execute if an exception occurs.");
        }
        public static void handleException(String[] names) {
            try {
                System.out.println("Attempting to access an invalid index safely...");

                System.out.println("Name at index " + names.length + ": " + names[names.length]);

            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Caught ArrayIndexOutOfBoundsException!");
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

            System.out.print("Enter the number of names: ");
            int size = sc.nextInt();
            sc.nextLine(); // Consume newline

            String[] names = new String[size];

            System.out.println("Enter the names:");
            for (int i = 0; i < size; i++) {
                names[i] = sc.nextLine();
            }

            System.out.println("\n--- Generating ArrayIndexOutOfBoundsException (Uncontrolled) ---");
            try {
                generateException(names);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught in main: " + e.getMessage());
            }

            System.out.println("\n--- Handling ArrayIndexOutOfBoundsException Gracefully ---");
            handleException(names);

            sc.close();
        }
    }


