import java.util.Scanner;


public class armstrongNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = String.valueOf(n).length();
            double sum = (double)0.0F;

            for(int temp = n; temp != 0; temp /= 10) {
                int x = temp % 10;
                sum += Math.pow((double)x, (double)count);
            }

            if (sum == (double)n) {
                System.out.println("Armstrong no.");
            } else {
                System.out.println("Not Armstrong no.");
            }

        }
    }

