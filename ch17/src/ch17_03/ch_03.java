package ch17_03;

interface Vehicle {
    String getBrand();
    String run();
    default String alarmOn() {
        return "alarmOn";
    }

    default String alarmOff() {
        return "alarmOff";
    }
}

class Car implements Vehicle {
    private String brand;
    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String run() {
        return "安全駕駛！";
    }

    public String alarmOff() {
        return "自己關閉警告燈";
    }
    
}

public class ch_03 {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getBrand());
        System.out.println(c.run());
        System.out.println(c.alarmOn());
        System.out.println(c.alarmOff());
    }
}
