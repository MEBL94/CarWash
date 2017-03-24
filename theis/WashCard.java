public class WashCard {
    private double balance = 0.0;
    private double amount;

    public WashCard(double balance) {
        this.balance = balance;
    }

    public WashCard() {
    }

    public void insertAmount() {
        System.out.print("How much money do you wish to insert on your WashCard? : ");
        String amountInput = System.console().readLine();
        double amountInputAsDouble = Double.parseDouble(amountInput);
        amount = amountInputAsDouble;
        this.balance = amount + this.balance;
        System.out.println("Your balance is now " + getBalance());
    } 

    public void withdrawAmount() {
        System.out.println("How much money do you wish to withdraw from your WashCard? ");
        String amountInput = System.console().readLine();
        double amountInputAsDouble = Double.parseDouble(amountInput);
        amount = amountInputAsDouble;
        if (this.amount < this.balance) {
            this.balance = this.balance - amount;
            System.out.println("Your balance is now " + getBalance());
        }else {
            System.out.println("Balance is too low to meet your request");
        }
        
    } 

    public void tellCurrentBalance() {
        System.out.println("Your current balance on your washcard is " + getBalance() + "kr");
    }


    public double getBalance(){
        return balance;
    }
    
}