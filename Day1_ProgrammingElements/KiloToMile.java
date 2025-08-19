import java.util.Scanner;

public class KiloToMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double mile = km / 1.6;
        System.out.println(mile);

    }
}
