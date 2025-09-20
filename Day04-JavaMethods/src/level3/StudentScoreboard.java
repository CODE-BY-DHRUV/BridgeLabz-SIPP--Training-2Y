import java.util.Scanner;
public class StudentScoreboard {
        public static int[][] generateRandomScores(int numStudents) {
            int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math
            for (int i = 0; i < numStudents; i++) {
                for (int j = 0; j < 3; j++) {
                    scores[i][j] = (int) (Math.random() * 51) + 50; // Random 2-digit score between 50-100
                }
            }
            return scores;
        }
        public static double[][] calculateResults(int[][] scores) {
            int numStudents = scores.length;
            double[][] results = new double[numStudents][3]; // Total, Average, Percentage

            for (int i = 0; i < numStudents; i++) {
                int total = 0;
                for (int j = 0; j < 3; j++) {
                    total += scores[i][j];
                }
                double average = total / 3.0;
                double percentage = (total / 300.0) * 100; // Max marks per subject = 100, total max = 300


                average = Math.round(average * 100.0) / 100.0;
                percentage = Math.round(percentage * 100.0) / 100.0;

                results[i][0] = total;
                results[i][1] = average;
                results[i][2] = percentage;
            }
            return results;
        }
        public static void displayScoreboard(int[][] scores, double[][] results) {
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
            System.out.println("---------------------------------------------------------------------------------------------------");

            for (int i = 0; i < scores.length; i++) {
                System.out.printf("%d\t", (i + 1));
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%d\t\t", scores[i][j]);
                }
                System.out.printf("%.0f\t%.2f\t%.2f%%\n",
                        results[i][0], results[i][1], results[i][2]);
            }

            System.out.println("---------------------------------------------------------------------------------------------------");
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of students: ");
            int numStudents = sc.nextInt();

            int[][] scores = generateRandomScores(numStudents);


            double[][] results = calculateResults(scores);


            displayScoreboard(scores, results);

            sc.close();
        }
    }


