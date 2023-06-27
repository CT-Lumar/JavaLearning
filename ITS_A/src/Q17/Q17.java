package Q17;

public class Q17 {

    double countPrice(boolean isMember, int ages, boolean joinMember) {
        double price;
        if (isMember) {
            if (ages > 65) {
                price = 0.0;
            } else {
                price = 30.0;
            }
        } 
        if (joinMember) {
            price = 430.0;
        } else {
            price = 130.0;
        }
        return price;
    }

    double countPrice2(boolean isMember, int ages, boolean joinMember) {
        double price;
        if (isMember) {
            if (ages > 65) {
                price = 0.0;
            } else {
                price = 30.0;
            }
        } 
        if (joinMember) {
            price = 430.0;
        } else {
            price = 130.0;
        }
        return price;
    }
    public static void main(String[] args) {
        Q17 t = new Q17();
        
    }
}
