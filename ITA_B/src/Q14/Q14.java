package Q14;

import java.util.ArrayList;

public class Q14 {
    public static void main(String[] args) {
        int[] AryList = {1, 2, 3, 4, 5, 6, 7};
        pop(null);
    }

    public static Integer pop(ArrayList<Integer> stack) {
        int ip = 0;
        return stack.remove(ip);
    }

    public static void push(ArrayList<Integer> stack, Integer item) {
        int index = 0;
        stack.add(index, item);
    }
}
