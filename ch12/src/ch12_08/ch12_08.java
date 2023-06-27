package ch12_08;

public class ch12_08 {
    public static void main(String[] args) {
        String str = "Java";
		char[] ch1 = { '入', '門', '邁', '向', '高', '手', '之', '路' };
		char[] ch2 = { '王', '者', '歸', '來' };
        StringBuffer bstr = new StringBuffer(str);
        System.out.println("bstr: " + bstr);
        bstr.append('9');
        System.out.println("bstr: " + bstr);
        bstr.append(ch2);
        System.out.println("bstr: " + bstr);
        bstr.insert(5, ch1);
        System.out.println("bstr: " + bstr);
        bstr.deleteCharAt(14);
        System.out.println("bstr: " + bstr);
        bstr.delete(14, 16);
        System.out.println("bstr: " + bstr);
        System.out.println(bstr.getClass());

        String str2 = bstr.toString();
        System.out.println(str2);
        System.out.println(str2.getClass());
    }
}
