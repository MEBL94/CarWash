public class Wash {
    private String washType;
    private double washPrice;

    public void showDetails() {
        System.out.println("Your wash type is: " + washType);
        System.out.println("The price of your chosen wash is: " + washPrice);
    }

    public void setWashType() {
        System.out.print("Select wash type: bronze, silver or gold");
        String washTypeInput = System.console().readLine();
        if (washTypeInput.equals("bronze")) {
            System.out.println("You have selected bronze wash.");
        }
        else if (washTypeInput.equals("silver")) {
            System.out.println("You have selected silver wash.");
        }
        else if (washTypeInput.equals("gold")) {
            System.out.println("You have selected gold wash.");
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
}