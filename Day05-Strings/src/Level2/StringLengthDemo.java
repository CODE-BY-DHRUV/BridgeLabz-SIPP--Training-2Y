import java.util.Scanner;

public class StringLengthDemo {
        public static int getStringLength(String text) {
            int count = 0;
            try {
                while (true) {
                    text.charAt(count);
                    count++;
                }
            } catch (IndexOutOfBoundsException e) {
                return count;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String inputText = sc.next();

            int customLength = getStringLength(inputText);

            int builtInLength = inputText.length();


            System.out.println("\nString: " + inputText);
            System.out.println("Length using custom method: " + customLength);
            System.out.println("Length using built-in length(): " + builtInLength);

            sc.close();
        }
    }


