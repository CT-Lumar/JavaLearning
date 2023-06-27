package ch09_11;

class NBAtemp {
    public static int counter;
    public int id;
    public String name;

    static {
        counter = 1;
        System.out.println("Initializing counter =" + counter);
    }

    NBAtemp() {
        id = ++counter;
    }

    public void output() {
        System.out.println("id:" + id + " name: " + name);
        System.out.println("Total " + counter + " members");
    }
}

public class ch09_11 {
    
    public static void main(String[] args) {
        System.out.println(NBAtemp.counter);
        NBAtemp t1 = new NBAtemp();
        t1.name = "Durant";
        t1.output();
    }
}
