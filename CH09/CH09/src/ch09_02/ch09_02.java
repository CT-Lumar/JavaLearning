package ch09_02;

class SmallMath {
    int x, y;
    SmallMath(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add() {
        System.out.println("add = " + (x + y));
    }

    public void mul() {
        System.out.println("add = " + (x * y));
    }
}

public class ch09_02 {

    public static void main(String[] args) {
        SmallMath s = new SmallMath(5, 10);
        s.add();
        s.mul();
    }
}