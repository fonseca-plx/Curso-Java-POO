package entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double initialBalance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = initialBalance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        if (amount >= balance) {
            throw new IllegalArgumentException("Not enough balance");
        }
        else if (amount >= withdrawLimit) {
            throw new IllegalArgumentException("The amount exceeds withdraw limit");
        }
        else {
            this.balance -= amount;
        }
    }
}
