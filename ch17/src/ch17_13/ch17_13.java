package ch17_13;

interface Animal {
    void who();
    default void running() {
        System.out.println("Animal is running");
    }
}

interface Dog extends Animal {
   
    default void running() {
        System.out.println("Dog is running");
        // Animal.super.running();
    }
}

class Pet implements Dog {

    @Override
    public void who() {
        System.out.println("I'm an animal");
    }
    
}

public class ch17_13 {
    public static void main(String[] args) {
        Pet p = new Pet();
        p.running();
        p.who();
    }
}
