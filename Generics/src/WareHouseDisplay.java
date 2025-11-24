import java.util.*;

abstract class WarehouseItem { }

class Electronics extends WarehouseItem { }
class Groceries extends WarehouseItem { }
class Furniture extends WarehouseItem { }

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }
}

class WarehouseDisplay {
    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem i : items)
            System.out.println(i.getClass().getSimpleName());
    }
}

