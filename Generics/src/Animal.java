import java.util.*;

class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }

class AnimalPrinter {
    public static void printAnimals(List<? extends Animal> list) {
        for (Animal a : list) System.out.println(a.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        printAnimals(Arrays.asList(new Dog(), new Dog()));
        printAnimals(Arrays.asList(new Cat(), new Cat()));
    }
}

