
    import java.util.Arrays;

    public class OTPGenerator {
        public static int generateOTP() {
            return (int)(Math.random() * 900000) + 100000; // Generates number between 100000 and 999999
        }


        public static boolean areUnique(int[] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int[] otpArray = new int[10];

            for (int i = 0; i < 10; i++) {
                otpArray[i] = generateOTP();
            }

            System.out.println("Generated OTPs: " + Arrays.toString(otpArray));

            boolean unique = areUnique(otpArray);
            System.out.println("Are all OTPs unique? " + unique);
        }
    }


