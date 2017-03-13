public class WashCard {
    private double amount;
    private double balance = 0.0;

    public WashCard(double amount, double balance) {
        this.amount = amount;
        this.balance = balance;
    }
    
    public WashCard() {

    }

    public void setAmount(double amount) {
        this.amount = amount;
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
    
    public void insertAmount(double amount) {
        balance = balance + amount; 
    } 

    public void deleteAmount(double amount) {
        balance = balance - amount;
    }

}