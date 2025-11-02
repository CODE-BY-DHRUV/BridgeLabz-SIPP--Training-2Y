import java.util.Scanner;
public class checkNumbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] numbers = new int[5];  // array of 5 numbers
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    if (numbers[i] % 2 == 0) {
                        System.out.println("The number " + numbers[i] + " is Positive and Even.");
                    } else {
                        System.out.println("The number " + numbers[i] + " is Positive and Odd.");
                    }
                } else if (numbers[i] < 0) {
                    System.out.println("The number " + numbers[i] + " is Negative.");
                } else {
                    System.out.println("The number is Zero.");
                }
            }
            int first = numbers[0];
            int last = numbers[numbers.length - 1];

            System.out.println("\nComparison of first and last elements:");
            if (first == last) {
                System.out.println("First element (" + first + ") is equal to last element (" + last + ").");
            } else if (first > last) {
                System.out.println("First element (" + first + ") is greater than last element (" + last + ").");
            } else {
                System.out.println("First element (" + first + ") is less than last element (" + last + ").");
            }
            sc.close();
        }
    }


