package Q26;

class JavaTester {
    int a = 5;
    static int b = 5;
    public void test() {
        int a = 10;
        int b = 10;
        System.out.println("a = " + a);
        System.out.println("this.a = " + this.a);
        System.out.println("b = " + b);
        System.out.println("JavaTester.b = " + JavaTester.b);
    }
}

public class Q26 {

    public static void main(String[] args) {
        JavaTester obj = new JavaTester();
        obj.test();
        
    }
    
}
