import java.util.Scanner;
public class greatestFactorWhile {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();
            int greatestFactor = 1;
            if (number <= 1) {
                System.out.println("Number should be greater than 1 to have a proper factor.");
            }
            else {
                int i=number-1;
               while(i>=1) {
                    if (number % i == 0) {
                        greatestFactor = i;
                        break;
                    }
                    i--;
                }
                System.out.println("Greatest factor of " + number + " (beside itself) is: " + greatestFactor);
            }
            sc.close();
        }
    }

