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

    public void showDetails() {
        System.out.println("Your wash type is: " + washType);
        System.out.println("The price of your chosen wash is: " + washPrice);
    }

    public void setWashTypeWithPrice() {
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
    public double getWashPrice() {
        return washPrice;
    }


    @Override
    public String toString() {
        return "Washtype: " + washType + "\nWashprice: " + washPrice;
    }
        
}