package ch24_07;

import java.util.ArrayList;
import java.util.List;

public class ch24_07 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> alist = new ArrayList<>();
        List<String> blist = new ArrayList<>();
        List<String> jlist = new ArrayList<>();

        //add
        list.add("Abe");
        list.add("Benjamin");
        list.add("Jack");
        list.add("Jesse");
        System.out.println("...1...");
        System.out.println("Contents=" + list);

        for(int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i).charAt(0));
            if (list.get(i).charAt(0) == 'A') {
                alist.add(list.get(i));
                list.remove(i);
                i--;
            } else if (list.get(i).charAt(0) == 'B') {
                blist.add(list.get(i));
                list.remove(i);
                i--;
            } else if (list.get(i).charAt(0) == 'J') {
                jlist.add(list.get(i));
                list.remove(i);
                i--;
            }
        }
        System.out.println("Contents=" + list);
        System.out.println("Contents=" + alist);
        System.out.println("Contents=" + blist);
        System.out.println("Contents=" + jlist);
    }
}
