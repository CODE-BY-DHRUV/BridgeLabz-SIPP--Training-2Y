import java.util.Scanner;

public class CollinearPoints {
        public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
            double slopeAB = (double) (y2 - y1) / (x2 - x1);
            double slopeBC = (double) (y3 - y2) / (x3 - x2);


            return slopeAB == slopeBC;
        }

        public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {

            double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));


            return area == 0.0;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter coordinates for Point A (x1 y1): ");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            System.out.println("Enter coordinates for Point B (x2 y2): ");
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            System.out.println("Enter coordinates for Point C (x3 y3): ");
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();


            boolean collinearSlope = areCollinearSlope(x1, y1, x2, y2, x3, y3);


            boolean collinearArea = areCollinearArea(x1, y1, x2, y2, x3, y3);

            System.out.println("\n--- Results ---");

            if (collinearSlope) {
                System.out.println("Using Slope Formula: The points are Collinear.");
            } else {
                System.out.println("Using Slope Formula: The points are NOT Collinear.");
            }

            if (collinearArea) {
                System.out.println("Using Area Formula: The points are Collinear.");
            } else {
                System.out.println("Using Area Formula: The points are NOT Collinear.");
            }

            sc.close();
        }
    }


