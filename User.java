import java.util.List;

public class User {
    private String userId;
    private String name;
    private List<BankAccount> accounts;

    public User(String userId, String name, List<BankAccount> accounts) {
        this.userId = userId;
        this.name = name;
        this.accounts = accounts;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}

