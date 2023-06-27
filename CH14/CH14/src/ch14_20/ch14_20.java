package ch14_20;

class Animal {
    public void moving() {
        System.out.println("moving...");
    }
}

// class Test extends Animal {
//     public void moving() {
//         System.out.println("Test...");
//     }
// }

public class ch14_20 {
    public static void main(String[] args) {
        // Test t1 = new Test();
        // t1.moving();

        // Animal t2 = new Test();
        // t2.moving();

        //annonymous
        Animal obj1 = new Animal(){
            public void moving() {
                System.out.println("test2...");
            }
        };
        obj1.moving();
    }
}
