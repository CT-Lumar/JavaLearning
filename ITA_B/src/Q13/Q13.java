package Q13;

public class Q13 {
    public static void main(String[] args) {
        int[] intList = {3, 6, 34, 24};
        for (int i : intList) {
            i *= 2;
        }

      
        for (int i = 0; i < intList.length; i ++) {
            System.out.println(intList[i]);
        }
    }
}
