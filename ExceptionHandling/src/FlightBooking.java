class SeatUnavailableException extends Exception { public SeatUnavailableException(String m){super(m);} }
class PaymentFailedException2 extends Exception { public PaymentFailedException2(String m){super(m);} }

class FlightBooking {
    public void checkSeatAvailability() throws SeatUnavailableException {
        throw new SeatUnavailableException("No seats available!");
    }

    public void processPayment() throws PaymentFailedException2 {
        throw new PaymentFailedException2("Payment processing failed!");
    }

    public void bookTicket() throws Exception {
        checkSeatAvailability();
        processPayment();
    }
}

public class Main {
    public static void main(String[] args) {
        FlightBooking fb = new FlightBooking();

        try {
            fb.bookTicket();
        } catch (SeatUnavailableException e) {
            System.out.println("Seat Error: " + e.getMessage());
        } catch (PaymentFailedException2 e) {
            System.out.println("Payment Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}
