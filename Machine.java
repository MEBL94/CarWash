// importerer biblioteket, som indeholder ArrayList
import java.util.ArrayList;

// Laver klassen Machine
public class Machine {

    // attributter
    private WashCard washCard;
    private ArrayList<Wash> receipt = new ArrayList<Wash>();
    private Wash wash;
    private User user;

    // public void printWashCard() {
    //     System.out.println("You have chosen to print a WashCard:");
    //     System.out.println("Current balance: " + washCard.getBalance());
    // }

    // funktion som tilføjer en Wash til receipt ArrayListen
    public void addWashToReceipt() {
        receipt.add(wash);
    }


    // funktion til at printe receipt
    public void printReceipt() {
        user.isAdmin();
        if (user.getAdmin() == true) {
        System.out.println("List of washes:");

        // Looper igennem ArrayListen
        for (int i = 0; i < receipt.size(); i++) {
        // printer hvert element i receipt ArrayListen
        System.out.println(receipt.get(i));
        System.out.println();
        }
        }
    }

    // en setter funktion til wash-attributten (for at tilknytte wash til machine)
    public void setWash(Wash wash) {
        this.wash = wash;
    }

    // en setter funktion til user-attributten (for at tilknytte en user til machine)
    public void setUser(User user) {
        this.user = user;
    }

}