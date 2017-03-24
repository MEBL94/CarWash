public class Wash {
    private String washType;
    private double washPrice;
    private WashCard washCard;

    public Wash(String washType, double washPrice) {
        this.washType = washType;
        this.washPrice = washPrice;
    }

    public Wash() {
    }

    public void chooseWash() {
        System.out.print("Select wash type: bronze, silver or gold: ");
        String washTypeInput = System.console().readLine();
        if (washTypeInput.equalsIgnoreCase("bronze")) {
            this.washType = washTypeInput;
            this.washPrice = 50.0;
            System.out.println("You have selected bronze wash. It will cost you " + washPrice);
        }
        else if (washTypeInput.equalsIgnoreCase("silver")) {
            this.washType = washTypeInput;
            this.washPrice = 100.0;
            System.out.println("You have selected silver wash. It will cost you " + washPrice);
        }
        else if (washTypeInput.equalsIgnoreCase("gold")) {
            this.washType = washTypeInput;
            this.washPrice = 150.0;
            System.out.println("You have selected gold wash. It will cost you " + washPrice);
        }
        else {
            System.out.println("Invalid input");
        }
    }

    public String getWashType() {
        return washType;
    }
    public double getWashPrice() {
        return washPrice;
    }

    // public void deduct() {
    //     balance = balance - wash.getWashPrice();
    // }

}