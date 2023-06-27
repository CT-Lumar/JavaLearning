package ch14_18_02;

class School {
    public static class Motto {
        static int num =400;
        public static void printInfo() {
            System.out.println("Motto...");
        }
    }
    public static void display() {
        Motto.printInfo();
    }
}

public class ch14_18_02 {
    public static void main(String[] args) {
        School.Motto.printInfo();
        System.out.println(School.Motto.num);
        School.display();
    }
}
