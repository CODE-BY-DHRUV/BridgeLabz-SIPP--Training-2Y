    import java.util.Scanner;
    public class CustomSubstring {
        public static String createSubstringUsingCharAt(String text, int start, int end) {
            String result = "";
            for (int i = start; i < end; i++) {
                result += text.charAt(i);
            }

            return result;
        }
        public static boolean compareStringsUsingCharAt(String str1, String str2) {
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

            System.out.print("Enter the main string: ");
            String text = sc.next();

            System.out.print("Enter the start index: ");
            int start = sc.nextInt();

            System.out.print("Enter the end index: ");
            int end = sc.nextInt();

            if (start < 0 || end > text.length() || start >= end) {
                System.out.println("Invalid start or end index!");
                sc.close();
                return;
            }

            String customSubstring = createSubstringUsingCharAt(text, start, end);

            String builtInSubstring = text.substring(start, end);

            boolean customCompareResult = compareStringsUsingCharAt(customSubstring, builtInSubstring);

            boolean builtInCompareResult = customSubstring.equals(builtInSubstring);

            System.out.println("\n--- Results ---");
            System.out.println("Custom Substring: " + customSubstring);
            System.out.println("Built-in Substring: " + builtInSubstring);
            System.out.println("Custom charAt() Comparison: " + customCompareResult);
            System.out.println("Built-in equals() Comparison: " + builtInCompareResult);

            if (customCompareResult && builtInCompareResult) {
                System.out.println("Both substrings match perfectly!");
            } else {
                System.out.println("The substrings do NOT match!");
            }

            sc.close();
        }
    }


