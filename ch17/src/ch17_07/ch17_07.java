package ch17_07;

interface Bird {
    void flying();
}

interface Airplane {
    void flying();
}

class InfoFly implements Bird, Airplane {

    @Override
    public void flying() {
        System.out.println("Soaring");
    }

    public double flying(int a, int b) {
        return a + b;
    }

    public double flying(int a, int b, int c) {
        return a + b + c;
    } 
    
}

public class ch17_07 {
    public static void main(String[] args) {
        InfoFly i = new InfoFly();
        i.flying();
        System.out.println(i.flying(2, 3, 4));
        System.out.println(i.flying(2, 3));
    }
}
