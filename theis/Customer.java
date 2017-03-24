public class Customer {
    private int id;
    private WashCard washCard;
    private Wash wash;

    public Customer(){
    }

    public void insertCreditCard() {
        System.out.print("Insert card please. \nNow enter your credit card code a deposit or buy a washcard: ");
        System.console().readLine();
        System.out.println("Pin code accepted...");
    }

    public void buyWash() {
        if (washCard.getBalance() >= wash.getWashPrice()) {
            System.out.println("You have bought a " + wash.getWashType());
            System.out.println("You have paid " + wash.getWashPrice() + " for it and your balance is now " + washCard.getBalance());
        } else {
            System.out.println("You cannot afford the wash. Insert money and try again.");
        }
    }

    public void buyWashCard() {
        insertCreditCard();
    }
 

}