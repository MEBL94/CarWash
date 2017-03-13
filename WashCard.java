public class WashCard {
    private double amount;
    private double balance = 0.0;

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