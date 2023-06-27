package ch16_03;

abstract class Car {
    abstract void run();
    abstract void test(String message);

    Car() {
        System.out.println("有車子了");
    }

    public void refuel() {
        System.out.println("加油");
    }
}

class Bmw extends Car {

    @Override
    void run() {
        System.out.println("安全駕駛中！！");
    }

    @Override
    void test(String message) {
        System.out.println("訊息：" + message);
    }

    Bmw() {
        System.out.println("有BMW了");
    }
    
}

public class ch16_03 {
    public static void main(String[] args) {
        
    }
}
