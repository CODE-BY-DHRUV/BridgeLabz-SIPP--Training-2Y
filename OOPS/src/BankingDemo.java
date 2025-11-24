
import java.util.*;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    protected double getBalance() { return balance; } // protected for subclasses
    private void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        if (amount > 0) setBalance(getBalance() + amount);
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }

    public abstract double calculateInterest();

    public void showAccount() {
        System.out.printf("%s - %s : Balance = %.2f%n", accountNumber, holderName, getBalance());
    }
}

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // annual percent

    public SavingsAccount(String acc, String holder, double balance, double rate) {
        super(acc, holder, balance);
        this.interestRate = rate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100.0);
    }

    @Override
    public boolean applyForLoan(double amount) {

        return amount <= (getBalance() * 5);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String acc, String holder, double balance, double overdraftLimit) {
        super(acc, holder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0.0;
    }

    @Override
    public boolean applyForLoan(double amount) {

        return amount <= overdraftLimit;
    }

    @Override
    public double calculateLoanEligibility() {
        return overdraftLimit;
    }
}

public class BankingDemo {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("S001", "Asha", 10000, 4.0));
        accounts.add(new CurrentAccount("C001", "Ravi", 2000, 15000));

        for (BankAccount acc : accounts) {
            acc.showAccount();
            System.out.printf(" Interest: %.2f%n", acc.calculateInterest());
            if (acc instanceof Loanable) {
                Loanable ln = (Loanable) acc;
                System.out.printf(" Loan eligibility: %.2f | Can apply for 10000? %b%n",
                        ln.calculateLoanEligibility(), ln.applyForLoan(10000));
            }
            System.out.println();
        }
    }
}
