package Q33;

class T {
    public void convertStringToNumber(String t) {
        double number = Double.parseDouble(t);
        System.out.println(number);
    }
}

public class Q33 {
    public static void main(String[] args) {
        T obj = new T();
        obj.convertStringToNumber("879878134.768");
    
    }
}
