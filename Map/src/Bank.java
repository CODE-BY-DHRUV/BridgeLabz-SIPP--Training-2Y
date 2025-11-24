import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Map<String, Double> bank = new HashMap<>();

        bank.put("ACC1", 10000.0);
        bank.put("ACC2", 5000.0);
        bank.put("ACC3", 20000.0);
        bank.put("ACC4", 12000.0);

        bank.put("ACC2", bank.get("ACC2") + 2000);

        double w = 6000;
        if(bank.get("ACC1") >= w) bank.put("ACC1", bank.get("ACC1") - w);
        else System.out.println("Insufficient funds");

        bank.entrySet().stream()
                .sorted((a,b)->Double.compare(b.getValue(), a.getValue()))
                .forEach(System.out::println);

        System.out.println("Top 3:");
        bank.entrySet().stream()
                .sorted((a,b)->Double.compare(b.getValue(), a.getValue()))
                .limit(3)
                .forEach(System.out::println);
    }
}
