import java.util.*;

public class UpperCaseNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("rahul", "meena", "anjali");

        names.stream()
                .map(String::toUpperCase)   // instead of s -> s.toUpperCase()
                .forEach(System.out::println);
    }
}
