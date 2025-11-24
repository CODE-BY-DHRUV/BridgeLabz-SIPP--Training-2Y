import java.util.Scanner;
public class countNumberOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                System.out.print("Enter an integer: ");
                int number = sc.nextInt();
                int count = 0;
                int n = number;
                if (n == 0) {
                    count = 1;
                }
                else {
                    while (n != 0) {
                        n = n / 10;
                        count++;
                    }
                }
                System.out.println("Number of digits in " + number + " = " + count);
            }
        }
