package ch24_04;

import java.util.ArrayList;

abstract class Shapes {
    abstract void demo();
}

class Square extends Shapes {

    @Override
    void demo() {
        System.out.println("Square");
    }
}

class Circle extends Shapes {

    @Override
    void demo() {
        System.out.println("Circle");
    }
    
}

public class ch24_04 {
    public static void main(String[] args) {
        ArrayList<Square> a1 = new ArrayList<Square>();
        a1.add(new Square());
        a1.add(new Square());
        demoShapes(a1);

        ArrayList<Circle> c1 = new ArrayList<Circle>();
        c1.add(new Circle());
        c1.add(new Circle());
        demoShapes(c1);
    }

    public static void demoShapes(ArrayList<? extends Shapes> lists) {
        for (Shapes list : lists) {
            list.demo();
        }
    }
}
