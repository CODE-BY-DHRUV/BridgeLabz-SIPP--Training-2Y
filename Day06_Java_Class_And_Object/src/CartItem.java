class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void displayDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Headphones", 50, 2);
        item.displayDetails();
    }
}

