package ch16_02;

abstract class Cal {
    public int x;
    public int y;
    Cal(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double mul() {
        return x * y;
    }

    abstract double Answer();
}

class CalPlus extends Cal {

    CalPlus(int x, int y) {
        super(x, y);
        //TODO Auto-generated constructor stub
    }

    @Override
    double Answer() {
        // TODO Auto-generated method stub
        return 0;
    }  
}

class CalMinus extends Cal {

    CalMinus(int x, int y) {
        super(x, y);
        //TODO Auto-generated constructor stub
    }

    @Override
    double Answer() {
        // TODO Auto-generated method stub
        return x - y;
    }

}


public class ch16_02 {
    public static void main(String[] args) {
        CalPlus cp = new CalPlus(10, 20);
        System.out.println(cp.mul());
        System.out.println(cp.Answer());

        CalMinus ca = new CalMinus(10, 20);
        System.out.println(ca.mul());
        System.out.println(ca.Answer());

    }
}
