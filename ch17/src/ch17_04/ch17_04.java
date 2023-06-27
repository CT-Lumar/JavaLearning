package ch17_04;

interface Animal {
    void showMe();
}

interface Bird extends Animal {
    void flying();
}

class Eagle implements Bird {

    @Override
    public void showMe() {
        System.out.println("I am an animal.");
    }

    @Override
    public void flying() {
        System.out.println("I'm an eagle. I'm soaring");
    }
    
}

public class ch17_04 {
    public static void main(String[] args) {
        Eagle e = new Eagle();
        e.showMe();
        e.flying();
    }
}
