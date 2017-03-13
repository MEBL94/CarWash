public class Customer {
    // private String firstName;
    // private String lastName;
    private WashCard washCard;
    private Wash wash;
    private String creditCardNumber = "";
    private double creditCardBalance;
    private boolean admin;


    public Customer(WashCard washCard, Wash wash, String creditCardNumber, double creditCardBalance, boolean admin) {
        this.washCard = washCard;
        this.wash = wash;
        this.creditCardNumber = creditCardNumber;
        this.creditCardBalance = creditCardBalance;
        this.admin = admin;
    }

    public Customer() {

    }

    public void setCreditCardBalance() {
        System.out.print("How much credit have you got on your Visa? : ");
        String creditCardBalanceAsString = System.console().readLine();
        creditCardBalance = Double.parseDouble(creditCardBalanceAsString);
    }

    public double getCreditCardBalance() {
        System.out.println("Your current balance on your credit card is " + creditCardBalance + "kr");
        return creditCardBalance;
    }


    public void buyWashCard() {
        System.out.print("Enter your credit card number to buy a wash: ");
        creditCardNumber = System.console().readLine();
        System.out.println("Credentials saved...");
    }

    
    public void buyWash(Wash wash) {
        System.out.println("You have bought a " + wash.getWashType());
        System.out.println("You have paid " + wash.getWashPrice() + " for it.");
    }

    public void isAdmin(boolean admin) {
        if (admin == true) {
            System.out.print("You are an admin. Do you want to view statistics?");
        }

        else {
            System.out.println("You are not an admin.");
        }
    }

    public void setWash(Wash wash) {
        this.wash = wash;
    }

    public void confirmPurchase() {
        System.out.print("Are you sure that you want to buy " + wash.getWashType() + " wash for" + wash.getWashPrice() + "? yes or no.");
        String input = System.console().readLine();
        if (input.equals("yes")) {
            System.out.println("Purchase confirmed.");
        }

        else if (input.equals("no")) {
            System.out.println("So you don't wish to buy it.");
        }

        else {
            System.out.println("Invalid input");
        }
    }

}