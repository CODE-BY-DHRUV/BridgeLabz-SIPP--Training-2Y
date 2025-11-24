class AccountNotFoundException extends Exception { public AccountNotFoundException(String m){super(m);} }
class InsufficientFundsException3 extends Exception { public InsufficientFundsException3(String m){super(m);} }

class BankManager {
    public void verifyAccount(int acc) throws AccountNotFoundException {
        if (acc != 1234)
            throw new AccountNotFoundException("Account not found!");
    }

    public void processTransaction() throws InsufficientFundsException3 {
        throw new InsufficientFundsException3("Not enough balance!");
    }

    public void executeTransaction(int acc) throws Exception {
        verifyAccount(acc);
        processTransaction();
    }
}

public class Main {
    public static void main(String[] args) {
        BankManager bm = new BankManager();

        try {
            bm.executeTransaction(5555);
        } catch (Exception e) {
            System.out.println("Transaction error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}

