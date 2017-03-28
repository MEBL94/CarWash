public class WashList {
    public static void main(String[] args) {
        // oprettelse af objekterne
        Wash wash1 = new Wash();
        WashCard washCard1 = new WashCard();
        User user1 = new User();
        Machine machine = new Machine();

        user1.setWash(wash1);
        user1.setWashCard(washCard1);        
        user1.setMachine(machine);
        washCard1.setWash(wash1);
        wash1.setWashCard(washCard1);
        wash1.setUser(user1);
        machine.setUser(user1);

        for(int i = 0; i < 1;) {
            System.out.println("Welcome to the menu. \nChoose between the following options: \n1. Buy a carwash \n2. Buy Washcard \n3. Admin statistics \n4. Exit" );
            String option = System.console().readLine();
            if(option.equalsIgnoreCase("1")) {
                System.out.println("--------------------");
                wash1.setWashTypeWithPrice();
                System.out.println("--------------------");
                }
            else if(option.equalsIgnoreCase("2")) {
                System.out.println("--------------------");
                user1.orderWashCard();
                System.out.println("--------------------");
            }
            else if(option.equalsIgnoreCase("3")) {
                System.out.println("--------------------");
                machine.printStatistics();
                System.out.println("--------------------");
            }
            else if (option.equalsIgnoreCase("4")) {
                System.out.println("--------------------");
                System.out.println("Thank you for choosing our carwash");
                i = 1;
                System.out.println("--------------------");
            }
        }


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