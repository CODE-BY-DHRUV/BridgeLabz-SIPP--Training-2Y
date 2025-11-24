import java.util.Arrays;
public class numberChecker2 {
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
        public static int sumOfDigits(int num) {
            int[] digits = getDigitsArray(num);
            int sum = 0;
            for (int digit : digits) sum += digit;
            return sum;
        }
        public static int sumOfSquaresOfDigits(int num) {
            int[] digits = getDigitsArray(num);
            int sum = 0;
            for (int digit : digits) {
                sum += Math.pow(digit, 2);
            }
            return sum;
        }
        public static boolean isHarshadNumber(int num) {
            int sumDigits = sumOfDigits(num);
            return sumDigits != 0 && num % sumDigits == 0;
        }

        public static int[][] digitFrequency(int num) {
            int[] digits = getDigitsArray(num);
            int[][] freq = new int[10][2];

            for (int i = 0; i < 10; i++) {
                freq[i][0] = i;
                freq[i][1] = 0;
            }
            for (int digit : digits) {
                freq[digit][1]++;
            }

            return freq;
        }

        public static void main(String[] args) {
            int number = 1729;
            System.out.println("Number: " + number);


            int count = countDigits(number);
            System.out.println("Number of digits: " + count);


            int[] digits = getDigitsArray(number);
            System.out.println("Digits array: " + Arrays.toString(digits));


            int sumDigits = sumOfDigits(number);
            System.out.println("Sum of digits: " + sumDigits);


            int sumSquares = sumOfSquaresOfDigits(number);
            System.out.println("Sum of squares of digits: " + sumSquares);


            boolean harshad = isHarshadNumber(number);
            System.out.println("Is Harshad Number? " + harshad);


            int[][] freq = digitFrequency(number);
            System.out.println("\nDigit Frequency:");
            System.out.println("Digit | Frequency");
            for (int i = 0; i < 10; i++) {
                if (freq[i][1] > 0) {
                    System.out.println("  " + freq[i][0] + "   |    " + freq[i][1]);
                }
            }
        }
    }


