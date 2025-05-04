public class Card {
    private String pin;
    private String cardNumber;
    private BankAccount account;

    public Card(String pin , String cardNumber , BankAccount account){
        this.pin= pin;
        this.cardNumber= cardNumber;
        this.account= account;
    }

    public boolean validatePin(String enteredPin){
        return this.pin.equals(enteredPin);
    }

    public BankAccount getAccount(){
        return account;
    }

    public String getCardNumber(){
        return cardNumber;
    }
}
