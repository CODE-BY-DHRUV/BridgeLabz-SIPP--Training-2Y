class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + accountHolder);
    }
}

class MainBank {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = 1001;
        sa.accountHolder = "Alice";
        sa.setBalance(50000);
        sa.displayDetails();
        System.out.println("Balance: " + sa.getBalance());
    }
}
