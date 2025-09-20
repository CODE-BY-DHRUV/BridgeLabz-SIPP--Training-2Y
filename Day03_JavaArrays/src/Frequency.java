import java.util.Scanner;
public class Frequency {
    public class DigitFrequency {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            long number = sc.nextLong();
            if (number < 0) {
                number = -number;
            }
            int[] digits = new int[20];
            int index = 0;
            if (number == 0) {
                digits[index++] = 0;
            } else {
                while (number > 0) {
                    digits[index++] = (int) (number % 10);
                    number /= 10;
                }
            }
            int[] frequency = new int[10];
            for (int i = 0; i < index; i++) {
                frequency[digits[i]]++;
            }
            System.out.println("\n=== Digit Frequency ===");
            for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s).");
                }
            }
            sc.close();
        }
    }

}
