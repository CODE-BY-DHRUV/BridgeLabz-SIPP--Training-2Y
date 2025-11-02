import java.util.Scanner;
public class unitConverter2 {
    public class UnitConverter {
        public static double convertYardsToFeet(double yards) {
            double yards2feet = 3;
            return yards * yards2feet;
        }
        public static double convertFeetToYards(double feet) {
            double feet2yards = 0.333333;
            return feet * feet2yards;
        }
        public static double convertMetersToInches(double meters) {
            double meters2inches = 39.3701;
            return meters * meters2inches;
        }
        public static double convertInchesToMeters(double inches) {
            double inches2meters = 0.0254;
            return inches * inches2meters;
        }
        public static double convertInchesToCentimeters(double inches) {
            double inches2cm = 2.54;
            return inches * inches2cm;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("=== Unit Converter Utility ===");
            System.out.println("1. Yards to Feet");
            System.out.println("2. Feet to Yards");
            System.out.println("3. Meters to Inches");
            System.out.println("4. Inches to Meters");
            System.out.println("5. Inches to Centimeters");
            System.out.print("Enter your choice (1-5): ");
            int choice = sc.nextInt();

            double input, result;

            switch (choice) {
                case 1:
                    System.out.print("Enter value in Yards: ");
                    input = sc.nextDouble();
                    result = convertYardsToFeet(input);
                    System.out.printf("%.2f Yards = %.2f Feet%n", input, result);
                    break;

                case 2:
                    System.out.print("Enter value in Feet: ");
                    input = sc.nextDouble();
                    result = convertFeetToYards(input);
                    System.out.printf("%.2f Feet = %.2f Yards%n", input, result);
                    break;

                case 3:
                    System.out.print("Enter value in Meters: ");
                    input = sc.nextDouble();
                    result = convertMetersToInches(input);
                    System.out.printf("%.2f Meters = %.2f Inches%n", input, result);
                    break;

                case 4:
                    System.out.print("Enter value in Inches: ");
                    input = sc.nextDouble();
                    result = convertInchesToMeters(input);
                    System.out.printf("%.2f Inches = %.4f Meters%n", input, result);
                    break;

                case 5:
                    System.out.print("Enter value in Inches: ");
                    input = sc.nextDouble();
                    result = convertInchesToCentimeters(input);
                    System.out.printf("%.2f Inches = %.2f Centimeters%n", input, result);
                    break;

                default:
                    System.out.println("Invalid choice! Please run the program again.");
            }

            sc.close();
        }
    }

}
