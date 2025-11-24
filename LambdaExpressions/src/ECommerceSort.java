import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
}

public class ECommerceSort {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Shoes", 2000, 4.3, 10),
                new Product("Phone", 15000, 4.8, 20),
                new Product("Watch", 3000, 4.0, 15)
        );

        // Sort by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));

        // Sort by rating (descending)
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));

        // Sort by discount (descending)
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
    }
}
