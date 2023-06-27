package CH09_01;

class TaipeiBank {
    int balance;
    TaipeiBank() {
        this.balance = 100;
    }
    public void printBalance() {
        System.out.println("餘額" + balance);
    }
}

public class CH09_01 {

    public static void main(String[] args) {
        TaipeiBank t = new TaipeiBank();
        t.printBalance();
    }    
}