package ch12_04;

public class ch12_04 {

	public static void main(String[] args) {
		//長度
		System.out.println("......1.......");
		String str1 = new String("aaaaaa");		// 建立中文內容字串
		String str2 = new String();				// 建立空字串
		System.out.println("str1字串長度 = " + str1.length());
		System.out.println("str1是空字串 = " + str1.isEmpty());
		System.out.println("str2字串長度 = " + str2.length());
		System.out.println("str2是空字串 = " + str2.isEmpty());
		
		//大小寫轉換
		System.out.println("......2.......");
		String str3 = new String("BBBB");		// 建立中文內容字串
		System.out.println("str1轉換大寫後 = " + str1.toUpperCase());
		System.out.println("str3轉換小寫後 = " + str3.toLowerCase());
		
		//字元搜尋
		System.out.println("......3.......");
		String str4 = "abcdefghijklm";
		System.out.println("索引2的字元 = " + str4.charAt(2));
		
		System.out.println("取字首 = " + str4.charAt(0));//取字首
		System.out.println("取字尾 = " + str4.charAt(str4.length()-1));//取字尾
		
		System.out.println("索引5新字串 = " + str4.substring(5));
		System.out.println("索引(5)-(11-1)新字串 = " + str4.substring(5, 11));
		
		System.out.println("去頭尾 = " + str4.substring(1, str4.length()-1));
		
		System.out.println("......4.......");
		char[] ch = str4.toCharArray();		// 將字串物件str轉成字元陣列ch
		System.out.println(ch);				// 列印字元陣列內容
		System.out.println("列印部分字元陣列內容 = " + ch[0] + ch[1] + ch[2] + ch[3]);
		
		//字串取代
		System.out.println("......5.......");
		String str6 = str4.replace("cdef", "java");			// 中文字串取代
		System.out.println(str6);
		
		String str5 = new String("    www.run   oob.com    ");
		System.out.println(str5);
		System.out.println(str5.trim());//取代前後空格
		System.out.println(str5.replace(" ", ""));//空格全部取代
		
		
		

		
	}
}
