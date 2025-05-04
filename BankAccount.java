public class BankAccount {
    private String accountNumber;
    private double balance;
    private User owner; 

    public BankAccount(String accountNumber, double balance, User owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public boolean hasSufficientBalance(double amount) {
        return balance >= amount;
    }

    public void debit(double amount) {
        if (hasSufficientBalance(amount)) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }
}

