public class WashList {
    public static void main(String[] args) {
        Wash wash1 = new Wash();
        Wash wash2 = new Wash();
        Wash wash3 = new Wash();
        WashCard washCard1 = new WashCard();
        WashCard washCard2 = new WashCard();
        WashCard washCard3 = new WashCard();        
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        Machine machine = new Machine();
        
        user1.setWash(wash1);
        user1.setWashCard(washCard1);        
        user1.isAdmin(false);
        user1.orderWashCard();
        washCard1.insertAmount();

        System.out.println("Your balance on your WashCard is now: " + washCard1.getBalance());
        
        washCard1.setWash(wash1);
        wash1.setWashTypeWithPrice();
        user1.confirmPurchase();
        
        System.out.println("Your balance on your WashCard is now: " + washCard1.getBalance());
        
        machine.setUser(user1);
        machine.setWash(wash1);
        machine.addWashToReceipt();
        machine.printReceipt();
        
        user2.setWash(wash2);
        user2.setWashCard(washCard2);
        
        user2.isAdmin(false);
        user2.orderWashCard();
        washCard2.insertAmount();
        System.out.println("Your balance on your WashCard is now: " + washCard2.getBalance());

        washCard2.setWash(wash2);
        wash2.setWashTypeWithPrice();
        user2.confirmPurchase();
        
        System.out.println("Your balance on your WashCard is now: " + washCard2.getBalance());
         
        machine.setUser(user2);
        machine.setWash(wash2);
        machine.addWashToReceipt();
        machine.printReceipt();
    }
}