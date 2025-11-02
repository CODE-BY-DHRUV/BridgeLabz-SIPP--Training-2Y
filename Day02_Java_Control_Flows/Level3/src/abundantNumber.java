import java.util.Scanner;
public class abundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                // Get input
                System.out.print("Enter an integer: ");
                int number = sc.nextInt();
                int sum = 0;
                // Find divisors and calculate their sum
                for (int i = 1; i < number; i++) {
                    if (number % i == 0) {
                        sum += i;
                    }
                }
                // Check abundant condition
                if (sum > number) {
                    System.out.println(number + " is an Abundant Number.");
                } else {
                    System.out.println(number + " is NOT an Abundant Number.");
                }
            }
        }
