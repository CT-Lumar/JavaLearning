package ch17_09;

interface Dog {
    default void running() {
        System.out.println("Dog");
    }
}

interface Cat {
    default void running() {
        System.out.println("Cat");
    }
}

class Pet implements Dog, Cat {

    @Override
    public void running() {
        // TODO Auto-generated method stub
        Dog.super.running();
        Cat.super.running();
    }

}

public class ch17_09 {
    public static void main(String[] args) {
        Pet p = new Pet();
        p.running();
    }
}
