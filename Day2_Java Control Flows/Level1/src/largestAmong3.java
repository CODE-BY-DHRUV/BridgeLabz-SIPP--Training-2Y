import java.util.Scanner;

public class largestAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Is the first number the largest? " + isFirstLargest(a, b, c));
        System.out.println("Is the second number the largest? " + isSecondLargest(a, b, c));
        System.out.println("Is the third number the largest? " + isThirdLargest(a, b, c));
    }

    public static boolean isFirstLargest(int a, int b, int c) {
        return a >= b && a >= c;
    }

    public static boolean isSecondLargest(int a, int b, int c) {
        return b >= a && b >= c;
    }

    public static boolean isThirdLargest(int a, int b, int c) {
        return c >= a && c >= b;
    }
}
