import java.util.*;

class Vehicle { }
class Truck extends Vehicle { }
class Bike extends Vehicle { }

class FleetManager<T extends Vehicle> {
    List<T> fleet = new ArrayList<>();

    public void addVehicle(T v) { fleet.add(v); }

    public void showFleet() {
        for (T v : fleet) System.out.println(v.getClass().getSimpleName());
    }
}

class TestFleet {
    public static void main(String[] args) {
        FleetManager<Truck> t = new FleetManager<>();
        t.addVehicle(new Truck());

        FleetManager<Bike> b = new FleetManager<>();
        b.addVehicle(new Bike());
    }
}

