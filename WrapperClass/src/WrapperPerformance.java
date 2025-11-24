import java.util.*;

public class WrapperPerformance {
    public static void main(String[] args) {

        int size = 1_000_000;

        // int[] benchmark
        int[] arr = new int[size];
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < size; i++) arr[i] = i;
        long sum1 = 0;
        for (int i : arr) sum1 += i;
        long t2 = System.currentTimeMillis();

        // ArrayList<Integer> benchmark
        ArrayList<Integer> list = new ArrayList<>();
        long t3 = System.currentTimeMillis();
        for (int i = 0; i < size; i++) list.add(i); // auto-boxing overhead
        long sum2 = 0;
        for (int i : list) sum2 += i;               // auto-unboxing overhead
        long t4 = System.currentTimeMillis();

        System.out.println("int[] time = " + (t2 - t1));
        System.out.println("ArrayList<Integer> time = " + (t4 - t3));
    }
}
