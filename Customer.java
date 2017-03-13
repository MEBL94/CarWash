public class Customer {
    private String firstName;
    private String lastName;
    private WashCard washCard;
    private Wash wash;
    private String creditCardNumber;
    private double creditCardBalance;
    private boolean admin;

    public void setCreditCardBalance() {
        System.out.print("How much credit have you got on your Visa? : ");
        String creditCardBalanceAsString = System.console().readLine();
        creditCardBalance = Double.parseDouble(creditCardBalanceAsString);
    }

    public double getCreditCardBalance() {
        return creditCardBalance;
    }


    public void buyWashCard() {
        System.out.print("Enter your credit card number to buy a wash: ");
        creditCardNumber = System.console().readLine();
    }

    
    public void buyWash(WashCard washCard) {
    
    }

    public void isAdmin(boolean admin) {
        if (admin == true) {
            System.out.print("Do you want to view statistics?");
        }

        else {
            System.out.println("You are not an admin.");
        }
    }





}