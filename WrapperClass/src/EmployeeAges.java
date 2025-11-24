import java.util.*;

public class EmployeeAges {
    public static void main(String[] args) {

        int[] ages = {32, 45, 28, 50};

        ArrayList<Integer> list = new ArrayList<>();

        for (int a : ages)
            list.add(a);   // auto-boxing

        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("Youngest = " + min);
        System.out.println("Oldest = " + max);
    }
}
