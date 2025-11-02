import java.util.Scanner;
public class CustomToCharArray {
        public static char[] getCharsFromString(String text) {
            char[] result = new char[text.length()];
            for (int i = 0; i < text.length(); i++) {
                result[i] = text.charAt(i);
            }

            return result;
        }
        public static boolean compareCharArrays(char[] arr1, char[] arr2) {

            if (arr1.length != arr2.length) {
                return false;
            }

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }

        public static void printCharArray(char[] arr) {
            for (char c : arr) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = sc.next();

            char[] customChars = getCharsFromString(text);

            char[] builtInChars = text.toCharArray();

            boolean isEqual = compareCharArrays(customChars, builtInChars);

            System.out.println("\n--- Results ---");
            System.out.print("Custom Character Array: ");
            printCharArray(customChars);

            System.out.print("Built-in Character Array: ");
            printCharArray(builtInChars);

            System.out.println("Are both arrays equal? " + isEqual);

            sc.close();
        }
    }


