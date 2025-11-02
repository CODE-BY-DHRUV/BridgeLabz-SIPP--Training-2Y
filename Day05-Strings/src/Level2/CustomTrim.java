import java.util.Scanner;

public class CustomTrim {

        public static int[] findTrimIndices(String text) {
            int start = 0;
            int end = text.length() - 1;
            while (start <= end && text.charAt(start) == ' ') {
                start++;
            }

            while (end >= start && text.charAt(end) == ' ') {
                end--;
            }

            return new int[]{start, end};
        }
        public static String customSubstring(String text, int start, int end) {
            StringBuilder sb = new StringBuilder();
            for (int i = start; i <= end; i++) {
                sb.append(text.charAt(i));
            }
            return sb.toString();
        }
        public static boolean compareStrings(String s1, String s2) {
            if (s1.length() != s2.length()) return false;

            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) return false;
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string with spaces: ");
            String inputText = sc.nextLine();

            int[] indices = findTrimIndices(inputText);
            String customTrimmed = "";
            if (indices[0] <= indices[1]) { // Check if there are non-space characters
                customTrimmed = customSubstring(inputText, indices[0], indices[1]);
            }


            String builtInTrimmed = inputText.trim();

            boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

            System.out.println("\nOriginal Text: '" + inputText + "'");
            System.out.println("Custom Trimmed Text: '" + customTrimmed + "'");
            System.out.println("Built-in Trimmed Text: '" + builtInTrimmed + "'");
            System.out.println("Are both results identical? " + isSame);

            sc.close();
        }
    }


