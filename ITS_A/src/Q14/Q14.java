package Q14;

public class Q14 {

    public double getMax(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }
    public static void main(String[] args) {
        double[] my_Array = {1.234, 2.245, 3.345, 4.445};
        Q14 t = new Q14();
        t.getMax(my_Array);
        System.out.println(t.getMax(my_Array));
    }
}
