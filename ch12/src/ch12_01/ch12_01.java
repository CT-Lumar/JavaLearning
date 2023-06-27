package ch12_01;

public class ch12_01 {

	public static void main(String[] args) {
		char[] ch1 = {'淡', '江', '大', '學'};
		char[] ch2 = {'M', 'I', 'N', 'G', '-', 'C', 'H', 'I'};
		String str1 = new String();				// 建立空字串
		String str2 = new String("淡江大學");			// 建立中文內容字串
		//String str2 = new String(ch1);			// 建立中文內容字串
		String str3 = new String(ch2);			// 建立英文內容字串
		String str4 = new String(ch1, 1, 3);	// 建立索引1開始的中文字串長度是3
		String str5 = new String(ch2, 2, 4);	// 建立索引2開始的英文字串長度是4
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);
		System.out.println("str5 = " + str5);
	}
}

