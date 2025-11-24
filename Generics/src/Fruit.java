import java.util.*;

class Fruit { }
class Apple extends Fruit { }
class Mango extends Fruit { }
class Car { }

class FruitBox<T extends Fruit> {
    List<T> fruits = new ArrayList<>();

    public void add(T f) {
        fruits.add(f);
    }

    public void display() {
        for (T f : fruits) System.out.println(f.getClass().getSimpleName());
    }
}

class TestFruitBox {
    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Apple());

        box.display();

        // box.add(new Car()); // ❌ Compile-time error
    }
}

