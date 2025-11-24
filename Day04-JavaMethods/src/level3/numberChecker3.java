import java.util.Arrays;
public class numberChecker3 {
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
        public static int[] reverseDigitsArray(int[] digits) {
            int[] reversed = new int[digits.length];
            for (int i = 0; i < digits.length; i++) {
                reversed[i] = digits[digits.length - 1 - i];
            }
            return reversed;
        }
        public static boolean compareArrays(int[] arr1, int[] arr2) {
            if (arr1.length != arr2.length) return false;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) return false;
            }
            return true;
        }
        public static boolean isPalindrome(int num) {
            int[] digits = getDigitsArray(num);
            int[] reversed = reverseDigitsArray(digits);
            return compareArrays(digits, reversed);
        }
        public static boolean isDuckNumber(int num) {
            int[] digits = getDigitsArray(num);
            for (int digit : digits) {
                if (digit != 0) return true;
            }
            return false;
        }
        public static void main(String[] args) {
            int number = 121;
            System.out.println("Number: " + number);

            int count = countDigits(number);
            System.out.println("Number of digits: " + count);

            int[] digits = getDigitsArray(number);
            System.out.println("Digits array: " + Arrays.toString(digits));

            int[] reversedDigits = reverseDigitsArray(digits);
            System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));

            boolean arraysEqual = compareArrays(digits, reversedDigits);
            System.out.println("Are digits array and reversed array equal? " + arraysEqual);

            boolean palindrome = isPalindrome(number);
            System.out.println("Is Palindrome? " + palindrome);

            boolean duck = isDuckNumber(number);
            System.out.println("Is Duck Number? " + duck);
        }
    }


