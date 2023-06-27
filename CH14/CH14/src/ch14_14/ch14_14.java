package ch14_14;

class School {
    int num_s = 100;
    public void demo() {
        System.out.println("School");
    }

    public void test1() {
        System.out.println("test1");
    }

    public void test2() {
        System.out.println("test2");
    }
}

class Dep extends School {
    int num_d = 200;
    public void demo() {
        System.out.println("Dep");
    }

    public void test3() {
        System.out.println("test3");
    }
}

public class ch14_14 {
    public static void main(String[] args) {
        School c = new Dep();
        c.test1();
        c.test2();
        //c.test3();
        c.demo();
    }
}
