import java.util.Scanner;
public class LowercaseComparison {

        public static String convertToLowercase(String text) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 32);
                }

                result.append(ch);
            }

            return result.toString();
        }

        public static boolean compareStrings(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String inputText = sc.nextLine();

            String customLowercase = convertToLowercase(inputText);

            String builtInLowercase = inputText.toLowerCase();

            boolean isSame = compareStrings(customLowercase, builtInLowercase);

            System.out.println("\nOriginal Text: " + inputText);
            System.out.println("Custom Lowercase Conversion: " + customLowercase);
            System.out.println("Built-in Lowercase Conversion: " + builtInLowercase);
            System.out.println("Are both results identical? " + isSame);

            sc.close();
        }
    }


