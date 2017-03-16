public class WashCard {
    private double amount;
    private double balance;
    private Wash wash;

    public WashCard(double amount, double balance, Wash wash) {
        this.amount = amount;
        this.balance = balance;
        this.wash = wash;
    }
    
    public WashCard() {

    }

    // public void setAmount(double amount) {
    //     this.amount = amount;
    // }

    public void deduct() {
        balance = balance - wash.getWashPrice();
    }
    public void setBalance(double balance) {
        this.balance = balance;
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
        if (balance <= 1000.0 && balance >= 200.0) {
        balance = balance + amount;
        }
        else {
            System.out.println("You are only allowed to have a maximum of 1000kr and a minimum of 200kr on your WashCard.");
        } 
    } 

    // public void withdrawAmount() {
    //     System.out.print("How much money do you wish to withdraw from your WashCard? : ");
    //     String amountInput = System.console().readLine();
    //     double amountInputAsDouble = Double.parseDouble(amountInput);
    //     amount = amountInputAsDouble;
    //     balance = balance - amount;
    // }

   public void setWash(Wash wash) {
       this.wash = wash;
   } 

}