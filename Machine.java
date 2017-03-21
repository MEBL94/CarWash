import java.util.ArrayList;
public class Machine {
    private WashCard washCard;
    private ArrayList<Wash> receipt = new ArrayList<Wash>();
    private Wash wash;
    private User user;

    public void printWashCard() {
        System.out.println("You have chosen to print a wash card:");
        System.out.println("Current balance: " + washCard.getBalance());
    }

    public void addWashToReceipt() {
        receipt.add(wash);
    }

    public void printReceipt() {
        System.out.println("List of washes:");
        for (int i = 0; i < receipt.size(); i++) {
        System.out.println(wash);
        System.out.println();
        }
    }

    public void setWash(Wash wash) {
        this.wash = wash;
    }

    public void setUser(User user) {
        this.user = user;
    }

}