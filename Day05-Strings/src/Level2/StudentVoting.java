import java.util.Scanner;
import java.util.Random;
public class StudentVoting {
        public static int[] generateRandomAges(int n) {
            int[] ages = new int[n];
            Random rand = new Random();
            for (int i = 0; i < n; i++) {
                ages[i] = rand.nextInt(90) + 10; // random age between 10 and 99
            }
            return ages;
        }
        public static String[][] checkVotingEligibility(int[] ages) {
            String[][] result = new String[ages.length][2];

            for (int i = 0; i < ages.length; i++) {
                result[i][0] = String.valueOf(ages[i]);
                if (ages[i] < 0) {
                    result[i][1] = "Cannot Vote";
                } else if (ages[i] >= 18) {
                    result[i][1] = "Can Vote";
                } else {
                    result[i][1] = "Cannot Vote";
                }
            }

            return result;
        }
        public static void display2DArray(String[][] arr) {
            System.out.println("\nAge\tVoting Eligibility");
            System.out.println("---------------------------");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i][0] + "\t" + arr[i][1]);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = 10;
            int[] ages = new int[n];

            System.out.println("Enter ages of 10 students:");
            for (int i = 0; i < n; i++) {
                System.out.print("Student " + (i + 1) + " age: ");
                ages[i] = sc.nextInt();
            }
            String[][] votingResult = checkVotingEligibility(ages);

            display2DArray(votingResult);

            sc.close();
        }
    }


