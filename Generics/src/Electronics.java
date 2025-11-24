import java.util.*;

class Cart<T> {
    List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }

    public void displayItems() {
        for (T i : items) System.out.println(i);
    }
}

class Electronics { }
class Clothing { }

class TestCart {
    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics());

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing());
    }
}

