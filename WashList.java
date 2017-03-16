public class WashList {
    public static void main(String[] args) {
        Wash wash1 = new Wash();
        WashCard washCard1 = new WashCard();        
        User user1 = new User();
        
        user1.setWash(wash1);
        user1.setWashCard(washCard1);

        //user1.setCreditCardBalance();
        //user1.getCreditCardBalance();
        
        user1.isAdmin(false);
        user1.orderWashCard();
        washCard1.insertAmount();
        System.out.println("Your balance on your WashCard is now: " + washCard1.getBalance());

        washCard1.setWash(wash1);
        wash1.setWashTypeWithPrice();
        user1.confirmPurchase();
        
        
        System.out.println("Your balance on your WashCard is now: " + washCard1.getBalance());  
    }
}