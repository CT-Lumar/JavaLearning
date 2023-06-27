package ch24_01;

class MyData {
    private Integer obj1;
    private Double obj2;

    //overload
    public void setobj(Integer obj) {
        this.obj1 = obj;
    }

    public void setobj(Double obj) {
        this.obj2 = obj;
    }

    Integer getobj1() {
        return this.obj1;
    }

    Double getobj2() {
        return this.obj2;
    }
}

public class ch24_01 {
    public static void main(String[] args) {
        MyData m = new MyData();
        m.setobj(10);
        m.setobj(12.4);
        System.out.println(m.getobj1());
        System.out.println(m.getobj2());
    }
}
