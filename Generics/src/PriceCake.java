import java.util.*;
abstract class Product {
    abstract double getPrice();
}

class Mobile extends Product {
    public double getPrice() { return 50000; }
}

class Laptop extends Product {
    public double getPrice() { return 70000; }
}

class PriceCalc {
    public static double calculateTotal(List<? extends Product> items) {
        double sum = 0;
        for (Product p : items) sum += p.getPrice();
        return sum;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile(), new Mobile());
        System.out.println(calculateTotal(mobiles));
    }
}


