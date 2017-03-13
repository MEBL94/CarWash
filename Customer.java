public class Customer {
    private String firstName;
    private String lastName;
    private WashCard washCard;
    private Wash wash;
    private String creditCardNumber;
    private double creditCardBalance;
    private boolean admin;

    public void showCreditCardBalance (double creditCardBalance) {
        this.creditCardBalance = creditCardBalance;
    }


    public void buyWashCard() {
        System.out.print("Enter your credit card number to buy a wash: ");
        creditCardNumber = System.console().readLine();
    }

    
    public void buyWash(WashCard washCard) {
    
    }

    public void insertAmount() {
            
    } 

    public void deleteAmount() {

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