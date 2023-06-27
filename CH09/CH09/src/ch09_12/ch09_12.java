package ch09_12;

class PrintSample {
    public static void output1() {
        System.out.println("output1");
    }

    public void output2() {
        System.out.println("output2");
    }
}

public class ch09_12 {
    
    public static void main(String[] args) {
        PrintSample.output1();
        PrintSample p = new PrintSample();
        p.output2();
    }
}
