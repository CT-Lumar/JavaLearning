package ch14_03_01;

class Emp {
    public int salary;
    public void showSal() {
        System.out.println("salary = " + salary);
    }
}

class Manager extends Emp {

}

public class ch14_03_01 {
    
    public static void main(String[] args) {
        Manager m = new Manager();
        m.salary = 20000;
        m.showSal();;
    }
}
