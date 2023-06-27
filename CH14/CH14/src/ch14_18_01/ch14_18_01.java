package ch14_18_01;

class School {
    public class Motto {
        int num = 400;
        public void printInfo() {
            System.out.println("Motto...");
        }
    }

    void display() {
        Motto m = new Motto();
        m.printInfo();
        System.out.println(m.num);
    }
}

public class ch14_18_01 {
    public static void main(String[] args) {
        School sc = new School();
        sc.display();

        School sc2 = new School();
        School.Motto inner = sc2.new Motto();
        inner.printInfo();
        System.out.println(inner.num);
    }
}
