package Q38;

public class Student {

    private int id = 1;
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 3;
        student.display();
    }

    public void display() {
        System.out.println(id);
    }
}
