import java.util.*;

public class Cart {
    public static void main(String[] args) {
        Map<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 40000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1500.0);

        for(String p : cart.keySet())
            System.out.println(p + " = " + cart.get(p));

        double total = 0;
        for(double v : cart.values()) total += v;

        if(total > 5000) total *= 0.90;

        System.out.println("Final total = " + total);

        cart.remove("Mouse");
    }
}

