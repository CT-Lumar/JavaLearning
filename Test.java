

class DataBank{
    int x, y;
}

public class Test {
    public static void main(String[] args) {
        DataBank db = new DataBank();
        db.x = 10;
        db.y = 20;
        System.out.println(db.x + "and" + db.y);
        swap(db);
    }

    public static void swap(DataBank t_db) {
        int tmp = t_db.x;
        t_db.x = t_db.y;
        t_db.y = tmp;
        System.out.println(t_db.x + " and " +  t_db.y);
    }

}