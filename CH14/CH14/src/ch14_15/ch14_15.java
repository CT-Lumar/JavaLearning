package ch14_15;

class Animal {
    int num_s = 100;
    public void walk() {
        System.out.println("Animal is walking.");
    }

    public void test1() {
        System.out.println("test1.");
    }
}

class Dog extends Animal {
    int num_d = 200;
    public void walk() {
        System.out.println(" Dog is walking.");
    }

    public void test2() {
        System.out.println("test2");
    }
}

public class ch14_15 {
    public static void main(String[] args) {
        System.out.println("Upcasting...");
        Animal obj1 = new Dog();
        obj1.walk();
        System.out.println(obj1.num_s);

        System.out.println("Downcasting...");

       // Dog obj2 = (Dog)obj1;
    }
}
