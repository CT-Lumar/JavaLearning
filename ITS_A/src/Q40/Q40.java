package Q40;

public class Q40 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        try {
            int a = 0;
            int b = 20;
            int division = b / a;
            int ary[] = {1};
            ary[10] = 10;
            System.out.println(division);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }
    }
}
