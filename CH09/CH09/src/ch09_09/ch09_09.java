package ch09_09;

import java.util.Scanner;

class Student {
    private String sno;
    public String getSno() {
        return "我的學號是：" + sno;
    }
    public void setSno(String sno) {
        this.sno = sno;
    }
    private String Sname;
    public String getSname() {
        return Sname + "請多多指教！";
    }
    public void setSname(String sname) {
        this.Sname = sname;
    }

    public String Iam() {
        return ("I am " + sno + ":" + Sname + ", 3Q!");
    }
    
}

public class ch09_09 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your St. ID");
        String sno = sc.nextLine();
        s1.setSno(sno);
        System.out.println("Input your name:");
        String sname = sc.nextLine();
        s1.setSname(sname);
        System.out.println(s1.Iam());
        System.out.println(s1.getSname());
        System.out.println(s1.getSno());
        sc.close();
    }
}
