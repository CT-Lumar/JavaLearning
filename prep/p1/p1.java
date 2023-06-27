package p1;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		// System.out.println("請輸入字串");
		// Scanner scanner = new Scanner(System.in);
		// String str = scanner.nextLine();
		// System.out.println("use for\n" + reverseStr(str));
		// System.out.println("*********");
		// reverseStr2(str);
		// scanner.close();
		// reverseWords("nurses run");
		MaxString t = new MaxString();
		t.maxStr("aabbjjlijjjj");
	}

	public static String reverseStr(String str) {
		String result = "";
		for(int i = str.length(); i >= 1; i--){
			result += str.charAt(i-1);
		}
		return result;
	}

	public static void reverseStr2(String str) {
		StringBuilder ary = new StringBuilder(str);
		System.out.println(ary);
		System.out.println(ary.reverse().toString());
		// return  ary.reverse().toString(); //StringBuilder 是物件, 要轉換型態
	}

	public static void reverseWords(String str) {
		String[] arr = str.trim().split("\\s+");
		String out = "";
		for(int i = arr.length - 1; i > 0; i--) {
			out += arr[i] + "\s";
		}
		System.out.println(out + arr[0]);
	}

	public static void reverseWords2(String str){
		// StringBuilder stringBuilder = new StringBuilder(str.trim().split);
	}

}
