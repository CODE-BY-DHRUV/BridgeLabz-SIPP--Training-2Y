class Product<T> {
    private double price;
    private T category;

    public Product(double price, T category) {
        this.price = price;
        this.category = category;
    }

    public double getPrice() { return price; }
    public void setPrice(double p) { price = p; }
}

class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        double newPrice = product.getPrice() * (1 - percent / 100);
        product.setPrice(newPrice);
    }
}

