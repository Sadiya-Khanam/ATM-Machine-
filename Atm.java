public class Atm {
    private CashDispenser CashDispenser;

    public Atm (double initialCash) {
        this.CashDispenser = new CashDispenser(initialCash);
    }

    public void start(Card card , String pin , double withdrwAmount){

        if(!card.validatePin(pin)){
            System.out.println("INVALID PIN");
            return;
        }

        BankAccount account = card.getAccount();

     if(!account.hasSufficientBalance(withdrwAmount)){
        System.out.println("INSUFFICIENT BALANCE");
        return;
     }

     if(!CashDispenser.canDispense(withdrwAmount)){
        System.out.println("ATM HAS INSUFFICIENT CASH");
        return;
     }

     account.debit(withdrwAmount);
     CashDispenser.dispense(withdrwAmount);
     System.out.println("TRANSACTION SUCCESSFULL.DISPENSED : " +withdrwAmount+ "rs");
    }
}