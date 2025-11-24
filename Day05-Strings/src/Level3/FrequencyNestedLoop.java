
    import java.util.Scanner;

    public class FrequencyNestedLoop {
        public static String[] findCharacterFrequency(String text) {

            char[] charArray = text.toCharArray();
            int length = charArray.length;

            int[] freq = new int[length];

            for (int i = 0; i < length; i++) {
                freq[i] = 1;
                if (charArray[i] == '0') {
                    continue;
                }


                for (int j = i + 1; j < length; j++) {
                    if (charArray[i] == charArray[j]) {
                        freq[i]++;
                        charArray[j] = '0';
                    }
                }
            }


            int uniqueCount = 0;
            for (int i = 0; i < length; i++) {
                if (charArray[i] != '0') {
                    uniqueCount++;
                }
            }

            String[] result = new String[uniqueCount];
            int index = 0;

            for (int i = 0; i < length; i++) {
                if (charArray[i] != '0') {
                    result[index] = charArray[i] + " = " + freq[i];
                    index++;
                }
            }

            return result;
        }


        public static void displayFrequency(String[] frequencyArray) {
            System.out.println("\nCharacter Frequency Table:");
            System.out.println("---------------------------");
            System.out.println("Character\tFrequency");
            System.out.println("---------------------------");

            for (String entry : frequencyArray) {
                String[] parts = entry.split(" = ");
                System.out.println("    " + parts[0] + "\t\t    " + parts[1]);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter a string: ");
            String input = sc.nextLine();


            String[] frequencies = findCharacterFrequency(input);


            displayFrequency(frequencies);

            sc.close();
        }
    }


