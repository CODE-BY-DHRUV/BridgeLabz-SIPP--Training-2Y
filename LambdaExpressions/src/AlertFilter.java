import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;  // "critical", "normal", "info"
    Alert(String type) { this.type = type; }
}

public class AlertFilter {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("critical"),
                new Alert("info"),
                new Alert("normal")
        );

        // User wants only critical alerts
        Predicate<Alert> criticalOnly = alert -> alert.type.equals("critical");

        alerts.stream()
                .filter(criticalOnly)
                .forEach(alert -> System.out.println("Showing: " + alert.type));
    }
}
