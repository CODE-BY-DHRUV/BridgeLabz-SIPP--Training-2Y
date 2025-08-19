import java.util.Scanner;
public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        // 1 yard = 3 feet
        double yards = feet / 3;

        // 1 mile = 1760 yards
        double miles = yards / 1760;

        System.out.printf("The distance %.2f feet is %.2f yards or %.4f miles.%n", feet, yards, miles);

        sc.close();
    }
}
