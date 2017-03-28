// klassedeklaration
public class Wash {

    // attributter
    private String washType;
    private double washPrice;
    private WashCard washCard;
    private User user;

    // konstruktør
    public Wash(String washType, double washPrice, WashCard washCard) {
        this.washType = washType;
        this.washPrice = washPrice;
        this.washCard = washCard;
    }

    // tom konstruktør
    public Wash() {
    }

    // metode som sætter WashType med en pris
    public void setWashTypeWithPrice() {
        if (washCard.getBalance() >= 200 && washCard.getBalance() <= 1000) {
            System.out.print("Select wash type: bronze, silver or gold: ");
            // gemmer bruger input i en variabel
            String washTypeInput = System.console().readLine();
            // hvis brugeren skriver bronze
            if (washTypeInput.equalsIgnoreCase("bronze")) {
                // WashType bliver sat til det brugeren har indtastet (i dette tilfælde bronze)
                this.washType = washTypeInput;
                // en bronze Wash koster 50kr
                this.washPrice = 50.0;
                System.out.println("You have selected bronze wash. The price of this wash is " + washPrice);
                user.confirmPurchase();
            }

            // samme princip med denne if-sætning (det er bare silver og ikke bronze)
            else if (washTypeInput.equalsIgnoreCase("silver")) {
                this.washType = washTypeInput;
                this.washPrice = 100.0;
                System.out.println("You have selected silver wash. The price of this wash is " + washPrice);
                user.confirmPurchase();
            }

            // samme principt med denne if-sætning (det er bare gold)
            else if (washTypeInput.equalsIgnoreCase("gold")) {
                this.washType = washTypeInput;
                this.washPrice = 150.0;
                System.out.println("You have selected gold wash. The price of this wash is " + washPrice);
                user.confirmPurchase();
            }
            else {
                System.out.print("Did you write something wrong? Try and write bronze, silver or gold: ");
                washTypeInput = System.console().readLine();
            }
            }
            else {
                System.out.println("You don't have a washcard yet. Choose option 2 from the menu first to buy a washcard."); 
            }
    }

    public void setUser(User user) {
        this.user = user;
    }


    public void setWashCard(WashCard washCard) {
        this.washCard = washCard;
    }

    // get metode
    public String getWashType() {
        return washType;
    }


    // get metode
    public double getWashPrice() {
        return washPrice;
    }


    
    @Override
    // toString() metode som bruges når WashType og WashPrice skal printes (returnerer en String)
    public String toString() {
        return "Washtype: " + washType + "\nWashprice: " + washPrice;
    }
        
}