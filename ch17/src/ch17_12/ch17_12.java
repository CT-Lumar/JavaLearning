package ch17_12;

interface Dog {
    void who();
    default void running() {
        System.out.println("Dog is running");
    }
}

interface Cat {
    void who();
    default void running() {
        System.out.println("cat is running");
    }
}

class Horse {
    public void running() {
        System.out.println("Horse is running");
    }
}

class Pet extends Horse implements Cat, Dog {

    @Override
    public void who() {
        System.out.println("Pet");
        Dog.super.running();
        Cat.super.running();
    }
}

public class ch17_12 {
    public static void main(String[] args) {
        Pet p = new Pet();
        p.running();
        p.who();
    }
}
