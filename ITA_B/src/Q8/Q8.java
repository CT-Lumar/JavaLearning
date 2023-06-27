package Q8;

public class Q8 {
    public static void main(String[] args) {
        int sum = 55;
        for (int i = 0; i < 10; i++) {
            add(sum);
        }
        System.out.println(sum);
    }

    public static void add(int sum) {
        sum++;
    }
}
