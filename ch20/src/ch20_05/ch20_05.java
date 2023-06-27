package ch20_05;

import java.io.IOException;

public class ch20_05 {
    public static void main(String[] args) {
        try {
            f1();
        } catch (Exception e) {
            System.out.println("非數據類型不能轉換");
        }

        try {
            f2();
        } catch (Exception e) {
            System.out.println("非數據類型不能轉換");
        }

        try {
            f3();
        } catch (IOException e) {
            System.out.println("error");
        }
        
    }

    public static void f1() throws NumberFormatException {
        String s = "abc";
        System.out.println(Double.parseDouble(s));
    }

    public static void f2() {
        String s = "abc";
        System.out.println(Double.parseDouble(s));
    }

    public static void f3() throws IOException {
//        String s = "abc";
//        System.out.println(Double.parseDouble(s));
throw new IOException("your message");
    }
}
