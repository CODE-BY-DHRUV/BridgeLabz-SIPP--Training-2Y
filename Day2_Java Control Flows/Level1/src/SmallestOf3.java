import java.util.Scanner;

public class SmallestOf3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean d = true;
        boolean e = false;
        if(a<=b && b<=c) {
            System.out.println(" Is the first number the smallest?" + d);
        }
        else{
            System.out.println(" Is the first number the smallest?" + e);
        }

    }
}
