package Q48;

class Fee {
    public static int fee(char model) {
        int price = 0;
        switch (model) {
            case 'A':
            price = 50;
            break;

            case 'T':
            price = 20;
            // break;

            case 'C':
            price = 5;
            break;

            default:
            price = 100;
            break;
        }
        return price;
    }
}

public class Q48 {
    public static void main(String[] args) {
        System.out.println(Fee.fee('C'));
    }

    
}
