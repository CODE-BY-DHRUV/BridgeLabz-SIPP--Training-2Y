interface Vehicle {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery info not available.");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() { System.out.println("Speed: 80 km/h"); }
    public void displayBattery() { System.out.println("Battery: 85%"); }
}

class GasCar implements Vehicle {
    public void displaySpeed() { System.out.println("Speed: 100 km/h"); }
}

public class DashboardDemo {
    public static void main(String[] args) {
        Vehicle e = new ElectricCar();
        Vehicle g = new GasCar();
        e.displayBattery();
        g.displayBattery(); // uses default
    }
}


