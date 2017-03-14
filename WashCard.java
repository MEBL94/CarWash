public class WashCard {
    private double amount;
    private double balance;

    public WashCard(double amount, double balance) {
        this.amount = amount;
        this.balance = balance;
    }
    
    public WashCard() {

    }

    // public void setAmount(double amount) {
    //     this.amount = amount;
    // }

    public void setBalance() {
        balance = 0.0;
    }
    

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }
    
    public void insertAmount() {
        System.out.print("How much money do you wish to insert on your WashCard? : ");
        String amountInput = System.console().readLine();
        double amountInputAsDouble = Double.parseDouble(amountInput);
        amount = amountInputAsDouble;
        balance = balance + amount; 
    } 

    public void withdrawAmount() {
        System.out.print("How much money do you wish to withdraw from your WashCard? : ");
        String amountInput = System.console().readLine();
        double amountInputAsDouble = Double.parseDouble(amountInput);
        amount = amountInputAsDouble;
        balance = balance - amount;
    }
    

}