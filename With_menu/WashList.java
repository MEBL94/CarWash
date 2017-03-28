public class WashList {
    public static void main(String[] args) {
        // oprettelse af objekterne
        Wash wash1 = new Wash();
        Wash wash2 = new Wash();
        WashCard washCard1 = new WashCard();
        WashCard washCard2 = new WashCard();
        User user1 = new User();
        User user2 = new User();
        Machine machine = new Machine();

        user1.setWash(wash1);
        user1.setWashCard(washCard1);        
        user1.setMachine(machine);
        washCard1.setWash(wash1);
        wash1.setWashCard(washCard1);
        wash1.setUser(user1);
        machine.setUser(user1);

        System.out.println("User 1:\n");
    
        user1.viewMenu();

        
        user2.setWash(wash2);
        user2.setWashCard(washCard2);        
        user2.setMachine(machine);
        washCard2.setWash(wash2);
        wash2.setWashCard(washCard2);
        wash2.setUser(user2);
        machine.setUser(user2);

        System.out.println("User 2:\n");
        user2.viewMenu();

        


        // // kald af metoderne
        // user1.setWash(wash1);
        // user1.setWashCard(washCard1);        
        // user1.orderWashCard();
        // washCard1.insertAmount();
        
        // washCard1.setWash(wash1);
        // wash1.setWashCard(washCard1);
        // wash1.setUser(user1);
        // user1.setMachine(machine);
        // machine.setUser(user1);
        // wash1.setWashTypeWithPrice();
        
        // machine.setWash(wash1);
        // // machine.printStatistics();
        
        // user2.setWash(wash2);
        // user2.setWashCard(washCard2);
        
        // user2.orderWashCard();
        // washCard2.insertAmount();

        // washCard2.setWash(wash2);
        // wash2.setWashCard(washCard2);
        // wash2.setUser(user2);
        // user2.setMachine(machine);
        // machine.setUser(user2);
        // wash2.setWashTypeWithPrice();        
         

        // machine.setWash(wash2);
        // machine.printStatistics();
    }
}