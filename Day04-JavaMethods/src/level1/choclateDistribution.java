import java.util.Scanner;
class ChocolateDistribution {
    public static int chocolatesPerChild(int totalChocolates, int totalChildren) {
        return totalChocolates / totalChildren;
    }
    public static int remainingChocolates(int totalChocolates, int totalChildren) {
        return totalChocolates % totalChildren;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the total number of children: ");
        int numberOfChildren = sc.nextInt();
        if (numberOfChildren == 0) {
            System.out.println("Error: Number of children cannot be zero!");
        } else {
            int eachChildGets = chocolatesPerChild(numberOfChocolates, numberOfChildren);
            int remaining = remainingChocolates(numberOfChocolates, numberOfChildren);

            System.out.println("Each child will get " + eachChildGets + " chocolates.");
            System.out.println("Remaining chocolates: " + remaining);
        }
        sc.close();
    }
}
