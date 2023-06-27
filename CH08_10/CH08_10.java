package CH08_10;

public class CH08_10 {

    public static void main(String[] args) {
        
        int[] matrix1 = {1, 2, 3, 4, 5};
        System.out.println(add(matrix1));

        int[] matrix2 = new int[] {1, 2, 3, 4, 5};
        System.out.println(add(matrix2));

        System.out.println(add(new int[] {1, 2, 3, 4, 5}));
    }

    public static int add(int[] nums) {
        int sum = 0;
        for (int num:nums) {
            sum += num;
        }
        return sum;
    }
}