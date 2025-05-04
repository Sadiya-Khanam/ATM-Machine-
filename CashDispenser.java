public class CashDispenser {
    private double availableCash;

    public CashDispenser(double initialCash){
        this.availableCash = initialCash;
    }

    public boolean canDispense(double amount){
        return availableCash >= amount;
    }

    public void dispense(double amount){
        if(canDispense(amount)){
            availableCash= availableCash-amount;
        }
    }

    public double getAvailableCash(){
        return availableCash;
}


}
