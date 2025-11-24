class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String msg) {
        super(msg);
    }
}

class TemperatureConverter {
    public double convert(double temp, char unit) throws InvalidTemperatureException {
        if (unit == 'C' && temp < -273.15)
            throw new InvalidTemperatureException("Temperature below absolute zero!");
        if (unit == 'F' && temp < -459.67)
            throw new InvalidTemperatureException("Temperature below absolute zero!");

        if (unit == 'C')
            return (temp * 9/5) + 32;  // C → F
        else
            return (temp - 32) * 5/9;  // F → C
    }
}

public class Main {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        try {
            double result = tc.convert(-300, 'C');
            System.out.println("Converted temp: " + result);
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
