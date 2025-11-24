import java.util.*;

public class Salary {
    public static void main(String[] args) {
        Map<String, Double> sal = new HashMap<>();

        sal.put("A", 50000.0);
        sal.put("B", 60000.0);
        sal.put("C", 55000.0);
        sal.put("D", 70000.0);
        sal.put("E", 45000.0);
        sal.put("F", 80000.0);

        sal.put("C", sal.get("C") * 1.10);
        sal.put("E", sal.get("E") * 1.15);

        double sum = 0;
        for(double v : sal.values()) sum += v;
        System.out.println("Average = " + sum / sal.size());

        double max = Collections.max(sal.values());
        System.out.println("Highest-paid:");
        for(String name : sal.keySet())
            if(sal.get(name) == max) System.out.println(name);
    }
}

