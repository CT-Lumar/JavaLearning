package ch14_21;

class Animal {
    public String moving() {
        return "moving...";
    }
}

class myCat {
    public void showMsg(Animal obj) {
        System.out.println(obj.moving());
    }
}

// class Temp extends Animal {
//     public String moving() {
//         return "Temp...";
//     }
// }

public class ch14_21 {
    public static void main(String[] args) {
        // myCat obj1 = new myCat();
        // Temp t = new Temp();
        // obj1.showMsg(t);
        myCat obj1 = new myCat();
        obj1.showMsg(new Animal() {
            public String moving() {
                return "Temp2...";
            }
        });

    }
}
