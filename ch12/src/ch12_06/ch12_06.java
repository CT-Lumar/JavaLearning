package ch12_06;

public class ch12_06 {

	public static void main(String[] args) {
		//實務上使用android的log.d()中
		//double, integer 轉成 String
		System.out.println(".....1......");
		char c = 'A';
		String str1 = String.valueOf(c);	// 字元轉字串
		System.out.println(str1.getClass());
		int i = 55;
		String str2 = String.valueOf(i);	// 整數轉字串
		long l = 66L;
		String str3 = String.valueOf(l);	// 長整數轉字串
		float f = 5.5f;
		String str4 = String.valueOf(f);	// 浮點數轉字串
		double d = 6.6;
		String str5 = String.valueOf(d);	// 雙倍精度浮點數轉字串
		boolean b = true;
		String str6 = String.valueOf(b);	// 布林值轉字串
		System.out.printf("%s%s%s%s%s%s\n",str1,str2,str3,str4,str5,str6);
		String str = str1+str2+str3+str4+str5+str6;		// 字串的串接
		System.out.println(str);
		
		///
        //字串轉換成double, integer...
        System.out.println(".....2......");
        Integer t1 = Integer.valueOf("1");
        System.out.println(t1);
        Double t2 = Double.valueOf("2.3");
        System.out.println(t2);
		
		

	}

}
