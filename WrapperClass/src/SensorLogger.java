import java.util.ArrayList;

public class SensorLogger {

    static ArrayList<Double> logs = new ArrayList<>();

    public static void log(double temp) {   // primitive
        logs.add(temp);                    // auto-boxing
    }

    public static void log(Double temp) {  // wrapper
        logs.add(temp);
    }

    public static void main(String[] args) {
        log(36.5);       // primitive
        log(37.2);       // wrapper

        for (Double d : logs) {
            System.out.println("Temp: " + d);  // auto-unboxing
        }
    }
}

