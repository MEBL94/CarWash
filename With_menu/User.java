public class User {

    private WashCard washCard;
    private Wash wash;
    private String creditCardNumber = "";

    private boolean admin;
    private Machine machine;


    // konstruktør
    public User(WashCard washCard, Wash wash, String creditCardNumber, boolean admin) {
        this.washCard = washCard;
        this.wash = wash;
        this.creditCardNumber = creditCardNumber;
        this.admin = admin;
    }

    public User() {

    }


   // funktion til at bestille et WashCard
    public void orderWashCard() {
        System.out.print("Enter your credit card number to order a WashCard: ");
        // gemmer den data som brugeren indtaster i creditCardNumber-attributten
        creditCardNumber = System.console().readLine();
        System.out.println("Credentials saved...");
        washCard.insertAmount();
    }


    // metode som definerer om en user er admin eller ikke (virker dog ikke helt optimalt endnu)
    public void isAdmin() {
        System.out.print("Enter password: ");
        String passWordInput = System.console().readLine();
        if (passWordInput.equals("password")) {
            admin = true;
            System.out.println("You are an admin.");
        }
        else {
            System.out.println("You are not an admin.");
            admin = false;
        }
    }


    // metode som bruges for at bekræfte købet af en vask
    public void confirmPurchase() {
        System.out.print("Are you sure that you want to buy " + wash.getWashType() + " wash for " 
        + wash.getWashPrice() + "? Type yes or no: ");
        // det brugeren taster bliver gemt i en String variabel
        String input = System.console().readLine();
        // hvis WashPrice er større end det der står på vaskekortet
        System.out.println();
        if (wash.getWashPrice() > washCard.getBalance()) {
            // besked til brugeren om at der ikke er nok penge på vaskekortet til at købe vasken
            System.out.println("Insufficient funds on your WashCard. A " + wash.getWashType() + " wash costs " 
            + wash.getWashPrice());
        //    System.out.println("Your current balance is: " + washCard.getBalance());
        }

        // hvis brugeren skriver yes
        else if (input.equals("yes")) {
            System.out.println("Purchase confirmed.");
            // amount bliver trukket fra vaskekortets balance
            washCard.deduct();
            System.out.print("Do you wish a receipt? Yes or no. ");
            input = System.console().readLine();
            if (input.equals("yes")) {
                System.out.println("You bought a:\n" + wash);
            }
            System.out.println("The balance on your WashCard is now: " + washCard.getBalance());     
            machine.addWashToStatistics(wash);
            machine.getStatistics();
        }

        // hvis brugeren skriver no
        else if (input.equals("no")) {
            System.out.println("Purchase cancelled.");
        }

        // hvis brugeren skriver noget andet end yes eller no
        else {
            System.out.println("Invalid input");
        }
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    // tilknytter en Wash til User
    public void setWash(Wash wash) {
        this.wash = wash;
    }

    // tilknytter et WashCard til User
    public void setWashCard(WashCard washCard) {
        this.washCard = washCard;
    }

    public void viewMenu() {
    for(int i = 0; i < 1;) {
            System.out.println("Welcome to Group One Wash. \nChoose between the following options: \n1. Buy a carwash \n2. Buy Washcard \n3. Admin statistics \n4. Exit" );
            String option = System.console().readLine();
            if(option.equals("1")) {
                System.out.println("--------------------");
                wash.setWashTypeWithPrice();
                System.out.println("--------------------");
                }
            else if(option.equals("2")) {
                System.out.println("--------------------");
                orderWashCard();
                System.out.println("--------------------");
            }
            else if(option.equals("3")) {
                System.out.println("--------------------");
                machine.printStatistics();
                System.out.println("--------------------");
            }
            else if (option.equals("4")) {
                System.out.println("--------------------");
                System.out.println("Thank you for choosing our carwash");
                i = 1;
                System.out.println("--------------------");
            }
        }
    }
}