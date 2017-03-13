public class Wash {
    private String washType;
    private double washPrice;

    public void showDetails() {
        System.out.println("Your wash type is: " + washType);
        System.out.println("The price of your chosen wash is: " + washPrice);
    }

    public void setWashType() {
        System.out.print("Select wash type: bronze, silver or gold");
        String washType = System.console().readLine();
        if (washType.equals("bronze")) {
            System.out.println("You have selected bronze wash. It will cost you " + getWashPrice());
        }
        else if (washType.equals("silver")) {
            System.out.println("You have selected silver wash. It will cost you " + getWashPrice());
        }
        else if (washType.equals("gold")) {
            System.out.println("You have selected gold wash. It will cost you " + getWashPrice());
        }
        else {
            System.out.println("Invalid input");
        }
    }

    public String getWashType() {
        return washType;
    }

    public double getWashPrice() {
        if (washType.equals("bronze")) {
            washPrice = 50.0;
        }
        else if (washType.equals("silver")) {
            washPrice = 100.0;
        }
        else if (washType.equals("gold")) {
            washPrice = 150.0;
        }
        return washPrice;
    }
}