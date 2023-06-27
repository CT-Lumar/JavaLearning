package ch24_02;

class MyData<T> {
    private T obj;
    public void setobj(T obj) {
        this.obj = obj;
    }

    public T getobj() {
        return this.obj;
    }
}

public class ch24_02 {
    public static void main(String[] args) {
        MyData<Integer> i = new MyData();
        i.setobj(10);
        System.out.println(i.getobj());
    }
}
