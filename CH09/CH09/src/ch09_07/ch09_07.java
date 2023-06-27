package ch09_07;

class Student {
    public String sno;
    public String sname;
    public int age = 18;
    public int money = 100;

    public void Iam() {
        System.out.println("I am " + sno + ":" + sname + "3Q");
        System.out.println("I have " + money + " dollars");
    }
}

public class ch09_07 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.sno = "1001";
        s1.sname = "John";
        s1.Iam();
    }
}
