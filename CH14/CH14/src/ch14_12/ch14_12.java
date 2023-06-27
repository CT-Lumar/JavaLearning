package ch14_12;

class Animal {
    String name;
    public void eat() {
        System.out.println(name + "正在吃食物");
    }

    public void sleep() {
        System.out.println(name + "正在睡覺");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super.name = name;
    }

    public void barking() {
        System.out.println(name + "barking...");
    }
}

class Bird extends Animal {
    Bird(String name) {
        this.name = name;
    }

    public void flying() {
        System.out.println(name + "flying....");
    }
}

public class ch14_12 {
    public static void main(String[] args) {
        Dog d = new Dog("Dog1");
        d.eat();
        d.sleep();
        System.out.println(d.name);
        d.barking();

        Bird b = new Bird("Bird1");
        b.eat();
        b.sleep();
        System.out.println(b.name);
        b.flying();
    }
}
