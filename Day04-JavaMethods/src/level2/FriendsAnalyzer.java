import java.util.Scanner;
public class FriendsAnalyzer {
        public static String findYoungest(String[] names, int[] ages) {
            int minAgeIndex = 0;
            for (int i = 1; i < ages.length; i++) {
                if (ages[i] < ages[minAgeIndex]) {
                    minAgeIndex = i;
                }
            }
            return names[minAgeIndex];
        }
        public static String findTallest(String[] names, double[] heights) {
            int maxHeightIndex = 0;
            for (int i = 1; i < heights.length; i++) {
                if (heights[i] > heights[maxHeightIndex]) {
                    maxHeightIndex = i;
                }
            }
            return names[maxHeightIndex];
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] friends = {"Amar", "Akbar", "Anthony"};
            int[] ages = new int[3];
            double[] heights = new double[3];
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter age of " + friends[i] + ": ");
                ages[i] = sc.nextInt();

                System.out.print("Enter height of " + friends[i] + " (in cm): ");
                heights[i] = sc.nextDouble();
            }

            String youngest = findYoungest(friends, ages);
            String tallest = findTallest(friends, heights);
            System.out.println("\nThe youngest friend is: " + youngest);
            System.out.println("The tallest friend is: " + tallest);

            sc.close();
        }
    }


