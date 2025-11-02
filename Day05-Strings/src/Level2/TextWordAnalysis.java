import java.util.Scanner;

public class TextWordAnalysis {
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
        public static String[][] getWordsWithLengths(String[] words) {
            String[][] result = new String[words.length][2];
            for (int i = 0; i < words.length; i++) {
                result[i][0] = words[i];
                result[i][1] = String.valueOf(getStringLength(words[i]));
            }
            return result;
        }


        public static int[] findShortestAndLongest(String[][] wordsWithLengths) {
            int minIndex = 0;
            int maxIndex = 0;
            int minLength = Integer.parseInt(wordsWithLengths[0][1]);
            int maxLength = Integer.parseInt(wordsWithLengths[0][1]);

            for (int i = 1; i < wordsWithLengths.length; i++) {
                int length = Integer.parseInt(wordsWithLengths[i][1]);
                if (length < minLength) {
                    minLength = length;
                    minIndex = i;
                }
                if (length > maxLength) {
                    maxLength = length;
                    maxIndex = i;
                }
            }

            return new int[]{minIndex, maxIndex};
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a text: ");
            String inputText = sc.nextLine();

            String[] words = customSplit(inputText);

            String[][] wordsWithLengths = getWordsWithLengths(words);

            System.out.println("\nWord\tLength");
            System.out.println("--------------");
            for (int i = 0; i < wordsWithLengths.length; i++) {
                System.out.println(wordsWithLengths[i][0] + "\t" + wordsWithLengths[i][1]);
            }

            int[] minMaxIndexes = findShortestAndLongest(wordsWithLengths);

            System.out.println("\nShortest word: " + wordsWithLengths[minMaxIndexes[0]][0] +
                    " (Length: " + wordsWithLengths[minMaxIndexes[0]][1] + ")");
            System.out.println("Longest word: " + wordsWithLengths[minMaxIndexes[1]][0] +
                    " (Length: " + wordsWithLengths[minMaxIndexes[1]][1] + ")");

            sc.close();
        }
    }


