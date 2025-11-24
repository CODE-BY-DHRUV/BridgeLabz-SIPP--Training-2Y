
import java.util.*;
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.printf("%s | Driver: %s | rate/km: %.2f%n", vehicleId, driverName, ratePerKm);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    private String location;

    public Car(String id, String driver, double ratePerKm, String initialLocation) {
        super(id, driver, ratePerKm);
        this.location = initialLocation;
    }

    @Override
    public double calculateFare(double distance) {
        double baseFare = 50;
        return baseFare + distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String newLocation) { this.location = newLocation; }
}

class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String id, String driver, double ratePerKm, String initialLocation) {
        super(id, driver, ratePerKm);
        this.location = initialLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return 20 + distance * getRatePerKm(); // lower base fare
    }

    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String newLocation) { this.location = newLocation; }
}

class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String id, String driver, double ratePerKm, String initialLocation) {
        super(id, driver, ratePerKm);
        this.location = initialLocation;
    }
    @Override
    public double calculateFare(double distance) {
        return 30 + distance * getRatePerKm();
    }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String newLocation) { this.location = newLocation; }
}

public class RideHailingDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
                new Car("CAR-01", "Suresh", 18, "MG Road"),
                new Bike("BIKE-01", "Anil", 10, "Brigade Road"),
                new Auto("AUTO-01", "Ramu", 12, "Church Street")
        );

        double distance = 12.5;
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.printf(" Fare for %.1f km = %.2f%n", distance, v.calculateFare(distance));
            if (v instanceof GPS) {
                GPS g = (GPS) v;
                System.out.println(" Location: " + g.getCurrentLocation());
                g.updateLocation("UpdatedLocation");
                System.out.println(" New Location: " + g.getCurrentLocation());
            }
            System.out.println();
        }
    }
}

