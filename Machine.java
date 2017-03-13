import java.util.*;
public class Machine {
    private ArrayList receipt = new ArrayList();
    private WashCard washCard;

    public void printWashCard() {
        System.out.println("You have chosen to print a wash card.");
    }

    public void printReceipt() {
        for (int i = 0; i < receipt.size(); i++) {
        System.out.println(receipt.get(i));
        }
    }
}