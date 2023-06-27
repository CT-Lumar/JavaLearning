package ch24_16;

import java.util.HashMap;
import java.util.Map;

class Phone {
    private String pname;
    private int price;
    public Phone(String pname, int price) {
        this.pname = pname;
        this.price = price;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

public class ch24_16 {
    public static void main(String[] args) {
        HashMap<String, Phone> p = new HashMap<String, Phone>();
        p.put("iPhone", new Phone("i3", 32000));
        p.put("Google", new Phone("gx5", 40000));
        p.put("Sony", new Phone("xperia6", 30000));
        p.put("Samsung", new Phone("galaxy", 20000));

        //edit
        p.get("Sony").setPrice(50000);
        //remove
        p.remove("Samsung");
        //print
        System.out.println(p.get("Sony").getPname());
        System.out.println(p.get("Sony").getPrice());

        //traverse
        for(Map.Entry<String, Phone> e:p.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue().getPname() + " " + e.getValue().getPrice());
        }
    }
}
