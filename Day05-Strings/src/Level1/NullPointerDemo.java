public class NullPointerDemo {
        public static void generateException() {
            String text = null;


            System.out.println("Length of text: " + text.length());
        }
        public static void handleException() {
            String text = null;

            try {
                System.out.println("Length of text: " + text.length());
            } catch (NullPointerException e) {

                System.out.println("Caught a NullPointerException!");
                System.out.println("Error Message: " + e.getMessage());
            } finally {
                System.out.println("Finally block executed. Clean up if needed.");
            }
        }

        public static void main(String[] args) {
            System.out.println("--- Generating NullPointerException (Program Crashes) ---");
            try {
                generateException();
            } catch (NullPointerException e) {
                System.out.println("Caught in main: " + e.getMessage());
            }

            System.out.println("\n--- Handling NullPointerException Gracefully ---");
            handleException();
        }
    }


