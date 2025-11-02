import java.util.Scanner;
public class bmiUsingArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter the number of persons: ");
            int number = sc.nextInt();


            double[][] personData = new double[number][3];
            String[] weightStatus = new String[number];

            for (int i = 0; i < number; i++) {
                System.out.println("\nEnter details for Person " + (i + 1) + ":");


                while (true) {
                    System.out.print("Enter height (in meters): ");
                    personData[i][0] = sc.nextDouble();
                    if (personData[i][0] > 0) break;
                    System.out.println("Height must be greater than 0. Please re-enter.");
                }


                while (true) {
                    System.out.print("Enter weight (in kg): ");
                    personData[i][1] = sc.nextDouble();
                    if (personData[i][1] > 0) break;
                    System.out.println("Weight must be greater than 0. Please re-enter.");
                }
            }


            for (int i = 0; i < number; i++) {
                double height = personData[i][0];
                double weight = personData[i][1];


                personData[i][2] = weight / (height * height);


                double bmi = personData[i][2];
                if (bmi < 18.5) {
                    weightStatus[i] = "Underweight";
                } else if (bmi >= 18.5 && bmi < 24.9) {
                    weightStatus[i] = "Normal";
                } else if (bmi >= 25 && bmi < 29.9) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obese";
                }
            }


            System.out.println("\n=== BMI Report ===");
            System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
            System.out.println("-----------------------------------------------------------");

            for (int i = 0; i < number; i++) {
                System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                        personData[i][0],
                        personData[i][1],
                        personData[i][2],
                        weightStatus[i]);
            }

            sc.close();
        }
    }



