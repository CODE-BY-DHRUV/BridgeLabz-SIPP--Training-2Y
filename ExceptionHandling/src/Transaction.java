import java.util.Random;

class NegativeAmountException extends Exception { public NegativeAmountException(String m){ super(m);} }
class InsufficientFundsException2 extends Exception { public InsufficientFundsException2(String m){ super(m);} }
class NetworkFailureException extends Exception { public NetworkFailureException(String m){ super(m);} }

class Transaction {
    public void process() throws NegativeAmountException, InsufficientFundsException2, NetworkFailureException {
        int x = new Random().nextInt(3);

        switch (x) {
            case 0: throw new NegativeAmountException("Amount cannot be negative!");
            case 1: throw new InsufficientFundsException2("Insufficient balance!");
            case 2: throw new NetworkFailureException("Network connection failed!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Transaction t = new Transaction();

        try {
            t.process();
        } catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException2 e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
