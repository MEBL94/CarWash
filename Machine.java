import java.util.ArrayList;
public class Machine {
    private WashCard washCard;
    private ArrayList<Wash> washes = new ArrayList<Wash>();

    public void printWashCard() {
        System.out.println("You have chosen to print a wash card:");
        System.out.println("Current balance: " + washCard.getBalance());
    }

    public void printReceipt() {
        for (int i = 0; i < washes.size(); i++) {
        System.out.println(washes.get(i));
        }
    }

}