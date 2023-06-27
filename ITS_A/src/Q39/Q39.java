package Q39;

public class Q39 {
    public static void main(String[] args) {
        /*try {
            int x = 1 / 0;
            System.out.println("try is executed");
        } catch (ArithmeticException ex) {
            System.out.println("catch AE");
        } catch (Exception ex){
            System.out.println("catch exception");
        } finally {
            System.out.println("executing finally");
        }*/
        int a = 5;
        int b = 10;
        int c = ++a * b--;
        System.out.println(c);
        
    }
}
