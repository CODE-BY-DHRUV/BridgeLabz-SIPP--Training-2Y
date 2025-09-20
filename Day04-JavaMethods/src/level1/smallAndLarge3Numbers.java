import java.util.Scanner;
public class smallAndLarge3Numbers {
    public static void findSmallestAndLargest(int num1, int num2, int num3) {
        int smallest = num1;
        int largest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        findSmallestAndLargest(num1, num2, num3);

        sc.close();
    }
}
