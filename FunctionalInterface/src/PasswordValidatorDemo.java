interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[@#$%^&+=].*");
    }
}

 class PasswordValidatorDemo {
    public static void main(String[] args) {
        String pass = "Abcd@123";
        System.out.println("Strong password? " + SecurityUtils.isStrongPassword(pass));
    }
}

