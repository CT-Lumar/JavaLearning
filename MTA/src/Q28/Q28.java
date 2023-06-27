package Q28;
import java.util.ArrayList;




public class Q28 {
    public static void main(String[] args) {
        ArrayList<Integer> obj1 =new ArrayList<>();
        obj1.add(1);
        obj1.add(9);
        obj1.add(9);
        obj1.add(2);
        obj1.add(0);
        obj1.add(3);
        obj1.add(1);
        obj1.add(1);
        System.out.println(obj1);
        pop(obj1);
        System.out.println(obj1);
        push(obj1, 19920311);
        System.out.println(obj1);
    }

    public static Integer pop(ArrayList<Integer> stack) {
        int index = 0;
        return stack.remove(index);
    }
    
    public static void push(ArrayList<Integer> stack, Integer item) {
        int index = 0;
        stack.add(index, item);
    }
}
