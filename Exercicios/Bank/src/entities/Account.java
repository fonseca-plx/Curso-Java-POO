package entities;

public class Account {

    private static final double RATE = 5.0;
    private final int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public Account(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + RATE;
    }

    @Override
    public String toString() {
        return "Account " + String.format("%d", getAccountNumber()) + ", Holder: " + String.format("%s", getAccountHolder()) + ", Balance: $ " + String.format("%.2f", getBalance());
    }
}
