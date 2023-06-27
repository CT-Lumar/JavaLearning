package Q14;

public class Q14 {

    public static void main(String[] args) {
        String firstName = "Thinker";
        firstName = firstName.substring(0, 5);
        System.out.println(firstName);
        String output = String.format("%s is %d characters long", firstName, firstName.length());
        System.out.println(output);
    }

}