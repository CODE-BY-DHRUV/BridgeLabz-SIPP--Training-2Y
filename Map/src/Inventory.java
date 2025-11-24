import java.util.*;

public class Inventory {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();

        stock.put("Laptop", 10);
        stock.put("Phone", 5);
        stock.put("Mouse", 20);

        stock.put("Phone", stock.get("Phone") - 3);
        if(stock.get("Phone") <= 0) stock.put("Phone", 0);

        stock.put("Laptop", stock.get("Laptop") + 5);

        String prod = "Phone";
        System.out.println(prod + " remaining: " + stock.getOrDefault(prod, -1));

        System.out.println("Out of stock:");
        for(String p : stock.keySet()){
            if(stock.get(p) == 0) System.out.println(p);
        }
    }
}
