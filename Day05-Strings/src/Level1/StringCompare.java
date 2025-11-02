import java.util.Scanner;
public class StringCompare {
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
            System.out.print("Enter the first string: ");
            String str1 = sc.next();

            System.out.print("Enter the second string: ");
            String str2 = sc.next();
            boolean customCompareResult = compareStringsUsingCharAt(str1, str2);

            boolean builtInCompareResult = str1.equals(str2);

            System.out.println("\n--- Comparison Results ---");
            System.out.println("Custom charAt() Comparison: " + customCompareResult);
            System.out.println("Built-in equals() Comparison: " + builtInCompareResult);

            if (customCompareResult == builtInCompareResult) {
                System.out.println("Both methods give the SAME result.");
            } else {
                System.out.println("The results are DIFFERENT!");
            }

            sc.close();
        }
    }


