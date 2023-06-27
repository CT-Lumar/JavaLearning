package ch24_14;

import java.util.ArrayList;
import java.util.Arrays;

class Student {
    private String sname;
    private int no;
    private int score;
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public Student(String sname, int no, int score) {
        this.sname = sname;
        this.no = no;
        this.score = score;
    }
}

public class ch24_14 {
    public static void main(String[] args) {
        //補充
        Integer[] ID = {1, 2, 3, 4, 5};
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ID));
        System.out.println(".....1.....");
        System.out.println("contents=" + list1);

        String[] str1 = {"Q1", "Q2", "Q3", "Q4"};
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(str1));
        System.out.println(".....2.....");
        System.out.println("contents=" + list2);

        ArrayList<Student> s = new ArrayList<Student>();
        s.add(new Student("John", 1, 100));
        s.add(new Student("Mary", 8, 80));
        s.add(new Student("tom", 4, 90));

        //edit
        s.get(2).setScore(0);

        System.out.println(".....3.....");
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i).getNo() + " " + s.get(i).getSname() + " " + s.get(i).getScore());
            
        }
    
    }
}
