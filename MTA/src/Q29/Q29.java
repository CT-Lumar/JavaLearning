package Q29;

public class Q29 {
    public static void main(String[] args) {
        double[] test = {1.23456, 2.23456, 3.23456, 4.23456};
        System.out.println(findMax(test));
    }

    public static double findMax (double[] maxArray) {
        double max = maxArray[0];
        for (int i = 1; i < maxArray.length; i++) {
            if (max < maxArray[i])
            max = maxArray[i];
        }
        return max;
    }

}
