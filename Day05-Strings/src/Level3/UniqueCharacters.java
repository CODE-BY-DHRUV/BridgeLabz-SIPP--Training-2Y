import java.util.Scanner;
public class UniqueCharacters {
        public static int findLength(String text) {
            int count = 0;
            try {
                while (true) {
                    text.charAt(count);
                    count++;
                }
            } catch (StringIndexOutOfBoundsException e) {
                return count;
            }
        }

        public static char[] findUniqueCharacters(String text) {
            int len = findLength(text);
            char[] tempArray = new char[len];
            int uniqueCount = 0;

            for (int i = 0; i < len; i++) {
                char currentChar = text.charAt(i);
                boolean isUnique = true;

                for (int j = 0; j < i; j++) {
                    if (text.charAt(j) == currentChar) {
                        isUnique = false;
                        break;
                    }
                }

                if (isUnique) {
                    tempArray[uniqueCount] = currentChar;
                    uniqueCount++;
                }
            }

            char[] uniqueChars = new char[uniqueCount];
            for (int i = 0; i < uniqueCount; i++) {
                uniqueChars[i] = tempArray[i];
            }

            return uniqueChars;
        }

        public static void displayUniqueCharacters(char[] uniqueChars) {
            System.out.println("\nUnique Characters:");
            for (int i = 0; i < uniqueChars.length; i++) {
                System.out.print(uniqueChars[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter a string: ");
            String text = sc.nextLine();


            char[] uniqueChars = findUniqueCharacters(text);


            displayUniqueCharacters(uniqueChars);

            sc.close();
        }
    }


