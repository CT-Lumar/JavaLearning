package ch17_16;

interface Animal {
    void running();
}

class Cat implements Animal {

    @Override
    public void running() {
        System.out.println("running!");
    }
    //要傳入物件，此物件要有Animal成分
    public void showMe(Animal obj) {
        System.out.println("showMe");
        obj.running();
    }
}

//原始寫法
class Temp implements Animal {

    @Override
    public void running() {
        System.out.println("Temp...");
    }

}

public class ch17_16 {
    public static void main(String[] args) {
        // //原始寫法
        // System.out.println("...1...");
        // Temp t = new Temp();
        // Cat obj1 = new Cat();
        // obj1.showMe(t);
        // System.out.println("...2...");
        // obj1.showMe(new Temp());
        System.out.println("...3...");
        Cat obj2 = new Cat();
        obj2.showMe(new Animal() {

            @Override
            public void running() {
                System.out.println("anonymous1");
            }
            
        });

        obj2.showMe(()-> {
            System.out.println("anonymous3");
        }
        
        );


    }
}
