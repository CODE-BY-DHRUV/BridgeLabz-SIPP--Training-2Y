import java.util.Scanner;
public class MarksOfStudents {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of students: ");
            int number = sc.nextInt();
            int[][] marks = new int[number][3];
            double[] percentage = new double[number];
            String[] grade = new String[number];

            for (int i = 0; i < number; i++) {
                System.out.println("\nEnter marks for Student " + (i + 1) + " (out of 100):");

                for (int j = 0; j < 3; j++) {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                    while (true) {
                        System.out.print(subject + ": ");
                        marks[i][j] = sc.nextInt();

                        if (marks[i][j] >= 0 && marks[i][j] <= 100) {
                            break;
                        } else {
                            System.out.println("Invalid input! Marks must be between 0 and 100. Please re-enter.");
                        }
                    }
                }
            }
            for (int i = 0; i < number; i++) {
                int total = marks[i][0] + marks[i][1] + marks[i][2];
                percentage[i] = total / 3.0;


                if (percentage[i] >= 80) {
                    grade[i] = "Level 4";
                } else if (percentage[i] >= 70) {
                    grade[i] = "Level 3";
                } else if (percentage[i] >= 60) {
                    grade[i] = "Level 2";
                } else if (percentage[i] >= 50) {
                    grade[i] = "Level 1";
                } else if (percentage[i] >= 40) {
                    grade[i] = "Level 0";
                } else {
                    grade[i] = "Remedial Standards";
                }
            }

            System.out.println("\n=== Student Report ===");
            System.out.printf("%-10s %-10s %-10s %-10s %-12s %-20s\n",
                    "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade Level");
            System.out.println("--------------------------------------------------------------------------");
            for (int i = 0; i < number; i++) {
                System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-20s\n",
                        (i + 1),
                        marks[i][0], marks[i][1], marks[i][2],
                        percentage[i], grade[i]);
            }
            sc.close();
        }
    }
