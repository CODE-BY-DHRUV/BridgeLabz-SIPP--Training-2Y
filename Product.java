import java.util.Objects;

abstract class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
   abstract double getDistcountedPrice(int price);

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(price, product.price) == 0 && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, quantity);
    }
}

