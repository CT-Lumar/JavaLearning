package ch24_13;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ch24_13 {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        //add
        map1.put(105, "平鎮高中");
        map1.put(102, "桃園高中");
        map1.put(103, "武陵高中");
        map1.put(101, "楊梅高中");
        System.out.println(".....新增.....");
        System.out.println("Contents=" + map1);
        //edit
        map1.put(105, "北藝大");
        System.out.println(".....修改.....");
        System.out.println("Contents=" + map1);
        //remove
        map1.remove(101);
        System.out.println(".....刪除.....");
        System.out.println("Contents=" + map1);
        //get value
        System.out.println(".....取值.....");
        System.out.println("Contents=" + map1.get(105));
        //traverse
        for(Map.Entry<Integer, String> e:map1.entrySet()) {
            Integer key = e.getKey();
            String value = e.getValue();
            System.out.println(key + " " + value);
        }

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("A101", "Tim");
        map2.put("A102", "Tom");
        map2.put("A105", "Tory");
        map2.put("A109", "Taylor");
        map2.put("A200", "Tyrant");
        System.out.println(".....5.....");
        System.out.println("content=" + map2.get("A200"));
        System.out.println("contents=" + map2);

        //traverse
        System.out.println(".....6.....");
        for(Map.Entry<String, String> e:map2.entrySet()) {
            String key = e.getKey();
            String value = e.getValue();
            System.out.println(key +" " + value);
        }

        //object
        HashMap<Object, Object> map3 = new HashMap<Object, Object>();
        map3.put("A101", "Tim");
        map3.put("A102", "Tom");
        map3.put("A105", 1992);
        map3.put("A109", false);
        map3.put("A200", "Tyrant");

        System.out.println(".....7.....");
        for(Map.Entry<Object, Object> e:map3.entrySet()) {
            Object key = e.getKey();
            Object value = e.getValue();
            System.out.println(key +" " + value);
        }

        map2.forEach(new BiConsumer<String, String>() {

            @Override
            public void accept(String t, String u) {
                System.out.println(t + " " + u);
            }
            
        });

        System.out.println(".....9.....");
        map2.forEach((t, u) -> {
            System.out.println(t + " " + u);
        });

    }
}
