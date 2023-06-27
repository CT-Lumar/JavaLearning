package ch17_14;

interface Animal {
    public void running();
}
//原始寫法

// class Dog implements Animal {

//     @Override
//     public void running() {
//         System.out.println("Dog is running");
//     }
// }

public class ch17_14 {
    public static void main(String[] args) {
        // System.out.println(".....1.....");
        // Dog h1 = new Dog();
        // h1.running(); //向上轉型（仿介面物件化）

        //匿名血法
        Animal h2 = new Animal() {

            @Override
            public void running() {
                System.out.println("h2....");
            }
        };

        h2.running();

        //lambda
        Animal h3;
        h3 = ()-> {
            System.out.println("Lambda...");
        };
        h3.running();
    }
}
