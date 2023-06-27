package ch14_05;

class Father {
    protected int x = 50; 
    public void printInfo() {
        System.out.println("Father.......");
    }
}

class Child extends Father {
    protected int x = 100;
    public void printInfo() {
        System.out.println(x);
        System.out.println(super.x);
    }
}

public class ch14_05 {
    
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("x = " + c.x);
        c.printInfo();
    }
}
