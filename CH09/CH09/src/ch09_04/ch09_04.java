package ch09_04;

class MyClass {
    int age;
    String name;
    //overload and constructor
    MyClass(int age) {
        this.age = age;
    }

    MyClass(String name) {
        this.name ="Mx " + name;
    }

    MyClass(int age, String name) {
        this(name);
        this.age = age;
    }

    public void printInfo() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}

public class ch09_04 {
    public static void main(String[] args) {
        MyClass m1 = new MyClass(20);
        m1.printInfo();
        MyClass m2 = new MyClass("bill");
        m2.printInfo();
        MyClass m3 = new MyClass(25, "natasha");
        m3.printInfo();
    }
}
