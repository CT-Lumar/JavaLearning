package ch17_17_3;

public class ch17_17_3 {

    private static View.OnClickListener bt = new View.OnClickListener() {

        @Override
        public void onClick(String str) {
            System.out.println(str + " how do you do!");
        }
        
    };
    public static void main(String[] args) {
        Button obj1 = new Button();
        obj1.setOnClickListener(bt);
    }
}
