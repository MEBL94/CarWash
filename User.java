// bruger ikke rigtig ArrayList i User (det er flyttet til Machine)
import java.util.ArrayList;
public class User {
    // attributter
    // private String firstName;
    // private String lastName;
    private WashCard washCard;
    private Wash wash;
    private String creditCardNumber = "";
    // private double creditCardBalance;
    private boolean admin;
    private Machine machine;
    private ArrayList<Wash> washes = new ArrayList<Wash>();

    // konstruktør
    public User(WashCard washCard, Wash wash, String creditCardNumber,
    // double creditCardBalance,
     boolean admin) {
        this.washCard = washCard;
        this.wash = wash;
        this.creditCardNumber = creditCardNumber;
   //     this.creditCardBalance = creditCardBalance;
        this.admin = admin;
    }

    public User() {

    }

   // public void setCreditCardBalance() {
   //     System.out.print("How much credit have you got on your Visa? : ");
   //     String creditCardBalanceAsString = System.console().readLine();
   //     creditCardBalance = Double.parseDouble(creditCardBalanceAsString);
   // }

   // public double getCreditCardBalance() {
   //     System.out.println("Your current balance on your credit card is " + creditCardBalance + "kr");
   //     return creditCardBalance;
   // }


   // funktion til at bestille et WashCard
    public void orderWashCard() {
        System.out.print("Enter your credit card number to order a WashCard: ");
        // gemmer den data som brugeren indtaster i creditCardNumber-attributten
        creditCardNumber = System.console().readLine();
        System.out.println("Credentials saved...");
    }

    
    // denne metode bruger vi ikke rigtig
    public void buyWash(Wash wash) {

        // System.out.println("You have bought a " + wash.getWashType());
        // System.out.println("You have paid " + wash.getWashPrice() + " for it.");
    }

    // metode som definerer om en user er admin eller ikke (virker dog ikke helt optimalt endnu)
    public void isAdmin() {
        System.out.print("Enter password: ");
        String passWordInput = System.console().readLine();
        if (passWordInput.equals("password")) {
            System.out.println("You are an admin. Do you want to view statistics?");
            admin = true;
        }

        else {
            System.out.println("You are not an admin.");
            admin = false;
        }
    }

    // tilknytter en Wash til User
    public void setWash(Wash wash) {
        this.wash = wash;
    }

    // tilknytter et WashCard til User
    public void setWashCard(WashCard washCard) {
        this.washCard = washCard;
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
            System.out.println("The balance on your WashCard is now: " + washCard.getBalance());
            // washCard.getBalance() = washCard.getBalance() - washCard.getAmount();
            machine.getStatistics();
            machine.addWashToStatistics();
        }

        // hvis brugeren skriver no
        else if (input.equals("no")) {
        //   System.out.println("So you don't wish to buy it.");
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

    // bruger ikke rigtig denne metode
    public void addWash() {
        System.out.print("Choose the type of wash you wish: ");
        String input1 = System.console().readLine();
        
    }

    // bruger ikke rigtig denne metode
    public void printWashes() {
        for (Wash w : washes) {
            System.out.println(w);
        }
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

}