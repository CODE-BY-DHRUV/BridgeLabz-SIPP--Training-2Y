import java.util.Scanner;
public class bmi {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter the number of persons: ");
            int n = sc.nextInt();


            double[] weights = new double[n];
            double[] heights = new double[n];
            double[] bmis = new double[n];
            String[] statuses = new String[n];


            System.out.println("\nEnter details for each person:");
            for (int i = 0; i < n; i++) {
                System.out.println("\nPerson " + (i + 1) + ":");
                System.out.print("Enter weight (in kg): ");
                weights[i] = sc.nextDouble();

                System.out.print("Enter height (in meters): ");
                heights[i] = sc.nextDouble();


                if (weights[i] <= 0 || heights[i] <= 0) {
                    System.out.println("Invalid input! Weight and height must be greater than 0.");
                    i--;
                }
            }


            for (int i = 0; i < n; i++) {
                bmis[i] = weights[i] / (heights[i] * heights[i]);

                if (bmis[i] < 18.5) {
                    statuses[i] = "Underweight";
                } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                    statuses[i] = "Normal";
                } else if (bmis[i] >= 25 && bmis[i] < 29.9) {
                    statuses[i] = "Overweight";
                } else {
                    statuses[i] = "Obese";
                }
            }


            System.out.println("\n=== BMI Report ===");
            System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
            System.out.println("-------------------------------------------------------");

            for (int i = 0; i < n; i++) {
                System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", heights[i], weights[i], bmis[i], statuses[i]);
            }

            sc.close();
        }
    }



