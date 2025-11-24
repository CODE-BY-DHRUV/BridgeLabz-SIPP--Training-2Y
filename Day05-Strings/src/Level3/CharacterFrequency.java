import java.util.Scanner;
public class CharacterFrequency {
        public static String[][] findCharacterFrequency(String text) {
            int[] freq = new int[256];


            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                freq[c]++;
            }

            int uniqueCount = 0;
            for (int i = 0; i < 256; i++) {
                if (freq[i] > 0) {
                    uniqueCount++;
                }
            }

            String[][] result = new String[uniqueCount][2];
            int index = 0;

            for (int i = 0; i < 256; i++) {
                if (freq[i] > 0) {
                    result[index][0] = String.valueOf((char) i);   // Character
                    result[index][1] = String.valueOf(freq[i]);    // Frequency
                    index++;
                }
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


