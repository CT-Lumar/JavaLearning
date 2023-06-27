package ch14_13;

class Animal {
    protected String name;
    Animal(String name) {
        this.name = name;
        System.out.println("Animal...");
    }

    public void eat() {
        System.out.println("eat...");
    }

    public void sleep() {
        System.out.println("sleep...");
    }
}

class Mammal extends Animal {
    protected String fav_food;
    Mammal(String name, String fav_food) {
        super(name);
        this.fav_food = fav_food;
    }

    public void favFood() {
        System.out.println(name + "喜歡吃" + fav_food);
    }
    
}

class Cat extends Mammal {

    Cat(String name, String fav_food) {
        super(name, fav_food);
    }
    public void jumping() {
        System.out.println(name + " 正在叫");
    }
}

public class ch14_13 {
    public static void main(String[] args) {
        Cat c = new Cat("Lucy", "fish");
        c.eat();
        c.sleep();
        System.out.println(c.name);
        c.favFood();
        System.out.println(c.fav_food);
        c.jumping();
    }
}
