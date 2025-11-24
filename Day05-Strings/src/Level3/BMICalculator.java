
    import java.util.Scanner;

    public class BMICalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[][] personData = new double[10][2];
            System.out.println("Enter the weight (in kg) and height (in cm) for 10 team members:");

            for (int i = 0; i < 10; i++) {
                System.out.printf("Member %d:\n", i + 1);
                System.out.print("  Weight (kg): ");
                personData[i][0] = scanner.nextDouble();
                System.out.print("  Height (cm): ");
                personData[i][1] = scanner.nextDouble();
            }
            String[][] bmiReport = calculateBMIAndStatus(personData);

            displayBMITable(bmiReport);

            scanner.close();
        }

        public static String[][] calculateBMIAndStatus(double[][] personData) {
            String[][] bmiResults = new String[personData.length][4];

            for (int i = 0; i < personData.length; i++) {
                double weight = personData[i][0];
                double heightCm = personData[i][1];

                double heightM = heightCm / 100.0;

                double bmi = Math.round((weight / (heightM * heightM)) * 100.0) / 100.0;
                String status = getBMIStatus(bmi);

                bmiResults[i][0] = String.valueOf(heightCm);
                bmiResults[i][1] = String.valueOf(weight);
                bmiResults[i][2] = String.valueOf(bmi);
                bmiResults[i][3] = status;
            }
            return bmiResults;
        }

        public static String getBMIStatus(double bmi) {
            if (bmi <= 18.4) {
                return "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                return "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                return "Overweight";
            } else {
                return "Obese";
            }
        }

        public static void displayBMITable(String[][] bmiReport) {
            System.out.println("---------------------------------------------------------");
            System.out.printf("| %-10s | %-10s | %-8s | %-12s |\n", "Height (cm)", "Weight (kg)", "BMI", "Status");
            System.out.println("---------------------------------------------------------");

            for (String[] person : bmiReport) {
                System.out.printf("| %-10s | %-10s | %-8s | %-12s |\n", person[0], person[1], person[2], person[3]);
            }
            System.out.println("---------------------------------------------------------");
        }
    }


