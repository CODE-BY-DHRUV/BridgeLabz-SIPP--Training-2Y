import java.util.Scanner;
public class LargestAndSecondLargest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = sc.nextInt();


            final int maxDigit = 10;
            int[] digits = new int[maxDigit];
            int index = 0;


            while (number != 0 && index < maxDigit) {
                int lastDigit = number % 10;
                digits[index] = lastDigit;
                index++;
                number = number / 10;
            }


            int largest = -1;
            int secondLargest = -1;

            for (int i = 0; i < index; i++) {
                int current = digits[i];

                if (current > largest) {
                    secondLargest = largest;
                    largest = current;
                } else if (current > secondLargest && current < largest) {
                    secondLargest = current;
                }
            }


            System.out.println("\nDigits stored in array:");
            for (int i = 0; i < index; i++) {
                System.out.print(digits[i] + " ");
            }

            System.out.println("\n\nLargest digit: " + largest);
            if (secondLargest != -1) {
                System.out.println("Second Largest digit: " + secondLargest);
            } else {
                System.out.println("Second Largest digit: Not found (all digits are same or only one digit present)");
            }

            sc.close();
        }
    }


