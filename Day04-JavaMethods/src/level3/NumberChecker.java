import java.util.Arrays;
public class NumberChecker {
        public static int countDigits(int num) {
            int count = 0;
            int temp = Math.abs(num);
            if (temp == 0) return 1;
            while (temp > 0) {
                count++;
                temp /= 10;
            }
            return count;
        }
        public static int[] getDigitsArray(int num) {
            int numDigits = countDigits(num);
            int[] digits = new int[numDigits];
            int temp = Math.abs(num);
            for (int i = numDigits - 1; i >= 0; i--) {
                digits[i] = temp % 10;
                temp /= 10;
            }
            return digits;
        }
        public static boolean isDuckNumber(int num) {
            int[] digits = getDigitsArray(num);
            for (int digit : digits) {
                if (digit != 0) return true;
            }
            return false;
        }
        public static boolean isArmstrongNumber(int num) {
            int[] digits = getDigitsArray(num);
            int n = digits.length;
            int sum = 0;
            for (int digit : digits) {
                sum += Math.pow(digit, n);
            }
            return sum == num;
        }
        public static int[] findLargestAndSecondLargest(int num) {
            int[] digits = getDigitsArray(num);
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int digit : digits) {
                if (digit > largest) {
                    secondLargest = largest;
                    largest = digit;
                } else if (digit > secondLargest && digit != largest) {
                    secondLargest = digit;
                }
            }
            return new int[]{largest, secondLargest};
        }
        public static int[] findSmallestAndSecondSmallest(int num) {
            int[] digits = getDigitsArray(num);
            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

            for (int digit : digits) {
                if (digit < smallest) {
                    secondSmallest = smallest;
                    smallest = digit;
                } else if (digit < secondSmallest && digit != smallest) {
                    secondSmallest = digit;
                }
            }
            return new int[]{smallest, secondSmallest};
        }
        public static void main(String[] args) {
            int number = 153;

            System.out.println("Number: " + number);
            int count = countDigits(number);
            System.out.println("Number of digits: " + count);
            int[] digits = getDigitsArray(number);
            System.out.println("Digits array: " + Arrays.toString(digits));

            boolean isDuck = isDuckNumber(number);
            System.out.println("Is Duck Number? " + isDuck);

            boolean isArmstrong = isArmstrongNumber(number);
            System.out.println("Is Armstrong Number? " + isArmstrong);


            int[] largestTwo = findLargestAndSecondLargest(number);
            System.out.println("Largest digit: " + largestTwo[0]);
            System.out.println("Second largest digit: " + largestTwo[1]);


            int[] smallestTwo = findSmallestAndSecondSmallest(number);
            System.out.println("Smallest digit: " + smallestTwo[0]);
            System.out.println("Second smallest digit: " + smallestTwo[1]);
        }
    }


