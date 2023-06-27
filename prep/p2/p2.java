package p2;

import java.util.Scanner;

public class p2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println(palindrome(string));
		scanner.close();
	}

	public static Boolean palindrome(String str) {
		StringBuilder ary = new StringBuilder(str);
		
		return ary.reverse().toString().equals(str) ? true : false;
	}
}
