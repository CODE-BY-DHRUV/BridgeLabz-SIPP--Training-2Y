import java.util.Arrays;
public class FootballTeamHeights {
        public static int calculateSum(int[] heights) {
            int sum = 0;
            for (int height : heights) {
                sum += height;
            }
            return sum;
        }
        public static double calculateMean(int[] heights) {
            int sum = calculateSum(heights);
            return (double) sum / heights.length;
        }
        public static int findShortest(int[] heights) {
            int min = heights[0];
            for (int height : heights) {
                min = Math.min(min, height);
            }
            return min;
        }
        public static int findTallest(int[] heights) {
            int max = heights[0];
            for (int height : heights) {
                max = Math.max(max, height);
            }
            return max;
        }
        public static int[] generateRandomHeights(int size) {
            int[] heights = new int[size];
            for (int i = 0; i < size; i++) {
                heights[i] = (int) (Math.random() * 101) + 150; // 150 to 250 cm
            }
            return heights;
        }

        public static void main(String[] args) {
            int size = 11;
            int[] heights = generateRandomHeights(size);

            System.out.println("Heights of players (in cm): " + Arrays.toString(heights));

            int shortest = findShortest(heights);
            int tallest = findTallest(heights);
            double meanHeight = calculateMean(heights);

            System.out.println("\n--- Football Team Height Analysis ---");
            System.out.println("Shortest height: " + shortest + " cm");
            System.out.println("Tallest height: " + tallest + " cm");
            System.out.printf("Mean height: %.2f cm%n", meanHeight);
        }
    }


