import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isHighTemp = temp -> temp > 35.0;

        double currentTemp = 38.5;
        if (isHighTemp.test(currentTemp))
            System.out.println("Alert: Temperature too high!");
        else
            System.out.println("Temperature normal.");
    }
}

