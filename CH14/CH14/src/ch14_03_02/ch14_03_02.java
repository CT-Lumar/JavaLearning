package ch14_03_02;

class Emp {
    public int salary;
    public void showSal() {
        System.out.println("salary = " + salary);
    }
}

class Manager extends Emp {
    public int bonus;
    public void showSal() {
        System.out.println("salary = " + (salary + bonus));
    }
}

public class ch14_03_02 {
    
    public static void main(String[] args) {
        Manager m = new Manager();
        m.salary = 20000;
        m.bonus = 5000;
        m.showSal();
    }
}
