package p1;

import java.util.HashMap;
import java.util.Map;

public class MaxString {
	public String maxStr(String str){
		String[] arr = str.split("");
		Map<String, Integer> count = new HashMap<String, Integer>();
		for (String achar : arr) {
			count.put(achar, count.getOrDefault(achar, 0) + 1);
		}

		System.out.println("String hashmap:" + count);

		String maxKey = "";
		int maxValue = 0;

		for (Map.Entry<String, Integer> entry : count.entrySet()) {

			if (entry.getValue() > maxValue) {
				maxValue = entry.getValue();
				maxKey = entry.getKey();
			}
		}
		System.out.println("Max String is " + maxKey);

		return maxKey;
	}
}
