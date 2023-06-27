package Q22;

public class Q22 {
    public static void main(String[] args) {
        System.out.println(showGreeting("hsieh chia tiNg"));
        char test = 'j';
        String test2 = "fldijfiudrj";
        
        System.out.println(test2.charAt(1));
        }

    public static String showGreeting(String firstName) {
        String welcomeMsg = "Welcome, ";
        welcomeMsg += firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        return welcomeMsg;
    }
}
