package ch12_02;

public class ch12_02 {
    public static void main(String[] args) {
        char[] ch1 = {'A', 'P', 'P', 'L', 'E'};
        String str1 = new String();//建立空字串
        String str2 = new String(ch1);//建立有內容的字串
        String str3 = new String(str2);//建立str2字串副本
        str1 = str2;

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        System.out.println("str1 == str2 " + (str1 == str2));
        System.out.println("str3 == str2 " + (str3 == str2));
        System.out.println("str3 == str2 " + (str3.equals(str2)));//副本比較

        str1 = "abc";
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str1 == str2 " + (str1 == str2));
    }
}
