import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create User
        User user = new User("U001", "Alice", new ArrayList<>());

        // Step 2: Create Bank Account for user
        BankAccount account = new BankAccount("AC001", 10000.0, user);

        // Step 3: Link account to user
        user.getAccounts().add(account);

        // Step 4: Create Card for the account
        Card card = new Card("1234", "CARD001", account);

        // Step 5: Create ATM with some cash
        Atm atm = new Atm(5000.0);

        // Step 6: Perform a transaction
        System.out.println("Trying to withdraw ₹3000...");
        atm.start(card, "1234", 3000.0);

        // Step 7: Check balances
        System.out.println("Remaining Account Balance: ₹" + account.getBalance());

       
    }
}

