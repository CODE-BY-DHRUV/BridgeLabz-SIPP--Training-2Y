
import java.util.*;
abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount(); // e.g., seasonal discount
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double discountPercent;

    public Electronics(String id, String name, double price, double discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * (discountPercent / 100.0);
    }

    @Override
    public double calculateTax() {

        return (getPrice() - calculateDiscount()) * 0.18;
    }

    @Override
    public String getTaxDetails() { return "Electronics tax 18%"; }
}

class Clothing extends Product implements Taxable {
    private double flatDiscount;

    public Clothing(String id, String name, double price, double flatDiscount) {
        super(id, name, price);
        this.flatDiscount = flatDiscount;
    }

    @Override
    public double calculateDiscount() {
        return flatDiscount;
    }

    @Override
    public double calculateTax() {

        return (getPrice() - calculateDiscount()) * 0.12;
    }

    @Override
    public String getTaxDetails() { return "Clothing tax 12%"; }
}

class Groceries extends Product {
    public Groceries(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {

        return 0;
    }
}

public class ECommerceDemo {
    public static void printFinalPrices(List<Product> products) {
        for (Product p : products) {
            double price = p.getPrice();
            double discount = p.calculateDiscount();
            double tax = 0;
            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }
            double finalPrice = price + tax - discount;
            System.out.printf("%s (%s): price=%.2f tax=%.2f discount=%.2f final=%.2f%n",
                    p.getName(), p.getClass().getSimpleName(), price, tax, discount, finalPrice);
        }
    }

    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();
        cart.add(new Electronics("E100", "Smartphone", 30000, 10));
        cart.add(new Clothing("C200", "Jeans", 2000, 200));
        cart.add(new Groceries("G300", "Rice 5kg", 400));

        printFinalPrices(cart);
    }
}
