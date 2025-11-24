import java.util.Scanner;
public class SplitTextDemo {
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
        public static String[] customSplit(String text) {
            int length = getStringLength(text);
            int wordCount = 1;

            for (int i = 0; i < length; i++) {
                if (text.charAt(i) == ' ') {
                    wordCount++;
                }
            }
            int[] spaceIndexes = new int[wordCount + 1];
            spaceIndexes[0] = -1;
            int index = 1;
            for (int i = 0; i < length; i++) {
                if (text.charAt(i) == ' ') {
                    spaceIndexes[index++] = i;
                }
            }
            spaceIndexes[wordCount] = length;

            String[] words = new String[wordCount];
            for (int i = 0; i < wordCount; i++) {
                int start = spaceIndexes[i] + 1;
                int end = spaceIndexes[i + 1];
                StringBuilder word = new StringBuilder();
                for (int j = start; j < end; j++) {
                    word.append(text.charAt(j));
                }
                words[i] = word.toString();
            }

            return words;
        }

        public static boolean compareStringArrays(String[] arr1, String[] arr2) {
            if (arr1.length != arr2.length) {
                return false;
            }
            for (int i = 0; i < arr1.length; i++) {
                if (!arr1[i].equals(arr2[i])) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a text: ");
            String inputText = sc.nextLine();

            String[] customWords = customSplit(inputText);

            String[] builtInWords = inputText.split(" ");

            boolean isSame = compareStringArrays(customWords, builtInWords);

            System.out.println("\nCustom Split Result:");
            for (String word : customWords) {
                System.out.println(word);
            }

            System.out.println("\nBuilt-in Split Result:");
            for (String word : builtInWords) {
                System.out.println(word);
            }

            System.out.println("\nAre both results identical? " + isSame);

            sc.close();
        }
    }


