package ch17_08;

interface Dog {
    int age =5;
    void running();
}

interface Cat {
    int age = 6;
    void running();
}

class Pet implements Dog, Cat {

    @Override
    public void running() {
        System.out.println("Pet......");
        System.out.println("dog age =" + Dog.age);
        System.out.println("cat age =" + Cat.age);
    }
    
}

public class ch17_08 {
    public static void main(String[] args) {
        Pet p = new Pet();
        p.running();
    }
}
