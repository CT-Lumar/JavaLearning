package ch12_05;

public class ch12_05 {

	public static void main(String[] args) {
	      String str1 = "abcdefg";
	      String str2 = new String("ABcdefGhi");
	      String str3 = new String("abcdefghi");
	      String str4 = "abcdefg";
	      
	      System.out.println(str1.compareTo(str2));
	      System.out.println(str2.compareTo(str3));
	      System.out.println(str1.compareTo(str4));
	      
	      System.out.println(str1.compareToIgnoreCase(str2));
	      System.out.println(str2.compareToIgnoreCase(str3));
	}
}

