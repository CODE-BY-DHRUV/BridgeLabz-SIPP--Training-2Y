
    import java.util.Scanner;

    public class UniqueCharacterFrequency {


        public static char[] findUniqueCharacters(String text) {
            int length = text.length();
            char[] unique = new char[length];
            int uniqueCount = 0;


            for (int i = 0; i < length; i++) {
                char currentChar = text.charAt(i);
                boolean isDuplicate = false;


                for (int j = 0; j < uniqueCount; j++) {
                    if (unique[j] == currentChar) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (!isDuplicate) {
                    unique[uniqueCount] = currentChar;
                    uniqueCount++;
                }
            }


            char[] finalUnique = new char[uniqueCount];
            for (int i = 0; i < uniqueCount; i++) {
                finalUnique[i] = unique[i];
            }

            return finalUnique;
        }

        public static String[][] findCharacterFrequency(String text) {
            int[] freq = new int[256];
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                freq[c]++;
            }

            char[] uniqueChars = findUniqueCharacters(text);

            String[][] result = new String[uniqueChars.length][2];

            for (int i = 0; i < uniqueChars.length; i++) {
                result[i][0] = String.valueOf(uniqueChars[i]);  // Character
                result[i][1] = String.valueOf(freq[uniqueChars[i]]); // Frequency
            }

            return result;
        }

        public static void displayFrequencyTable(String[][] freqArray) {
            System.out.println("\nCharacter Frequency Table:");
            System.out.println("----------------------------");
            System.out.println("Character\tFrequency");
            System.out.println("----------------------------");

            for (int i = 0; i < freqArray.length; i++) {
                System.out.println("    " + freqArray[i][0] + "\t\t    " + freqArray[i][1]);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            String[][] frequencies = findCharacterFrequency(input);

            displayFrequencyTable(frequencies);

            sc.close();
        }
    }


