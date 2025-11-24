class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String msg) {
        super(msg);
    }
}

class LoginSystem {
    private final String validUser = "admin";
    private final String validPass = "1234";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        }
        System.out.println("Login successful!");
    }
}

 public class Main {
    public static void main(String[] args) {
        LoginSystem ls = new LoginSystem();

        try {
            ls.validate("admin", "0000");
        } catch (InvalidCredentialsException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}

