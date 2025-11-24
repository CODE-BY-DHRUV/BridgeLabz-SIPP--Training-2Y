class ServiceOverdueException extends Exception { public ServiceOverdueException(String m){ super(m);} }
class InvalidMileageException extends Exception { public InvalidMileageException(String m){ super(m);} }

class Vehicle {
    public void checkMaintenance(int mileage, boolean overdue)
            throws InvalidMileageException, ServiceOverdueException {

        if (mileage < 0) throw new InvalidMileageException("Mileage cannot be negative!");

        if (overdue) throw new ServiceOverdueException("Service date is overdue!");

        System.out.println("Vehicle is in good condition.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();

        try {
            v.checkMaintenance(-50, false);
        } catch (Exception e) {
            System.out.println("Maintenance alert: " + e.getMessage());
        }
    }
}

