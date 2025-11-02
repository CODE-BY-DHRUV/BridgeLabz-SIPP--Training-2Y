import java.util.Scanner;

public class DiscountForStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fees = sc.nextInt();
        int discountPercent = sc.nextInt();
        int disAmount = (discountPercent * fees) / 100;
        int disPrice = fees - disAmount ;
        System.out.println("The discount amount is INR " + disAmount + " and final discounted fee is INR " + disPrice);




    }
}
