package ch17_01;

interface Fly {
    void flying();
}

class Bird implements Fly {

    @Override
    public void flying() {
        System.out.println("flying");
        
    }
    
}

public class ch17_01 {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.flying();
    }
}
