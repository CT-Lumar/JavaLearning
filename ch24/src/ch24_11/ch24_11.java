package ch24_11;
import java.util.HashSet;
public class ch24_11 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		// 新增
		set.add("a");
		set.add("bb");
		set.add("c");
		set.add("a");// 資料重複不進行存儲
		System.out.println("....1.....");
		System.out.println(set);

		// 修改
		set.remove("b");
		set.add("e");
		System.out.println("....2.....");
		System.out.println(set);

		// 刪除
		set.remove("c"); // 刪除元素香港
		System.out.println("....3.....");
		System.out.println(set);

		// 走訪
		System.out.println("....4.....");
		for (String value : set) {
			System.out.println(value);
		}

		// 其它
		System.out.println("HashSet元素個數 : " + set.size());
		System.out.println("HashSet是空的   : " + set.isEmpty());
		System.out.println("HashSet包含a : " + set.contains("a"));
		set.clear();
		System.out.println("....5.....");
		System.out.println(set);
	}
}
