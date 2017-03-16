public class WashList {
    public static void main(String[] args) {
        Wash wash1 = new Wash();
        WashCard washCard1 = new WashCard();        
        Customer customer1 = new Customer();
        
        customer1.setWash(wash1);
        customer1.setWashCard(washCard1);

        //customer1.setCreditCardBalance();
        //customer1.getCreditCardBalance();
        
        customer1.isAdmin(false);
        customer1.orderWashCard();
        washCard1.insertAmount();
        System.out.println("Your balance on your WashCard is now: " + washCard1.getBalance());

        washCard1.setWash(wash1);
        wash1.setWashTypeWithPrice();
        customer1.confirmPurchase();
        
        
        System.out.println("Your balance on your WashCard is now: " + washCard1.getBalance());  
    }
}