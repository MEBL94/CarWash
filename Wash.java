public class Wash {
    private String washType;
    private double washPrice;

    public void showDetails() {
        System.out.println("Your wash type is: " + washType);
        System.out.println("The price of your chosen wash is: " + washPrice);
    }

    public String getWashType() {
        return washType;
    }

    public double getWashPrice() {
        return washPrice;
    }
}