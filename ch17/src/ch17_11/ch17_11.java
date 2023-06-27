package ch17_11;

interface Dog {
    void running();
}

class Horse {
    public void who() {
        System.out.println("Horse");
    }
}

class Pet extends Horse implements Dog {

    @Override
    public void running() {
        System.out.println("Pet");
    }

}

public class ch17_11 {
    public static void main(String[] args) {
        Pet p = new Pet();
        p.who();
        p.running();
    }
}
