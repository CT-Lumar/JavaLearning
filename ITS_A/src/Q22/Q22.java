package Q22;

public class Q22 {
    public static void main(String[] args) {
        int[][] array = {{2, 20, 15}, {16, 6, 32}, {50, 4, 27}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 10) break;
                System.out.println(array[i][j]);
            }
        }
    }
    
}
