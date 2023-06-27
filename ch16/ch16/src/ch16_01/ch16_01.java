package ch16_01;

abstract class Shape {
    public void draw() {
        System.out.println("Square");
    }
}

class Circle extends Shape {
    // public void draw() {
    //     System.out.println("Circle");
    // }
}

public class ch16_01 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
