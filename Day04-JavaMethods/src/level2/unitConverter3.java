import java.util.Scanner;
public class unitConverter3 {
        public static double convertFahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
        public static double convertCelsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }
        public static double convertPoundsToKilograms(double pounds) {
            double pounds2kilograms = 0.453592;
            return pounds * pounds2kilograms;
        }
        public static double convertKilogramsToPounds(double kilograms) {
            double kilograms2pounds = 2.20462;
            return kilograms * kilograms2pounds;
        }
        public static double convertGallonsToLiters(double gallons) {
            double gallons2liters = 3.78541;
            return gallons * gallons2liters;
        }

        public static double convertLitersToGallons(double liters) {
            double liters2gallons = 0.264172;
            return liters * liters2gallons;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("=== Unit Converter Utility ===");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Pounds to Kilograms");
            System.out.println("4. Kilograms to Pounds");
            System.out.println("5. Gallons to Liters");
            System.out.println("6. Liters to Gallons");
            System.out.print("Enter your choice (1-6): ");
            int choice = sc.nextInt();

            double input, result;

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    input = sc.nextDouble();
                    result = convertFahrenheitToCelsius(input);
                    System.out.printf("%.2f°F = %.2f°C%n", input, result);
                    break;

                case 2:
                    System.out.print("Enter temperature in Celsius: ");
                    input = sc.nextDouble();
                    result = convertCelsiusToFahrenheit(input);
                    System.out.printf("%.2f°C = %.2f°F%n", input, result);
                    break;

                case 3:
                    System.out.print("Enter weight in Pounds: ");
                    input = sc.nextDouble();
                    result = convertPoundsToKilograms(input);
                    System.out.printf("%.2f Pounds = %.2f Kilograms%n", input, result);
                    break;

                case 4:
                    System.out.print("Enter weight in Kilograms: ");
                    input = sc.nextDouble();
                    result = convertKilogramsToPounds(input);
                    System.out.printf("%.2f Kilograms = %.2f Pounds%n", input, result);
                    break;

                case 5:
                    System.out.print("Enter volume in Gallons: ");
                    input = sc.nextDouble();
                    result = convertGallonsToLiters(input);
                    System.out.printf("%.2f Gallons = %.2f Liters%n", input, result);
                    break;

                case 6:
                    System.out.print("Enter volume in Liters: ");
                    input = sc.nextDouble();
                    result = convertLitersToGallons(input);
                    System.out.printf("%.2f Liters = %.2f Gallons%n", input, result);
                    break;

                default:
                    System.out.println("Invalid choice! Please run the program again.");
            }

            sc.close();
        }
    }


