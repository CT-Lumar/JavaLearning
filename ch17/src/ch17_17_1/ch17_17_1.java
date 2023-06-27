package ch17_17_1;

class Temp implements View.OnClickListener {

    @Override
    public void onClick(String str) {
        System.out.println(str + " how do you do!");
    }

}

public class ch17_17_1 {
    public static void main(String[] args) {
        Button bt1 = new Button();
        Temp t = new Temp();
        bt1.setOnClickListener(t);
    }
}
