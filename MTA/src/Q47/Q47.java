package Q47;

public class Q47 {
    public static void main(String[] args) {
        
    }

    public static double safeRoot(double radicand, double index) {
        if (radicand >= 0) {
            return Math.pow(radicand, 1/index);
        } else {
            if (index % 2 == 0) {
                return null;
            } else {
                return -Math.pow(-radicand, 1/index);
            }
        }

    }
}
