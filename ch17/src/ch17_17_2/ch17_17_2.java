package ch17_17_2;

public class ch17_17_2 {
    public static void main(String[] args) {
        Button bt = new Button();
        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(String str) {
                System.out.println(str + " how do oyu do!");
            }
            
        });
    }
}
