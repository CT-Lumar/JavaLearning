package ch20_04;

import java.util.Scanner;

public class ch20_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your key: ");
        String key = sc.nextLine();

        if (key.equals("abc")) {
            throw new NumberFormatException();
        } else {
            System.out.println(key);
        }
        sc.close();
    }
}
