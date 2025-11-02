import java.util.Random;
public class StudentScorecard {
        public static void main(String[] args) {

            int numStudents = 10;
            int[][] studentScores = generateRandomScores(numStudents);
            double[][] studentStats = calculateStats(studentScores);
            String[] studentGrades = assignGrades(studentStats);

            displayScorecard(studentScores, studentStats, studentGrades);
        }
        public static int[][] generateRandomScores(int numStudents) {
            int[][] scores = new int[numStudents][3];
            Random rand = new Random();
            for (int i = 0; i < numStudents; i++) {
                for (int j = 0; j < 3; j++) {
                    scores[i][j] = rand.nextInt(90) + 10;
                }
            }
            return scores;
        }
        public static double[][] calculateStats(int[][] scores) {
            double[][] stats = new double[scores.length][6];

            for (int i = 0; i < scores.length; i++) {
                int total = 0;
                for (int j = 0; j < 3; j++) {
                    stats[i][j] = scores[i][j];
                    total += scores[i][j];
                }

                stats[i][3] = total;
                stats[i][4] = (double) total / 3;
                stats[i][5] = Math.round(((double) total / 300) * 100 * 100.0) / 100.0;
            }
            return stats;
        }
        public static String[] assignGrades(double[][] stats) {
            String[] grades = new String[stats.length];
            for (int i = 0; i < stats.length; i++) {
                double percentage = stats[i][5];


                if (percentage >= 80) {
                    grades[i] = "A";
                } else if (percentage >= 70) {
                    grades[i] = "B";
                } else if (percentage >= 60) {
                    grades[i] = "C";
                } else if (percentage >= 50) {
                    grades[i] = "D";
                } else if (percentage >= 40) {
                    grades[i] = "E";
                } else {
                    grades[i] = "R";
                }
            }
            return grades;
        }


        public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.printf("| %-8s | %-8s | %-8s | %-8s | %-8s | %-12s | %-8s |\n", "Student", "Physics", "Chem", "Math", "Total", "Percentage", "Grade");
            System.out.println("---------------------------------------------------------------------------------");

            for (int i = 0; i < scores.length; i++) {
                System.out.printf("| %-8d | %-8d | %-8d | %-8d | %-8.2f | %-12.2f | %-8s |\n",
                        i + 1,
                        scores[i][0],
                        scores[i][1],
                        scores[i][2],
                        stats[i][3],
                        stats[i][5],
                        grades[i]);
            }
            System.out.println("---------------------------------------------------------------------------------");
        }
    }



