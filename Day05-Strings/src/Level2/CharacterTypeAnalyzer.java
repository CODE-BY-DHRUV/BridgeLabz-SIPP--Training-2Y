import java.util.Scanner;
public class CharacterTypeAnalyzer {
        public static String checkChar(char ch) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    return "Vowel";
                } else {
                    return "Consonant";
                }
            } else {
                return "Not a Letter";
            }
        }

        public static String[][] analyzeString(String text) {
            int length = text.length();
            String[][] result = new String[length][2];

            for (int i = 0; i < length; i++) {
                char ch = text.charAt(i);
                result[i][0] = String.valueOf(ch);
                result[i][1] = checkChar(ch);
            }

            return result;
        }
        public static void display2DArray(String[][] arr) {
            System.out.println("\nCharacter\tType");
            System.out.println("-------------------------");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String inputText = sc.nextLine();

            String[][] analysisResult = analyzeString(inputText);

            display2DArray(analysisResult);

            sc.close();
        }
    }


