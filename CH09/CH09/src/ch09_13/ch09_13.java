package ch09_13;

class Student {
    public int no;
    public static int total;
    public Student() {
        total++;
        no = total;
    }

    public void showMe(String name) {
        System.out.println(name + " is# " + no);
    }

    public static void show() {
        System.out.println("Total student = " + total);
    }
}

public class ch09_13 {
    
    public static void main(String[] args) {
        Student.show();
        Student J = new Student();
        System.out.println("J is # " + J.no);
        Student.show();
        Student M = new Student();
        Student T = new Student();
        Student.show();

        T.total = 100;
        System.out.println("Total = " + M.total);

        Student SomeOne;
        SomeOne = M;
        SomeOne.no = 20;
        System.out.println("no = " + M.no);
    }
}
