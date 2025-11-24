public class AgeValidator {

    public static boolean isValidAge(String age) {
        try {
            int val = Integer.parseInt(age);
            return val >= 18;
        } catch (Exception e) {
            return false;
        }
    }
}

