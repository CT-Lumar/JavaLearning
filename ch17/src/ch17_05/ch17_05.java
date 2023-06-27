package ch17_05;

interface Bird {
    void birdFly();
}

interface Airplaine {
    void airplaneFly();
}

class Fly implements Bird, Airplaine {

    @Override
    public void airplaneFly() {
        System.out.println("airplaneFly");
    }

    @Override
    public void birdFly() {
        System.out.println("birdFly");
    }
    
}

public class ch17_05 {
    public static void main(String[] args) {
        Fly f = new Fly();
        f.airplaneFly();
        f.birdFly();
    }
}
