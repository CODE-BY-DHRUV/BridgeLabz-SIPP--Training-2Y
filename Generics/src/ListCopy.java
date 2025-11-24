import java.util.*;

class ListCopy {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) dest.add(n);
    }

    public static void main(String[] args) {
        List<Number> d = new ArrayList<>();
        List<Integer> s = Arrays.asList(1, 2, 3);

        copyList(d, s);
        System.out.println(d);
    }
}
