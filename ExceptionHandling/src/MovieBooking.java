import java.util.*;

class InvalidSeatException extends Exception { public InvalidSeatException(String m){super(m);} }
class SeatAlreadyBookedException extends Exception { public SeatAlreadyBookedException(String m){super(m);} }

class MovieBooking {
    Map<Integer, Boolean> seats = new HashMap<>();

    public MovieBooking() {
        for(int i=1; i<=10; i++) seats.put(i, true);
    }

    public void bookSeat(int seatNo) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNo))
            throw new InvalidSeatException("Seat number does not exist!");

        if (!seats.get(seatNo))
            throw new SeatAlreadyBookedException("Seat already booked!");

        seats.put(seatNo, false);
        System.out.println("Seat booked successfully!");
    }
}

public class Main {
    public static void main(String[] args) {
        MovieBooking mb = new MovieBooking();
        try {
            mb.bookSeat(5);
            mb.bookSeat(5);
        } catch (Exception e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }
}
