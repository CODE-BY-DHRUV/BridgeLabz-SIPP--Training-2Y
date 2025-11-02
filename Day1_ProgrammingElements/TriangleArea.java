import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double baseInches = sc.nextDouble();
        double heightInches = sc.nextDouble();


        double areaInSqInches = 0.5 * baseInches * heightInches;


        double areaInSqCm = areaInSqInches * 6.4516;

        System.out.printf("The area of the triangle is %.2f square inches or %.2f square centimeters.%n",
                areaInSqInches, areaInSqCm);

        sc.close();

    }
}
