import java.util.Scanner;
public class TallestAmongFriends {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            final int FRIENDS = 3;
            String[] names = {"Amar", "Akbar", "Anthony"};
            double[] ages = new double[FRIENDS];
            double[] heights = new double[FRIENDS];

            System.out.println("=== Find Youngest and Tallest Friend ===");

            // Step 1: Take input
            for (int i = 0; i < FRIENDS; i++) {
                System.out.println("\nEnter details for " + names[i] + ":");

                System.out.print("Age: ");
                ages[i] = sc.nextDouble();

                System.out.print("Height (in cm): ");
                heights[i] = sc.nextDouble();
            }

            // Step 2: Initialize indices for youngest and tallest
            int youngestIndex = 0;
            int tallestIndex = 0;

            // Step 3: Find youngest and tallest
            for (int i = 1; i < FRIENDS; i++) {
                // Check for youngest
                if (ages[i] < ages[youngestIndex]) {
                    youngestIndex = i;
                }
                // Check for tallest
                if (heights[i] > heights[tallestIndex]) {
                    tallestIndex = i;
                }
            }

            // Step 4: Display results
            System.out.println("\n=== Results ===");
            System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + " years)");
            System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

            sc.close();
        }
    }


