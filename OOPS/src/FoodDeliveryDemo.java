
import java.util.*;
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int q) { this.quantity = q; }

    public abstract double calculateTotalPrice();
    public void getItemDetails() {
        System.out.printf("%s x%d : unit %.2f | total %.2f%n",
                itemName, quantity, price, calculateTotalPrice());
    }
}

interface Discountable {
    double applyDiscount(); // returns discount amount
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discountPercent;

    public VegItem(String name, double price, int qty, double discountPercent) {
        super(name, price, qty);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateTotalPrice() {
        double sub = getPrice() * getQuantity();
        double disc = sub * (discountPercent / 100.0);
        return sub - disc;
    }

    @Override
    public double applyDiscount() {
        return getPrice() * getQuantity() * (discountPercent / 100.0);
    }

    @Override
    public String getDiscountDetails() { return discountPercent + "% veg offer"; }
}

class NonVegItem extends FoodItem implements Discountable {
    private double extraChargePerItem; // e.g., handling charge
    private double discountPercent;

    public NonVegItem(String name, double price, int qty, double extraChargePerItem, double discountPercent) {
        super(name, price, qty);
        this.extraChargePerItem = extraChargePerItem;
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateTotalPrice() {
        double sub = (getPrice() + extraChargePerItem) * getQuantity();
        double disc = sub * (discountPercent / 100.0);
        return sub - disc;
    }

    @Override
    public double applyDiscount() {
        return (getPrice() + extraChargePerItem) * getQuantity() * (discountPercent / 100.0);
    }

    @Override
    public String getDiscountDetails() { return discountPercent + "% non-veg seasonal"; }
}

public class FoodDeliveryDemo {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Tikka", 180, 2, 10));
        order.add(new NonVegItem("Chicken Biryani", 250, 1, 20, 5));

        double grandTotal = 0;
        for (FoodItem fi : order) {
            fi.getItemDetails();
            if (fi instanceof Discountable) {
                Discountable d = (Discountable) fi;
                System.out.println(" Discount: " + d.applyDiscount() + " | " + d.getDiscountDetails());
            }
            grandTotal += fi.calculateTotalPrice();
        }
        System.out.printf("Grand Total: %.2f%n", grandTotal);
    }
}

