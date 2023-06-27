package ch12_10;

public class ch12_10 {
    public static void main(String[] args) {
        System.out.println(".....1.....");
        int data1 = 10;
        int data2 = 20;

        
        Integer wr1 = data1;
        Integer wr2 = data2;
        System.out.println(wr1.getClass());

        System.out.println((double)data1/(double)data2);
        System.out.println(wr1.doubleValue()/wr2.doubleValue());

        System.out.println(wr1 == wr2);//自動拆箱拿到值比對
        System.out.println(wr2.equals(wr2));

        wr1 = wr1 + 50;//自動拆箱拿到值，再裝回
        System.out.println(wr1.getClass());

        System.out.println(".....2.....");
        Integer wr3 = new Integer(10);
        Integer wr4 = new Integer(10);

        System.out.println(wr3 == wr4);
        System.out.println(data1 == wr3);
        System.out.println(wr3.equals(wr4));

        System.out.println(".....3.....");

        data2 = 50; wr2 = 50; wr1 = 50;
        System.out.println(data2 == wr2);//wr2 integer會自動拆箱，然後跟data2比對
        System.out.println(wr1 == wr2);//wr2 integer



    }
}
