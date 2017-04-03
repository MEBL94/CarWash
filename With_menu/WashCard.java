public class WashCard {
    // attributter
    private double amount;
    private double balance = 0.0;
    private Wash wash;

    // konstruktør
    public WashCard(double amount, double balance, Wash wash) {
        this.amount = amount;
        this.balance = balance;
        this.wash = wash;
    }
    
    public WashCard() {
    }

    // funktion som trækker WashPrice fra WashCard når en bruger køber en vask
    public void deduct() {
        balance = balance - wash.getWashPrice();
    }

    // funktion til at indsætte et beløb på vaskekortet    
    public void insertAmount() {
        System.out.print("How much credit do you wish to insert on your WashCard? : ");
        String amountInput = System.console().readLine();
        // parser String-inputtet om til double-datatypen(et kommatal)
        double amountInputAsDouble = Double.parseDouble(amountInput);
        amount = amountInputAsDouble;
        // hvis det beløb der bliver indsat er mindre end eller lig med 1000 og større end eller lig med 200
        if (amount <= 1000.0 && amount >= 200.0) {
        // amount bliver lagt til balance
            balance = balance + amount;
            System.out.println("The balance on your WashCard is now: " + balance);
        }
        // hvis beløbet ikke er mellem 200 og 1000kr skriver programmet at det ikke er tilladt
        // og der bliver ikke lagt noget beløb til balance
        else {
            System.out.println("You are only allowed to create a WashCard with a balance of maximum 1000kr and minimum of 200kr.");
        } 
    } 

    // metode til at tilknytte en Wash til WashCard
   public void setWash(Wash wash) {
       this.wash = wash;
   } 

    // get-metode til at få fat i amount
    public double getAmount() {
        return amount;
    }

    // get-metode til at få fat i balance
    public double getBalance() {
        return balance;
    }
}