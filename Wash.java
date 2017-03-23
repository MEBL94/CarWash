// klassedeklaration
public class Wash {

    // attributter
    private String washType;
    private double washPrice;
    private WashCard washCard;

    // konstruktør
    public Wash(String washType, double washPrice) {
        this.washType = washType;
        this.washPrice = washPrice;
    }

    // tom konstruktør
    public Wash() {

    }

    // bruger ikke denne metode
    public void showDetails() {
        System.out.println("Your wash type is: " + washType);
        System.out.println("The price of your chosen wash is: " + washPrice);
    }

    // metode som sætter WashType med en pris
    public void setWashTypeWithPrice() {
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
            }

            // samme princip med denne if-sætning (det er bare silver og ikke bronze)
            else if (washTypeInput.equalsIgnoreCase("silver")) {
                this.washType = washTypeInput;
                this.washPrice = 100.0;
                System.out.println("You have selected silver wash. The price of this wash is " + washPrice);
            }

            // samme principt med denne if-sætning (det er bare gold)
            else if (washTypeInput.equalsIgnoreCase("gold")) {
            this.washType = washTypeInput;
            this.washPrice = 150.0;
            System.out.println("You have selected gold wash. The price of this wash is " + washPrice);
        }
            else {
            System.out.println("Invalid input");
        }
    }

    // get metode
    public String getWashType() {
        return washType;
    }

    // public void setWashPrice() {
    //     if (washType.equals("bronze")) {
    //         washPrice = 50.0;
    //     }

    //     else if (washType.equals("silver")) {
    //         washPrice = 100.0;
    //     }

    //     else if (washType.equals("gold")) {
    //         washPrice = 150.0;
    //     }
    // }

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