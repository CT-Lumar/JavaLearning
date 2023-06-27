package ch12_03;

public class ch12_03 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println("s1 == s2 " +(s1 == s2));
        System.out.println("s1 equals s2 " +(s1.equals(s2)));

        String s3 = "Java";
        String s4 = "Java";
        System.out.println("s3 == s4 " +(s3 == s4));
        System.out.println(s3.equals(s4));

        String s7 = new String("java");
        System.out.println("s1 == s7 " + (s1.equals(s7)));
        System.out.println("s1 == s7 " + (s1.equalsIgnoreCase(s7)));
    }
}
