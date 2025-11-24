
import java.util.*;
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate; // per day

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);

    public void getVehicleDetails() {
        System.out.printf("Vehicle: %s | Type: %s | Rate/day: %.2f%n", vehicleNumber, type, rentalRate);
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private double dailyInsurance;

    public Car(String num, double rate, double dailyInsurance) {
        super(num, "Car", rate);
        this.dailyInsurance = dailyInsurance;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return dailyInsurance;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance (daily) applied";
    }
}

class Bike extends Vehicle implements Insurable {
    private double flatInsurance;

    public Bike(String num, double rate, double flatInsurance) {
        super(num, "Bike", rate);
        this.flatInsurance = flatInsurance;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return flatInsurance;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike flat insurance";
    }
}

class Truck extends Vehicle {
    private double perTonSurcharge;
    private double tonnage;

    public Truck(String num, double rate, double perTonSurcharge, double tonnage) {
        super(num, "Truck", rate);
        this.perTonSurcharge = perTonSurcharge;
        this.tonnage = tonnage;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + (perTonSurcharge * tonnage * days);
    }
}

public class VehicleRentalDemo {
    public static void main(String[] args) {
        List<Vehicle> fleet = Arrays.asList(
                new Car("KA01AA0001", 3000, 200),
                new Bike("KA01BB1111", 500, 50),
                new Truck("KA01CC2222", 8000, 1000, 5)
        );

        for (Vehicle v : fleet) {
            v.getVehicleDetails();
            int days = 3;
            System.out.printf(" Rental cost for %d days: %.2f%n", days, v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.printf(" Insurance: %.2f | %s%n", ins.calculateInsurance(), ins.getInsuranceDetails());
            } else {
                System.out.println(" No insurance interface implemented for this vehicle.");
            }
            System.out.println();
        }
    }
}

