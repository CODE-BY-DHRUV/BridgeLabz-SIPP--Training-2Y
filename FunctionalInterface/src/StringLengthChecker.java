import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> getLength = str -> str.length();

        String msg = "Hello, Functional Interface!";
        System.out.println("Length: " + getLength.apply(msg));
    }
}

