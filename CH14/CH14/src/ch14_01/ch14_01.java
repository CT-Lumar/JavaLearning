package ch14_01;

class Tshape {
    private double unline = 0;
    private double downline = 0;
    private double height = 0;
    public int tx = 0;
    public double getUnline() {
        return unline;
    }
    public void setUnline(double unline) {
        this.unline = unline;
    }
    public double getDownline() {
        return downline;
    }
    public void setDownline(double downline) {
        this.downline = downline;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }  
}

class TshapeArea extends Tshape {
    public double Area() {
        return ((getUnline() + getDownline()) * getHeight() * 0.5);
    }
}

public class ch14_01 {

    public static void main(String[] args) {
        TshapeArea t = new TshapeArea();
        t.setDownline(20);
        t.setHeight(33);
        t.setUnline(40);
        System.out.println("Dimension of Tshape is:  " + t.Area());
    }
}