package ch17_06;

interface Bird {
    void birdFly();
}

interface Airplaine {
    void airplaneFly();
}

interface Fly extends Bird, Airplaine {
    void pediaFly();
}

class InfoFly implements Fly {

    @Override
    public void birdFly() {
        System.out.println("Bird soaring");
    }

    @Override
    public void airplaneFly() {
        System.out.println("Airplane flying");
    }

    @Override
    public void pediaFly() {
        System.out.println("Flying");
    }
    
}

public class ch17_06 {
    public static void main(String[] args) {
        InfoFly obj = new InfoFly();
        obj.birdFly();
        obj.airplaneFly();
        obj.pediaFly();
    }
}
