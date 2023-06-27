package ch17_10;

interface School {
    int num_s = 100;
    default void demo() {
        System.out.println("School.");
    }

    default void test1() {
        System.out.println("test1");
    }

    void test2();
    void test3();
}

class Dep implements School {
    int num_d = 200;
    @Override
    public void test2() {
        System.out.println("test2");
    }

    @Override
    public void test3() {
        System.out.println("test3");
    }

    public void test4() {
        System.out.println("test4");
    }

    public void demo() {
        System.out.println("Dep");
    }
    
}

public class ch17_10 {
    public static void main(String[] args) {
        System.out.println("new Dep object");
        Dep d = new Dep();
        d.test1();
        d.test2();
        d.test3();
        d.test4();
        d.demo();
        System.out.println("num_s=" + d.num_s);
        System.out.println("num_d=" + d.num_d);
        System.out.println(".....upcasting.....");
        School obj1 = new Dep();
        obj1.test1();
        obj1.test2();
        obj1.test3();
        // obj1.test4(); The method test4() is undefined for the type School
        obj1.demo();
        System.out.println(".....downcasting.....");
        Dep obj2 = (Dep)obj1;
        obj2.test1();
        obj2.test2();
        obj2.test3();
        obj2.test4();
        obj2.demo();
        System.out.println("num_s=" + obj2.num_s);
        System.out.println("num_d=" + obj2.num_d);
    }
}
