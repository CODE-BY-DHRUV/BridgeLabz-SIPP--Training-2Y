@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartHome {
    public static void main(String[] args) {

        // Motion trigger
        LightAction motionTrigger = () ->
                System.out.println("Lights ON with soft white glow.");

        // Time-of-day trigger
        LightAction eveningTrigger = () ->
                System.out.println("Warm yellow lights activated.");

        // Voice command trigger
        LightAction voiceTrigger = () ->
                System.out.println("Colorful ambient lights ON.");

        motionTrigger.activate();
        eveningTrigger.activate();
        voiceTrigger.activate();
    }
}
