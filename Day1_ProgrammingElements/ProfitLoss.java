import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costPrice = sc.nextInt();
        int sellingPrice = sc.nextInt();
        int profit = sellingPrice - costPrice;
        int loss = costPrice - sellingPrice;
        double profitPercent = (profit * 100) * 100;
        System.out.println("The Cost Price is INR " + costPrice + "and Selling Price is INR \n " + sellingPrice
                + " The Profit is INR " + profit +  " and the Profit Percentage is\n" + profitPercent);
    }
}
