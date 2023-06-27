package ch20_01;

public class ch20_01 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 7;
            //arr[1] = 7;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bound!");
            System.out.println(e);
        } finally {//一定會執行
            System.out.println("this line is always executed");
        }
    }
}
