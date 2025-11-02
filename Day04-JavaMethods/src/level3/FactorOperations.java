import java.util.Arrays;
public class FactorOperations {
        public static int[] findFactors(int num) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) count++;
            }
            int[] factors = new int[count];
            int index = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) factors[index++] = i;
            }

            return factors;
        }
        public static int greatestFactor(int[] factors) {
            int greatest = factors[0];
            for (int factor : factors) {
                if (factor > greatest) greatest = factor;
            }
            return greatest;
        }
        public static int sumOfFactors(int[] factors) {
            int sum = 0;
            for (int factor : factors) sum += factor;
            return sum;
        }
        public static long productOfFactors(int[] factors) {
            long product = 1;
            for (int factor : factors) product *= factor;
            return product;
        }
        public static long productOfCubes(int[] factors) {
            long product = 1;
            for (int factor : factors) product *= Math.pow(factor, 3);
            return product;
        }
        public static void main(String[] args) {
            int number = 6;

            int[] factors = findFactors(number);
            System.out.println("Factors of " + number + ": " + Arrays.toString(factors));

            int greatest = greatestFactor(factors);
            System.out.println("Greatest factor: " + greatest);

            int sum = sumOfFactors(factors);
            System.out.println("Sum of factors: " + sum);

            long product = productOfFactors(factors);
            System.out.println("Product of factors: " + product);

            long productCubes = productOfCubes(factors);
            System.out.println("Product of cubes of factors: " + productCubes);
        }
    }


