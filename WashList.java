public class WashList {
    public static void main(String[] args) {
        Wash wash1 = new Wash();
        WashCard washCard1 = new WashCard();        
        Customer customer1 = new Customer();
        
        customer1.setCreditCardBalance();
        customer1.getCreditCardBalance();
        customer1.buyWashCard();

        washCard1.setBalance();
        washCard1.insertAmount(1000);
        System.out.println(washCard1.getBalance());

        wash1.setWashTypeAndPrice();
        customer1.setWash(wash1);
        customer1.confirmPurchase();
        customer1.isAdmin(false);

        washCard1.deleteAmount(500);
        System.out.println(washCard1.getBalance());

        

        

        
    }
}