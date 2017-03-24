public class Run {
    public static void main(String[] args) {

        WashCard w = new WashCard();
        Customer customer = new Customer();
        Wash wash = new Wash();


        customer.buyWashCard();
        w.insertAmount();
        w.getBalance();
        w.withdrawAmount();
        w.getBalance();
        w.tellCurrentBalance();
        wash.chooseWash();
        // customer.buyWash();
        w.tellCurrentBalance();
        

    }    
}