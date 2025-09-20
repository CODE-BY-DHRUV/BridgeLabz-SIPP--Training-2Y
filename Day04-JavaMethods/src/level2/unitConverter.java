import java.util.Scanner;
public class unitConverter {
        public static double convertKmToMiles(double km) {
            double km2miles = 0.621371;
            return km * km2miles;
        }
        public static double convertMilesToKm(double miles) {
            double miles2km = 1.60934;
            return miles * miles2km;
        }
        public static double convertMetersToFeet(double meters) {
            double meters2feet = 3.28084;
            return meters * meters2feet;
        }
        public static double convertFeetToMeters(double feet) {
            double feet2meters = 0.3048;
            return feet * feet2meters;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Unit Converter Utility");
            System.out.println("Choose a conversion option:");
            System.out.println("1. Kilometers to Miles");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. Meters to Feet");
            System.out.println("4. Feet to Meters");
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            double input, result;

            switch (choice) {
                case 1:
                    System.out.print("Enter value in Kilometers: ");
                    input = sc.nextDouble();
                    result = convertKmToMiles(input);
                    System.out.printf("%.2f Kilometers = %.2f Miles%n", input, result);
                    break;

                case 2:
                    System.out.print("Enter value in Miles: ");
                    input = sc.nextDouble();
                    result = convertMilesToKm(input);
                    System.out.printf("%.2f Miles = %.2f Kilometers%n", input, result);
                    break;

                case 3:
                    System.out.print("Enter value in Meters: ");
                    input = sc.nextDouble();
                    result = convertMetersToFeet(input);
                    System.out.printf("%.2f Meters = %.2f Feet%n", input, result);
                    break;

                case 4:
                    System.out.print("Enter value in Feet: ");
                    input = sc.nextDouble();
                    result = convertFeetToMeters(input);
                    System.out.printf("%.2f Feet = %.2f Meters%n", input, result);
                    break;

                default:
                    System.out.println("Invalid choice! Please run the program again.");
            }
            sc.close();
        }
    }

