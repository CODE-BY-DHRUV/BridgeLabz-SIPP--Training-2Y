import java.util.Scanner;
public class reverseNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Take user input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Step 2: Find digit count
            int temp = number;
            int count = 0;
            while (temp > 0) {
                count++;
                temp /= 10;
            }

            // Step 3: Create array to store digits
            int[] digits = new int[count];

            // Step 4: Extract digits and store in array
            temp = number; // reset temp
            for (int i = 0; i < count; i++) {
                digits[i] = temp % 10; // store last digit
                temp /= 10;            // remove last digit
            }

            // Step 5: Create another array to store reversed digits
            int[] reversed = new int[count];
            for (int i = 0; i < count; i++) {
                reversed[i] = digits[count - 1 - i];
            }

            // Step 6: Display reversed array as reversed number
            System.out.print("\nReversed number: ");
            for (int i = 0; i < count; i++) {
                System.out.print(reversed[i]);
            }

            sc.close();
        }
    }
