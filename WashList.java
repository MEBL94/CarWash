public class WashList {
    public static void main(String[] args) {
        Wash wash1 = new Wash();
        WashCard washCard1 = new WashCard();        
        Customer customer1 = new Customer();
        
        customer1.setCreditCardBalance();
        customer1.getCreditCardBalance();
        customer1.buyWashCard();

        wash1.setWashTypeAndPrice();
        customer1.confirmPurchase();

        
    }
}