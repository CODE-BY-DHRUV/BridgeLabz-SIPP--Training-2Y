import java.util.Scanner;
public class UpperCaseComparison {
        public static String convertToUppercase(String text) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);
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

            String customUppercase = convertToUppercase(inputText);


            String builtInUppercase = inputText.toUpperCase();

            boolean isSame = compareStrings(customUppercase, builtInUppercase);


            System.out.println("\nOriginal Text: " + inputText);
            System.out.println("Custom Uppercase Conversion: " + customUppercase);
            System.out.println("Built-in Uppercase Conversion: " + builtInUppercase);
            System.out.println("Are both results identical? " + isSame);

            sc.close();
        }
    }


